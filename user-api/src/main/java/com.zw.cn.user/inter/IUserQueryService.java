package com.zw.cn.user.inter;

import com.zw.cn.user.request.UserQueryRequest;
import com.zw.cn.user.response.UserQueryResponse;

/**
 * Created with IntelliJ IDEA.
 * User: zhaowei
 * Date: 2019/8/13
 * Time: 9:21
 * To change this template use File | Settings | File Templates.
 * Description: TODO
 */
public interface IUserQueryService {

    /**
     * 根据用户id来查询用户信息
     * @param request
     * @return
     */
    UserQueryResponse getUserById(UserQueryRequest request);

}
