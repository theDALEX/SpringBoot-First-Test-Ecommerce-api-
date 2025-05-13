package com.codewithmosh.store.dtos;

import java.math.BigDecimal;

import com.codewithmosh.store.entities.Category;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductDto {
    @JsonProperty("product_id")
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Category category;
}
