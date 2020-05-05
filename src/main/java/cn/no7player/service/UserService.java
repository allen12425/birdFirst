package cn.no7player.service;

import cn.no7player.mapper.UserMapper;
import cn.no7player.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.Name;

/**
 * Created by zl on 2015/8/27.
 */

@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        User user=userMapper.findUserInfo();
        //User user=null;
        return user;
    }

}
