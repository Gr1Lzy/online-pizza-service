package org.github.application.service;

import org.github.application.dto.category.CategoryDetailDto;
import org.github.application.dto.category.CategoryDto;
import org.github.application.dto.category.CategorySaveDto;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    CategoryDto save(CategorySaveDto categoryDto);

    CategoryDto update(Long id, CategorySaveDto categorySaveDto);

    void delete(Long id);

    List<CategoryDto> findAll();

    Optional<CategoryDto> findById(Long id);

    Optional<CategoryDetailDto> findByIdWithDetails(Long id);
}
