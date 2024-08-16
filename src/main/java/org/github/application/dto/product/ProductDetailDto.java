package org.github.application.dto.product;

import lombok.Data;
import org.github.application.model.Category;
import org.github.application.model.Ingredient;
import org.github.application.model.ProductItem;

import java.util.Set;

@Data
public class ProductDetailDto {
    private String id;
    private String name;
    private String imageUrl;
    private String createAt;
    private String updateAt;
    private Category category;
    private Set<ProductItem> productItems;
    private Set<Ingredient> ingredients;
}
