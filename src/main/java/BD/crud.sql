USE dam2;

CREATE TABLE professor (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    cognoms VARCHAR(100) NOT NULL
);

INSERT INTO professor (nom, cognoms) VALUES ('David', 'Lozano');
INSERT INTO professor (nom, cognoms) VALUES ('Jep', 'Massanes');
INSERT INTO professor (nom, cognoms) VALUES ('Joan', 'Coll');


select * from professor;

CREATE TABLE ModulProfessional (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(50) NOT NULL,
    id_professor INT NOT NULL,
    FOREIGN KEY (id_professor) REFERENCES professor(id)
);

INSERT INTO ModulProfessional (nom, id_professor) VALUES ('Acces dades', 1);
INSERT INTO ModulProfessional (nom, id_professor) VALUES ('Programació processos', 2);
INSERT INTO ModulProfessional (nom, id_professor) VALUES ('Programació videojocs', 3);

select * from ModulProfessional;

