insert into customers(id, name, email, age, password, phone_number)
values (1, 'Max', 'max@gmail.com', 19, '1234', '+380999752899');

insert into accounts (id, number, currency, balance, customer_id)
values (1, '12345', 'USD', 10000.10, 1);

insert into employers (id, name, address)
values (1, 'Dan-It', 'Kyiv');

insert into customers_employers (customer_id, employer_id)
values (1, 1);