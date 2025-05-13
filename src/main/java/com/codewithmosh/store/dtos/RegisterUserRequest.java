package com.codewithmosh.store.dtos;

import lombok.Data;

//@Data is simillar to @Getter @Setter
@Data
public class RegisterUserRequest {
    private String name;
    private String email;
    private String password;
}
