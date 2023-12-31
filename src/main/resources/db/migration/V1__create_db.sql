CREATE TABLE CLIENT
(
    ID   INT AUTO_INCREMENT PRIMARY KEY,
    FIRST_NAME  VARCHAR(200) NOT NULL,
    LAST_NAME VARCHAR(200) NOT NULL
);

CREATE TABLE PLANET
(
    ID   INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(500) NOT NULL
);

CREATE TABLE TICKET
(
    ID             INT AUTO_INCREMENT PRIMARY KEY,
    CREATED_AT     TIMESTAMP NOT NULL,
    CLIENT_ID      INT,
    FROM_PLANET_ID INT,
    TO_PLANET_ID   INT,
    FOREIGN KEY (CLIENT_ID) REFERENCES CLIENT (ID),
    FOREIGN KEY (FROM_PLANET_ID) REFERENCES PLANET (ID),
    FOREIGN KEY (TO_PLANET_ID) REFERENCES PLANET (ID)
);
