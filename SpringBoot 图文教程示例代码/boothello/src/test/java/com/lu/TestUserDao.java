package com.lu;

import com.lu.dao.UserDao;
import com.lu.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @SpringBootTest(classes = {AppRun.class}) 参数为启动类的类对象
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppRun.class})
public class TestUserDao {
    @Autowired
    private UserDao userDao;

    /**
     * 测试查询方法
     */
    @Test
    public void test1(){
        List<User> all = userDao.findAll();
//        打印查询结果
        for (User user : all) {
            System.out.println(user);
        }
    }
}
