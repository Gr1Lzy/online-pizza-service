package org.github.application.dto.category;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CategoryDetailDto {
    private Long id;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
