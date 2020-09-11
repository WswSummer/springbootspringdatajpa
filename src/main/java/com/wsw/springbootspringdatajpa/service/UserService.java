package com.wsw.springbootspringdatajpa.service;

import com.wsw.springbootspringdatajpa.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * @Author WangSongWen
 * @Date: Created in 14:22 2020/9/11
 * @Description:
 */
public interface UserService {
    User findUserByUsername(String username);

    void save(User user);

    //排序查询
    List<User> findAll(Sort sort);

    //分页查询
    Page<User> findAll(Pageable pageable);
}
