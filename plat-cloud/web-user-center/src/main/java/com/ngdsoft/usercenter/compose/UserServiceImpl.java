package com.ngdsoft.usercenter.compose;

import com.ngdsoft.api.user.UserService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserServiceImpl implements UserService {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
