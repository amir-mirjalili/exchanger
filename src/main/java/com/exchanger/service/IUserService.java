package com.exchanger.service;

import com.exchanger.domain.user.UserEntity;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    UserEntity save(UserEntity user);

    Optional<UserEntity> findById(Integer id);

    List<UserEntity> findAll();

    void deleteById(Integer id);
}
