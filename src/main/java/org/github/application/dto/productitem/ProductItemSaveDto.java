package org.github.application.dto.productitem;

import lombok.Data;

@Data
public class ProductItemSaveDto {
    private String name;
    private String size;
    private Long pizzaType;
}
