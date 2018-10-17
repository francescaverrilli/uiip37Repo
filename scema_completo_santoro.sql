-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema phone
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema phone
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `phone` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `phone` ;

-- -----------------------------------------------------
-- Table `phone`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `phone`.`country` (
  `code` VARCHAR(2) NOT NULL,
  `name` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`code`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `phone`.`brand`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `phone`.`brand` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) NOT NULL,
  `country` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `country` (`country` ASC) VISIBLE,
  INDEX `fk_country` (`id` ASC) VISIBLE,
  CONSTRAINT `brand_ibfk_1`
    FOREIGN KEY (`country`)
    REFERENCES `phone`.`country` (`code`))
ENGINE = InnoDB
AUTO_INCREMENT = 14
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `phone`.`opsys`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `phone`.`opsys` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(64) NOT NULL,
  `company` VARCHAR(64) NOT NULL,
  `openSource` TINYINT(1) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 12
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `phone`.`smartphone`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `phone`.`smartphone` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(64) NULL DEFAULT NULL,
  `ram` VARCHAR(5) NOT NULL,
  `cpu` VARCHAR(64) NOT NULL,
  `displayPpi` INT(11) NOT NULL,
  `displaySize` VARCHAR(12) NOT NULL,
  `displayResolution` VARCHAR(64) NOT NULL,
  `size` VARCHAR(64) NOT NULL,
  `weight` INT(4) NOT NULL,
  `notes` VARCHAR(1024) NOT NULL,
  `brand` INT(11) NOT NULL,
  `opsys` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_brand` (`brand` ASC) VISIBLE,
  INDEX `fk_opSys` (`opsys` ASC) VISIBLE,
  CONSTRAINT `fk_brand`
    FOREIGN KEY (`brand`)
    REFERENCES `phone`.`brand` (`id`),
  CONSTRAINT `fk_opSys`
    FOREIGN KEY (`opsys`)
    REFERENCES `phone`.`opsys` (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 20
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
