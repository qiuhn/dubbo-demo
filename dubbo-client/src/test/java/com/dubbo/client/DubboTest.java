package com.dubbo.client;

import com.dubbo.example.DubboApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.IOException;


/**
 * Created by qiuhn on 2016/4/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class DubboTest {

    @Resource
    private DubboApi dubboApi;

    @Test
    public void testHello() throws IOException {

        System.out.println( dubboApi.hello("111"));

        System.in.read();
    }
}
