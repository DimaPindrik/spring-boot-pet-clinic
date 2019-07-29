package com.devdim.sfpetclinic.services;

import java.util.Set;

/**
 * created by Dima on 7/29/2019.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
