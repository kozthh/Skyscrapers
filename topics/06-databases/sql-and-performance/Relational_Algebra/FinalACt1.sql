Create database PCQUEST;

USE PCQUEST;

CREATE TABLE CUSTOMERS(

    CUSTOMER_ID INT PRIMARY KEY,
    CUSTOMER_NAME VARCHAR(50) NOT NULL,
    CITY VARCHAR(100)
);

CREATE TABLE ORDERS(

    ORDER_ID INT PRIMARY KEY,
    CUSTOMER_ID INT,
    PRODUCT VARCHAR(50),
    AMOUNT INT,

    FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMERS(CUSTOMER_ID)
);

INSERT INTO CUSTOMERS (customer_id, customer_name, city) VALUES
    (1,'Juan Dela Cruz', 'Manila'),
    (2,'Maria Santos', 'Cebu'),
    (3, 'Pedro Reyes', 'Davao'),
    (4, 'Ana Lim', 'Laguna');



INSERT INTO ORDERS(ORDER_ID, CUSTOMER_ID, PRODUCT, AMOUNT) VALUES
    (101,1,'Laptop', 45000),
    (102,2,'GIGABYTE RTX 2060',8000),
    (103,1,'RED DEVIL RX 5600xt', 8500),
    (104, 4,'Ryzen 5 5600',6500);


SELECT * from customers;

SElECT * from orders;

select c.customer_name, c.city, o.product
from customers as c
inner join orders o on o.CUSTOMER_ID = c.CUSTOMER_ID;

select c.customer_name, c.city, o.PRODUCT, o.AMOUNT
from customers as c
left join orders o on o.CUSTOMER_ID = c.CUSTOMER_ID;

select c.customer_name, c.city, o.PRODUCT, o.AMOUNT
from customers as c
right join orders o on o.CUSTOMER_ID = c.CUSTOMER_ID;

select c.customer_name, c.city, o.PRODUCT, o.AMOUNT
from customers as c
left join orders o on o.CUSTOMER_ID = c.CUSTOMER_ID
union
select c.customer_name, c.city, o.PRODUCT, o.AMOUNT
from customers as c
right join orders o on o.CUSTOMER_ID = c.CUSTOMER_ID;

