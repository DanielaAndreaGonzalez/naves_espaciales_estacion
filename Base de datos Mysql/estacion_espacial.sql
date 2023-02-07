CREATE DATABASE  IF NOT EXISTS `estacion_espacial` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `estacion_espacial`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: estacion_espacial
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `nave_espacial_no_tripulada`
--

DROP TABLE IF EXISTS `nave_espacial_no_tripulada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nave_espacial_no_tripulada` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `actividad` varchar(45) DEFAULT NULL,
  `velocidad` float DEFAULT NULL,
  `tipo_combustible` varchar(45) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `alto` float DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `cantidad_motores` int DEFAULT NULL,
  `tipo_estudio` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nave_espacial_no_tripulada`
--

LOCK TABLES `nave_espacial_no_tripulada` WRITE;
/*!40000 ALTER TABLE `nave_espacial_no_tripulada` DISABLE KEYS */;
INSERT INTO `nave_espacial_no_tripulada` VALUES (1,'Saturno','Japon','2022-07-12 13:38:42.985',200,'quimico',4900,2700,'no_tripulada',3,'luna'),(2,'PLuton','Europa','2022-07-12 13:38:42.985',500,'quimico',4900,2700,'no_tripulada',4,'Orbita');
/*!40000 ALTER TABLE `nave_espacial_no_tripulada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nave_espacial_tripulada`
--

DROP TABLE IF EXISTS `nave_espacial_tripulada`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nave_espacial_tripulada` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `actividad` varchar(45) DEFAULT NULL,
  `velocidad` float DEFAULT NULL,
  `tipo_combustible` varchar(45) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `alto` float DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `cantidad_personas` int DEFAULT NULL,
  `tipo_objetivo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nave_espacial_tripulada`
--

LOCK TABLES `nave_espacial_tripulada` WRITE;
/*!40000 ALTER TABLE `nave_espacial_tripulada` DISABLE KEYS */;
INSERT INTO `nave_espacial_tripulada` VALUES (1,'Mercurio','Rusia','2022-07-12 13:38:42.985',34.5,'quimico',7800,3700,'tripulada',4,'MISIONLUNAR');
/*!40000 ALTER TABLE `nave_espacial_tripulada` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo_lanzadera`
--

DROP TABLE IF EXISTS `vehiculo_lanzadera`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculo_lanzadera` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `actividad` varchar(45) DEFAULT NULL,
  `velocidad` float DEFAULT NULL,
  `tipo_combustible` varchar(45) DEFAULT NULL,
  `peso` float DEFAULT NULL,
  `alto` float DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `capacidad_carga` float DEFAULT NULL,
  `potencia` float DEFAULT NULL,
  `sistema_propulsion` float DEFAULT NULL,
  `tipo_carga` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo_lanzadera`
--

LOCK TABLES `vehiculo_lanzadera` WRITE;
/*!40000 ALTER TABLE `vehiculo_lanzadera` DISABLE KEYS */;
INSERT INTO `vehiculo_lanzadera` VALUES (1,'adfa','col','2022-07-12 13:38:42.985',0,NULL,0,0,NULL,0,0,0,NULL),(7,'Israel','EE.UU','2022-07-12 13:39:46.338',4700,'quimico',10000,5600,'vehiculo_lanzadera',3400,7800,2300,'Satelite');
/*!40000 ALTER TABLE `vehiculo_lanzadera` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-12 19:28:32
