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

/*Table structure for table `obat_pasien` */

DROP TABLE IF EXISTS `obat_pasien`;

CREATE TABLE `obat_pasien` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_pasien` varchar(20) NOT NULL,
  `obat` varchar(255) DEFAULT NULL,
  `harga` int(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;

/*Data for the table `obat_pasien` */

insert  into `obat_pasien`(`id`,`id_pasien`,`obat`,`harga`) values (6,'PSN0001','Oskadon',12000),(7,'PSN0001','Oskadon',12000),(9,'PSN0003','Oskadon',12000),(10,'PSN0003','Konimex',30000),(11,'PSN0004','Oskadon',12000),(12,'PSN0004','Konimex',30000);

/*Table structure for table `rekam_medis` */

DROP TABLE IF EXISTS `rekam_medis`;

CREATE TABLE `rekam_medis` (
  `id_pasien` varchar(20) NOT NULL,
  `jasa_medis` int(11) DEFAULT NULL,
  `nama_pasien` varchar(30) DEFAULT NULL,
  `jenis_kelamin` varchar(14) DEFAULT NULL,
  `tempat_lahir` varchar(60) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `no_telp` varchar(14) DEFAULT NULL,
  `no_bpjs` varchar(29) DEFAULT NULL,
  `status_periksa` varchar(20) DEFAULT NULL,
  `sistol` varchar(255) DEFAULT NULL,
  `distole` varchar(255) DEFAULT NULL,
  `tinggi` varchar(10) DEFAULT NULL,
  `berat_badan` varchar(10) DEFAULT NULL,
  `diagnosa1` text DEFAULT NULL,
  `diagnosa2` text DEFAULT NULL,
  `anamnesa1` text DEFAULT NULL,
  `anamnesa2` text DEFAULT NULL,
  `nama_penyakit` varchar(255) DEFAULT NULL,
  `tindak_lanjut` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_pasien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `rekam_medis` */

insert  into `rekam_medis`(`id_pasien`,`jasa_medis`,`nama_pasien`,`jenis_kelamin`,`tempat_lahir`,`tgl_lahir`,`alamat`,`no_telp`,`no_bpjs`,`status_periksa`,`sistol`,`distole`,`tinggi`,`berat_badan`,`diagnosa1`,`diagnosa2`,`anamnesa1`,`anamnesa2`,`nama_penyakit`,`tindak_lanjut`) values ('PSN0001',10000,'Adien','Laki-Laki','Bandung','1999-04-12','Jl Lodan Dalam II C','081809987878','098989787878','SUDAH DI PERIKSA','Sistol','Distole','170','60','Diagnosa 1','Diagnosa 2','Anamnesa 1','Anamnesa 2','Nama Penyakit','TIDAK ADA'),('PSN0002',NULL,'Ahmad Saripai','Laki-Laki','Bandung','1999-12-12','Cicangkang','09898989','12313',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),('PSN0003',NULL,'Febrianto','Laki-Laki','Rembang','1999-03-12','Lodan Dalam	','098989891','8989898','SUDAH DI PERIKSA','Sistol','Distole','160','70','Diagnosa 1','Diagnosa 2','Anamnesa 1','Anamnesa 2','Diabetes','TIDAK ADA'),('PSN0004',200000,'Indri','Perempuan','Bandung','2021-10-26','Lodan Dalam	','087178787','098989898','SUDAH DI PERIKSA','Sistol','Distole','170','60','Diagnosa 1','Diagnosa 2','Anamnesa 1','Anamnesa 2','Nama Penyakit','TIDAK ADA');

/*Table structure for table `tbl_obat` */

DROP TABLE IF EXISTS `tbl_obat`;

CREATE TABLE `tbl_obat` (
  `id_obat` varchar(11) NOT NULL,
  `nama_obat` varchar(100) DEFAULT NULL,
  `expired` varchar(100) DEFAULT NULL,
  `supplier` varchar(100) DEFAULT NULL,
  `harga` int(30) DEFAULT NULL,
  PRIMARY KEY (`id_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_obat` */

insert  into `tbl_obat`(`id_obat`,`nama_obat`,`expired`,`supplier`,`harga`) values ('01','Oskadon','2021-12-12','SUOP',12000),('02','Bodrex','2021-12-05','SYOP',15000),('03','Konimex','2021-05-08','Kond',30000);

/*Table structure for table `tbl_pasien` */

DROP TABLE IF EXISTS `tbl_pasien`;

CREATE TABLE `tbl_pasien` (
  `id_pasien` varchar(60) NOT NULL,
  `tgl_daftar` date DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(100) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `jenis_kelamin` varchar(20) DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `no_telp` varchar(15) DEFAULT NULL,
  `no_bpjs` varchar(30) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
  `transaksi` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`id_pasien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_pasien` */

insert  into `tbl_pasien`(`id_pasien`,`tgl_daftar`,`nama`,`tempat_lahir`,`tgl_lahir`,`jenis_kelamin`,`alamat`,`no_telp`,`no_bpjs`,`status`,`transaksi`) values ('PSN0001','2021-10-24','Adien','Bandung','1999-04-12','Laki-Laki','Jl Lodan Dalam II C','081809987878','098989787878','SUDAH DI PERIKSA','OK'),('PSN0002','2021-10-24','Ahmad Saripai','Bandung','1999-12-12','Laki-Laki','Cicangkang','09898989','12313','BELUM DI PERIKSA','NOK'),('PSN0003','2021-10-24','Febrianto','Rembang','1999-03-12','Laki-Laki','Lodan Dalam	','098989891','8989898','SUDAH DI PERIKSA','NOK'),('PSN0004','2021-10-26','Indri','Bandung','2021-10-26','Perempuan','Lodan Dalam	','087178787','098989898','SUDAH DI PERIKSA','OK');

/*Table structure for table `tbl_penyakit` */

DROP TABLE IF EXISTS `tbl_penyakit`;

CREATE TABLE `tbl_penyakit` (
  `id_penyakit` varchar(40) NOT NULL,
  `nama_penyakit` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_penyakit`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_penyakit` */

insert  into `tbl_penyakit`(`id_penyakit`,`nama_penyakit`) values ('DIAR','DIARE'),('HPTS','Hepatitis');

/*Table structure for table `tbl_status_periksa` */

DROP TABLE IF EXISTS `tbl_status_periksa`;

CREATE TABLE `tbl_status_periksa` (
  `id_status` varchar(10) NOT NULL,
  `jenis_status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id_status`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tbl_status_periksa` */

insert  into `tbl_status_periksa`(`id_status`,`jenis_status`) values ('1','SUDAH DI PERIKSA'),('2','BELUM DI PERIKSA');

/*Table structure for table `tbl_tindaklanjut` */

DROP TABLE IF EXISTS `tbl_tindaklanjut`;

CREATE TABLE `tbl_tindaklanjut` (
  `id_tindaklanjut` varchar(100) NOT NULL,
  `jenis_tindaklanjut` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_tindaklanjut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `tbl_tindaklanjut` */

insert  into `tbl_tindaklanjut`(`id_tindaklanjut`,`jenis_tindaklanjut`) values ('01','RUJUKAN'),('02','TIDAK ADA');

/*Table structure for table `transaksi` */

DROP TABLE IF EXISTS `transaksi`;

CREATE TABLE `transaksi` (
  `idpassien` varchar(100) NOT NULL,
  `tgldaftar` date DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `tempat_lahir` varchar(100) DEFAULT NULL,
  `tgl_lahir` date DEFAULT NULL,
  `jenis_kelamin` varchar(100) DEFAULT NULL,
  `alamat` text DEFAULT NULL,
  `no_telp` varchar(20) DEFAULT NULL,
  `no_bpjs` varchar(40) DEFAULT NULL,
  `jasa_medis` int(60) DEFAULT NULL,
  `lain_lain` int(60) DEFAULT NULL,
  `biaya_obat` int(20) DEFAULT NULL,
  `total` int(30) DEFAULT NULL,
  PRIMARY KEY (`idpassien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `transaksi` */

insert  into `transaksi`(`idpassien`,`tgldaftar`,`nama`,`tempat_lahir`,`tgl_lahir`,`jenis_kelamin`,`alamat`,`no_telp`,`no_bpjs`,`jasa_medis`,`lain_lain`,`biaya_obat`,`total`) values ('PSN0001','2021-10-24','Adien','Bandung','1999-04-12','Laki-Laki','Jl Lodan Dalam II C','081809987878','098989787878',200000,10000,24000,0),('PSN0004','2021-10-26','Indri','Bandung','2021-10-26','Perempuan','Lodan Dalam	','087178787','098989898',200000,0,42000,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
