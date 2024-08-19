package org.github.application.dto.cartitem;

import lombok.Data;
import org.github.application.model.Cart;
import org.github.application.model.Ingredient;
import org.github.application.model.ProductItem;

import java.util.Set;

@Data
public class CartItemDetailDto {
    private Long id;
    private Long quantity;
    private Cart cart;
    private ProductItem productItemId;
    private Set<Ingredient> ingredients;
}
