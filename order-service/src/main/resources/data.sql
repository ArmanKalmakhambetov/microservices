INSERT INTO orders (customer_id, date_of_create)
VALUES (1, CURRENT_TIMESTAMP),(2, CURRENT_TIMESTAMP);
INSERT INTO order_product_ids (order_id, product_ids)
VALUES (1, 1), (2, 2);