package com.wsw.springbootspringdatajpa.Repository;

import com.wsw.springbootspringdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author WangSongWen
 * @Date: Created in 14:01 2020/9/11
 * @Description:
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserByUsername(String username);
}
