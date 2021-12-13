package com.kry.restapimanager.service;

import com.kry.restapimanager.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public String addUser(User user);

    public List<User> getUsers(List<Integer> userIdList);
}
