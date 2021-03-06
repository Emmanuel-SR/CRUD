package com.example.CRUD.services.mappers;
//Interface that define the behavior of the Mapper operations
public interface Mapper<M, E> {

    M toModel(E e);

    E toEntity(M m);

}

