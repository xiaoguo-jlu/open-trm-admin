package com.qingmu.web.application.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qingmu.web.facade.service.admin.RolePermissionService;
import com.qingmu.web.infrastructure.framework.dao.RolePermissionMapper;
import com.qingmu.web.infrastructure.framework.dao.po.RolePermission;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qingmu
 * @since 2024-12-07
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService {

}
