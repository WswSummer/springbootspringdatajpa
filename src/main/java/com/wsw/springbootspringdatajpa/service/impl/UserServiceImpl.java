package com.wsw.springbootspringdatajpa.service.impl;

import com.wsw.springbootspringdatajpa.Repository.UserRepository;
import com.wsw.springbootspringdatajpa.entity.User;
import com.wsw.springbootspringdatajpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 14:23 2020/9/11
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User findUserByUsername(String username) {
        User user = userRepository.findUserByUsername(username);
        return user;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findAll(Sort sort) {
        List<User> userList = userRepository.findAll(sort);
        return userList;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        Page<User> page = userRepository.findAll(pageable);
        return page;
    }
}
