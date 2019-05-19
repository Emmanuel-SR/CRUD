package com.example.CRUD.services.mappers;

import com.example.CRUD.entities.User;
import com.example.CRUD.models.UserModel;
import org.springframework.stereotype.Component;

//Implements the mapper behavior
//Convert model to entity and vice-versa
@Component
public class UserMapper implements Mapper<UserModel, User> {
    @Override
    public UserModel toModel(User entity) {
        UserModel model = new UserModel();
        model.setId(entity.getId());
        model.setName(entity.getName());
        model.setEmail(entity.getEmail());
        return model;
    }

    @Override
    public User toEntity(UserModel model) {
        User entity = new User();
        entity.setId(model.getId());
        entity.setName(model.getName());
        entity.setEmail(model.getEmail());
        return entity;
    }
}
