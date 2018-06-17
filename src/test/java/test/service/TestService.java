package test.service;

import test.entity.User;

import java.util.List;

public interface TestService {
    public List<User> findUserByName(User user);
}
