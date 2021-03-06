CREATE TABLE IF NOT EXISTS `PORTFOLIO`(
    `id` INTEGER PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL,
    `code` VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS `INSTRUMENT`(
    `id` INTEGER PRIMARY KEY,
    `name` VARCHAR(100) NOT NULL,
    `short_code` VARCHAR(100) NOT NULL,
    `price` DECIMAL(20, 8)
);

CREATE TABLE IF NOT EXISTS `PORTFOLIO_VALUE`(
    `id` INTEGER PRIMARY KEY,
    `portfolio_id` INTEGER NOT NULL,
    `instrument_id` INTEGER NOT NULL,
    `amount` DECIMAL(20, 8)
);