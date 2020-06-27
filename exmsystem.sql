-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 27, 2020 at 08:58 AM
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
-- Database: `exmsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `enrolements`
--

DROP TABLE IF EXISTS `enrolements`;
CREATE TABLE IF NOT EXISTS `enrolements` (
  `enrolemntID` int(11) NOT NULL AUTO_INCREMENT,
  `studentName` varchar(50) NOT NULL,
  `studentEmail` varchar(100) NOT NULL,
  `subject` varchar(50) NOT NULL,
  `dateTime` varchar(50) NOT NULL,
  PRIMARY KEY (`enrolemntID`),
  KEY `enrolemntID` (`enrolemntID`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `enrolements`
--

INSERT INTO `enrolements` (`enrolemntID`, `studentName`, `studentEmail`, `subject`, `dateTime`) VALUES
(1, 'prasanna', 'prasanna.srilal.7@gmail.cokm', 'dsa', '2012.12.12'),
(2, 'dg', 'sdg', 'gsdg', 'dsg'),
(4, 'vs', 'svdsv', 'dv', 'vs'),
(3, 'hfhf', 'prasanna.srilal.7@gmail.com', 'hghg', 'bbfb');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `regid` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `age` int(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `faculty` varchar(50) NOT NULL,
  `department` varchar(50) NOT NULL,
  `yearofreg` int(11) NOT NULL,
  PRIMARY KEY (`regid`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`regid`, `firstname`, `lastname`, `email`, `age`, `address`, `gender`, `faculty`, `department`, `yearofreg`) VALUES
(1, 'nimal', 'Perera', 'nimal@gmail.com', 12, 'r.pura', 'male', 'IT', 'HR', 2015),
(21, 'yhrh', 'hfdd', 'dh@gmail.com', 33, 'sdgsd', 'Male', 'Faculty OF Computing', 'Department Of Software Engineering', 2011),
(22, 'fdbd', 'fdfgf', 'dgf@gmail.com', 34, 'fhfgfg', 'Male', 'Faculty OF Computing', 'Department Of Software Engineering', 2008);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `subjectcode` varchar(20) NOT NULL,
  `subjectname` varchar(50) NOT NULL,
  `description` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`subjectcode`, `subjectname`, `description`) VALUES
('ryery', 'ryr', 'reryer');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
