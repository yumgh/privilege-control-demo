package com.example.pcd.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuming
 * @date 2019/6/9
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDTO {

    /** 返回码 */
    private String code;

    /** 结果描述 */
    private String message;

    /** 结果实体 */
    private Object body;

    public ResultDTO(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
