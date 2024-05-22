-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2024 at 03:41 PM
-- Server version: 8.0.32
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cosmetics2`
--

-- --------------------------------------------------------

--
-- Table structure for table `tblcategory`
--

CREATE TABLE `tblcategory` (
  `Category_ID` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Category_Name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tblcategory`
--

INSERT INTO `tblcategory` (`Category_ID`, `Category_Name`) VALUES
('C-0003', 'ds'),
('C01', 'Shampoo'),
('C02', 'Face Wash');

-- --------------------------------------------------------

--
-- Table structure for table `tblcheckout`
--

CREATE TABLE `tblcheckout` (
  `OrderId` varchar(10) NOT NULL,
  `CustId` varchar(20) NOT NULL,
  `CustName` varchar(20) NOT NULL,
  `ProID` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Product_Name` varchar(20) NOT NULL,
  `UPrice` double NOT NULL,
  `qty` int NOT NULL,
  `Price` double NOT NULL,
  `OrderDate` varchar(50) NOT NULL,
  `checkOutdate` timestamp NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tblcheckout`
--

INSERT INTO `tblcheckout` (`OrderId`, `CustId`, `CustName`, `ProID`, `Product_Name`, `UPrice`, `qty`, `Price`, `OrderDate`, `checkOutdate`) VALUES
('03', 'C01', 'asd', 'P02', 'Kohoba', 100, 10, 1000, '0000-00-00 00:00:00', '2024-05-22 13:05:40'),
('C02', 'C01', 'asd', 'P01', 'Araliya', 150, 10, 1500, '', '0000-00-00 00:00:00'),
('O001', 'C01', 'asd', 'P01', 'Araliyas', 150, 5, 750, '', '0000-00-00 00:00:00'),
('O01', 'C01', 'asd', 'P01', 'Araliya', 150, 9, 1350, '', '0000-00-00 00:00:00'),
('O022', 'C01', 'asd', 'P01', 'Araliyas', 150, 5, 750, '', '0000-00-00 00:00:00'),
('O03', 'C01', 'asd', 'P02', 'Kohoba', 100, 5, 500, '', '0000-00-00 00:00:00'),
('P01', 'C01', 'asd', 'P02', 'Kohoba', 100, 5, 500, '', '0000-00-00 00:00:00'),
('P06', 'C01', 'asd', 'P02', 'Kohoba', 100, 5, 500, '', '0000-00-00 00:00:00'),
('T01', 'C01', 'asd', 'P02', 'Kohoba', 100, 5, 500, '', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `tblorder`
--

CREATE TABLE `tblorder` (
  `OrderId` varchar(10) NOT NULL,
  `CustID` varchar(20) NOT NULL,
  `CustName` varchar(20) NOT NULL,
  `ProID` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Product_Name` varchar(20) NOT NULL,
  `UPrice` double NOT NULL,
  `qty` int NOT NULL,
  `Price` double NOT NULL,
  `OrderDate` timestamp NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tblorder`
--

INSERT INTO `tblorder` (`OrderId`, `CustID`, `CustName`, `ProID`, `Product_Name`, `UPrice`, `qty`, `Price`, `OrderDate`) VALUES
('01', 'C01', 'asd', 'P01', 'Araliyas', 100, 5, 500, '0000-00-00 00:00:00'),
('02', 'C01', 'asd', 'P01', 'Araliyas', 150, 5, 750, '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `tblproducts`
--

CREATE TABLE `tblproducts` (
  `Product_ID` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Product_Name` varchar(20) NOT NULL,
  `Category_Name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Price` double NOT NULL,
  `Stocks` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tblproducts`
--

INSERT INTO `tblproducts` (`Product_ID`, `Product_Name`, `Category_Name`, `Price`, `Stocks`) VALUES
('P-0003', 'as', 'Shampoo', 100, 0),
('P01', 'Araliyas', 'Shampoo', 150, 25),
('P02', 'Kohoba', 'Face Wash', 100, 70);

-- --------------------------------------------------------

--
-- Table structure for table `tbluser`
--

CREATE TABLE `tbluser` (
  `UserID` varchar(5) NOT NULL,
  `UserRoll` varchar(15) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `ContactNo` varchar(13) NOT NULL,
  `Address` varchar(20) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `UserName` varchar(12) NOT NULL,
  `Password` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tbluser`
--

INSERT INTO `tbluser` (`UserID`, `UserRoll`, `Name`, `ContactNo`, `Address`, `Email`, `UserName`, `Password`) VALUES
('C01', 'Customer', 'asd', '0112', 'asd', 'asd@gmail.com', 'asd123', 'asd123'),
('U0010', 'Admin', 'adf', '0112', 'ad', 'ad@gmail.com', 'ad', 'ad1234'),
('U01', 'Admin', 'admin', '0779219230', 'Colombo', 'admin@gmail.com', 'admin', 'admin12'),
('U02', 'Cashier', 'User', '0778452145', 'Nugegoda', 'user@gmail.com', 'user', 'user12'),
('U09', 'Customer', 'as', '024654', 'vcer', 'ads@gmail.com', 'as', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tblcategory`
--
ALTER TABLE `tblcategory`
  ADD PRIMARY KEY (`Category_ID`);

--
-- Indexes for table `tblcheckout`
--
ALTER TABLE `tblcheckout`
  ADD PRIMARY KEY (`OrderId`);

--
-- Indexes for table `tblorder`
--
ALTER TABLE `tblorder`
  ADD PRIMARY KEY (`OrderId`);

--
-- Indexes for table `tblproducts`
--
ALTER TABLE `tblproducts`
  ADD PRIMARY KEY (`Product_ID`);

--
-- Indexes for table `tbluser`
--
ALTER TABLE `tbluser`
  ADD PRIMARY KEY (`UserID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
