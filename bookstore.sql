-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2022 at 02:53 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `billtb`
--

CREATE TABLE `billtb` (
  `bnum` int(11) NOT NULL,
  `uname` varchar(250) NOT NULL,
  `cname` varchar(250) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `billtb`
--

INSERT INTO `billtb` (`bnum`, `uname`, `cname`, `amount`) VALUES
(1, 'Users', 'Neil', 700),
(4, 'Users', 'Ken', 2070);

-- --------------------------------------------------------

--
-- Table structure for table `booktb`
--

CREATE TABLE `booktb` (
  `id` int(11) NOT NULL,
  `title` varchar(250) NOT NULL,
  `author` varchar(250) NOT NULL,
  `category` varchar(250) NOT NULL,
  `quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booktb`
--

INSERT INTO `booktb` (`id`, `title`, `author`, `category`, `quantity`, `price`) VALUES
(1, '48 Laws of power', 'Robert Green', 'Others', 76, 100),
(2, 'harry potter', 'j.k rowlings', 'Novels', 98, 670),
(3, 'Chronicles of Narnia', 'JK-ROWLINGS', 'Novels', 200, 85),
(4, 'Atlas', 'Natgeo', 'Geography', 13, 350),
(5, 'Spiderman', 'Stan lee', 'Comics', 100, 100),
(6, 'Ironman', 'Stan Lee', 'Comics', 26, 207),
(7, 'Black panther', 'hdfayu', 'Programming', 127, 2626),
(8, 'Captain America', 'Stan Lee', 'Comics', 678, 260),
(9, 'peaky blinders', 'Shelby', 'Auto-Biography', 10, 10),
(10, 'inception', 'leo', 'Programming', 200, 230),
(11, 'mission impossible', 'tom cruise', 'Comics', 200, 200),
(12, 'Inception', 'leah', 'Novels', 300, 300),
(13, 'cat in the hat', 'clebert', 'Comics', 100, 300);

-- --------------------------------------------------------

--
-- Table structure for table `usertb`
--

CREATE TABLE `usertb` (
  `uid` int(11) NOT NULL,
  `username` varchar(250) NOT NULL,
  `uphone` int(11) NOT NULL,
  `uaddress` varchar(250) NOT NULL,
  `upassword` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `usertb`
--

INSERT INTO `usertb` (`uid`, `username`, `uphone`, `uaddress`, `upassword`) VALUES
(1, 'clebert', 787434358, 'kigali', 'clebert'),
(2, 'david', 1234567889, 'kigali', 'david'),
(3, 'ben', 787624537, 'kigali', 'ben'),
(4, 'Daniel', 786536425, 'Musanze', 'Daniel');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `billtb`
--
ALTER TABLE `billtb`
  ADD PRIMARY KEY (`bnum`);

--
-- Indexes for table `booktb`
--
ALTER TABLE `booktb`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usertb`
--
ALTER TABLE `usertb`
  ADD PRIMARY KEY (`uid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `billtb`
--
ALTER TABLE `billtb`
  MODIFY `bnum` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `booktb`
--
ALTER TABLE `booktb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `usertb`
--
ALTER TABLE `usertb`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
