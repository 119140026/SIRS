-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Bulan Mei 2021 pada 10.28
-- Versi server: 10.4.18-MariaDB
-- Versi PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumah_sakit`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokter`
--

CREATE TABLE `dokter` (
  `Id_TenagaMedis` char(5) NOT NULL,
  `Nama_Dokter` varchar(30) DEFAULT NULL,
  `Spesialisasi_Dokter` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dokter`
--

INSERT INTO `dokter` (`Id_TenagaMedis`, `Nama_Dokter`, `Spesialisasi_Dokter`) VALUES
('ID001', 'Dr. Yusuf', 'Jantung'),
('ID002', 'Dr. Maqruf', 'Batuk'),
('ID003', 'dr. Eci', 'Kulit'),
('ID004', 'Manii', 'Kulit');

-- --------------------------------------------------------

--
-- Struktur dari tabel `grafikdatabase`
--

CREATE TABLE `grafikdatabase` (
  `Pasien` int(4) NOT NULL,
  `Obat` int(4) NOT NULL,
  `TenagaMedis` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `grafikdatabase`
--

INSERT INTO `grafikdatabase` (`Pasien`, `Obat`, `TenagaMedis`) VALUES
(12, 23, 22);

-- --------------------------------------------------------

--
-- Struktur dari tabel `multivalue_dosisobat`
--

CREATE TABLE `multivalue_dosisobat` (
  `Id_Obat` char(5) NOT NULL,
  `Dosis_Obat` char(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `multivalue_dosisobat`
--

INSERT INTO `multivalue_dosisobat` (`Id_Obat`, `Dosis_Obat`) VALUES
('ID001', 'Dosis Rendah');

-- --------------------------------------------------------

--
-- Struktur dari tabel `multivalue_notelpon`
--

CREATE TABLE `multivalue_notelpon` (
  `Id_Pasien` char(5) DEFAULT NULL,
  `Nomor_Telpon` char(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `multivalue_notelpon`
--

INSERT INTO `multivalue_notelpon` (`Id_Pasien`, `Nomor_Telpon`) VALUES
('ID001', '0877723'),
('ID001', '087772323233');

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `Id_Obat` char(5) NOT NULL,
  `Nama_Obat` varchar(30) DEFAULT NULL,
  `Jenis_Obat` char(15) DEFAULT NULL,
  `Harga_Obat` char(15) DEFAULT NULL,
  `Tanggal_Kadaluarsa` char(20) DEFAULT NULL,
  `Id_TenagaMedis` char(5) NOT NULL,
  `Id_Pasien` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`Id_Obat`, `Nama_Obat`, `Jenis_Obat`, `Harga_Obat`, `Tanggal_Kadaluarsa`, `Id_TenagaMedis`, `Id_Pasien`) VALUES
('ID001', 'Tolak Angin', 'Serbuk', 'Rp. 50,000', '12 Juli 2023', 'ID001', 'ID001'),
('ID002', 'Antangin', 'Kaplet', 'Rp. 200,000', '12 MEI 2023', 'ID002', 'ID002'),
('ID003', 'Maag', 'Serbuk', 'Rp. 250,000', '12 Mei 2022', 'ID003', 'ID003'),
('ID004', 'OBH COMBI', 'Serbuk', 'Rp. 50,000', '12 Mei 2025', 'ID003', 'ID004');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `Id_Pasien` char(5) NOT NULL,
  `Nama_Pasien` varchar(30) DEFAULT NULL,
  `Tanggal_Lahir` char(20) DEFAULT NULL,
  `Ruangan_Pasien` char(10) DEFAULT NULL,
  `Alamat_Pasien` varchar(30) DEFAULT NULL,
  `Id_TenagaMedis` char(5) NOT NULL,
  `Umur` char(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`Id_Pasien`, `Nama_Pasien`, `Tanggal_Lahir`, `Ruangan_Pasien`, `Alamat_Pasien`, `Id_TenagaMedis`, `Umur`) VALUES
('ID001', 'YUSUF', '12 JULI 2001', 'Kamar 01', 'LAMPUNG', 'ID001', '20 TAHUN'),
('ID002', 'Habib', '12 Mei 2001', 'Kamar 02', 'BaLam', 'ID001', '20 Tahun'),
('ID003', 'Enak', '12 Mei 2001', 'Kamar 05', 'BaLAm', 'ID001', '20 Tahun'),
('ID004', 'Gilang', '12 Juli 2008', 'Kamar 01', 'Padang', 'ID001', '12 Tahun');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien_rekammedis`
--

CREATE TABLE `pasien_rekammedis` (
  `Id_Pasien` char(5) DEFAULT NULL,
  `Id_RekamMedis` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `penyakit`
--

CREATE TABLE `penyakit` (
  `Id_Pasien` char(5) DEFAULT NULL,
  `Nama_Penyakit` varchar(30) DEFAULT NULL,
  `Gejala_Penyakit` varchar(20) DEFAULT NULL,
  `Id_RekamMedis` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penyakit`
--

INSERT INTO `penyakit` (`Id_Pasien`, `Nama_Penyakit`, `Gejala_Penyakit`, `Id_RekamMedis`) VALUES
('ID001', 'Makan', 'Otak', 'ID001');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perawat`
--

CREATE TABLE `perawat` (
  `Id_TenagaMedis` char(5) NOT NULL,
  `Nama_Perawat` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `perawat`
--

INSERT INTO `perawat` (`Id_TenagaMedis`, `Nama_Perawat`) VALUES
('ID001', 'Yusuf'),
('ID002', 'Reza'),
('ID003', 'Eci');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perawat_pasien`
--

CREATE TABLE `perawat_pasien` (
  `Id_TenagaMedis` char(5) DEFAULT NULL,
  `Id_Pasien` char(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekam_medis`
--

CREATE TABLE `rekam_medis` (
  `Id_RekamMedis` char(5) NOT NULL,
  `Tanggal_Pemeriksaan` char(20) DEFAULT NULL,
  `Gejala_Penyakit` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `rekam_medis`
--

INSERT INTO `rekam_medis` (`Id_RekamMedis`, `Tanggal_Pemeriksaan`, `Gejala_Penyakit`) VALUES
('ID001', '12 Juli 2001', 'Otak'),
('ID002', '3 Mei 2021', 'Batuk');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tenaga_medis`
--

CREATE TABLE `tenaga_medis` (
  `Id_TenagaMedis` char(5) NOT NULL,
  `Jenis_Kelamin` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tenaga_medis`
--

INSERT INTO `tenaga_medis` (`Id_TenagaMedis`, `Jenis_Kelamin`) VALUES
('ID001', 'L'),
('ID002', 'P'),
('ID003', 'P');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`Id_TenagaMedis`);

--
-- Indeks untuk tabel `multivalue_dosisobat`
--
ALTER TABLE `multivalue_dosisobat`
  ADD KEY `Id_Obat` (`Id_Obat`);

--
-- Indeks untuk tabel `multivalue_notelpon`
--
ALTER TABLE `multivalue_notelpon`
  ADD KEY `Id_Pasien` (`Id_Pasien`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`Id_Obat`),
  ADD KEY `Id_TenagaMedis` (`Id_TenagaMedis`),
  ADD KEY `Id_Pasien` (`Id_Pasien`);

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`Id_Pasien`),
  ADD KEY `Id_TenagaMedis` (`Id_TenagaMedis`);

--
-- Indeks untuk tabel `pasien_rekammedis`
--
ALTER TABLE `pasien_rekammedis`
  ADD KEY `Id_Pasien` (`Id_Pasien`),
  ADD KEY `Id_RekamMedis` (`Id_RekamMedis`);

--
-- Indeks untuk tabel `penyakit`
--
ALTER TABLE `penyakit`
  ADD KEY `Id_Pasien` (`Id_Pasien`),
  ADD KEY `Id_RekamMedis` (`Id_RekamMedis`);

--
-- Indeks untuk tabel `perawat`
--
ALTER TABLE `perawat`
  ADD PRIMARY KEY (`Id_TenagaMedis`);

--
-- Indeks untuk tabel `perawat_pasien`
--
ALTER TABLE `perawat_pasien`
  ADD KEY `Id_TenagaMedis` (`Id_TenagaMedis`),
  ADD KEY `Id_Pasien` (`Id_Pasien`);

--
-- Indeks untuk tabel `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD PRIMARY KEY (`Id_RekamMedis`);

--
-- Indeks untuk tabel `tenaga_medis`
--
ALTER TABLE `tenaga_medis`
  ADD PRIMARY KEY (`Id_TenagaMedis`);

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `multivalue_dosisobat`
--
ALTER TABLE `multivalue_dosisobat`
  ADD CONSTRAINT `multivalue_dosisobat_ibfk_1` FOREIGN KEY (`Id_Obat`) REFERENCES `obat` (`Id_Obat`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `multivalue_notelpon`
--
ALTER TABLE `multivalue_notelpon`
  ADD CONSTRAINT `multivalue_notelpon_ibfk_1` FOREIGN KEY (`Id_Pasien`) REFERENCES `pasien` (`Id_Pasien`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD CONSTRAINT `obat_ibfk_1` FOREIGN KEY (`Id_TenagaMedis`) REFERENCES `tenaga_medis` (`Id_TenagaMedis`) ON UPDATE CASCADE,
  ADD CONSTRAINT `obat_ibfk_2` FOREIGN KEY (`Id_Pasien`) REFERENCES `pasien` (`Id_Pasien`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD CONSTRAINT `pasien_ibfk_1` FOREIGN KEY (`Id_TenagaMedis`) REFERENCES `tenaga_medis` (`Id_TenagaMedis`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `pasien_rekammedis`
--
ALTER TABLE `pasien_rekammedis`
  ADD CONSTRAINT `pasien_rekammedis_ibfk_1` FOREIGN KEY (`Id_Pasien`) REFERENCES `pasien` (`Id_Pasien`) ON UPDATE CASCADE,
  ADD CONSTRAINT `pasien_rekammedis_ibfk_2` FOREIGN KEY (`Id_RekamMedis`) REFERENCES `rekam_medis` (`Id_RekamMedis`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `penyakit`
--
ALTER TABLE `penyakit`
  ADD CONSTRAINT `penyakit_ibfk_1` FOREIGN KEY (`Id_Pasien`) REFERENCES `pasien` (`Id_Pasien`) ON UPDATE CASCADE,
  ADD CONSTRAINT `penyakit_ibfk_2` FOREIGN KEY (`Id_RekamMedis`) REFERENCES `rekam_medis` (`Id_RekamMedis`) ON UPDATE CASCADE;

--
-- Ketidakleluasaan untuk tabel `perawat_pasien`
--
ALTER TABLE `perawat_pasien`
  ADD CONSTRAINT `perawat_pasien_ibfk_1` FOREIGN KEY (`Id_TenagaMedis`) REFERENCES `tenaga_medis` (`Id_TenagaMedis`) ON UPDATE CASCADE,
  ADD CONSTRAINT `perawat_pasien_ibfk_2` FOREIGN KEY (`Id_Pasien`) REFERENCES `pasien` (`Id_Pasien`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
