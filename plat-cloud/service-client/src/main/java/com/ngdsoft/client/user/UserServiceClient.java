package com.ngdsoft.client.user;


import com.ngdsoft.api.user.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;


@FeignClient(value = "user-center", path = "/user-api")
public interface UserServiceClient extends UserService {
}
