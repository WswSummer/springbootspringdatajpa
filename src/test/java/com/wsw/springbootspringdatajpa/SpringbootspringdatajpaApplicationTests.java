package com.wsw.springbootspringdatajpa;

import com.wsw.springbootspringdatajpa.entity.User;
import com.wsw.springbootspringdatajpa.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringbootspringdatajpaApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User wsw = userService.findUserByUsername("wsw");
        System.out.println(wsw);
    }

    @Test
    void contextLoads1() {
        User user = new User();
        user.setId(2);
        user.setUsername("www");
        user.setPassword("123");
        user.setCreatetime(new Date());
        userService.save(user);
    }

    @Test
    void contextLoads2() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        List<User> userList = userService.findAll(sort);
        System.out.println(userList);
    }

    @Test
    void contextLoads3() {
        Sort sort = Sort.by(Sort.Direction.DESC, "id");
        Pageable pageable = PageRequest.of(1,10, sort);
        Page<User> users = userService.findAll(pageable);
        System.out.println(users.getTotalElements());
        System.out.println(users.getTotalPages());
    }
}
