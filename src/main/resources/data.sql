INSERT INTO roles (id, name) VALUES (1, 'USER');
INSERT INTO roles (id, name) VALUES (2, 'ADMIN');

INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (1, 'Ukraine', 'Vyshneve', 'Kyivska', 'Buchanskyi', 'Sahaidachnoho', 45, 08132);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (2, 'Ukraine', 'Kyiv', 'Kyivska', 'Kyivskyi', 'Khreshchatyk', 10, 01001);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (3, 'Ukraine', 'Lviv', 'Lvivska', 'Lychakivskyi', 'Shevchenka', 22, 79010);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (4, 'Ukraine', 'Kharkiv', 'Kharkivska', 'Kharkivskyi', 'Svobody', 15, 61022);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (5, 'Ukraine', 'Odesa', 'Odeska', 'Primorskyi', 'Derybasivska', 5, 65026);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (6, 'Ukraine', 'Dnipro', 'Dnipropetrovska', 'Tsentralnyi', 'Gagarina', 30, 49000);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (7, 'Ukraine', 'Zaporizhzhia', 'Zaporizka', 'Leninskyi', 'Soborna', 8, 69000);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (8, 'Ukraine', 'Kherson', 'Khersonska', 'Suvorovskyi', 'Lenina', 7, 73000);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (9, 'Ukraine', 'Ternopil', 'Ternopilska', 'Ternopilskyi', 'Svobody', 14, 46000);
INSERT INTO addresses (id, country, city, oblast, region, street, house, zipcode) VALUES (10, 'Ukraine', 'Chernivtsi', 'Chernivetska', 'Chernivetskyi', 'Kobylianskoi', 18, 58000);

INSERT INTO housing_offices (id, name) VALUES (1, 'Housing_Office#1');
INSERT INTO housing_offices (id, name) VALUES (2, 'Housing_Office#2');
INSERT INTO housing_offices (id, name) VALUES (3, 'Housing_Office#3');
INSERT INTO housing_offices (id, name) VALUES (4, 'Housing_Office#4');
INSERT INTO housing_offices (id, name) VALUES (5, 'Housing_Office#5');

INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (1, 'Emergency', 1, 1);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (2, 'LimitedAbleBodied', 2, 1);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (3, 'AbleBodied', 3, 2);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (4, 'Emergency', 4, 2);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (5, 'LimitedAbleBodied', 5, 3);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (6, 'AbleBodied', 6, 3);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (7, 'Emergency', 7, 4);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (8, 'LimitedAbleBodied', 8, 4);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (9, 'AbleBodied', 9, 5);
INSERT INTO buildings (id, state, address_id, housing_offices_id) VALUES (10, 'Emergency', 10, 5);

INSERT INTO rooms (id, room_number, building_id) VALUES (1, 33, 1);
INSERT INTO rooms (id, room_number, building_id) VALUES (2, 34, 1);
INSERT INTO rooms (id, room_number, building_id) VALUES (3, 35, 1);
INSERT INTO rooms (id, room_number, building_id) VALUES (4, 36, 1);
INSERT INTO rooms (id, room_number, building_id) VALUES (5, 37, 1);
INSERT INTO rooms (id, room_number, building_id) VALUES (6, 38, 2);
INSERT INTO rooms (id, room_number, building_id) VALUES (7, 39, 2);
INSERT INTO rooms (id, room_number, building_id) VALUES (8, 40, 2);
INSERT INTO rooms (id, room_number, building_id) VALUES (9, 41, 2);
INSERT INTO rooms (id, room_number, building_id) VALUES (10, 42, 2);

INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (1, 'Nick', 'Green', 'nick@mail.com', '$2a$10$CJgEoobU2gm0euD4ygru4ukBf9g8fYnPrMvYk.q0GMfOcIDtUhEwC', 2, 1);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (2, 'John', 'Smith', 'john@mail.com', '$2a$10$DxJi7tIZrq3gHVhIm4.PMeIVJMCrplnD8xOSZD.QDSmrpUSj3kqjG', 1, 2);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (3, 'Alice', 'Johnson', 'alice@mail.com', '$2a$10$F/dSjl6RRCX8OmlHNktmlePhBlxlc6DnCUEoPcIm6ZJouEd4Q/HNu', 1, 3);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (4, 'Elena', 'Martinez', 'elena@mail.com', '$2a$10$1bPqenl3GMZTj2oavjVV5O/Qk0eK2vGnEEtWQeALI4/8bzjCR2LzS', 1, 4);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (5, 'Sara', 'Garcia', 'sara@mail.com', '$2a$10$ncgKn/7geegbh41nQDFfvefdSoS84JO0XgRjQ5V9gW02/F4q/5Zeq', 1, 6);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (6, 'Olivia', 'Davis', 'olivia@mail.com', '$2a$10$7uLLJOtMqL2YCDaPQsUrwO0kDxOpJ/wK7jhucHg.08HqyTuvFEJLC', 2, 7);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (7, 'Daniel', 'Wilson', 'daniel@mail.com', '$2a$10$w9ZQh/gWemG7URfW/km/B.XAbF6zLHh8se5gLCz4gGyV/xIj53Ouy', 1, 8);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (8, 'Sophia', 'Lee', 'sophia@mail.com', '$2a$10$y5mlu7SWYGdut3fxLOLPyOiLOQW0NY5RaNJ4GOv8ODKHnf5a2JbWm', 1, 9);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (9, 'William', 'Brown', 'william@mail.com', '$2a$10$kt2QPFbXw/tW8lDXOefwY.EQ9/Zm4YUtrwqKmtQlVJbA/EdbnKdQu', 1, 10);
INSERT INTO users (id, first_name, last_name, email, password, role_id, room_id) VALUES (10, 'Emma', 'Harris', 'emma@mail.com', '$2a$10$PYVFrzN.BsTqZuzyFvdInOTd1OFa/XVLM06T8.XjX9.cJk9.3ekuK', 1, 1);

INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (1, 'Cleaning and snow removal needed due to snowstorm', '2023-09-28 10:30:15.123456', 'Created', 'CLEANING_AND_SNOW_REMOVAL', 1, 1);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (2, 'Confirmation required for maintenance', '2023-09-27 15:45:22.987654','IsNotConfirmed', 'ELEVATOR_MAINTENANCE', 2, 2);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (3, 'Rodent eradication needed in the basement', '2023-09-26 12:20:35.543210','Rejected', 'RODENT_ERADICATION', 3, 3);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (4, 'Water meter verification required', '2023-09-25 09:55:10.111222', 'ConfirmedBy', 'WATER_METER_VERIFICATION_AND_MAINTENANCE', 4, 4);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (5, 'Smoke exhaust system maintenance', '2023-09-24 14:10:50.888777', 'IsPerforming', 'SMOKE_EXHAUST_SYSTEM_MAINTENANCE_AND_REPAIR', 5, 5);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (6, 'Maintenance of indoor heating system', '2023-09-23 16:40:30.333444', 'IsNotFinished', 'INDOOR_HEATING_SYSTEM_MAINTENANCE', 6, 6);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (7, 'Cleaning and snow removal needed due to snowstorm','2023-09-22 11:25:55.666999', 'Done', 'CLEANING_AND_SNOW_REMOVAL', 7, 7);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (8, 'Maintenance of indoor drainage system', '2023-09-21 17:15:40.777888', 'Created', 'INDOOR_DRAINAGE_SYSTEM_MAINTENANCE', 8, 8);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (9, 'Insect disinfection required', '2023-09-20 13:05:05.222333', 'IsNotConfirmed', 'INSECT_DISINFECTION', 9, 9);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (10, 'Maintenance and repair of fire alarm system', '2023-09-19 08:50:12.444555', 'Rejected', 'FIRE_ALARM_SYSTEM_MAINTENANCE_AND_REPAIR', 10, 10);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (11, 'Maintenance and repair of building technical devices', '2023-09-18 19:30:25.555444', 'ConfirmedBy', 'MAINTENANCE_AND_INTERNAL_BUILDING_TECHNICAL_DEVICE_CONSTRUCTION_ELEMENTS_REPAIR', 10, 1);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (12, 'Cleaning and snow removal needed due to snowstorm', '2023-09-17 14:12:38.888999', 'IsPerforming', 'CLEANING_AND_SNOW_REMOVAL', 1, 2);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (13, 'Maintenance and repair of heating system construction elements', '2023-09-16 10:55:45.111222', 'IsNotFinished', 'MAINTENANCE_AND_INTERNAL_HEATING_SYSTEM_CONSTRUCTION_ELEMENTS_REPAIR', 2, 3);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (14, 'Rodent eradication needed in the basement', '2023-09-15 09:25:30.777888', 'Done', 'RODENT_ERADICATION', 3, 4);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (15, 'Maintenance of indoor water supply system', '2023-09-14 11:30:20.333444', 'Created', 'INDOOR_WATER_SUPPLY_SYSTEM_MAINTENANCE', 4, 5);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (16, 'Cleaning and snow removal needed due to snowstorm', '2023-09-13 15:40:10.222333', 'IsNotConfirmed', 'CLEANING_AND_SNOW_REMOVAL', 5, 6);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (17, 'Maintenance of indoor drainage system', '2023-09-12 16:55:22.444555', 'Rejected', 'INDOOR_DRAINAGE_SYSTEM_MAINTENANCE', 6, 7);
INSERT INTO requests (id, description, data_created, status, task, user_id, building_id) VALUES (18, 'Cleaning', '2023-09-16 14:15:32.464391', 'Created', 'CLEANING_TERRITORY', 7, 8);

