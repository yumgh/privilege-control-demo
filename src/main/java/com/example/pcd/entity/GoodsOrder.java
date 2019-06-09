package com.example.pcd.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author yuming
 * @date 2019/6/9
 */
@Data
public class GoodsOrder {

    /** 主键 */
    private Integer id;

    /** 订单ID */
    private Integer orderId;

    /** 用户ID */
    private Integer userId;

    /** 商品数量 */
    private Integer goodsCount;

    /** 订单金额 */
    private BigDecimal totalMoney;

    /** 创建者 */
    private String createdBy;

    /** 创建时间 */
    private Date createdDate;

    /** 更新人 */
    private String updatedBy;

    /** 更新时间 */
    private Date updatedDate;
}