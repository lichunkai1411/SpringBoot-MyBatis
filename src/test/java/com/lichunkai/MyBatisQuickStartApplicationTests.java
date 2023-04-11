package com.lichunkai;

import com.lichunkai.mapper.UserMapper;
import com.lichunkai.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MyBatisQuickStartApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testListUser() {
        List<User> userList = userMapper.list();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
