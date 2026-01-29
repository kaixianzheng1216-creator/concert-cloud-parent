package com.example.concert.order.controller;

import com.example.concert.common.domain.Result;
import com.example.concert.common.dto.OrderDTO;
import com.example.concert.common.dto.UserDTO;
import com.example.concert.order.client.UserClient;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Tag(name = "订单管理", description = "订单相关接口")
@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final UserClient userClient;

    @Operation(summary = "根据 ID 获取订单信息")
    @GetMapping("/{id}")
    public Result<OrderDTO> getOrderById(@PathVariable Long id) {
        OrderDTO orderDTO = OrderDTO.builder()
                .id(id)
                .orderNo("ORD_" + System.currentTimeMillis())
                .userId(1001L)
                .productId(2001L)
                .amount(new BigDecimal("880.00"))
                .status(0)
                .createTime(LocalDateTime.now())
                .build();

        Result<UserDTO> userResult = userClient.getUserById(orderDTO.getUserId());

        if (userResult.getCode() == 200) {
            orderDTO.setUserInfo(userResult.getData());
        }

        return Result.success(orderDTO);
    }
}