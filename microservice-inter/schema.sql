DROP TABLE IF EXISTS account;

CREATE TABLE account (
  account_id INT NOT NULL AUTO_INCREMENT,
  user_id VARCHAR(100) NOT NULL,
  total_data_balance VARCHAR(100) NOT NULL,
  available_data_balance VARCHAR(100) NOT NULL,
  used_data_balance VARCHAR(100) NOT NULL,
  created_date TIMESTAMP NOT NULL,
  updated_date TIMESTAMP,
  PRIMARY KEY (account_id));

insert into account (user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values ('7','30.0','27.0','3.0', current_timestamp());
insert into account (user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values ('1','30.0','27.0','3.0', current_timestamp());
insert into account (user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values ('10','30.0','27.0','3.0', current_timestamp());
insert into account (user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values ('8','30.0','27.0','3.0', current_timestamp());
insert into account (user_id,total_data_balance,available_data_balance,used_data_balance, created_date)
values ('9','30.0','27.0','3.0', current_timestamp());