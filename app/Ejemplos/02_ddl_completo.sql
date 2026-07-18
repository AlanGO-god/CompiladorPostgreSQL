-- Ejemplo 2: DDL completo
-- Incluye: CREATE TABLE con restricciones de columna y de tabla,
-- CREATE INDEX, CREATE VIEW, ALTER TABLE y DROP.

CREATE TABLE IF NOT EXISTS clientes (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    correo VARCHAR(150) UNIQUE,
    pais CHAR(2) DEFAULT 'MX',
    activo BOOLEAN DEFAULT TRUE,
    creado TIMESTAMP WITHOUT TIME ZONE DEFAULT NULL
);

CREATE TABLE ventas (
    id SERIAL PRIMARY KEY,
    cliente_id INTEGER NOT NULL,
    monto NUMERIC(12,2) CHECK (monto >= 0),
    fecha DATE NOT NULL,
    CONSTRAINT fk_ventas_cliente FOREIGN KEY (cliente_id) REFERENCES clientes (id)
);

CREATE INDEX idx_ventas_cliente ON ventas (cliente_id);

CREATE OR REPLACE VIEW vista_clientes_activos AS
    SELECT id, nombre, correo
    FROM clientes
    WHERE activo = TRUE;

ALTER TABLE clientes
    ADD COLUMN telefono VARCHAR(20),
    ALTER COLUMN pais SET DEFAULT 'US';

DROP INDEX IF EXISTS idx_ventas_cliente;
DROP VIEW IF EXISTS vista_clientes_activos CASCADE;
