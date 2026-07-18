FROM python:3.12-slim

# Directorio de trabajo
WORKDIR /workspace

# Versión de ANTLR
ENV ANTLR_VERSION=4.13.2

# Instalar dependencias del sistema
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        default-jdk \
        curl \
        git \
        bash \
        nano \
        vim \
        graphviz && \
    rm -rf /var/lib/apt/lists/*

# Descargar ANTLR
RUN curl -L https://www.antlr.org/download/antlr-${ANTLR_VERSION}-complete.jar \
    -o /usr/local/lib/antlr.jar

# Crear entorno virtual
RUN python -m venv /opt/venv

# Agregar el venv al PATH
ENV PATH="/opt/venv/bin:${PATH}"

# Variables para Java
ENV CLASSPATH=".:/usr/local/lib/antlr.jar"

# Que Streamlit no pregunte el correo la primera vez y escuche en
# todas las interfaces (necesario para que el mapeo de puertos de
# docker-compose 8501:8501 funcione)
ENV STREAMLIT_SERVER_HEADLESS=true
ENV STREAMLIT_SERVER_ADDRESS=0.0.0.0

# Copiar archivo de dependencias
COPY requirements.txt .

# Actualizar pip e instalar dependencias
RUN pip install --no-cache-dir --upgrade pip && \
    pip install --no-cache-dir -r requirements.txt

# Crear comando antlr4
RUN printf '#!/bin/sh\nexec java -jar /usr/local/lib/antlr.jar "$@"\n' \
    > /usr/local/bin/antlr4 && \
    chmod +x /usr/local/bin/antlr4

# Crear atajo gen-pg: regenera Lexer+Parser de PostgreSQL desde grammar/ hacia app/
RUN printf '#!/bin/sh\nexec antlr4 -Dlanguage=Python3 -visitor -no-listener -o app grammar/PostgreSQLLexer.g4 grammar/PostgreSQLParser.g4\n' \
    > /usr/local/bin/gen-pg && \
    chmod +x /usr/local/bin/gen-pg

# Mantener vivo el contenedor
CMD ["tail", "-f", "/dev/null"]
