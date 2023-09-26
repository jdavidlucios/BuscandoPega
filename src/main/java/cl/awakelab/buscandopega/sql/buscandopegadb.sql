CREATE DATABASE IF NOT EXISTS `buscandopega` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci */ /*!80016 DEFAULT ENCRYPTION = 'N' */;
USE `buscandopega`;

CREATE TABLE Registro_de_Postulaciones
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Fecha_Postulacion DATE,
    Plataforma        VARCHAR(100),
    Empresa           VARCHAR(100),
    Cargo             VARCHAR(50),
    Link              VARCHAR(255),
    Estado            ENUM ('Aceptado', 'Rechazado', 'Pendiente'),
    Comentarios       TEXT
);
