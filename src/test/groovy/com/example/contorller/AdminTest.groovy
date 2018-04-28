package com.example.contorller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.web.bind.annotation.RequestMapping;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")

@RequestMapping("/admin")
class AdminTest {

    @Test
    @RequestMapping("/test")
    void test(){
        println "hello"
    }
}