package com.rickie_job.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 * @Classname BaseResponse
 * @Author rickie
 * @Date 2022/11/30 11:32 AM
 */

@Data
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = -7884135703066734448L;

    private int code;

    private T data;

    private String message;

    private String description;

    public BaseResponse(int code, T data, String message, String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data, String message) {
        this(code,data,message,"");
    }

    public BaseResponse(int code, T data) {
        this(code,data,"","");
    }

    public BaseResponse(int code, String message, String description) {
        this(code,null,message,description);
    }

    public BaseResponse(ErrorCode errorCode){
        this(errorCode.getCode(),null, errorCode.getMessage(), errorCode.getDescription());
    }
}
