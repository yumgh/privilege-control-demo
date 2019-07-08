CREATE TABLE `client_info`
(
    `id`              bigint(20)                    NOT NULL AUTO_INCREMENT,
    `client_id`       varchar(100) COLLATE utf8_bin NOT NULL,
    `client_name`     varchar(30) COLLATE utf8_bin       DEFAULT NULL,
    `client_sex`      char(1) COLLATE utf8_bin           DEFAULT NULL COMMENT 'F-female,M-male',
    `client_phone`    bigint(20)                         DEFAULT NULL,
    `client_birthday` datetime                           DEFAULT NULL,
    `created_by`      varchar(30) COLLATE utf8_bin       DEFAULT NULL,
    `created_date`    timestamp                     NULL DEFAULT CURRENT_TIMESTAMP,
    `updated_by`      varchar(30) COLLATE utf8_bin       DEFAULT NULL,
    `updated_date`    timestamp                     NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    UNIQUE KEY `client_info_client_id_uindex` (`client_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin COMMENT ='客户信息'

