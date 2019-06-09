package com.example.pcd.dao;

import com.example.pcd.entity.GoodsOrder;
import com.example.pcd.entity.privilege.PrivilegeGoodsOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yuming
 * @date 2019/6/9
 */
@Mapper
public interface GoodsOrderDAO {

    /**
     * 根据user_id查询订单详情
     *
     * @param userId
     * @return
     */
    List<GoodsOrder> selectByUserId(@Param("userId") Integer userId,
                                    @Param("privilege") PrivilegeGoodsOrder privilege);
}