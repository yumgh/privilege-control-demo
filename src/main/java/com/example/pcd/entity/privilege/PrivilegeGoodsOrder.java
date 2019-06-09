package com.example.pcd.entity.privilege;

import lombok.Data;

/**
 * @author yuming
 * @date 2019/6/9
 */
@Data
public class PrivilegeGoodsOrder {

    /** 主键 */
    private Integer id;

    /** 系统ID */
    private String systemId;

    /** 场景ID */
    private String sceneId;

    /** 权限开启状态，默认为关闭-N，开启为Y */
    private String privilegeStatus;

    /** 订单ID */
    private Boolean orderId;

    /** 用户ID */
    private Boolean userId;

    /** 商品数量 */
    private Boolean goodsCount;

    /** 订单金额 */
    private Boolean totalMoney;

    /** 创建者 */
    private Boolean createdBy;

    /** 创建时间 */
    private Boolean createdDate;

    /** 更新人 */
    private Boolean updatedBy;

    /** 更新时间 */
    private Boolean updatedDate;
}