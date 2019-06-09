package com.example.pcd.exception;

/**
 * @author yuming
 * @date 2019/6/9
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -4239511100713067396L;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    protected BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
