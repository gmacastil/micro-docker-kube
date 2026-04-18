INSERT INTO products (name, price, create_date)
SELECT 'Naranja', 500, CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Naranja');

INSERT INTO products (name, price, create_date)
SELECT 'Manzana', 600, CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Manzana');

INSERT INTO products (name, price, create_date)
SELECT 'Pera', 700, CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Pera');

INSERT INTO products (name, price, create_date)
SELECT 'Mango', 800, CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Mango');

INSERT INTO products (name, price, create_date)
SELECT 'Curuba', 900, CURRENT_TIMESTAMP
WHERE NOT EXISTS (SELECT 1 FROM products WHERE name = 'Curuba');