package com.example.concert.user.controller;

import com.example.concert.common.domain.Result;
import com.example.concert.common.dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "用户管理", description = "用户相关接口")
@RestController
@RequestMapping("/users")
public class UserController {
    @Operation(summary = "根据 ID 获取用户信息")
    @GetMapping("/{id}")
    public Result<UserDTO> getUserById(@Parameter(description = "用户ID") @PathVariable Long id) {
        UserDTO userDTO = UserDTO.builder()
                .id(id)
                .username("test_user_" + id)
                .phone("13800138000")
                .email("test@example.com")
                .build();

        return Result.success(userDTO);
    }
}