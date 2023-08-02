DROP TABLE IF EXISTS trade;
DROP TABLE IF EXISTS security;
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS counter_party;

CREATE TABLE trade (
    trade_id int auto_increment PRIMARY KEY,
    trade_type VARCHAR(10) NOT NULL,
    trade_currency VARCHAR(10) NOT NULL,
    quantity INT NOT NULL,
    trade_settlement_date DATE NOT NULL,
    trade_status VARCHAR(10) NOT NULL,
    trade_date DATE NOT NULL,
    FOREIGN key (security_id) REFERENCES security (security_id),
    FOREIGN key (book_id) REFERENCES book (book_id),
    FOREIGN key (counter_party_id) REFERENCES counter_party_id (counter_party_id)

);

CREATE TABLE security (
    security_id int auto_increment PRIMARY KEY,
    cusip VARCHAR(50),
    isin VARCHAR(50) NOT NULL ,
    bond_currency VARCHAR(10) NOT NULL,
    bond_maturity_date DATE NOT NULL,
    coupon_percent DOUBLE NOT NULL,
    unit_price DOUBLE NOT NULL,
    face_value(mn) INT NOT NULL,
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
    bond_holder VARCHAR (100) NOT NULL,
    FOREIGN key (trade_id) REFERENCES trade (trade_id)
);

CREATE TABLE user (
    user_id int auto_increment PRIMARY KEY,
    user_name VARCHAR (100) NOT NULL,
    password VARCHAR (100) NOT NULL
);



