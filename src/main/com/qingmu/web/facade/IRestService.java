package com.qingmu.web.facade;

import java.util.List;

/**
 * 后端服务统一接口，定义了统一的资源操作接口，包括单个增删改查/分页查询/批量查询/导入/导出
 * 所有后端管理服务都实现自该接口
 *
 * @param <D> 返回结果类型
 * @param <Q> 查询条件类型
 */
public interface IRestService<D, Q> {
    List<D> getAll(Q q);
    ActionResponse<Integer> export(Q q);
    ActionResponse<D> getSingle(D d);
    ActionResponse<D> getById(Long id);
    ActionResponse<D> insert(D d);
    ActionResponse<D> update(Long id, D d);
    ActionResponse<D> save(D d);
    ActionResponse<Integer> delete(Long id);
}
