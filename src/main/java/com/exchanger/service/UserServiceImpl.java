package com.exchanger.service;


import com.exchanger.domain.user.UserEntity;
import com.exchanger.dto.UserCreateDTO;
import com.exchanger.dto.UserUpdateDTO;
import com.exchanger.mapper.UserMapper;
import com.exchanger.repository.db.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity save(UserCreateDTO user) {
        UserEntity userEntity = UserMapper.INSTANCE.toInsertEntity(user);
        return userRepository.save(userEntity);
    }

    @Override
    public Optional<UserEntity> findById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserEntity update(UserUpdateDTO user) {
        var getUser = userRepository.findById(user.getId());
        if (getUser.isEmpty()) return new UserEntity();
        var userEntity = UserMapper.INSTANCE.updateEntityFromDto(user, getUser.get());
        return userRepository.save(userEntity);
    }
}
