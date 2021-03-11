-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 12, 2020 at 03:43 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestion de boite de production`
--

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `cin` int(8) NOT NULL,
  `nom` varchar(15) NOT NULL,
  `prenom` varchar(15) NOT NULL,
  `num_tel` int(8) NOT NULL,
  `e_mail` varchar(50) NOT NULL,
  `adresse` varchar(20) NOT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`cin`, `nom`, `prenom`, `num_tel`, `e_mail`, `adresse`) VALUES
(12344321, 'ramez', 'zormati', 50791249, 'ramezaz@gmail.com', 'moureddine msaken'),
(12342345, 'sami', 'zormati', 50791249, '@.', 'azerazer');

-- --------------------------------------------------------

--
-- Table structure for table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `cin` int(8) NOT NULL,
  `nom` varchar(15) NOT NULL,
  `prenom` varchar(15) NOT NULL,
  `num_tel` int(8) NOT NULL,
  `sexe` varchar(1) NOT NULL,
  `type` varchar(10) NOT NULL,
  `mot_de_passe` varchar(20) NOT NULL,
  PRIMARY KEY (`cin`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `compte`
--

INSERT INTO `compte` (`cin`, `nom`, `prenom`, `num_tel`, `sexe`, `type`, `mot_de_passe`) VALUES
(12341234, 'Ramez', 'zormati', 50791249, 'H', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `date`
--

DROP TABLE IF EXISTS `date`;
CREATE TABLE IF NOT EXISTS `date` (
  `num_date` int(11) NOT NULL AUTO_INCREMENT,
  `date_s` datetime NOT NULL,
  `lieu` varchar(15) NOT NULL,
  `remarque` varchar(50) NOT NULL,
  `id_service` int(11) NOT NULL,
  PRIMARY KEY (`num_date`),
  KEY `const1` (`id_service`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `date`
--

INSERT INTO `date` (`num_date`, `date_s`, `lieu`, `remarque`, `id_service`) VALUES
(1, '2020-05-14 12:00:00', 'sousse', '', 4),
(2, '2021-05-29 12:00:00', 'jammel', '', 4),
(3, '2021-05-29 00:00:00', 'azefazef', '', 5),
(4, '2020-05-31 12:00:00', 'azerazer', '', 5),
(5, '2020-05-31 12:00:00', 'azerazer', '', 5);

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

DROP TABLE IF EXISTS `service`;
CREATE TABLE IF NOT EXISTS `service` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nom_service` varchar(15) NOT NULL,
  `type` varchar(15) NOT NULL,
  `tarif` decimal(10,3) NOT NULL,
  `avance` decimal(10,3) NOT NULL,
  `cin_client` int(8) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `service`
--

INSERT INTO `service` (`id`, `nom_service`, `type`, `tarif`, `avance`, `cin_client`) VALUES
(1, 'serv', 'Thour', '1000.000', '500.000', 12344321),
(2, 'serviceramez', 'Evenement', '1000.000', '500.000', 12344321),
(3, 'serviceramez', 'Evenement', '1000.000', '500.000', 12344321),
(4, 'serviceramez', 'Evenement', '1000.000', '500.000', 12344321),
(5, 'servici', 'Mariage', '1000.000', '500.000', 12342345);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
