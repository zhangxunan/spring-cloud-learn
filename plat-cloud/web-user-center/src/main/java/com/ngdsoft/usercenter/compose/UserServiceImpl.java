package com.ngdsoft.usercenter.compose;

import com.ngdsoft.api.user.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserServiceImpl implements UserService {

    @Value("${server.port}")
    private String port;

    @Override
    public String hello(String name) {
        return "hello " + name + " port:" + port;
    }
}
