package dao.impl;

import org.springframework.stereotype.Repository;

import dao.UserDao;
import entity.User;

@Repository //为了包扫描的时候这个Dao被扫描到  
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{  
    public UserDaoImpl(){  
        //设置命名空间  
        super.setNs("mapper.UserMapper");
    }
    //如果接口UserDao有新的方法定义，在下面就可以实现
}
