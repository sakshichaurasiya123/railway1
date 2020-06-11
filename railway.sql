-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 31, 2019 at 02:20 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `railway`
--

-- --------------------------------------------------------

--
-- Table structure for table `alogin`
--

CREATE TABLE `alogin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `cpassword` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `alogin`
--

INSERT INTO `alogin` (`username`, `password`, `email`, `cpassword`) VALUES
('Sakshi Chaurasiya', '9755876907', 'sakshichaurasiya02@gmail.com', '9755876907');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `cpassword` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`username`, `email`, `password`, `cpassword`) VALUES
('Akanksha', 'akanksha@gmail.com', '12345', '12345'),
('juhi', 'juhi@gmail.com', 'juhi', 'juhi'),
('mohni', 'mohni@gmail.com', '12345', '12345'),
('mukesh', 'mukesh@gmail.com', '12345', '12345'),
('Muskan', 'muskan01@gmail.com', '12345', '12345'),
('neha', 'neha@gmail.com', '12345678', '12345678'),
('pratibha', 'pratibha@gmail.com', '12345', '12345'),
('rahul', 'rahul@gmail.com', '12345', '12345'),
('rajul', 'rajul@gmail.com', '1234567', '1234567'),
('rani', 'rani12@gmail.com', '9755876907', '9755876907'),
('Rani Chaurasiya', 'rani@gmail.com', '12345', '12345'),
('ravindra', 'ravindra@gmail.com', '12345', '12345'),
('Sakshi  Richhariya', 'richhriya@gmail.com', '123456', '123456'),
('rudrpratap singh', 'rudrpratap@gmail.com', '9755876907', '9755876907'),
('Sakshi Chaurasiya', 'sakshi02@gmail.com', '123456', '123456'),
('Sakshi Chaurasiya', 'sakshi05@gmail.com', '12345', '12345'),
('Sakshi Chaurasiya', 'sakshi104@gmail.com', '12345', '12345'),
('Sakshi Chaurasiya', 'sakshi123@gmail.com', '12345', '12345'),
('Sakshi Chaurasiya', 'sakshi23@gmail.com', '12345', '12345'),
('Sakshi Chaurasiya', 'sakshi@gmail.com', '1234567', '1234567'),
('Muskan', 'sakshichaurasiya02@gmail.com', '1234567', '1234567'),
('Muskan', 'sakshichaurasiya03@gmail.com', '12345', '12345'),
('Sakshi Chaurasiya', 'sakshichaurasiya05@gmail.com', '12345', '12345'),
('Sakshi  Richhariya', 'sakshiR@gmail.com', '1234567', '12334567');

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `Id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `source` varchar(50) NOT NULL,
  `destination` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `gender` varchar(8) NOT NULL,
  `bookingdate` date NOT NULL,
  `journeydate` date NOT NULL,
  `travellingClass` varchar(10) NOT NULL,
  `PNR` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

INSERT INTO `reservation` (`Id`, `name`, `source`, `destination`, `age`, `gender`, `bookingdate`, `journeydate`, `travellingClass`, `PNR`) VALUES
(1, 'Sakshi Chaurasiya', 'indore', 'bhopal', 21, 'female', '2019-10-17', '2019-10-24', 'SL', 2),
(2, 'Sakshi Chaurasiya', 'indore', 'bhopal', 13, 'female', '2019-10-24', '2019-10-18', 'SL', 3),
(17, 'Sakshi Chaurasiya', 'indore', 'bhopal', 12, 'female', '2019-10-24', '2019-10-24', 'SL', 60),
(18, 'Sakshi Chaurasiya', 'indore', 'bhopal', 9, 'female', '2019-10-25', '2019-10-26', '1A', 61),
(19, 'Sakshi Chaurasiya', 'indore', 'bhopal', 40, 'female', '2019-10-27', '2019-11-16', 'SL', 63),
(20, 'Sakshi Chaurasiya', 'indore', 'bhopal', 15, 'female', '2019-10-27', '2019-10-31', '2S', 65),
(21, 'Sakshi Chaurasiya', 'indore', 'bhopal', 45, 'female', '2019-10-26', '2019-10-31', '2S', 66),
(22, 'Sakshi Chaurasiya', 'indore', 'bhopal', 19, 'female', '2019-10-30', '2019-11-12', '2S', 69),
(23, 'Sakshi Chaurasiya', 'indore', 'khajuraho', 30, 'female', '2019-11-16', '2019-10-26', '2S', 70),
(24, 'Sakshi Chaurasiya', 'indore', 'bhopal', 20, 'female', '2019-10-31', '2019-10-31', 'CC', 5),
(26, 'Sakshi Chaurasiya', 'indore', 'bhopal', 20, 'female', '2019-10-31', '2019-10-31', 'EC', 90),
(29, 'Sakshi Chaurasiya', 'indore', 'bhopal', 20, 'female', '2019-10-31', '2019-10-31', 'SL', 6),
(31, 'Sakshi Chaurasiya', 'indore', 'bhopal', 21, 'female', '2019-10-31', '2019-10-31', 'SL', 8);

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `ticketNo` int(11) NOT NULL,
  `travellingClass` varchar(50) NOT NULL,
  `DateOfJourney` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`ticketNo`, `travellingClass`, `DateOfJourney`) VALUES
(7701, 'AC', '0000-00-00'),
(7701, 'AC', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `train`
--

CREATE TABLE `train` (
  `trainno` int(11) NOT NULL,
  `trainname` text NOT NULL,
  `source` varchar(50) NOT NULL,
  `destination` varchar(50) NOT NULL,
  `arrivaltime` varchar(30) NOT NULL,
  `departuretime` varchar(30) NOT NULL,
  `DateOfJourney` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `train`
--

INSERT INTO `train` (`trainno`, `trainname`, `source`, `destination`, `arrivaltime`, `departuretime`, `DateOfJourney`) VALUES
(1111, 'Samperk kranti', 'jhanshi', 'Delhi', '11:00 am', '10:00 pm', '2019-11-11'),
(3040, 'railway', 'indore', 'khajuraho', '10:30pm', '11:30 am', '1999-11-11'),
(20000, 'channai Express', 'indore', 'chhatarpur', '06:00 am', '03:50 pm', '2019-11-11'),
(20001, 'bundelkhand Express', 'indore', 'bhopal', '06:00 am', '03:50 pm', '2019-10-11');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `alogin`
--
ALTER TABLE `alogin`
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`Id`),
  ADD UNIQUE KEY `PNR` (`PNR`);

--
-- Indexes for table `train`
--
ALTER TABLE `train`
  ADD UNIQUE KEY `trainno` (`trainno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
