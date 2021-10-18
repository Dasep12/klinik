/*
SQLyog Enterprise - MySQL GUI v8.05 
MySQL - 5.5.5-10.4.20-MariaDB : Database - klinik
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`klinik` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `klinik`;

/*Table structure for table `tbl_obat` */

DROP TABLE IF EXISTS `tbl_obat`;

CREATE TABLE `tbl_obat` (
  `id_obat` varchar(11) NOT NULL,
  `nama_obat` varchar(100) DEFAULT NULL,
  `expired` varchar(100) DEFAULT NULL,
  `supplier` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_obat` */

/*Table structure for table `tbl_pasien` */

DROP TABLE IF EXISTS `tbl_pasien`;

CREATE TABLE `tbl_pasien` (
  `id_pasien` varchar(60) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(100) DEFAULT NULL,
  `jenis_kelamin` varchar(20) DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `no_telp` varchar(15) DEFAULT NULL,
  `no_bpjs` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_pasien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_pasien` */

/*Table structure for table `tbl_penyakit` */

DROP TABLE IF EXISTS `tbl_penyakit`;

CREATE TABLE `tbl_penyakit` (
  `id_penyakit` varchar(40) NOT NULL,
  `nama_penyakit` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_penyakit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_penyakit` */

/*Table structure for table `tbl_tindaklanjut` */

DROP TABLE IF EXISTS `tbl_tindaklanjut`;

CREATE TABLE `tbl_tindaklanjut` (
  `id_tindaklanjut` varchar(100) NOT NULL,
  `jenis_tindaklanjut` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_tindaklanjut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_tindaklanjut` */

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `idpassien` varchar(100) NOT NULL,
  `tgldaftar` date DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(100) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `jenis_kelmin` varchar(100) DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `no_bpjs` varchar(40) DEFAULT NULL,
  `jasa_medis` int(60) DEFAULT NULL,
  `lain_lain` int(60) DEFAULT NULL,
  `total` int(30) DEFAULT NULL,
  PRIMARY KEY (`idpassien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `transaksi` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
