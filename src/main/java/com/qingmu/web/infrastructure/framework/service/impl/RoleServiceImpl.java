package com.qingmu.web.infrastructure.framework.service.impl;

import com.qingmu.web.infrastructure.framework.dao.po.Role;
import com.qingmu.web.infrastructure.framework.dao.RoleMapper;
import com.qingmu.web.infrastructure.framework.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qingmu
 * @since 2022-07-23
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
