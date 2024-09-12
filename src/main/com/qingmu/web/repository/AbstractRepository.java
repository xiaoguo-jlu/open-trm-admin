package com.qingmu.web.repository;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qingmu.web.infrastructure.DateConstants;
import com.qingmu.web.infrastructure.framework.dao.po.BaseEntity;

import java.util.List;

public abstract class AbstractRepository<Q, E extends BaseEntity> implements IRepository<Q, E> {
    @Override
    public QueryWrapper<E> getAllQueryWrap(Q q) {
        return null;
    }

    @Override
    public QueryWrapper<E> getSingleQueryWrap(E e) {
        return null;
    }

    public BaseMapper<E> getMapper() {
        return null;
    }

    @Override
    public List<E> getAll(Q q) {
        return getMapper().selectList(getAllQueryWrap(q));
    }

    @Override
    public E getSingle(E e) {
        return getMapper().selectOne(getSingleQueryWrap(e));
    }

    @Override
    public E getById(Long id) {
        return getMapper().selectById(id);
    }

    @Override
    public E insert(E e) {
        int result = getMapper().insert(e);
        return result == 0 ? null : getSingle(e);
    }

    @Override
    public E update(Long id, E e) {
        e.setId(id);
        getMapper().updateById(e);
        return getById(id);
    }

    @Override
    public E save(E e) {
        if (e.getId() == null) {
            return insert(e);
        } else {
            return update(e.getId(), e);
        }
    }

    @Override
    public List<E> batchSave(List<E> e) {
        return null;
    }

    @Override
    public List<E> batchInsert(List<E> e) {
        return null;
    }

    @Override
    public List<E> batchUpdate(List<E> e) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return getMapper().deleteById(id);
    }

    @Override
    public int deletePhysical(Long id) {
        return getMapper().deleteById(id);
    }
}
