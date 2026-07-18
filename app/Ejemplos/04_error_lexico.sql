-- Ejemplo 4: errores LEXICOS intencionales
-- (para que el analizador lexico los detecte y los muestre en la pestania
-- "Errores")

-- Error 1: caracter no reconocido por ninguna regla del lexer
SELECT nombre FROM clientes WHERE edad > 18 @ 0;

-- Error 2: otro caracter invalido dentro de una expresion
UPDATE clientes SET saldo = saldo # 2 WHERE id = 1;

-- Error 3: cadena de texto sin comilla de cierre (arrastra el resto
-- del archivo como parte del token, por eso va al final del ejemplo)
SELECT 'esto es un string que nunca se cierra
FROM clientes;
