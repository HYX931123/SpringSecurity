package org.springframe.test;


import org.junit.runner.RunWith;
import org.springframe.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by HeYixuan on 2017/4/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=Application.class)// 指定spring-boot的启动类
public class BaseTest {
}
