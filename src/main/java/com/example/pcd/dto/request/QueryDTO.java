package com.example.pcd.dto.request;

import lombok.Data;

/**
 * @author yuming
 * @date 2019/6/9
 */
@Data
public class QueryDTO {

    /** 系统ID */
    private String systemId;
    /** 场景ID */
    private String sceneId;
    /** 系统用户ID */
    private String userId;
}
