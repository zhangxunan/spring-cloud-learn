package com.ngdsoft.client.user;


import com.ngdsoft.api.user.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;


@FeignClient(value = "user-center", path = "/user-api"/*, fallback = UserServiceClient.DefaultFallback.class*/)
public interface UserServiceClient extends UserService {
    /**
     * 容错处理类，当调用失败时，简单返回空字符串
     */
    @Component
    class DefaultFallback implements UserServiceClient {
        public String hello(String name) {
            return "服务不可用";
        }
    }
}
