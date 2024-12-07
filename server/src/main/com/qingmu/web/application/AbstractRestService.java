package com.qingmu.web.application;

import com.qingmu.web.facade.ActionResponse;
import com.qingmu.web.facade.IRestService;

import java.util.ArrayList;
import java.util.List;

public class AbstractRestService<D, Q> implements IRestService<D, Q> {
    @Override
    public List<D> getAll(Q q) {
        return new ArrayList<>();
    }

    @Override
    public ActionResponse<Integer> export(Q q) {
        return new ActionResponse<>();
    }

    @Override
    public ActionResponse<D> getSingle(D d) {
        return new ActionResponse<>();
    }

    @Override
    public ActionResponse<D> getById(Long id) {
        return new ActionResponse<>();
    }

    @Override
    public ActionResponse<D> insert(D d) {
        return new ActionResponse<>();
    }

    @Override
    public ActionResponse<D> update(Long id, D d) {
        return new ActionResponse<>();
    }

    @Override
    public ActionResponse<D> save(D d) {
        return new ActionResponse<>();
    }

    @Override
    public ActionResponse<Integer> delete(Long id) {
        return new ActionResponse<>();
    }
}
