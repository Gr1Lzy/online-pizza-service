package org.github.application.dto.productitem;

import lombok.Data;

@Data
public class ProductItemDto {
    private Long id;
    private String name;
    private Long size;
    private Long pizzaType;
}
