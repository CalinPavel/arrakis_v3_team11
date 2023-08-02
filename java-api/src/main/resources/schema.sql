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
    bond_maturity_date DATE NOT NULL,
    coupon_percent DOUBLE NOT NULL,
    unit_price DOUBLE NOT NULL,
    face_value INT NOT NULL,
    issuer_name VARCHAR(100) NOT NULL,
    type VARCHAR(50) NOT NULL
);

CREATE TABLE book (
    book_id int auto_increment PRIMARY KEY,
    book_name VARCHAR(50) NOT NULL,
    status VARCHAR (50) NOT NULL
);

CREATE TABLE counter_party (
    counter_party_id int auto_increment PRIMARY KEY,
    bond_holder VARCHAR (100) NOT NULL
);

CREATE TABLE app_user (
    user_id int auto_increment PRIMARY KEY,
    user_name VARCHAR (100) NOT NULL,
    password VARCHAR (100) NOT NULL
);

CREATE TABLE trade (
    trade_id INT auto_increment PRIMARY KEY,
    trade_type VARCHAR(10) NOT NULL,
    trade_currency VARCHAR(10) NOT NULL,
    quantity INT NOT NULL,
    trade_settlement_date DATE NOT NULL,
    trade_status VARCHAR(10) NOT NULL,
    trade_date DATE NOT NULL,
    security_id INT,
    FOREIGN KEY (security_id) REFERENCES security (security_id),
    book_id INT,
    FOREIGN KEY (book_id) REFERENCES book (book_id),
    counter_party_id INT,
    FOREIGN KEY (counter_party_id) REFERENCES counter_party (counter_party_id)
);



