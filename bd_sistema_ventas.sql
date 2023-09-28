-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-09-2023 a las 07:19:13
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_sistema_ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_categoria`
--

CREATE TABLE `tb_categoria` (
  `idCategoria` int(11) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tb_categoria`
--

INSERT INTO `tb_categoria` (`idCategoria`, `descripcion`, `estado`) VALUES
(1, 'PEGI 3 – Todas las edades', 1),
(2, 'PEGI 7 – Niños pequeños', 1),
(3, 'PEGI 12 – Niños mayores de 12 años', 1),
(4, 'PEG 16 – Niños mayores de 16 años', 1),
(5, 'PEGI 18 – Solo adultos', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_plataforma`
--

CREATE TABLE `tb_plataforma` (
  `idPlataforma` int(11) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tb_plataforma`
--

INSERT INTO `tb_plataforma` (`idPlataforma`, `descripcion`, `estado`) VALUES
(1, 'PlayStation', 1),
(2, 'Xbox', 1),
(3, 'PC', 1),
(4, 'Nintendo', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_usuario`
--

CREATE TABLE `tb_usuario` (
  `idUsuario` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `usuario` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tb_usuario`
--

INSERT INTO `tb_usuario` (`idUsuario`, `nombre`, `apellido`, `usuario`, `password`, `telefono`, `estado`) VALUES
(1, 'Santiago', 'Jaimes Pinilla', 'jaisan', '12345', '3022937045', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_videojuego`
--

CREATE TABLE `tb_videojuego` (
  `idVideojuego` int(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double(10,2) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `porcentajeIva` int(2) NOT NULL,
  `idCategoria` int(11) NOT NULL,
  `idPlataforma` int(11) NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `tb_videojuego`
--

INSERT INTO `tb_videojuego` (`idVideojuego`, `nombre`, `cantidad`, `precio`, `descripcion`, `porcentajeIva`, `idCategoria`, `idPlataforma`, `estado`) VALUES
(2, 'Mario bros', 50, 200000.00, 'Fisico', 19, 2, 4, 1),
(3, 'God of War', 25, 360000.00, 'Digital', 19, 4, 3, 1),
(4, 'God of War', 75, 400000.00, 'Fisico', 19, 4, 1, 1),
(5, 'GTA 5: Grand Theft Auto 5', 90, 200000.00, 'Fisico', 19, 5, 1, 1),
(6, 'GTA 5: Grand Theft Auto 5', 60, 180000.00, 'Digital', 19, 5, 1, 1),
(7, 'GTA 5: Grand Theft Auto 5', 50, 190000.00, 'Fisico', 19, 5, 2, 1),
(8, 'GTA 5: Grand Theft Auto 5', 70, 140000.00, 'Digital', 19, 5, 2, 1),
(9, 'GTA 5: Grand Theft Auto 5', 6, 200000.00, 'Fisico', 19, 5, 3, 1),
(10, 'GTA 5: Grand Theft Auto 5', 10, 150000.00, 'Digital', 19, 5, 3, 1),
(11, 'Elden Ring ', 69, 500000.00, 'Fisico', 19, 5, 1, 1),
(12, 'Elden Ring ', 80, 450000.00, 'Digital', 19, 5, 1, 1),
(13, 'Elden Ring ', 59, 500000.00, 'Fisico', 19, 4, 2, 1),
(14, 'Elden Ring ', 75, 450000.00, 'Digital', 19, 4, 2, 1),
(15, 'Elden Ring ', 90, 500000.00, 'Fisico', 19, 4, 3, 1),
(16, 'Elden Ring ', 100, 450000.00, 'Digital', 19, 4, 3, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_categoria`
--
ALTER TABLE `tb_categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `tb_plataforma`
--
ALTER TABLE `tb_plataforma`
  ADD PRIMARY KEY (`idPlataforma`);

--
-- Indices de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`idUsuario`);

--
-- Indices de la tabla `tb_videojuego`
--
ALTER TABLE `tb_videojuego`
  ADD PRIMARY KEY (`idVideojuego`),
  ADD KEY `idCategoria` (`idCategoria`),
  ADD KEY `idPlataforma` (`idPlataforma`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_categoria`
--
ALTER TABLE `tb_categoria`
  MODIFY `idCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `tb_plataforma`
--
ALTER TABLE `tb_plataforma`
  MODIFY `idPlataforma` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `tb_videojuego`
--
ALTER TABLE `tb_videojuego`
  MODIFY `idVideojuego` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_videojuego`
--
ALTER TABLE `tb_videojuego`
  ADD CONSTRAINT `tb_videojuego_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `tb_categoria` (`idCategoria`),
  ADD CONSTRAINT `tb_videojuego_ibfk_2` FOREIGN KEY (`idPlataforma`) REFERENCES `tb_plataforma` (`idPlataforma`),
  ADD CONSTRAINT `tb_videojuego_ibfk_3` FOREIGN KEY (`idCategoria`) REFERENCES `tb_categoria` (`idCategoria`),
  ADD CONSTRAINT `tb_videojuego_ibfk_4` FOREIGN KEY (`idPlataforma`) REFERENCES `tb_plataforma` (`idPlataforma`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
