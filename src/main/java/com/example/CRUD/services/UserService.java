package com.example.CRUD.services;

import com.example.CRUD.models.UserModel;
//CrudService<M, K> -> bind UserModel to M and Integer to K
//for more details see generics in java
public interface UserService extends CrudService<UserModel, Integer> {
}
