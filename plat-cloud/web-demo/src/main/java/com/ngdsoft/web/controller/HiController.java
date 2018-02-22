package com.ngdsoft.web.controller;


import com.ngdsoft.client.user.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private UserServiceClient userServiceClient;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return userServiceClient.hello(name);
    }
}
