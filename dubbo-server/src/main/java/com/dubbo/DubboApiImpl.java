package com.dubbo;

import com.dubbo.example.DubboApi;
import com.dubbo.example.User;
import org.springframework.stereotype.Service;

/**
 * Created by qiuhn on 2016/4/25.
 */
@Service("dubboApi")
public class DubboApiImpl implements DubboApi {

    @Override
    public User hello(String name) {
        User user = new User();
        user.setId("1");
        user.setName("张三");
        return user;
    }

    @Override
    public String sleep() {
        return null;
    }
}
