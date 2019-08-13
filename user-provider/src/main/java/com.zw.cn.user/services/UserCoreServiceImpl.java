package java.com.zw.cn.user.services;

import com.zw.cn.user.inter.IUserCoreService;
import com.zw.cn.user.request.CheckAuthRequest;
import com.zw.cn.user.request.UserLoginRequest;
import com.zw.cn.user.request.UserRegisterRequest;
import com.zw.cn.user.response.CheckAuthResponse;
import com.zw.cn.user.response.UserLoginResponse;
import com.zw.cn.user.response.UserRegisterResponse;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: zhaowei
 * Date: 2019/8/13
 * Time: 10:44
 * To change this template use File | Settings | File Templates.
 * Description: TODO
 */
@Service
@Log4j
public class UserCoreServiceImpl implements IUserCoreService {

    @Autowired


    @Override
    public UserLoginResponse login(UserLoginRequest request) {
        return null;
    }

    @Override
    public CheckAuthResponse validToken(CheckAuthRequest request) {
        return null;
    }

    @Override
    public UserRegisterResponse register(UserRegisterRequest userRegisterRequest) {
        return null;
    }
}
