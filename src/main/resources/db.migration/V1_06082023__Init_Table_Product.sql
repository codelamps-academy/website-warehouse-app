CREATE TABLE IF NOT EXISTS product (
    id UUID DEFAULT uuid_generated_v4() NOT NULL,
    name-product varchar(255) NOT NULL,
    quantity-product int DEFAULT '0',
    PRIMARY KEY (id)
);