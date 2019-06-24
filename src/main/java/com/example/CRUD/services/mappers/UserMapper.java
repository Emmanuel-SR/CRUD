package com.example.CRUD.services.mappers;

import com.example.CRUD.entities.User;
import com.example.CRUD.models.UserModel;
import org.springframework.stereotype.Component;

import static java.util.Objects.isNull;

//Implements the mapper behavior
//Convert model to entity and vice-versa
@Component
public class UserMapper implements Mapper<UserModel, User> {

    @Override
    public UserModel toModel(User entity) {
        if (isNull(entity)) return null;
        UserModel model = new UserModel();
        model.setId(entity.getId());
        model.setUser_name(entity.getUsername());
        model.setHashed_pwd(entity.getHashedPassword());
        return model;
    }

    @Override
    public User toEntity(UserModel model) {
        if (isNull(model)) return null;
        User entity = new User();
        entity.setId(model.getId());
        entity.setUsername(model.getUser_name());
        entity.setHashedPassword(model.getHashed_pwd());
        return entity;
    }

}
