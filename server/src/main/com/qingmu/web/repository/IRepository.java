package com.qingmu.web.repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qingmu.web.infrastructure.framework.dao.po.BaseEntity;

import java.util.List;

public interface IRepository<Q, E extends BaseEntity> {
    QueryWrapper<E> getAllQueryWrap(Q q);

    List<E> getAll(Q q);
    
    QueryWrapper<E> getSingleQueryWrap(E e);

    E getSingle(E e);
    
    E getById(Long id);
    
    E insert(E e);
    
    E update(Long id, E e);

    E save(E e);

    List<E> batchSave(List<E> e);

    List<E> batchInsert(List<E> e);

    List<E> batchUpdate(List<E> e);

    int delete(Long id);

    int deletePhysical(Long id);
}
