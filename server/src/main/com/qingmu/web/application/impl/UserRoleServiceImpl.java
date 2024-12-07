package com.qingmu.web.application.impl;

import com.qingmu.web.facade.service.admin.UserRoleService;
import com.qingmu.web.infrastructure.framework.dao.po.UserRole;
import com.qingmu.web.infrastructure.framework.dao.UserRoleMapper;
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
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
