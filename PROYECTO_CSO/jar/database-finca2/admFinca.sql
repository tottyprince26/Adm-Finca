-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: admfinca.mysql.database.azure.com    Database: admfinca
-- ------------------------------------------------------
-- Server version	5.6.47.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `banco`
--

DROP TABLE IF EXISTS `banco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banco` (
  `id_banco` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `representante` varchar(45) NOT NULL,
  `comunidad_id` int(11) NOT NULL,
  PRIMARY KEY (`id_banco`),
  KEY `fk_bank_idx` (`comunidad_id`),
  CONSTRAINT `fk_bank` FOREIGN KEY (`comunidad_id`) REFERENCES `comunidad` (`id_Comunidad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banco`
--

LOCK TABLES `banco` WRITE;
/*!40000 ALTER TABLE `banco` DISABLE KEYS */;
INSERT INTO `banco` VALUES (1,'Los chanchitos','estero saldado','tuku tuku',1);
/*!40000 ALTER TABLE `banco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cobro`
--

DROP TABLE IF EXISTS `cobro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cobro` (
  `id_cobro` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_cobro` varchar(45) NOT NULL,
  `fecha_vencimiento` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `cantidad` varchar(45) NOT NULL,
  `propietario_id` int(11) NOT NULL,
  `presidente_id` int(11) NOT NULL,
  PRIMARY KEY (`id_cobro`),
  KEY `fk_cob_idx` (`propietario_id`),
  KEY `fk_cobr_idx` (`presidente_id`),
  CONSTRAINT `fk_cob` FOREIGN KEY (`propietario_id`) REFERENCES `propietario` (`id_propietario`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_cobr` FOREIGN KEY (`presidente_id`) REFERENCES `presidente` (`id_presidente`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cobro`
--

LOCK TABLES `cobro` WRITE;
/*!40000 ALTER TABLE `cobro` DISABLE KEYS */;
/*!40000 ALTER TABLE `cobro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comunidad`
--

DROP TABLE IF EXISTS `comunidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comunidad` (
  `id_Comunidad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `canton` varchar(45) NOT NULL,
  `fecha_fundacion` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `referencia` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `estado` varchar(1) NOT NULL,
  PRIMARY KEY (`id_Comunidad`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comunidad`
--

LOCK TABLES `comunidad` WRITE;
/*!40000 ALTER TABLE `comunidad` DISABLE KEYS */;
INSERT INTO `comunidad` VALUES (1,'comunidad','guayaquil','guayas','Fri Jul 27 15:44:39 COT 2001','takataka','takataka','takataka','A');
/*!40000 ALTER TABLE `comunidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `director`
--

DROP TABLE IF EXISTS `director`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `director` (
  `id_director` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  `cedula` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `contacto` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `comunidad_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id_director`),
  KEY `fk_dire_idx` (`comunidad_id`),
  KEY `fk_direct_idx` (`usuario_id`),
  CONSTRAINT `fk_dire` FOREIGN KEY (`comunidad_id`) REFERENCES `comunidad` (`id_Comunidad`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_direct` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `director`
--

LOCK TABLES `director` WRITE;
/*!40000 ALTER TABLE `director` DISABLE KEYS */;
INSERT INTO `director` VALUES (1,'director',22,'1212121221','femenino','takataka','guayaquil','takataka',1,3);
/*!40000 ALTER TABLE `director` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finca`
--

DROP TABLE IF EXISTS `finca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `finca` (
  `id_finca` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `AnioFuncionamiento` varchar(45) NOT NULL,
  `propietario_id` int(11) NOT NULL,
  PRIMARY KEY (`id_finca`),
  KEY `fk_1_idx` (`propietario_id`),
  CONSTRAINT `fk_1` FOREIGN KEY (`propietario_id`) REFERENCES `propietario` (`id_propietario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finca`
--

LOCK TABLES `finca` WRITE;
/*!40000 ALTER TABLE `finca` DISABLE KEYS */;
INSERT INTO `finca` VALUES (1,'finquita','guayaquil','takataka','Fri Jul 30 15:55:18 COT 1993',1);
/*!40000 ALTER TABLE `finca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `id_pago` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_pago` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `cantidad` varchar(45) NOT NULL,
  `presidente_id` int(11) NOT NULL,
  `banco_id` int(11) NOT NULL,
  PRIMARY KEY (`id_pago`),
  KEY `fk_pag_idx` (`presidente_id`),
  KEY `fk_pgo_idx` (`banco_id`),
  CONSTRAINT `fk_pag` FOREIGN KEY (`presidente_id`) REFERENCES `presidente` (`id_presidente`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_pgo` FOREIGN KEY (`banco_id`) REFERENCES `banco` (`id_banco`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `presidente`
--

DROP TABLE IF EXISTS `presidente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `presidente` (
  `id_presidente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  `cedula` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `contacto` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `comunidad_id` int(11) NOT NULL,
  PRIMARY KEY (`id_presidente`),
  KEY `fk_presi_idx` (`comunidad_id`),
  CONSTRAINT `fk_presi` FOREIGN KEY (`comunidad_id`) REFERENCES `comunidad` (`id_Comunidad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `presidente`
--

LOCK TABLES `presidente` WRITE;
/*!40000 ALTER TABLE `presidente` DISABLE KEYS */;
INSERT INTO `presidente` VALUES (1,'presidente',24,'12412123','masculino','taka','guayaquil','taka',1);
/*!40000 ALTER TABLE `presidente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propietario`
--

DROP TABLE IF EXISTS `propietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `propietario` (
  `id_propietario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  `cedula` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `contacto` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `comunidad_id` int(11) NOT NULL,
  PRIMARY KEY (`id_propietario`),
  KEY `fk_prop_idx` (`comunidad_id`),
  CONSTRAINT `fk_prop` FOREIGN KEY (`comunidad_id`) REFERENCES `comunidad` (`id_Comunidad`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propietario`
--

LOCK TABLES `propietario` WRITE;
/*!40000 ALTER TABLE `propietario` DISABLE KEYS */;
INSERT INTO `propietario` VALUES (1,'propietario',44,'12122112','masculino','taktak','guayaquil','taktak',1);
/*!40000 ALTER TABLE `propietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `secretario`
--

DROP TABLE IF EXISTS `secretario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `secretario` (
  `id_secretario` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `edad` int(11) NOT NULL,
  `cedula` varchar(45) NOT NULL,
  `sexo` varchar(45) NOT NULL,
  `contacto` varchar(45) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `comunidad_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id_secretario`),
  KEY `fk_secre_idx` (`comunidad_id`),
  KEY `fk_secret_idx` (`usuario_id`),
  CONSTRAINT `fk_secre` FOREIGN KEY (`comunidad_id`) REFERENCES `comunidad` (`id_Comunidad`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_secret` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `secretario`
--

LOCK TABLES `secretario` WRITE;
/*!40000 ALTER TABLE `secretario` DISABLE KEYS */;
INSERT INTO `secretario` VALUES (1,'secretario',1212,'121212113','masculino','takataka','guayaquil','takataka',1,4);
/*!40000 ALTER TABLE `secretario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_usuario` (
  `id_tipo_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) NOT NULL,
  PRIMARY KEY (`id_tipo_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
INSERT INTO `tipo_usuario` VALUES (1,'director'),(2,'secretario');
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `tipo_usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `fk_user_idx` (`tipo_usuario_id`),
  CONSTRAINT `fk_user` FOREIGN KEY (`tipo_usuario_id`) REFERENCES `tipo_usuario` (`id_tipo_usuario`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'director','director',1),(2,'secretario','secretario',2),(3,'directorX','directorX',2),(4,'secretariaX','secretariaX',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-12 16:10:51
