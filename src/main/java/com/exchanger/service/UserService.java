package com.exchanger.service;

import com.exchanger.domain.user.UserEntity;
import com.exchanger.dto.UserCreateDTO;
import com.exchanger.dto.UserUpdateDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserEntity save(UserCreateDTO user);

    Optional<UserEntity> findById(Integer id);

    List<UserEntity> findAll();

    void deleteById(Integer id);

    UserEntity update(UserUpdateDTO user);

}
