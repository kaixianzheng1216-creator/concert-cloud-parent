package com.example.concert.order.client;

import com.example.concert.common.domain.Result;
import com.example.concert.common.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "concert-user")
public interface UserClient {
    @GetMapping("/users/{id}")
    Result<UserDTO> getUserById(@PathVariable("id") Long id);
}