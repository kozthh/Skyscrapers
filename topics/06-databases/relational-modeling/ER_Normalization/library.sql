create database library;

use library;

create table members(
member_id int primary key, 
member_name varchar(50),
member_contact int
); 

create table author(
author_id int primary key, 
author_name varchar(50), 
author_crountry varchar(50)
);

create table publisher(
publisher_id int primary key, 
publisher varchar(50), 
pubisher_city varchar(50)
); 

create table books(
book_id int primary key, 
author_id int, 
publisher_id int, 
booktitle varchar(50) not null, 

foreign key (author_id) references author(author_id), 
foreign key (publisher_id) references publisher(publisher_id)
);

create table loans(
    loan_id        varchar(10) primary key,   
    member_id      varchar(10) not null,
    date_borrowed  date not null,
    due_date       date,
    foreign key (member_id) references members(member_id)
);

create table loan_books(        
    loan_id  varchar(10) not null,
    book_id  varchar(10) not null,
    primary key (loan_id, book_id),
    foreign key (loan_id) references loans(loan_id),
    foreign key (book_id) references books(book_id)
);


INSERT INTO members (member_id, member_name, member_contact)
VALUES
(1, 'Ana Reyes',        9175550101),
(2, 'Ben Cruz',         9175550202),
(3, 'Carlo Santos',     9175550303),
(4, 'Diana Lopez',      9175550404),
(5, 'Ella Fernandez',   9175550505);


INSERT INTO author (author_id, author_name, author_crountry)
VALUES
(1, 'Niklaus Wirth',    'Switzerland'),
(2, 'Kenneth Rosen',    'United States'),
(3, 'Andrew Tanenbaum', 'Netherlands'),
(4, 'Robert Sedgewick', 'United States'),
(5, 'Donald Knuth',     'United States');


INSERT INTO publisher (publisher_id, publisher, pubisher_city)
VALUES
(1, 'Pearson',      'London'),
(2, 'McGraw-Hill',  'New York'),
(3, 'Addison-Wesley','Boston'),
(4, 'O''Reilly',    'Sebastopol'),
(5, 'MIT Press',    'Cambridge');


INSERT INTO books (book_id, author_id, publisher_id, booktitle)
VALUES
(101, 1, 1, 'Data Structures'),
(102, 2, 2, 'Discrete Mathematics'),
(103, 3, 1, 'Computer Networks'),
(104, 4, 3, 'Algorithms'),
(105, 5, 5, 'The Art of Computer Programming');


INSERT INTO loans (loan_id, member_id, date_borrowed, due_date)
VALUES
(1, 1, '2026-08-03', '2026-08-17'),
(2, 2, '2026-08-05', '2026-08-19'),
(3, 1, '2026-08-10', '2026-08-24'),
(4, 3, '2026-08-12', '2026-08-26'),
(5, 4, '2026-08-15', '2026-08-29');


INSERT INTO loan_books (loan_id, book_id)
VALUES
(1, 101),
(1, 102),   
(2, 103),
(3, 103),   
(4, 104),
(5, 105);