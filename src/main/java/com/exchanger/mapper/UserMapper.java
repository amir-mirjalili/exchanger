package com.exchanger.mapper;

import com.exchanger.domain.user.UserEntity;
import com.exchanger.dto.UserCreateDTO;
import com.exchanger.dto.UserUpdateDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity toInsertEntity(UserCreateDTO dto);
    UserEntity toUpdateEntity(UserUpdateDTO dto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    UserEntity updateEntityFromDto(UserUpdateDTO dto, @MappingTarget UserEntity entity);
    UserCreateDTO toCreateDto(UserEntity entity);
}
