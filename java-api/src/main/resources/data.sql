INSERT INTO book ( book_name ) VALUES ('Trading_book_1');
INSERT INTO book ( book_name ) VALUES ('Trading_book_2');
INSERT INTO book ( book_name ) VALUES ('Trading_book_3');
INSERT INTO book ( book_name ) VALUES ('Trading_book_4');
INSERT INTO book ( book_name ) VALUES ('Trading_book_6');




INSERT INTO counter_party ( bond_holder ) VALUES ('AZ Holdings Inc');
INSERT INTO counter_party ( bond_holder ) VALUES ('Acme Co');
INSERT INTO counter_party ( bond_holder ) VALUES ('Sovereign Investments');
INSERT INTO counter_party ( bond_holder ) VALUES ('Muncipal Gov Of Orange County');
INSERT INTO counter_party ( bond_holder ) VALUES ('Goldman Sachs');
INSERT INTO counter_party ( bond_holder ) VALUES ('UBS');
INSERT INTO counter_party ( bond_holder ) VALUES ('Barclays');
INSERT INTO counter_party ( bond_holder ) VALUES ('British Telecom');
INSERT INTO counter_party ( bond_holder ) VALUES ('Pension Holdings');
INSERT INTO counter_party ( bond_holder ) VALUES ('Zurich Pension fund 4');




INSERT INTO security ( cusip ,  isin ,  bond_currency ,  bond_maturity_date ,  issuer_name ,  type ,  status ) VALUES ('', 'XS1988387210', 'USD', '05/08/2021', 'BNPParibasIssu 4,37% Microsoft Corp (USD)', 'CORP', 'active');
INSERT INTO security ( cusip ,  isin ,  bond_currency ,  bond_maturity_date ,  issuer_name ,  type ,  status ) VALUES ('123456780', 'USN0280EAR64', 'USD', '30/07/2021', 'Airbus 3.15%  USD', 'CORP', 'active');
INSERT INTO security ( cusip ,  isin ,  bond_currency ,  bond_maturity_date ,  issuer_name ,  type ,  status ) VALUES ('123456bh0', 'A12356111', 'USD', '30/09/2021', 'UBS Facebook (USD)', 'CORP', 'active');
INSERT INTO security ( cusip ,  isin ,  bond_currency ,  bond_maturity_date ,  issuer_name ,  type ,  status ) VALUES ('AMZN 3.15 08/22/27 REGS', 'USU02320AG12', 'USD', '03/08/2021', 'Amazon', 'CORP', 'active');
INSERT INTO security ( cusip ,  isin ,  bond_currency ,  bond_maturity_date ,  issuer_name ,  type ,  status ) VALUES ('BDCHBW8', 'GB00B6460505', 'GBP', '09/08/2021', 'HM Treasury United Kingdon', 'GOVN', 'active');
INSERT INTO security ( cusip ,  isin ,  bond_currency ,  bond_maturity_date ,  issuer_name ,  type ,  status ) VALUES ('87973RAA8', 'US87973RAA86', 'USD', '06/08/2021', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', 'GOVN', 'active');
INSERT INTO security ( cusip ,  isin ,  bond_currency ,  bond_maturity_date ,  issuer_name ,  type ,  status ) VALUES ('87973RAA8', 'US87973RAA86', 'USD', '22/12/2030', 'First Norway Alpha Kl.IV', 'GOVN', 'active');



INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 50, '04/08/2021', 'open', '13/05/2021', 4.37, 90, 1000, '', 'XS1988387210', 'BNPParibasIssu 4,37% Microsoft Corp (USD)');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('sell', 'GBP', 40, '04/08/2021', 'open', '04/02/2021', 4.37, 89.56, 1000, '', 'XS1988387210', 'BNPParibasIssu 4,37% Microsoft Corp (USD)');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 1000, '23/08/2021', 'open', '13/05/2021', 3.15, 105.775, 900, '123456780', 'USN0280EAR64', 'Airbus 3.15%  USD');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('sell', 'GBP', 900, '10/09/2021', 'open', '04/02/2021', 3.15, 105.775, 900, '123456780', 'USN0280EAR64', 'Airbus 3.15%  USD');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 50, '23/08/2021', 'open', '13/05/2021', 2, 90, 900, '123456bh0', 'A12356111', 'UBS Facebook (USD)');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 1000, '23/08/2021', 'open', '13/05/2021', 3.15, 105.775, 900, '123456780', 'USN0280EAR64', 'Airbus 3.15%  USD');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('sell', 'USD', 50, '23/08/2021', 'open', '13/05/2021', 2, 90, 900, '123456bh0', 'A12356111', 'UBS Facebook (USD)');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'GBP', 60, '27/09/2021', 'open', '04/02/2021', 3.15, 98.56, 900, 'AMZN 3.15 08/22/27 REGS', 'USU02320AG12', 'Amazon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 50, '23/08/2021', 'open', '23/08/2021', 3.15, 98.56, 900, 'AMZN 3.15 08/22/27 REGS', 'USU02320AG12', 'Amazon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'GBP', 1100, '27/09/2021', 'open', '27/09/2021', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('sell', 'GBP', 900, '28/09/2021', 'open', '28/09/2021', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'GBP', 2000, '29/09/2021', 'open', '29/09/2021', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('sell', 'GBP', 2000, '30/09/2021', 'open', '30/09/2021', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'GBP', 1000, '01/10/2021', 'open', '01/10/2021', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'GBP', 900, '02/10/2019', 'open', '02/10/2019', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('sell', 'GBP', 1900, '03/10/2019', 'open', '03/10/2019', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'GBP', 600, '04/10/2018', 'open', '04/10/2018', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'GBP', 600, '05/10/2019', 'open', '05/10/2019', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'GBP', 700, '06/06/2021', 'open', '06/06/2021', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('sell', 'GBP', 1300, '07/10/2021', 'open', '07/10/2011', 0.75, 110.35, 900, 'BDCHBW8', 'GB00B6460505', 'HM Treasury United Kingdon');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 60, '27/09/2021', 'open', '04/02/2012', 2.02, 100.13, 690, '87973RAA8', 'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 50, '23/08/2021', 'open', '23/08/2012', 2.02, 100.13, 690, '87973RAA8', 'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 75, '27/09/2021', 'open', '04/02/2013', 2.02, 100.13, 690, '87973RAA8', 'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 50, '23/08/2021', 'open', '23/08/2014', 2.02, 100.13, 690, '87973RAA8', 'US87973RAA86', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 300, '27/09/2021', 'open', '04/02/2016', 1.123, 98.76, 340, '87973RAA8', 'US87973RAA86', 'First Norway Alpha Kl.IV');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 300, '23/08/2021', 'open', '23/08/2012', 1.123, 98.76, 340, '87973RAA8', 'US87973RAA86', 'First Norway Alpha Kl.IV');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('buy', 'USD', 300, '27/09/2021', 'open', '04/02/2013', 1.123, 98.76, 340, '87973RAA8', 'US87973RAA86', 'First Norway Alpha Kl.IV');
INSERT INTO trade ( trade_type ,  trade_currency ,  quantity ,  trade_settlement_date ,  trade_status ,  trade_date ,  coupon_percent ,  unit_price ,  face_value ,  cusip ,  isin ,  issuer_name ) VALUES ('sell', 'USD', 300, '23/08/2021', 'open', '23/08/2015', 1.123, 98.76, 340, '87973RAA8', 'US87973RAA86', 'First Norway Alpha Kl.IV');


update trade set book_id=1 where cusip ='' and isin ='XS1988387210';
update trade set book_id=2 where cusip ='123456780' and isin ='USN0280EAR64';
update trade set book_id=3 where cusip ='123456bh0' and isin ='A12356111';
update trade set book_id=4 where cusip ='AMZN 3.15 08/22/27 REGS' and isin ='USU02320AG12' or (cusip ='87973RAA8' and isin ='US87973RAA86') ;
update trade set book_id=5 where cusip ='BDCHBW8' and isin ='GB00B6460505';


update trade set counter_party_id=1 where cusip ='' and isin ='XS1988387210' and trade_date in ('13/05/2021','04/02/2021');
update trade set counter_party_id=2 where cusip ='123456780' and isin ='USN0280EAR64' and trade_date in ('13/05/2021','04/02/2021');
update trade set counter_party_id=3 where cusip ='123456bh0' and isin ='A12356111' and trade_date in ('13/05/2021');
update trade set counter_party_id=4 where cusip ='AMZN 3.15 08/22/27 REGS' and isin ='USU02320AG12' and trade_date in ('04/02/2021','23/08/2021');
update trade set counter_party_id=5 where cusip ='BDCHBW8' and isin ='GB00B6460505' and trade_date in ('27/09/2021','28/09/2021');
update trade set counter_party_id=6 where cusip ='BDCHBW8' and isin ='GB00B6460505' and trade_date in ('29/09/2021','30/09/2021');
update trade set counter_party_id=7 where cusip ='BDCHBW8' and isin ='GB00B6460505' and trade_date in ('01/10/2021','02/10/2019','03/10/2019');
update trade set counter_party_id=8 where cusip ='BDCHBW8' and isin ='GB00B6460505' and trade_date in ('04/10/2018');
update trade set counter_party_id=9 where cusip ='BDCHBW8' and isin ='GB00B6460505' and trade_date in ('05/10/2019', '06/06/2021','07/10/2011');
update trade set counter_party_id=10 where cusip ='87973RAA8' and isin ='US87973RAA86' and trade_date in ('04/02/2012','23/08/2012','04/02/2013','23/08/2014','04/02/2016','23/08/2012','04/02/2013','23/08/2015');

update trade set security_id=1 where cusip = '' and isin ='XS1988387210' and issuer_name ='BNPParibasIssu 4,37% Microsoft Corp (USD)';
update trade set security_id=2 where cusip ='123456780' and isin ='USN0280EAR64' and issuer_name='Airbus 3.15%  USD';
update trade set security_id=3 where cusip ='123456bh0' and isin ='A12356111' and issuer_name='UBS Facebook (USD)';
update trade set security_id=4 where cusip ='AMZN 3.15 08/22/27 REGS' and isin ='USU02320AG12' and issuer_name='Amazon';
update trade set security_id=5 where cusip ='BDCHBW8' and isin ='GB00B6460505' and issuer_name='HM Treasury United Kingdon';
update trade set security_id=6 where cusip ='87973RAA8' and isin ='US87973RAA86' and issuer_name='TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S';
update trade set security_id=7 where cusip ='87973RAA8' and isin ='US87973RAA86' and issuer_name= 'First Norway Alpha Kl.IV';

INSERT INTO app_user (user_email_address) VALUES ('test1@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('test2@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('test3@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('georgewang1211@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('xyz_1@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('abc@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('test10@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('ab123@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('abcde@gmail.com');
INSERT INTO app_user (user_email_address) VALUES ('abcxyz@gmail.com');

INSERT INTO book_user (book_id, user_id) VALUES (1, 1);
INSERT INTO book_user (book_id, user_id) VALUES (3, 1);
INSERT INTO book_user (book_id, user_id) VALUES (4, 1);
INSERT INTO book_user (book_id, user_id) VALUES (1, 2);
INSERT INTO book_user (book_id, user_id) VALUES (2, 2);
INSERT INTO book_user (book_id, user_id) VALUES (4, 3);
INSERT INTO book_user (book_id, user_id) VALUES (5, 3);
INSERT INTO book_user (book_id, user_id) VALUES (2, 3);
INSERT INTO book_user (book_id, user_id) VALUES (1, 4);
INSERT INTO book_user (book_id, user_id) VALUES (4, 5);
INSERT INTO book_user (book_id, user_id) VALUES (3, 6);
INSERT INTO book_user (book_id, user_id) VALUES (2, 6);
INSERT INTO book_user (book_id, user_id) VALUES (5, 7);
INSERT INTO book_user (book_id, user_id) VALUES (2, 7);
INSERT INTO book_user (book_id, user_id) VALUES (1, 8);
INSERT INTO book_user (book_id, user_id) VALUES (4, 9);
INSERT INTO book_user (book_id, user_id) VALUES (1, 10);
INSERT INTO book_user (book_id, user_id) VALUES (3, 10);
INSERT INTO book_user (book_id, user_id) VALUES (5, 10);
