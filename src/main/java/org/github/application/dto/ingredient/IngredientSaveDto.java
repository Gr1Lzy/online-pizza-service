package org.github.application.dto.ingredient;

import lombok.Data;

@Data
public class IngredientSaveDto {
    private String name;
    private Long price;
}