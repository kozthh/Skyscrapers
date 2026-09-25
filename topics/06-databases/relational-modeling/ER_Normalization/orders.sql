

use shop;

create table customers(
    customer_id int primary key,
    name varchar(50) not null,
    address varchar(100) not null
);

create table product(
                        product_id int primary key,
                        product_name varchar(50),
                        stocks int default 1,
                        manufacture varchar(50),
                        price int
);

create table orders(
    order_id int primary key,
    customer_id int,
    product_id int,
    order_date datetime default current_timestamp,

    foreign key (customer_id) references customers(customer_id)
);

create table order_items(
                            order_item_id int auto_increment primary key,
                            order_id      int not null,
                            product_id    int not null,
                            qty           int not null default 1,
                            price_at_sale int not null,
                            foreign key (order_id) references orders(order_id),
                            foreign key (product_id) references product(product_id)
);

INSERT INTO product (product_id, product_name, stocks, manufacture, price)
VALUES
    (1,  'Wireless Mouse',      50, 'Logitech',  450),
    (2,  'Mechanical Keyboard', 30, 'Razer',     3200),
    (3,  '24" Monitor',         20, 'Samsung',   6500),
    (4,  'USB-C Hub',           40, 'Anker',     900),
    (5,  'Webcam 1080p',        25, 'Logitech',  1500),
    (6,  'HDMI Cable 2m',       100,'Ugreen',    150),
    (7,  'Laptop Stand',        35, 'Nulaxy',    700),
    (8,  'Wireless Earbuds',    60, 'JBL',       2200),
    (9,  'External SSD 1TB',    15, 'SanDisk',   3800),
    (10, 'Power Bank 20000mAh', 45, 'Baseus',    1100);

INSERT INTO customers (customer_id, name, address)
VALUES
    (1,  'Juan Dela Cruz',     'Calamba, Laguna'),
    (2,  'Maria Santos',       'Los Baños, Laguna'),
    (3,  'Ana Reyes',          'Manila'),
    (4,  'Pedro Garcia',       'Quezon City'),
    (5,  'Liza Torres',        'Cabuyao, Laguna'),
    (6,  'Mark Villanueva',    'Sta. Rosa, Laguna'),
    (7,  'Carla Mendoza',      'Biñan, Laguna'),
    (8,  'Jose Ramirez',       'Makati'),
    (9,  'Angela Cruz',        'San Pedro, Laguna'),
    (10, 'Ryan Aquino',        'Pasig');


INSERT INTO orders (order_id, customer_id)
VALUES
    (1001, 1),
    (1002, 2),
    (1003, 3),
    (1004, 4),
    (1005, 5),
    (1006, 6),
    (1007, 7),
    (1008, 8),
    (1009, 9),
    (1010, 10);

INSERT INTO order_items (order_id, product_id, qty, price_at_sale)
VALUES
    (1001, 1, 2, 450),
    (1001, 3, 1, 6500),
    (1002, 8, 1, 2200),
    (1003, 2, 1, 3200),
    (1003, 6, 3, 150),
    (1004, 5, 1, 1500),
    (1005, 10,1, 1100),
    (1006, 4, 2, 900),
    (1007, 9, 1, 3800),
    (1007, 7, 1, 700),
    (1008, 1, 1, 450),
    (1009, 3, 1, 6500),
    (1010, 8, 2, 2200);

