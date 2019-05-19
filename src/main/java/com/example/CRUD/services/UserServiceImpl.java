package com.example.CRUD.services;

import com.example.CRUD.entities.User;
import com.example.CRUD.models.Head;
import com.example.CRUD.models.ResponseModel;
import com.example.CRUD.models.UserModel;
import com.example.CRUD.repositories.UserRepository;
import com.example.CRUD.services.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//The implementation of UserService
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserMapper mapper;

    @Override
    public ResponseModel<UserModel> get(Integer id) {
        ResponseModel response = new ResponseModel();
        try {
            //findById is a method in CrudRepository interface (AUTO IMPLEMENTED by Spring)
            //Optional<T> is a wrapper in this case an user wrapper
            Optional<User> optional = repository.findById(id);
            optional.ifPresent((e) -> {
                response.setBody(mapper.toModel(e));
            });
        } catch (Exception exception) {
            this.setError(response, exception);
        }
        return response;
    }

    @Override
    public ResponseModel<UserModel> deleteById(Integer id) {
        ResponseModel response = new ResponseModel();
        try {
            //deleteById is a method in CrudRepository interface (AUTO IMPLEMENTED by Spring)
            repository.deleteById(id);
        } catch (Exception exception) {
            this.setError(response, exception);
        }
        return response;
    }

    @Override
    public ResponseModel<UserModel> insert(UserModel model) {
        return this.save(model);
    }

    @Override
    public ResponseModel<UserModel> update(UserModel model) {
        return this.save(model);
    }

    //Insert and Update have the same implementation
    private ResponseModel<UserModel> save(UserModel model) {
        ResponseModel response = new ResponseModel();
        try {
            User entity = mapper.toEntity(model);
            //save is a method in CrudRepository interface (AUTO IMPLEMENTED by Spring)
            User entityOut = repository.save(entity);
            UserModel modelOut = mapper.toModel(entityOut);
            response.setBody(modelOut);
        } catch (Exception exception) {
            this.setError(response, exception);
        }
        return response;
    }

    private void setError(ResponseModel response, Exception exception) {
        response.setHead(new Head("-1", exception.getMessage()));
    }
}
