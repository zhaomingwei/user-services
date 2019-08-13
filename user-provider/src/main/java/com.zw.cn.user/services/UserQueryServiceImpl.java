package com.zw.cn.user.services;

import com.zw.cn.user.inter.IUserQueryService;
import com.zw.cn.user.request.UserQueryRequest;
import com.zw.cn.user.response.UserQueryResponse;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: zhaowei
 * Date: 2019/8/13
 * Time: 10:45
 * To change this template use File | Settings | File Templates.
 * Description: TODO
 */
@Service
public class UserQueryServiceImpl implements IUserQueryService {

    @Override
    public UserQueryResponse getUserById(UserQueryRequest request) {
        return null;
    }
}
