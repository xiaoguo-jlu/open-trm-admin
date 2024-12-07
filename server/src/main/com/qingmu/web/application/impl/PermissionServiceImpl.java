package com.qingmu.web.application.impl;

import com.qingmu.web.facade.service.admin.PermissionService;
import com.qingmu.web.infrastructure.framework.dao.po.Permission;
import com.qingmu.web.infrastructure.framework.dao.PermissionMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
