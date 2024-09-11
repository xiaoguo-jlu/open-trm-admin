package com.qingmu.web.facade;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * 后端服务统一接口，定义了统一的资源操作接口，包括单个增删改查/分页查询/批量查询/导入/导出
 * 所有后端管理服务都实现自该接口
 *
 * @param <D> 返回结果类型
 * @param <Q> 查询条件类型
 */
public interface IRestService<D, Q> {
    @Path("/getAll")
    @GET
    List<D> getAll(@QueryParam("") Q q);

    @Path("/export")
    @POST
    ActionResponse<Integer> export(@QueryParam("") Q q);

    @Path("/getSingle")
    @GET

    ActionResponse<D> getSingle(@QueryParam("") D d);

    @Path("/getById")
    @GET
    ActionResponse<D> getById(@QueryParam("") Long id);

    @Path("/insert")
    @GET
    ActionResponse<D> insert(@QueryParam("") D d);

    @Path("/update")
    @GET
    ActionResponse<D> update(Long id, @QueryParam("") D d);

    @Path("/save")
    @GET
    ActionResponse<D> save(@QueryParam("") D d);

    @Path("/delete")
    @GET
    ActionResponse<Integer> delete(@QueryParam("") Long id);
}
