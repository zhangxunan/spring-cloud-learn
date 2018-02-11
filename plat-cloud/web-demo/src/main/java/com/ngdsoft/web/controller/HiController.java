package com.ngdsoft.web.controller;


import com.ngdsoft.web.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.hello(name);
    }
}
