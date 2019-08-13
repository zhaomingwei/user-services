package com.zw.cn.user.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: zhaowei
 * Date: 2019/8/13
 * Time: 9:32
 * To change this template use File | Settings | File Templates.
 * Description: TODO
 */
@Setter
@Getter
@Data
public class UserRegisterRequest implements Serializable {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 用户性别，0-男，1-女，2-未知
     */
    private String sex;
}
