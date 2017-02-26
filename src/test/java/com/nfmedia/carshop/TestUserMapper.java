package com.nfmedia.carshop;

import com.nfmedia.carshop.entries.User;
import com.nfmedia.carshop.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description
 * <p>
 * Author rabbit.
 * Datetime 2017/2/25.
 */
public class TestUserMapper {
    private ApplicationContext applicationContext;

    // 获取spring容器
    @Before
    public void setUp() {
        this.applicationContext = new ClassPathXmlApplicationContext("classpath:config/application.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        System.out.println(userMapper);
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }
}
