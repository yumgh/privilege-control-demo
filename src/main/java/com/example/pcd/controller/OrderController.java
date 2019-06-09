package com.example.pcd.controller;

import com.example.pcd.constant.ResultCode;
import com.example.pcd.dto.request.QueryDTO;
import com.example.pcd.dto.response.ResultDTO;
import com.example.pcd.entity.GoodsOrder;
import com.example.pcd.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuming
 * @date 2019/6/9
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private OrderService orderService;

    @PostMapping("/detail")
    public ResultDTO queryOrderDetail(@RequestBody QueryDTO queryDTO) {
        ResultDTO resultDTO;
        try {
            List<GoodsOrder> orderList = orderService.queryOrderDetail(queryDTO);
            return new ResultDTO(ResultCode.SUCCESS, "查询成功", orderList);
        } catch (Exception e) {
            logger.error("获取订单详情失败", e);
            resultDTO = new ResultDTO(ResultCode.ERROR, "获取订单详情失败");
        }
        return resultDTO;
    }
}
