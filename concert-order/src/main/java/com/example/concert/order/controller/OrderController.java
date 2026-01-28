package com.example.concert.order.controller;

import com.example.concert.common.domain.Result;
import com.example.concert.common.dto.UserDTO;
import com.example.concert.order.client.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final UserClient userClient;

    @GetMapping("/user/{userId}")
    public Result<UserDTO> getUserInfo(@PathVariable Long userId) {
        return userClient.getUserById(userId);
    }
}