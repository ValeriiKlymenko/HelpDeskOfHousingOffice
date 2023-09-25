INSERT INTO roles (id, name) VALUES (1, 'USER');
INSERT INTO roles (id, name) VALUES (2, 'ADMIN');

INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (1, 'Ukraine', 'Vyshneve', 'Kyivska', 'Buchanskyi', 'Sahaidachnoho', 45, 08132);

INSERT INTO housing_offices (id, name, address_id) VALUES (1, 'Housing_Office#1', 1);

INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (1, 'Emergency', 1, 1);

INSERT INTO rooms (id, room_number, building_id) VALUES (1, 33, 1);

INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (1, 'Nick', 'Green', 'nick@mail.com', '$2a$10$CJgEoobU2gm0euD4ygru4ukBf9g8fYnPrMvYk.q0GMfOcIDtUhEwC', 1, 1);

INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (1, 'Description', '2020-09-16 14:15:32.464391', 'Created', 'ONE', 1, 1);