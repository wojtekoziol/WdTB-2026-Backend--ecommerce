-- Dane startowe aplikacji. Tabele tworzy Hibernate z encji, a ten plik Spring Boot uruchamia zaraz potem.
-- LAB 01: dopiszcie tu konta wszystkich osób z zespołu (reguła R1.03).
-- LAB 02: dopiszcie dane do swoich tabel (kolejność: najpierw tabele, na które wskazują klucze obce).
insert into user_account (email, display_name, role, created_at) values
    ('wojciech.koziol@student.merito.pl',   'Wojciech',   'USER',    current_timestamp),
    ('dorian.kita@student.merito.pl',  'Dorian',  'USER',    current_timestamp),
    ('mateusz.frackowiak@example.com',       'Mateusz', 'USER', current_timestamp),
    ('admin@example.com',       'Admin', 'ADMIN',   current_timestamp);

-- LAB 01: Wasze konta (zmieńcie na swoje dane, rola USER)
-- insert into user_account (email, display_name, role, created_at) values
--     ('imie.nazwisko@student.merito.pl', 'Imię', 'USER', current_timestamp);

-- ===== LAB 02 · <tabela 1> =====
insert into product (name, description, product_size, standard_price) values
    ('Bike', 'Sport bike', 'MEDIUM', 1000.00),
    ('Skateboad', 'Cool skateboard', 'SMALL', 150.00),
    ('Ball', 'Soccer ball', 'SMALL', 50.00);

-- ===== LAB 02 · <tabela 2> =====
insert into order_header (order_date, requested_delivery_date, status, street, city, postal_code) values
    ('2026-10-01', '2026-10-07', 'PENDING', 'Sezamkowa', 'Wrocław', '60-415'),
    ('2026-10-25', '2026-10-31', 'PENDING', 'Czekoladowa', 'Wrocław', '39-745'),
    ('2026-10-01', '2026-10-02', 'COMPLETED', 'Brązowa', 'Warszawa', '12-215');

-- ===== LAB 02 · <tabela 3> =====
insert into order_line (quantity, price, discount_pct, comment) values
    (5, 50.00, 5, null),
    (1, 1000.00, 0, null),
    (20, 150.00, 20, 'Cool skateboard, nice discount');