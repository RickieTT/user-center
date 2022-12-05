package com.rickie_job.usercenter.exception;

import com.rickie_job.usercenter.common.ErrorCode;

/**
 * @Classname BusinessException
 * @Author rickie
 * @Date 2022/11/30 4:21 PM
 */

//运行时异常 可以不用在java的代码中显式捕获
//其实就是在做语法糖 让代码写起来更容易
public class BusinessException extends RuntimeException{
    private static final long serialVersionUID = -5050191956361632915L;

    private final int code;

    private final String description;

    public BusinessException(String message, int code, String description){
        super(message);
        this.code = code;
        this.description = description;
    }

    public BusinessException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = errorCode.getDescription();
    }

    public BusinessException(ErrorCode errorCode, String description){
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}


