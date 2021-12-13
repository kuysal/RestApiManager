package com.kry.restapimanager.service;

import com.kry.restapimanager.model.User;
import com.kry.restapimanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public String addUser(User user) {
        userRepository.save(user);
        return "User saved succesfully";
    }

    @Override
    public List<User> getUsers(List<Integer> userIdList) {
        return userRepository.findAllById(userIdList);
    }
}
