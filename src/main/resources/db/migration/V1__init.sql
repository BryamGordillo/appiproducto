CREATE TABLE producto (
  id serial,
  description VARCHAR(45) NOT NULL,
  details VARCHAR(45) NULL,
  PRIMARY KEY (id)
  );

  CREATE TABLE cliente (
    id serial,
    description VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
    );