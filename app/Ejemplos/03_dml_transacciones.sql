-- Ejemplo 3: DML + control de transacciones
-- Incluye: INSERT con varias filas, UPDATE, DELETE con subconsulta,
-- y BEGIN/SAVEPOINT/ROLLBACK/COMMIT.

BEGIN TRANSACTION;

INSERT INTO clientes (nombre, correo, pais)
VALUES
    ('Ana Torres', 'ana@correo.com', 'MX'),
    ('Luis Ramos', 'luis@correo.com', 'US');

SAVEPOINT antes_de_actualizar;

UPDATE clientes
SET activo = FALSE
WHERE correo LIKE '%@correo.com'
  AND pais <> 'MX';

DELETE FROM ventas
WHERE cliente_id NOT IN (SELECT id FROM clientes WHERE activo = TRUE)
RETURNING id;

ROLLBACK TO antes_de_actualizar;

COMMIT WORK;
