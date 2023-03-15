

--
-- Database: `carnet`
--

-- --------------------------------------------------------

--
-- Table structure for table `cars`
--

CREATE TABLE IF NOT EXISTS `cars` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `make` text NOT NULL,
  `model` text NOT NULL,
  `year` int(11) NOT NULL,
  `color` text NOT NULL,
  `litre` double NOT NULL,
  `mileage` int(11) NOT NULL,
  `price` double NOT NULL,
  `image` text NOT NULL,
  `cond` text NOT NULL,
  `seller` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1;


use carnet;
--
-- Dumping data for table `cars`
--

INSERT INTO cars (id, make, model, year, color, litre, mileage, price, image, cond, seller) VALUES
(1, 'Skoda', 'Kodiaq', 2020, 'Gray', 2, 46000, 46000, 'kodiaq.jpg', 'Used', 'dunne111'),
(2, 'Audi', 'A4', 2005, 'Red', 1.8, 91300, 3000, 'a41999.jpg', 'Used', 'sregan22'),
(3, 'Opel', 'Astra', 2015, 'Silver', 1.4, 88000, 1900, 'astra2000.jpg', 'Used', 'cfarr'),
(4, 'Toyota', 'Avensis', 2016, 'Silver', 1.6, 34500, 9400, 'avensis2006.jpg', 'Used', 'cfarr'),
(5, 'Citroen', 'C4 Picasso', 2017, 'Black', 1.4, 36000, 7950, 'c4picasso2007.jpg', 'Used', 'jthomas'),
(6, 'Seat', 'Cordoba', 2018, 'Silver', 1.2, 26000, 6000, 'cordoba2008.jpg', 'Used', 'sanjesh'),
(7, 'Ford', 'Fiesta', 2017, 'Blue', 1.1, 41000, 5500, 'fiesta2007.jpg', 'Used', 'granger10'),
(8, 'Ford', 'Focus', 2010, 'Red', 1.4, 103000, 3000, 'focus2000.jpg', 'Used', 'jthomas'),
(9, 'Ford', 'Focus', 2014, 'Blue', 1.9, 11000, 14000, 'focus2010.jpg', 'Used', 'jthomas'),
(10, 'Subaru', 'Impreza', 2013, 'Blue', 2, 70400, 8000, 'impreza2003.jpg', 'Used', 'dunne111'),
(11, 'Mazda', '3', 2006, 'Grey', 1.8, 74000, 9800, 'mazda32006.jpg', 'Used', 'sregan22'),
(12, 'Renault', 'Megane', 2011, 'Blue', 1.6, 114000, 2800, 'megane2001.jpg', 'Used', 'sitko'),
(13, 'Audi', 'A4', 2013, 'Red', 2, 165000, 44000, 'a42013.jpg', 'New', 'sitko'),
(14, 'Honda', 'Accord', 2021, 'Silver', 2.2, 25000, 28000, 'accord2013.jpg', 'New', 'granger10'),
(15, 'Volvo', 'C70', 2021, 'Brown', 1.8, 35000, 31000, 'c702013.jpg', 'New', 'sanjesh'),
(16, 'Mercedes', 'C-Class', 2021, 'White', 3.2, 30000, 52000, 'cclass2013.jpg', 'New', 'granger10'),
(17, 'Mini', 'Cooper', 2021, 'Black', 1.6, 18000, 28000, 'mini2013.jpg', 'New', 'jthomas'),
(19, 'Hyundai', 'Santa Fe', 2021, 'Silver', 2.4, 100000, 26000, 'santafe2013.jpg', 'New', 'ellen101'),
(21, 'Volkswagen', 'Touareg', 2021, 'Silver', 2, 40000, 33000, 'touareg2013.jpg', 'New', 'sanjesh'),
(25, 'Dodge', 'Challenger', 2021, 'Red', 3.2, 8500, 34500, 'challenger2010.jpg', 'Used', 'sitko'),
(26, 'BMW', 'Series 5', 2021, 'White', 3.2, 12000, 48000, 'series52013.jpg', 'New', 'sitko');
