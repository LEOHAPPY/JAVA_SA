CREATE TABLE `test`.`student` (
  `matric` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NULL,
  `nick` VARCHAR(45) NULL,
  `dob` DATE NULL,
  `fee` DECIMAL NULL,
  PRIMARY KEY (`matric`));
  
  INSERT INTO `test`.`student` (`matric`, `name`, `nick`, `fee`) VALUES ('1', 'v', 'v', '45');
INSERT INTO `test`.`student` (`matric`, `name`, `nick`, `fee`) VALUES ('2', 'g', 'g', '78');
