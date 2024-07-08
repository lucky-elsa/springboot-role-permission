package com.security.rolepermissionexample.auth.model.mapper;

import com.security.rolepermissionexample.auth.model.User;
import com.security.rolepermissionexample.auth.model.entity.UserEntity;
import com.security.rolepermissionexample.common.model.mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserEntityToUserMapper extends BaseMapper<UserEntity, User> {

    @Override
    User map(UserEntity source);

    static UserEntityToUserMapper initialize() {
        return Mappers.getMapper(UserEntityToUserMapper.class);
    }

}
