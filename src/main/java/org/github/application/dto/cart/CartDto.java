package org.github.application.dto.cart;

import lombok.Data;

@Data
public class CartDto {
    private Long id;
    private Long userId;
    private Long totalAmount;
}
