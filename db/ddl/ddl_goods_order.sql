/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 100121
Source Host           : localhost:3306
Source Database       : privilege

Target Server Type    : MYSQL
Target Server Version : 100121
File Encoding         : 65001

Date: 2019-06-09 21:14:18
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods_order
-- ----------------------------
DROP TABLE IF EXISTS `goods_order`;
CREATE TABLE `goods_order`
(
    `id`           int(11)     NOT NULL AUTO_INCREMENT COMMENT '主键',
    `order_id`     int(32)     NOT NULL COMMENT '订单ID',
    `user_id`      int(32)     NOT NULL COMMENT '用户ID',
    `goods_count`  int(11)     NOT NULL COMMENT '商品数量',
    `total_money`  decimal(11, 2)       DEFAULT NULL COMMENT '订单金额',
    `created_by`   varchar(32) NOT NULL COMMENT '创建者',
    `created_date` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `updated_by`   varchar(32) NOT NULL COMMENT '更新人',
    `updated_date` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE = MyISAM
  DEFAULT CHARSET = utf8;
