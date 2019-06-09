package com.example.pcd.service;

import com.example.pcd.dao.GoodsOrderDAO;
import com.example.pcd.dao.privilege.PrivilegeGoodsOrderDAO;
import com.example.pcd.dto.request.QueryDTO;
import com.example.pcd.entity.GoodsOrder;
import com.example.pcd.entity.privilege.PrivilegeGoodsOrder;
import com.example.pcd.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuming
 * @date 2019/6/9
 */
@Service
public class OrderService {

    @Autowired
    private GoodsOrderDAO orderDAO;

    @Autowired
    private PrivilegeGoodsOrderDAO privilegeDAO;

    public List<GoodsOrder> queryOrderDetail(QueryDTO queryDTO) {
        List<GoodsOrder> orderList ;
        PrivilegeGoodsOrder privilege = privilegeDAO
                .selectPrivilege(queryDTO.getSystemId(), queryDTO.getSceneId());
        if (privilege != null) {
            orderList = orderDAO.selectByUserId(Integer.parseInt(queryDTO.getUserId()), privilege);
        } else {
            throw new BusinessException("没有权限");
        }
        return orderList;
    }
}
