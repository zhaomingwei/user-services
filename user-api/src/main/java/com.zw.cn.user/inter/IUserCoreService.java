package com.zw.cn.user.inter;

import com.zw.cn.user.request.CheckAuthRequest;
import com.zw.cn.user.response.CheckAuthResponse;
import com.zw.cn.user.request.UserLoginRequest;
import com.zw.cn.user.response.UserLoginResponse;
import com.zw.cn.user.request.UserRegisterRequest;
import com.zw.cn.user.response.UserRegisterResponse;

/**
 * Created with IntelliJ IDEA.
 * User: zhaowei
 * Date: 2019/8/13
 * Time: 9:21
 * To change this template use File | Settings | File Templates.
 * Description: TODO
 */
public interface IUserCoreService {

    /**
     * 用户登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);

    /**
     * 校验过程
     * @param request
     * @return
     */
    CheckAuthResponse validToken(CheckAuthRequest request);

    /**
     * 注册
     */
    UserRegisterResponse register(UserRegisterRequest userRegisterRequest);

}
