package com.codewithmosh.store.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.codewithmosh.store.dtos.ProductDto;
import com.codewithmosh.store.dtos.RegisterUserRequest;
import com.codewithmosh.store.dtos.UpdateUserRequest;
import com.codewithmosh.store.entities.Product;
import com.codewithmosh.store.entities.User;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDto toDo(Product product);

    Product toEntity(ProductDto productDto);
}
