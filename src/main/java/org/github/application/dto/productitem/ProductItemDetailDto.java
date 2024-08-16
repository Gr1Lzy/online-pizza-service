package org.github.application.dto.productitem;

import lombok.Data;
import org.github.application.model.Product;

import java.time.LocalDateTime;

@Data
public class ProductItemDetailDto {
    private Long id;
    private String name;
    private Long size;
    private Long pizzaType;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Product product;
}
