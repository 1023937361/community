package com.nowcoder.community;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MapperTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void selectUserTest(){

        User user = userMapper.selectById(120);
        System.out.println(user);
    }

    @Test
    public void insertUserTest(){

        User user = new User();
        user.setUsername("刘万里");
        user.setPassword("123456");

        userMapper.insertUser(user);
    }
}
