DROP TABLE IF EXISTS users;

CREATE TABLE users (
  id INT NOT NULL AUTO_INCREMENT,
  user_id INT NOT NULL,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  phone_number VARCHAR(100) NOT NULL,
  address_line1 VARCHAR(100) NOT NULL,
  address_line2 VARCHAR(100) NOT NULL,
  created_date TIMESTAMP NOT NULL,
  updated_date TIMESTAMP,
  PRIMARY KEY (id));
  
insert into users (first_name,last_name,email,phone_number,address_line1,address_line2, created_date)
values ('marikannan','paramasivam','maricutes@gmail.com','01111509589','Jalan ipoh,Sentul','Kuala lumpur', current_timestamp());