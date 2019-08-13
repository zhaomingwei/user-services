package com.zw.cn.user.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: zhaowei
 * Date: 2019/8/13
 * Time: 9:30
 * To change this template use File | Settings | File Templates.
 * Description: TODO
 */
@Setter
@Getter
@Data
public class CheckAuthRequest implements Serializable {
    /**
     * 登录token
     */
    private String token;

}
