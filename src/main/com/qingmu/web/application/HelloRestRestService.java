package com.qingmu.web.application;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qingmu.web.infrastructure.framework.dao.po.Role;
import com.qingmu.web.infrastructure.framework.dao.po.User;
import com.qingmu.web.infrastructure.framework.dao.RoleMapper;
import com.qingmu.web.infrastructure.framework.dao.UserMapper;
import com.qingmu.web.facade.IHelloRestService;
import com.qingmu.web.infrastructure.framework.dao.po.TablePO;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Named("helloRestService")
public class HelloRestRestService implements IHelloRestService {

    @Override
    public String queryTableName() {
        List<TablePO> tablePOS = new LinkedList<>();
        return tablePOS.stream().map(TablePO::getTableName).collect(Collectors.joining(System.lineSeparator()));
    }

    @Inject
    UserMapper UserMapper;

    @Inject
    RoleMapper RoleMapper;

    @Override
    public List<User> getUser() {
        return UserMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Role> getRoleList() {
        return RoleMapper.selectList(new QueryWrapper<>());
    }
}
