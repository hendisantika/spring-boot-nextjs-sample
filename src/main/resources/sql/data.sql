INSERT INTO users
VALUES ('userId', 'test@helloai.ink', '123456');

INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('1', 'Audi', 'A5', 2016, '8T MY16 S line plus Coupe 2dr S tronic 7sp quattro 2.0T', 82640, 'Above Average',
        'Southport (QLD)', 'Dealership', 'No', '2024-03-28', floor(rand() * (20000 - 10000 + 1)) + 10000, 'Grey',
        '2.0 Direct Injection Turbo Petrol', '7 S line plus Automatic', 'QLD', 20240328);

UPDATE `preinterview`.`usedcarsales`
SET `badges`    = '30 TFSI',
    `bodytype`  = 'Hatchback',
    `fueltype`  = 'Petrol',
    `cylinders` = '3',
    `seat`      = '5',
    `doors`     = '5'
WHERE (`id` = '1');

-- Inserting record with ID 2
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('2', 'Audi', 'A5', 2014, '8T MY15 Cabriolet 2dr S tronic 7sp quattro 3.0DT', 73092, 'Excellent',
        'Altona North (VIC)', 'Wholesale', 'No', '2024-03-26', floor(rand() * (20000 - 10000 + 1)) + 10000, 'Black',
        '3.0 Direct Injection Turbo Diesel', '7 Automatic', 'VIC', 20240326);

-- Inserting record with ID 3
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('3', 'Audi', 'A5', 2015, '8T MY15 Coupe 2dr S tronic 7sp quattro 2.0T', 156251, 'Average',
        'Sunshine, Melbourne (VIC)', 'Auction', 'No', '2024-03-25', floor(rand() * (20000 - 10000 + 1)) + 10000, 'Grey',
        '2.0 Direct Injection Turbo Petrol', '7 Automatic', 'VIC', 20240325);

-- Inserting record with ID 4
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('4', 'Audi', 'A5', 2010, '8T MY10 Cabriolet 2dr S tronic 7sp quattro 2.0T', 171000, 'Excellent',
        'West Footscray (VIC)', 'Dealership', 'No', '2024-03-23', floor(rand() * (20000 - 10000 + 1)) + 10000, 'Grey',
        '2.0 Multi-Point Injection Turbo Petrol', '7 Automatic', 'VIC', 20240323);

-- Inserting record with ID 5
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('5', 'Audi', 'A5', 2010, '8T MY10 Sportback 5dr S tronic 7sp quattro 2.0T', 123956, 'Excellent',
        'Alphington (VIC)', 'Dealership', 'No', '2024-03-20', floor(rand() * (20000 - 10000 + 1)) + 10000, 'Red',
        '2.0 Multi-Point Injection Turbo Petrol', '7 Automatic', 'VIC', 20240320);

-- Inserting record with ID 6
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('6', 'Abarth', '124', 2018, '348 Series 1 Spider Roadster 2dr Man 6sp 1.4T', 51634, 'Excellent',
        'New Lambton Heights (NSW)', 'Wholesale', 'No', '2024-03-04', floor(rand() * (20000 - 10000 + 1)) + 10000,
        'White', '1.4 Multi-Point Injection Turbo Petrol', '6 Spider Manual', 'NSW', 20240304);

-- Inserting record with ID 7
INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('7', 'Abarth', '124', 2017, '348 Spider Roadster 2dr Man 6sp 1.4T', 32335, 'Average',
        'Sunshine, Melbourne (VIC)', 'Auction', 'No', '2024-01-11', floor(rand() * (20000 - 10000 + 1)) + 10000,
        'White', '1.4 Multi-Point Injection Turbo Petrol', '6 Spider Manual', 'VIC', 20240111);


INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, accessories, states,
                          customdate, badges, bodytype, bodytypeconfig, fueltype, cylinders, division, drive, seat,
                          doors)
VALUES ('8', 'Audi', 'A5', 2020, 'F5 MY20 45 TFSI S line Coupe 2dr S tronic 7sp quattro 2.0T', 33679, 'Above Average',
        'Parramatta (NSW)', 'Wholesale', 'No', '2023-11-02', rand() * 10000 + 10000, 'Grey',
        '2.0 Direct Injection Turbo Petrol', '7 45 TFSI S line Automatic', NULL, 'NSW', 3, NULL, NULL, NULL, 'Petrol',
        NULL, NULL, NULL, NULL, NULL),
       ('9', 'Alfa Romeo', '147', 2001, 'MY02 Twin Spark Hatchback 5dr Man 5sp 2.0i', 104337, 'Above Average',
        'Wentworthville (NSW)', 'Dealership', 'No', '2024-02-22', rand() * 10000 + 10000, 'Black',
        '2.0 Multi-Point Injection Aspirated Petrol', '5 Twin Spark Manual', NULL, 'NSW', 3, NULL, NULL, NULL, 'Petrol',
        NULL, NULL, NULL, NULL, NULL);


INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, accessories, states,
                          customdate, badges, bodytype, bodytypeconfig, fueltype, cylinders, division, drive, seat,
                          doors)
VALUES ('10', 'Austin', 'Freeway', 1964, 'Sedan 6st 4dr Auto 3sp 2400', 81494, 'Above Average', 'Carrara (QLD)',
        'Wholesale', 'No', '2023-06-30', rand() * 10000 + 10000, 'Cream', '2400 Carburettor Single Aspirated Petrol',
        '3 Automatic', NULL, 'QLD', 3, NULL, NULL, NULL, 'Petrol', NULL, NULL, NULL, NULL, NULL),
       ('11', 'Bentley', 'Arnage', 2001, 'Le Mans Sedan 4dr Auto 4sp 6.75T', 187100, 'Excellent', 'Bowral (NSW)',
        'Dealership', 'No', '2023-09-08', rand() * 10000 + 10000, NULL, '6.75 Multi-Point Injection Turbo Petrol',
        '4 Le Mans Automatic', NULL, 'NSW', 3, NULL, NULL, NULL, 'Petrol', NULL, NULL, NULL, NULL, NULL),
       ('12', 'Bentley', 'Arnage', 2003, 'Series 2 R Red Label Sedan 4dr Auto 4sp 6.75TT', 43392, 'Average',
        'Belmore, Sydney (NSW)', 'Auction', 'No', '2023-06-28', rand() * 10000 + 10000, 'Black',
        '6.75 Multi-Point Injection Turbo Petrol', '4 R Red Label Automatic', NULL, 'NSW', 3, NULL, NULL, NULL,
        'Petrol', NULL, NULL, NULL, NULL, NULL);


INSERT INTO usedcarsales (id, make, model, year, description, odometer, vehiclecondition, salelocation, salecategory,
                          salvagevehicle, saledate, saleprice, colour, engine, transmission, states, customdate)
VALUES ('13', 'Audi', 'A5', 2005, '8T MY10 Sportback 5dr S tronic 7sp quattro 2.0T', 323956, 'Excellent',
        'Alphington (VIC)', 'Dealership', 'No', '2024-03-20', floor(rand() * (20000 - 10000 + 1)) + 10000, 'Red',
        '2.0 Multi-Point Injection Turbo Petrol', '7 Automatic', 'VIC', 20240320);
