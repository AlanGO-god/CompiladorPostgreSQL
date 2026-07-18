-- Ejemplo 5: errores SINTACTICOS intencionales
-- (todos los tokens son validos, pero el orden no respeta la gramatica
-- de PostgreSQL, asi que el analizador sintactico los debe marcar)

-- Error 1: falta la lista de columnas despues de SELECT
SELECT FROM clientes;

-- Error 2: falta el nombre de la tabla
CREATE TABLE (
    id INTEGER
);

-- Error 3: parentesis sin cerrar en VALUES
INSERT INTO clientes (nombre, correo) VALUES ('Ana', 'ana@correo.com';

-- Error 4: palabra clave mal escrita (SELEC en vez de SELECT)
SELEC nombre FROM clientes;
