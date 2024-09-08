package com.qingmu.web.application.impl;

import com.qingmu.web.facade.service.PermissionService;
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
 * @since 2022-07-23
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
