CREATE DATABASE userinfo;
USE userinfo;
CREATE TABLE USER(
                     id INT PRIMARY KEY AUTO_INCREMENT,
                     username VARCHAR(20),
                     PASSWORD VARCHAR(20)
);
INSERT INTO USER VALUES(NULL,'tom','123');
INSERT INTO USER VALUES(NULL,'jack','123');