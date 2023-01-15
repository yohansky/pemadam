-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 27, 2022 at 02:20 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `damkar`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `id_ptgs` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `no_hp` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`id_ptgs`, `nama`, `jabatan`, `no_hp`) VALUES
('p1', 'Aji Prastio', 'Pemadam', '08121657342'),
('p2', 'Fadhil Dzil', 'Pemadam', '08129768502'),
('p3', 'Febrian', 'Pemadam', '08129445025');

-- --------------------------------------------------------

--
-- Table structure for table `korban_jiwa`
--

CREATE TABLE `korban_jiwa` (
  `nik` varchar(25) NOT NULL,
  `nama` varchar(40) NOT NULL,
  `usia` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `korban_jiwa`
--

INSERT INTO `korban_jiwa` (`nik`, `nama`, `usia`) VALUES
('11', 'Jamil', '24'),
('12', 'Sarah', '20'),
('13', 'Junita', '27'),
('14', 'Zaenab', '31');

-- --------------------------------------------------------

--
-- Table structure for table `laporan_masuk`
--

CREATE TABLE `laporan_masuk` (
  `kode_laporan` varchar(10) NOT NULL,
  `nama_lapor` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `kondisi` varchar(30) NOT NULL,
  `tgl` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `laporan_masuk`
--

INSERT INTO `laporan_masuk` (`kode_laporan`, `nama_lapor`, `alamat`, `kondisi`, `tgl`) VALUES
('L1', 'Anissa', 'Kalisari', 'Besar', '2022-07-13'),
('L2', 'Ade', 'Lapo', 'Kebakaran Besar', '2022-07-29');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('root', 'root'),
('Admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `nomor` varchar(10) NOT NULL,
  `jenis` varchar(25) NOT NULL,
  `plat` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`nomor`, `jenis`, `plat`) VALUES
('M1', 'Damkar Busa', 'B 2134'),
('M2', 'Damkar Ringan', 'B 8149'),
('M3', 'Damkar Ganda', 'B 9794');

-- --------------------------------------------------------

--
-- Table structure for table `penanganan`
--

CREATE TABLE `penanganan` (
  `kd_p` varchar(10) NOT NULL,
  `id_ptgs` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `kode_laporan` varchar(10) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tgl` date NOT NULL,
  `nomor` varchar(10) NOT NULL,
  `plat` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penanganan`
--

INSERT INTO `penanganan` (`kd_p`, `id_ptgs`, `nama`, `kode_laporan`, `alamat`, `tgl`, `nomor`, `plat`) VALUES
('Pen1', 'p1', 'Aji Prastio', 'L1', 'Kalisari', '2022-07-13', 'M1', 'B 2134'),
('Pen2', 'p2', 'Fadhil Dzil', 'L1', 'Kalisari', '2022-07-13', 'M1', 'B 2134'),
('Pen3', 'p3', 'Febrian', 'L1', 'Kalisari', '2022-07-13', 'M1', 'B 2134');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
