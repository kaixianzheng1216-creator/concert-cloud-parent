package com.example.concert.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(description = "订单信息传输对象")
public class OrderDTO implements Serializable {
    @Schema(description = "订单 ID")
    private Long id;

    @Schema(description = "订单编号")
    private String orderNo;

    @Schema(description = "用户 ID")
    private Long userId;

    @Schema(description = "商品 ID")
    private Long productId;

    @Schema(description = "订单金额")
    private BigDecimal amount;

    @Schema(description = "订单状态: 0-待支付, 1-已支付, 2-已取消")
    private Integer status;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "下单用户信息")
    private UserDTO userInfo;
}