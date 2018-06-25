create database testboot;
use testboot;
CREATE TABLE `city` (
  `id` varchar(100) NOT NULL,
  `province_id` varchar(100) DEFAULT NULL,
  `city_name` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;