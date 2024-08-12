package org.github.application.dto.product;

import lombok.Data;

@Data
public class ProductDetailDto {
    private String id;
    private String name;
    private String imageUrl;
    private String createAt;
    private String updateAt;
}
