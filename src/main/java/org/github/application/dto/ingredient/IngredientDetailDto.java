package org.github.application.dto.ingredient;

import lombok.Data;
import org.github.application.model.Product;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class IngredientDetailDto {
    private Long id;
    private String name;
    private Long price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Set<Product> products;
}
