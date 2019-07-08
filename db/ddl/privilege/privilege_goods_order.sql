/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 100121
Source Host           : localhost:3306
Source Database       : privilege

Target Server Type    : MYSQL
Target Server Version : 100121
File Encoding         : 65001

Date: 2019-06-09 21:14:28
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for privilege_goods_order
-- ----------------------------
DROP TABLE IF EXISTS `privilege_goods_order`;
CREATE TABLE `privilege_goods_order`
(
    `id`               int(11)             NOT NULL AUTO_INCREMENT COMMENT '主键',
    `system_id`        varchar(32)         NOT NULL COMMENT '系统ID',
    `scene_id`         varchar(32)         NOT NULL COMMENT '场景ID',
    `privilege_status` char(1)                      DEFAULT 'N' COMMENT '权限开启状态，默认为关闭-N，开启为Y',
    `order_id`         tinyint(1) unsigned DEFAULT '0' COMMENT '订单ID',
    `user_id`          tinyint(1) unsigned DEFAULT '0' COMMENT '用户ID',
    `goods_count`      tinyint(1) unsigned DEFAULT '0' COMMENT '商品数量',
    `total_money`      tinyint(1) unsigned DEFAULT '0' COMMENT '订单金额',
    `created_by`       tinyint(1) unsigned DEFAULT '0' COMMENT '创建者',
    `created_date`     tinyint(1) unsigned DEFAULT '0' COMMENT '创建时间',
    `updated_by`       tinyint(1) unsigned DEFAULT '0' COMMENT '更新人',
    `updated_date`     tinyint(1) unsigned DEFAULT '0' COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
