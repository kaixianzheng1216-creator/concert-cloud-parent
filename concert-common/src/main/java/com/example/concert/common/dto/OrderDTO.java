package com.example.concert.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO implements Serializable {
    private Long id;
    private String orderNo;
    private Long userId;
    private Long productId;
    private BigDecimal amount;
    private Integer status;
    private LocalDateTime createTime;

    private UserDTO userInfo;
}