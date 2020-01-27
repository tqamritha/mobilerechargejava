-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: projectdata
-- ------------------------------------------------------
-- Server version	8.0.18

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
-- Table structure for table `operatordata`
--

DROP TABLE IF EXISTS `operatordata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `operatordata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operator_name` varchar(45) NOT NULL,
  `description` varchar(90) NOT NULL,
  `rate` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operatordata`
--

LOCK TABLES `operatordata` WRITE;
/*!40000 ALTER TABLE `operatordata` DISABLE KEYS */;
INSERT INTO `operatordata` VALUES (1,'airtel','Unlimited Calling, 100 SMS Messages/ Day, 1.5GB/ Day',448),(2,'idea','2.5gb per day',500),(4,'idea','per day 2.5gb 2g/3g/4g',76),(5,'jio','5 GB/DAY PACKS',555),(6,'airtel','Unlimited Calling, 100 SMS/ Day, 1.5GB/ Day',199),(7,'idea','per day 3gb 2g/3g/4g',343),(9,'idea',' 1000 SMS. Pack valid for 28days',50),(10,'idea','per day 2.5gb/4gb',332),(11,'jio','per day 2.5gb 2g/3g/4g',344),(12,'jio','per day 3gb 2g/3g/4g',97),(13,'jio','per day 3.5gb',250),(14,'uninor','18000 All Local/STD Seconds',98),(15,'idea','per day 2.5gb 2g/3g/4g',98),(16,'docomo','Talktime of Rs. 5000 for Rs. 5000 recharge ',5000),(18,'docomo','3G Data: 1 GB / Day -- Local, STD & Roaming Calls: Unlimited -- SMS: 100 SMS / Day',399),(19,'uninor','Local Onnet at 10P/Min, Other Local at 25P/Min and STD at 30P/Min',72),(20,'idea',' filmy recharge 1gb 4g/3g/2g data valid 24 hours',20);
/*!40000 ALTER TABLE `operatordata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `userid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `mobile` bigint(10) NOT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  UNIQUE KEY `mobile_UNIQUE` (`mobile`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Amruta Ekbote ','abc12@gmail.com','amruta@123',8932658732),(2,'Pooja kolpe','p12@gmail.com','pooja@123',8998979787),(3,'Priyanka P','priyanka@gmail.com','123456789',7720819485),(4,'Sachin','s1@gmail.com','sachin@123',9988782342),(6,'Sankalp ','san@gmail.com','sankalp@123',9879879879),(7,'shradha','sara@gmail.com','sara@123',8435545656);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-01-27 10:22:19
