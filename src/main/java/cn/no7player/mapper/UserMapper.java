package cn.no7player.mapper;

import cn.no7player.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by zl on 2015/8/27.
 */
@Component
public interface UserMapper {
    User findUserInfo();
}
