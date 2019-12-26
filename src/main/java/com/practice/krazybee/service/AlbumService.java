package com.practice.krazybee.service;

import java.util.List;

public interface AlbumService<T, ID> {

    List<T> findAll();

    T findById(ID id);

    T save(T object);

    List<T> saveAll(List<T> objects);


//    void delete(T object);
//
//    void deleteById(ID id);

}
