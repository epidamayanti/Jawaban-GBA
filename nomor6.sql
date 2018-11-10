SELECT c.id, c.name, COUNT( p.category_id ) AS Jumlah_product FROM product_categories c JOIN products p ON c.id = p.category_id GROUP BY category_id
