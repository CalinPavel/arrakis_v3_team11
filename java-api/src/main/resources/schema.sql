DROP TABLE IF EXISTS book_user;
DROP TABLE IF EXISTS trade;
DROP TABLE IF EXISTS security;
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS counter_party;
DROP TABLE IF EXISTS app_user;


CREATE TABLE security (
    security_id int auto_increment PRIMARY KEY,
    cusip VARCHAR(50),
    isin VARCHAR(50) NOT NULL ,
    bond_currency VARCHAR(10) NOT NULL,
    bond_maturity_date VARCHAR(50) NOT NULL,
    coupon_percent DOUBLE NOT NULL,
    unit_price DOUBLE NOT NULL,
    face_value INT NOT NULL,
    issuer_name varchar(100) NOT NULL,
    type varchar(50) NOT NULL,
    status varchar(50) NOT NULL

);

CREATE TABLE book (
    book_id int auto_increment PRIMARY KEY,
    book_name VARCHAR(50) NOT NULL
);

CREATE TABLE counter_party (
    counter_party_id int auto_increment PRIMARY KEY,
    bond_holder VARCHAR (100) NOT NULL
);

CREATE TABLE app_user (
    user_id int auto_increment PRIMARY KEY,
    user_email_address varchar (100) NOT NULL,
);

CREATE TABLE trade (
    trade_id INT auto_increment PRIMARY KEY,
    trade_type VARCHAR(10) NOT NULL,
    trade_currency VARCHAR(10) NOT NULL,
    quantity INT NOT NULL,
    trade_settlement_date varchar(50) NOT NULL,
    trade_status VARCHAR(10) NOT NULL,
    trade_date varchar(50) NOT NULL,
    cusip VARCHAR(50),
    isin VARCHAR(50) NOT NULL ,
    issuer_name VARCHAR(100),
    security_id INT,
    FOREIGN KEY (security_id) REFERENCES security(security_id),
    book_id INT,
    FOREIGN KEY (book_id) REFERENCES book (book_id),
    counter_party_id INT,
    FOREIGN KEY (counter_party_id) REFERENCES counter_party (counter_party_id)
);

CREATE TABLE book_user (
    book_id INT NOT NULL REFERENCES book(book_id),
    user_id INT NOT NULL REFERENCES app_user(user_id),
    PRIMARY KEY (book_id , user_id)
);