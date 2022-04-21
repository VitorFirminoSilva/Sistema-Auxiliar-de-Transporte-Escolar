-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_projeto
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `db_projeto` ;

-- -----------------------------------------------------
-- Schema db_projeto
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_projeto` DEFAULT CHARACTER SET latin1 ;
USE `db_projeto` ;

-- -----------------------------------------------------
-- Table `db_projeto`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`cliente` (
  `cpfResponsavel` VARCHAR(14) NOT NULL,
  `celular` VARCHAR(14) NOT NULL,
  `email` VARCHAR(150) NOT NULL,
  `endereco` VARCHAR(100) NOT NULL,
  `nomeMae` VARCHAR(60) NOT NULL,
  `nomePai` VARCHAR(60) NOT NULL,
  `status` TINYINT(1) NOT NULL DEFAULT '0',
  `telefone` VARCHAR(13) NOT NULL,
  PRIMARY KEY (`cpfResponsavel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`crianca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`crianca` (
  `codCrianca` INT(11) NOT NULL AUTO_INCREMENT,
  `dataNascimento` DATE NOT NULL,
  `nome` VARCHAR(255) NOT NULL,
  `status` TINYINT(1) NOT NULL DEFAULT '0',
  `cpfResponsavel` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`codCrianca`),
  CONSTRAINT `FK_crianca_cpfResponsavel`
    FOREIGN KEY (`cpfResponsavel`)
    REFERENCES `db_projeto`.`cliente` (`cpfResponsavel`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`local`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`local` (
  `idLocal` INT(11) NOT NULL AUTO_INCREMENT,
  `bairro` VARCHAR(40) NOT NULL,
  `email` VARCHAR(40) NOT NULL,
  `responsavel` VARCHAR(40) NOT NULL,
  `rua` VARCHAR(40) NOT NULL,
  `telefone` VARCHAR(15) NOT NULL,
  `tipo` VARCHAR(40) NOT NULL,
  PRIMARY KEY (`idLocal`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`contrato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`contrato` (
  `numContrato` INT(11) NOT NULL AUTO_INCREMENT,
  `dataFim` DATE NOT NULL,
  `dataInicio` DATE NOT NULL,
  `valorContrato` DOUBLE NOT NULL,
  `codCrianca` INT(11) NOT NULL,
  `localDestino` INT(11) NOT NULL,
  `localOrigem` INT(11) NOT NULL,
  PRIMARY KEY (`numContrato`),
  CONSTRAINT `FK_contrato_codCrianca`
    FOREIGN KEY (`codCrianca`)
    REFERENCES `db_projeto`.`crianca` (`codCrianca`),
  CONSTRAINT `FK_contrato_localDestino`
    FOREIGN KEY (`localDestino`)
    REFERENCES `db_projeto`.`local` (`idLocal`),
  CONSTRAINT `FK_contrato_localOrigem`
    FOREIGN KEY (`localOrigem`)
    REFERENCES `db_projeto`.`local` (`idLocal`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`funcionario` (
  `numeroRegistro` VARCHAR(20) NOT NULL,
  `tipo` VARCHAR(31) NULL DEFAULT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `dataNascimento` DATE NOT NULL,
  `email` VARCHAR(150) NOT NULL,
  `endereco` VARCHAR(50) NOT NULL,
  `escolaridade` VARCHAR(50) NULL DEFAULT NULL,
  `estadoCivil` VARCHAR(20) NULL DEFAULT NULL,
  `naturalidade` VARCHAR(20) NULL DEFAULT NULL,
  `nomeFuncionario` VARCHAR(60) NOT NULL,
  `nomeMae` VARCHAR(60) NOT NULL,
  `nomePai` VARCHAR(60) NOT NULL,
  `numeroConta` VARCHAR(18) NOT NULL,
  `salarioBase` DOUBLE NOT NULL,
  `sexo` VARCHAR(255) NOT NULL,
  `status` TINYINT(1) NOT NULL DEFAULT '0',
  `senha` VARCHAR(32) NULL DEFAULT NULL,
  `usuario` VARCHAR(50) NULL DEFAULT NULL,
  `registroPedagogico` VARCHAR(30) NULL DEFAULT NULL,
  `cnh` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`numeroRegistro`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`veiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`veiculo` (
  `chassis` VARCHAR(255) NOT NULL,
  `condicao` VARCHAR(255) NOT NULL,
  `modelo` VARCHAR(255) NOT NULL,
  `placa` VARCHAR(255) NOT NULL,
  `qtdAssentos` INT(11) NOT NULL,
  `quilometragem` INT(11) NOT NULL,
  `status` TINYINT(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`chassis`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`historicoutilizacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`historicoutilizacao` (
  `horarioFim` TIME NULL DEFAULT NULL,
  `horarioInicio` TIME NOT NULL,
  `horarioPrevisto` TIME NOT NULL,
  `data` DATE NOT NULL,
  `motorista_registro` VARCHAR(20) NOT NULL,
  `veiculo_chassis` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`data`, `motorista_registro`, `veiculo_chassis`),
  CONSTRAINT `FK_historicoUtilizacao_motorista_registro`
    FOREIGN KEY (`motorista_registro`)
    REFERENCES `db_projeto`.`funcionario` (`numeroRegistro`),
  CONSTRAINT `FK_historicoUtilizacao_veiculo_chassis`
    FOREIGN KEY (`veiculo_chassis`)
    REFERENCES `db_projeto`.`veiculo` (`chassis`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`manutencao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`manutencao` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `dataManutencao` DATE NOT NULL,
  `descricao` VARCHAR(150) NOT NULL,
  `status` VARCHAR(2) NOT NULL,
  `tipoManutencao` VARCHAR(30) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `numChassi` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`codigo`, `numChassi`),
  CONSTRAINT `FK_manutencao_numChassi`
    FOREIGN KEY (`numChassi`)
    REFERENCES `db_projeto`.`veiculo` (`chassis`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`movimentacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`movimentacao` (
  `idMovimentacao` INT(11) NOT NULL AUTO_INCREMENT,
  `dataMovi` DATE NOT NULL,
  `descricao` VARCHAR(50) NOT NULL,
  `numReferencia` INT(11) NOT NULL,
  `tipoMovi` VARCHAR(20) NOT NULL,
  `valor` DOUBLE NOT NULL,
  PRIMARY KEY (`idMovimentacao`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`pagamento` (
  `idPagamento` INT(11) NOT NULL AUTO_INCREMENT,
  `data` DATE NOT NULL,
  `status` VARCHAR(2) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `numeroRegistro` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idPagamento`, `numeroRegistro`),
  CONSTRAINT `FK_pagamento_numeroRegistro`
    FOREIGN KEY (`numeroRegistro`)
    REFERENCES `db_projeto`.`funcionario` (`numeroRegistro`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`parcela`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`parcela` (
  `numParcela` INT(11) NOT NULL AUTO_INCREMENT,
  `dataVencimento` DATE NOT NULL,
  `status` VARCHAR(2) NOT NULL,
  `valor` DOUBLE NOT NULL,
  `numContrato` INT(11) NOT NULL,
  PRIMARY KEY (`numParcela`, `numContrato`),
  CONSTRAINT `FK_parcela_numContrato`
    FOREIGN KEY (`numContrato`)
    REFERENCES `db_projeto`.`contrato` (`numContrato`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`viagem`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`viagem` (
  `data` DATE NOT NULL,
  `motorista_registro` VARCHAR(20) NOT NULL,
  `numero_contrato` INT(11) NOT NULL,
  PRIMARY KEY (`data`, `motorista_registro`, `numero_contrato`),
  CONSTRAINT `FK_viagem_motorista_registro`
    FOREIGN KEY (`motorista_registro`)
    REFERENCES `db_projeto`.`funcionario` (`numeroRegistro`),
  CONSTRAINT `FK_viagem_numero_contrato`
    FOREIGN KEY (`numero_contrato`)
    REFERENCES `db_projeto`.`contrato` (`numContrato`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `db_projeto`.`vinculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_projeto`.`vinculo` (
  `horarioFim` TIME NULL DEFAULT NULL,
  `horarioInicio` TIME NOT NULL,
  `horarioPrevisto` TIME NOT NULL,
  `data` DATE NOT NULL,
  `monitor_registro` VARCHAR(20) NOT NULL,
  `motorista_registro` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`data`, `monitor_registro`, `motorista_registro`),
  CONSTRAINT `FK_vinculo_monitor_registro`
    FOREIGN KEY (`monitor_registro`)
    REFERENCES `db_projeto`.`funcionario` (`numeroRegistro`),
  CONSTRAINT `FK_vinculo_motorista_registro`
    FOREIGN KEY (`motorista_registro`)
    REFERENCES `db_projeto`.`funcionario` (`numeroRegistro`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- Gera movimentação ao pagar uma parcela --
DROP TRIGGER IF EXISTS `db_projeto`.`parcela_AFTER_UPDATE_WRONG_SCHEMA`;

DELIMITER $$
USE `db_projeto`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `parcela_AFTER_UPDATE` 
AFTER UPDATE ON `parcela` FOR EACH ROW 

BEGIN
	IF(NEW.status = 'PG') THEN
		INSERT INTO movimentacao (dataMovi, descricao, tipoMovi, valor, numReferencia) 
			VALUES (current_date(), 'PAGAMENTO DE UMA PARCELA DO CONTRATO', 'PARCELA', NEW.valor, NEW.numParcela);
	END IF;
END;$$
DELIMITER;

-- Gera movimentação ao liberar pagamento dos funcionários --
DROP TRIGGER IF EXISTS `db_projeto`.`pagamento_AFTER_INSERT`;

DELIMITER $$
USE `db_projeto`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `db_projeto`.`pagamento_AFTER_INSERT` 
AFTER INSERT ON `pagamento` FOR EACH ROW
BEGIN
	IF(NEW.status = 'PG') THEN
		INSERT INTO movimentacao (dataMovi, descricao, tipoMovi, valor, numReferencia) 
			VALUES (current_date(), 'PAGAMENTO DO SALARIO DE UM FUNCIONARIO', 'PAGAMENTO', NEW.valor, NEW.idPagamento);
	END IF;
END$$
DELIMITER ;


-- Gera movimentação ao pagar uma manutenção --
DROP TRIGGER IF EXISTS `db_projeto`.`manutencao_AFTER_INSERT`;

DELIMITER $$
USE `db_projeto`$$
CREATE DEFINER = CURRENT_USER TRIGGER `db_projeto`.`manutencao_AFTER_INSERT` AFTER INSERT ON `manutencao` FOR EACH ROW
BEGIN
	IF(NEW.status = 'PG') THEN
		INSERT INTO movimentacao (dataMovi, descricao, tipoMovi, valor, numReferencia) 
			VALUES (current_date(), 'PAGAMENTO DE MANUTENÇÃO', 'MANUTENCAO', NEW.valor, NEW.codigo);
	END IF;
END$$
DELIMITER ;


DROP TRIGGER IF EXISTS `db_projeto`.`manutencao_AFTER_UPDATE`;

DELIMITER $$
USE `db_projeto`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `db_projeto`.`manutencao_AFTER_UPDATE` 
AFTER UPDATE ON `manutencao` FOR EACH ROW
BEGIN
	IF(NEW.status = 'PG') THEN
		INSERT INTO movimentacao (dataMovi, descricao, tipoMovi, valor, numReferencia) 
			VALUES (current_date(), 'PAGAMENTO DE MANUTENÇÃO', 'MANUTENCAO', NEW.valor, NEW.codigo);
	END IF;
END$$
DELIMITER ;


-- Gera parcelas ao inserir um contrato com data de inicio e fim --
DROP TRIGGER IF EXISTS `db_projeto`.`contrato_AFTER_INSERT`;

DELIMITER $$
USE `db_projeto`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `contrato_AFTER_INSERT` 
AFTER INSERT ON `contrato` FOR EACH ROW 
BEGIN
    DECLARE qtde, contador, veri, i INTEGER;
	DECLARE valorparcela FLOAT;


	SELECT TIMESTAMPDIFF(MONTH,NEW.dataInicio,NEW.dataFim) INTO qtde;
	SET contador = 30;
	SET valorparcela = NEW.valorContrato/qtde;
	SELECT numContrato INTO veri FROM parcela 
		WHERE numContrato = new.numContrato AND status= 'PG';
	IF veri IS null THEN
		DELETE FROM parcela WHERE numContrato = new.numContrato;
		SET i = 1;
		
		WHILE i <= qtde DO
			INSERT INTO parcela 
				VALUES (i, DATE_ADD(CURRENT_DATE, INTERVAL contador DAY), "PD", valorParcela, NEW.numContrato);
			SET contador = contador + 30;
			SET i = i + 1;
		END WHILE;
	END IF;
END$$
DELIMITER ;



DELIMITER $$
USE `db_projeto`$$
CREATE DEFINER = CURRENT_USER TRIGGER `db_projeto`.`contrato_AFTER_UPDATE` AFTER UPDATE ON `contrato` FOR EACH ROW
BEGIN
 DECLARE qtde, contador, veri, i INTEGER;
	DECLARE valorparcela FLOAT;


	SELECT TIMESTAMPDIFF(MONTH,NEW.dataInicio,NEW.dataFim) INTO qtde;
	SET contador = 30;
	SET valorparcela = NEW.valorContrato/qtde;
	SELECT numContrato INTO veri FROM parcela 
		WHERE numContrato = new.numContrato AND status= 'PG';
	IF veri IS null THEN
		DELETE FROM parcela WHERE numContrato = new.numContrato;
		SET i = 1;
		
		WHILE i <= qtde DO
			INSERT INTO parcela 
				VALUES (i, DATE_ADD(CURRENT_DATE, INTERVAL contador DAY), "PD", valorParcela, NEW.numContrato);
			SET contador = contador + 30;
			SET i = i + 1;
		END WHILE;
	END IF;
END$$
DELIMITER ;