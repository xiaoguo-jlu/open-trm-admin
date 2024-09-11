package com.qingmu.web.repository;

import java.util.List;

public interface IRepository<Q, E> {
    List<E> getAll(Q q);
    
    Integer export(Q q);

    E getSingle(E e);
    
    E getById(Long id);
    
    E insert(E e);
    
    E update(Long id, E e);
    
    E save(E e);
    
    int delete(Long id);
}
