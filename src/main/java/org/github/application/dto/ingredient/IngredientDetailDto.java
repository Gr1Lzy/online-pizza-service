package org.github.application.dto.ingredient;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class IngredientDetailDto {
    private Long id;
    private String name;
    private Long price;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
