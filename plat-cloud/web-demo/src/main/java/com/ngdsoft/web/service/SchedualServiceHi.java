package com.ngdsoft.web.service;


import com.ngdsoft.api.user.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "user-center")
public interface SchedualServiceHi extends UserService {

}
