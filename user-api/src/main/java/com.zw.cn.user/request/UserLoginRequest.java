package com.zw.cn.user.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: zhaowei
 * Date: 2019/8/13
 * Time: 9:23
 * To change this template use File | Settings | File Templates.
 * Description: TODO
 */
@Setter
@Getter
@Data
public class UserLoginRequest implements Serializable {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

}
