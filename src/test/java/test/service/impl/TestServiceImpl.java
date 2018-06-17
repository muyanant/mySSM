package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.dao.TestDao;
import test.entity.User;
import test.service.TestService;

import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestDao testDao;
    public List<User> findUserByName(User user) {
        return  testDao.findUserByName(user);
    }
}
