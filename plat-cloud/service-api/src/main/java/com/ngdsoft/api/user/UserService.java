package com.ngdsoft.api.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public interface UserService {

    @GetMapping(value = "/hello")
    String hello(@RequestParam("name") String name);

}
