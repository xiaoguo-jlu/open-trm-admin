package com.qingmu.web.facade;

import com.qingmu.web.infrastructure.framework.dao.po.Role;
import com.qingmu.web.infrastructure.framework.dao.po.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/hello")
@Produces("text/json")
public interface IHelloRestService {


    @GET
    @Path("/tableName")
    String queryTableName();

    @GET
    @Path("/user")
    List<User> getUser();

    @GET
    @Path("/role")
    List<Role> getRoleList();
}
