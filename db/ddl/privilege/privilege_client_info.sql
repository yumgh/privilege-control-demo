CREATE TABLE `privilege_client_info`
(
    `id`               int(11)             NOT NULL AUTO_INCREMENT COMMENT '主键',
    `system_id`        varchar(32)         NOT NULL COMMENT '系统ID',
    `scene_id`         varchar(32)         NOT NULL COMMENT '场景ID',
    `privilege_status` char(1)                  DEFAULT 'N' COMMENT '权限开启状态，默认为关闭-N，开启为Y',
    `client_id`        tinyint(1) unsigned null default 0,
    `client_name`      tinyint(1) unsigned null default 0,
    `client_sex`       tinyint(1) unsigned null default 0,
    `client_phone`     tinyint(1) unsigned null default 0,
    `client_birthday`  tinyint(1) unsigned null default 0,
    `created_by`       tinyint(1) unsigned null default 0,
    `created_date`     tinyint(1) unsigned null default 0,
    `updated_by`       tinyint(1) unsigned null default 0,
    `updated_date`     tinyint(1) unsigned null default 0,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin COMMENT ='客户信息权限表'

