package com.codewithmosh.store.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDto {
    // json data can be modified using @Json... ex:@JsonIgnore
    private Long id;
    private String name;
    private String email;
    // @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    // private LocalDateTime createdAt;
}
