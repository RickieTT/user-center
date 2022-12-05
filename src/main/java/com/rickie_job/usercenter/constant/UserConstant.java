package com.rickie_job.usercenter.constant;

/**
 * 接口里属性都默认为 public static
 * 用户常量接口
 */
public interface UserConstant {

    /**
     * 用户登录态键
     */
    String USER_LOGIN_STATE = "userLoginState";


    //权限
    /**
     * 默认权限
     */
    int DEFAULT_ROLE = 0;
    /**
     * 管理员权限
     */
    int ADMIN_ROLE = 1;
}
