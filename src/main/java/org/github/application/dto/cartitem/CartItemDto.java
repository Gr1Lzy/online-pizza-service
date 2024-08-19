package org.github.application.dto.cartitem;

import lombok.Data;

@Data
public class CartItemDto {
    private Long id;
    private Long quantity;
    private Long cartId;
    private Long productItemId;
}
