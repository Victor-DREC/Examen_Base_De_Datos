--EXAMÉN BASE DE DATOS

CREATE TABLE socios(
	id_socio INT PRIMARY KEY,
	nombres VARCHAR(50) NOT NULL,
	apellidos VARCHAR(50) NOT NULL,
	edad INT NOT NULL,
	fecha_registro VARCHAR(10) NOT NULL,
	activo BOOLEAN NOT NULL
);

INSERT INTO socios (id_socio, nombres, apellidos, edad, fecha_registro, activo) 
VALUES
(1, 'María Elena', 'Gómez Andrade', 28, '2023-01-15', TRUE),
(2, 'Carlos Alberto', 'Mendoza Ríos', 45, '2022-11-03', TRUE),
(3, 'Ana Lucía', 'Torres Paredes', 19, '2024-02-20', FALSE),
(4, 'Jorge Luis', 'Espinoza Castillo', 62, '2021-08-12', TRUE),
(5, 'Sofia Isabel', 'Vargas Delgado', 34, '2023-09-05', FALSE);
