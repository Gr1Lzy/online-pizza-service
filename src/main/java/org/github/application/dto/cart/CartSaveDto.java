package org.github.application.dto.cart;

import lombok.Data;

@Data
public class CartSaveDto {
    private Long userId;
    private Long totalAmount;
}
