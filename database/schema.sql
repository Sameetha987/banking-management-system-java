-- Database: bank_db

CREATE TABLE customers (
    customer_id     VARCHAR(20) PRIMARY KEY,
    name            VARCHAR(100) NOT NULL,
    email           VARCHAR(100) UNIQUE NOT NULL,
    mobile          VARCHAR(15) UNIQUE NOT NULL,
    pin             VARCHAR(255) NOT NULL,
    status          VARCHAR(20) NOT NULL,
    created_at      TIMESTAMP NOT NULL
);

CREATE TABLE accounts (
    account_number  VARCHAR(20) PRIMARY KEY,
    customer_id     VARCHAR(20) NOT NULL,
    account_type    VARCHAR(20) NOT NULL,
    balance         DECIMAL(15,2) NOT NULL,
    status          VARCHAR(20) NOT NULL,
    created_at      TIMESTAMP NOT NULL,

    CONSTRAINT fk_account_customer
        FOREIGN KEY (customer_id)
        REFERENCES customers(customer_id)
);

CREATE TABLE transactions (
    transaction_id  VARCHAR(30) PRIMARY KEY,
    account_number  VARCHAR(20) NOT NULL,
    customer_id     VARCHAR(20) NOT NULL,
    type            VARCHAR(20) NOT NULL,
    amount          DECIMAL(15,2) NOT NULL,
    balance_after   DECIMAL(15,2) NOT NULL,
    status          VARCHAR(20) NOT NULL,
    created_at      TIMESTAMP NOT NULL,

    CONSTRAINT fk_tx_account
        FOREIGN KEY (account_number)
        REFERENCES accounts(account_number),

    CONSTRAINT fk_tx_customer
        FOREIGN KEY (customer_id)
        REFERENCES customers(customer_id)
);

CREATE TABLE audit_logs (
    id              BIGINT AUTO_INCREMENT PRIMARY KEY,
    actor_type      VARCHAR(20) NOT NULL,
    actor_id        VARCHAR(20),
    action          VARCHAR(100) NOT NULL,
    status          VARCHAR(20) NOT NULL,
    message         VARCHAR(255),
    created_at      TIMESTAMP NOT NULL
);
