DROP TABLE IF EXISTS citas;

DROP TABLE IF EXISTS clientes;

DROP TABLE IF EXISTS dentistas;

CREATE TABLE IF NOT EXISTS clientes (
	idcliente INT AUTO_INCREMENT,
    dni VARCHAR(8), 
	nom_apels VARCHAR(250) DEFAULT NULL,
	PRIMARY KEY(idcliente)
);

CREATE TABLE IF NOT EXISTS dentistas (
	id INT AUTO_INCREMENT,
	nombre VARCHAR(100) DEFAULT NULL,
	numero_doctor VARCHAR(10) DEFAULT NULL,
	PRIMARY KEY(id)
);

CREATE TABLE IF NOT EXISTS citas (
	id INT AUTO_INCREMENT,
	dentista INT,
	cliente INT,
    fecha date, 
    hora time, 
	PRIMARY KEY(id),
	KEY(dentista, cliente),
	CONSTRAINT clienteFK FOREIGN KEY (cliente) REFERENCES clientes (idcliente) ON DELETE CASCADE ON UPDATE CASCADE,
	CONSTRAINT cientificoFK FOREIGN KEY (dentista) REFERENCES dentistas (id) ON DELETE CASCADE ON UPDATE CASCADE
);
INSERT INTO clientes (dni, nom_apels) VALUES ('12345678', 'Juan García Pérez');
INSERT INTO clientes (dni, nom_apels) VALUES ('87654321', 'María González López');
INSERT INTO clientes (dni, nom_apels) VALUES ('23456789', 'Pedro Ruiz García');

INSERT INTO dentistas (nombre, numero_doctor) VALUES ('Ana Martínez', '1234');
INSERT INTO dentistas (nombre, numero_doctor) VALUES ('Pablo López', '5678');
INSERT INTO dentistas (nombre, numero_doctor) VALUES ('Luisa Fernandez', '9012');

INSERT INTO citas (dentista, cliente, fecha, hora) VALUES (1, 1, '2023-05-02', '10:00:00');
INSERT INTO citas (dentista, cliente, fecha, hora) VALUES (1, 2, '2023-05-03', '11:00:00');
INSERT INTO citas (dentista, cliente, fecha, hora) VALUES (2, 3, '2023-05-04', '12:00:00');
INSERT INTO citas (dentista, cliente, fecha, hora) VALUES (3, 1, '2023-05-05', '13:00:00');
INSERT INTO citas (dentista, cliente, fecha, hora) VALUES (3, 2, '2023-05-06', '14:00:00');