package org.github.application.dto.cart;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CartDetailDto {
    private Long id;
    private Long totalAmount;
    private Long userId;
    private String token;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
