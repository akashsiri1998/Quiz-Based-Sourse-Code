-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: quizapp
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `userdemo`
--

DROP TABLE IF EXISTS `userdemo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userdemo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(150) DEFAULT NULL,
  `lastName` varchar(150) DEFAULT NULL,
  `userName` varchar(150) DEFAULT NULL,
  `userPassword` varchar(150) DEFAULT NULL,
  `City` varchar(150) DEFAULT NULL,
  `mobileNumber` int DEFAULT NULL,
  `userEmail` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdemo`
--

LOCK TABLES `userdemo` WRITE;
/*!40000 ALTER TABLE `userdemo` DISABLE KEYS */;
INSERT INTO `userdemo` VALUES (1,'akash','patil','akash123','Akash@123','nashik',123558,'nashik'),(2,'suraj','bhoite','suraj123','suraj@123','kolhapur',7895655,'suraj@gmail.com'),(3,'raj','kundra','raj25','raj@89','pune',1259863,'puneswarget'),(4,'rajat','patil','rajat223','rajat@235','Nashik',569887,'rajat212gmail.com'),(5,'a','a','a','a','a',123,'asd'),(6,'kunal','patil','unal12','kunal@12','pune',125468,'kunal@gmail.com'),(7,'puneet','kolhe','punit256','punit@123','nagar',4587955,'nagar'),(8,'sejal','patel','sejal45','Sejal@1223','nashik',78956455,'sejal@gmail.com'),(9,'3','3','34','5','5',5,'5'),(10,'d','d','d','d','d',12365,'d');
/*!40000 ALTER TABLE `userdemo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-20 17:14:21
