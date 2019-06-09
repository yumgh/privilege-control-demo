package com.example.pcd.dao.privilege;

import com.example.pcd.entity.privilege.PrivilegeGoodsOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author yuming
 * @date 2019/6/9
 */
@Mapper
public interface PrivilegeGoodsOrderDAO {

    /**
     * @param systemId 系统ID
     * @param sceneId  场景ID，对应调用的接口
     * @return
     */
    PrivilegeGoodsOrder selectPrivilege(@Param("systemId") String systemId,
                                        @Param("sceneId") String sceneId);
}