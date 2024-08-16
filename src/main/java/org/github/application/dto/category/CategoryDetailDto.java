package org.github.application.dto.category;

import lombok.Data;
import org.github.application.model.Product;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class CategoryDetailDto {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Set<Product> products;
}
