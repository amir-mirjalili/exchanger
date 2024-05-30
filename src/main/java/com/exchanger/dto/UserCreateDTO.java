package com.exchanger.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateDTO {
        private String name;
        private String family;
        private String password;
        private String username;
        private String nationalCode;
        private String phoneNumber;
        private String email;
}
