import os
import streamlit as st

from archivo import Archivo
from analizador_lexico import AnalizadorLexico


CARPETA_EJEMPLOS = os.path.join(os.path.dirname(__file__), "ejemplos")


class App:

    def __init__(self):
        st.set_page_config(
            page_title="Compilador de PostgreSQL (ANTLR)",
            layout="wide",
        )

        self.analizador_lexico = AnalizadorLexico()

    def ejecutar(self):
        st.title("Compilador de PostgreSQL (emulado con ANTLR)")
        st.caption(
            "Proyecto academico - Lenguajes y Automatas 2 - ITC. "
            "Cubre unicamente la fase lexica; no analiza sintaxis ni "
            "hace validacion semantica del SQL."
        )

        codigo = self._obtener_codigo_fuente()

        if codigo is None or codigo.strip() == "":
            st.info("Elige un ejemplo, sube un archivo o escribe codigo SQL para analizarlo.")
            return

        st.subheader("Codigo fuente")
        st.code(codigo, language="sql")

        self.analizador_lexico.analizar(codigo)
        tokens = self.analizador_lexico.obtener_tokens()
        errores_lexicos = self.analizador_lexico.obtener_errores()

        pestana_tokens, pestana_errores = st.tabs(
            ["Tokens (analisis lexico)", "Errores lexicos"]
        )

        with pestana_tokens:
            self._mostrar_tokens(tokens)

        with pestana_errores:
            self._mostrar_errores(errores_lexicos)

    def _obtener_codigo_fuente(self):
        st.sidebar.header("Codigo fuente")

        fuente = st.sidebar.radio(
            "Elige de donde tomar el codigo SQL",
            ["Ejemplo incluido", "Subir archivo (.sql / .txt)", "Escribir codigo"],
        )

        if fuente == "Ejemplo incluido":
            return self._obtener_codigo_de_ejemplo()

        if fuente == "Subir archivo (.sql / .txt)":
            return self._obtener_codigo_de_archivo()

        return self._obtener_codigo_escrito()

    def _obtener_codigo_de_ejemplo(self):
        archivos = sorted(os.listdir(CARPETA_EJEMPLOS))
        archivos_sql = [a for a in archivos if a.endswith(".sql")]

        seleccion = st.sidebar.selectbox("Ejemplo", archivos_sql)

        if seleccion is None:
            return ""

        ruta = os.path.join(CARPETA_EJEMPLOS, seleccion)
        with open(ruta, "r", encoding="utf-8") as f:
            return f.read()

    def _obtener_codigo_de_archivo(self):
        archivo_subido = st.sidebar.file_uploader(
            "Selecciona tu archivo", type=["sql", "txt"]
        )

        if archivo_subido is None:
            return None

        archivo = Archivo(archivo_subido)

        if not archivo.es_valido():
            st.sidebar.error("El archivo debe ser .sql o .txt")
            return None

        info = archivo.obtener_info()
        st.sidebar.success(f"Archivo cargado: {info['nombre']}")

        return archivo.leer()

    def _obtener_codigo_escrito(self):
        return st.sidebar.text_area(
            "Escribe tu codigo SQL", height=250,
            placeholder="SELECT * FROM clientes WHERE activo = TRUE;",
        )

    def _mostrar_tokens(self, tokens):
        st.subheader("Tabla de tokens generados")

        if len(tokens) == 0:
            st.warning("No se encontraron tokens.")
            return

        st.dataframe(tokens, use_container_width=True, height=400)
        st.caption(f"Total de tokens reconocidos: {len(tokens)}")

        resumen = self.analizador_lexico.obtener_resumen_categorias()
        if resumen:
            st.subheader("Tokens por categoria")
            st.bar_chart(resumen)

    def _mostrar_errores(self, errores_lexicos):
        st.subheader("Errores lexicos")

        if len(errores_lexicos) == 0:
            st.success("No hay errores lexicos.")
        else:
            st.dataframe(errores_lexicos, use_container_width=True)


if __name__ == "__main__":
    app = App()
    app.ejecutar()