package com.example.CRUD.services;

import com.example.CRUD.models.ResponseModel;

//Interface that define the behavior of the CRUD operations
public interface CrudService<M, K> {

    ResponseModel<M> get(K key);

    ResponseModel<M> deleteById(K key);

    ResponseModel<M> insert(M model);

    ResponseModel<M> update(M model);

}