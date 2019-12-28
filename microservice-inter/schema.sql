DROP TABLE IF EXISTS account;

CREATE TABLE account (
  id INT NOT NULL AUTO_INCREMENT,
  account_id INT NOT NULL,
  user_id VARCHAR(100) NOT NULL,
  total_data_balance VARCHAR(100) NOT NULL,
  available_data_balance VARCHAR(100) NOT NULL,
  used_data_balance VARCHAR(100) NOT NULL,
  created_date TIMESTAMP NOT NULL,
  updated_date TIMESTAMP,
  PRIMARY KEY (id));

insert into account (account_id,user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values (1,'7','30.0','27.0','3.0', current_timestamp());
insert into account (account_id,user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values (2,'1','20.0','17.0','3.0', current_timestamp());
insert into account (account_id,user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values (3,'2','10.0','7.0','3.0', current_timestamp());
insert into account (account_id,user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values (4,'7','25.0','23.0','4.0', current_timestamp());
insert into account (account_id,user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values (5,'8','20.0','17.0','3.0', current_timestamp());
insert into account (account_id,user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values (6,'8','10.0','7.0','3.0', current_timestamp());
insert into account (account_id,user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values (7,'8','25.0','23.0','4.0', current_timestamp());