USE dam2;


CREATE TABLE professor (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           nom VARCHAR(50) NOT NULL,
                           cognoms VARCHAR(100) NOT NULL
);


USE dam2;
INSERT INTO professor (nom, cognoms) VALUES ('David', 'Lozano');
INSERT INTO professor (nom, cognoms) VALUES ('Jep', 'Massanes');
INSERT INTO professor (nom, cognoms) VALUES ('Joan', 'Coll');


select * from professor;
