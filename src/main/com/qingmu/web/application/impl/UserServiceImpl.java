package com.qingmu.web.application.impl;

import com.qingmu.web.facade.service.UserService;
import com.qingmu.web.infrastructure.framework.dao.po.User;
import com.qingmu.web.infrastructure.framework.dao.UserMapper;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
