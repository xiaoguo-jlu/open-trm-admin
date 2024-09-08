package com.qingmu.web.infrastructure.framework.service.impl;

import com.qingmu.web.infrastructure.framework.dao.po.Menu;
import com.qingmu.web.infrastructure.framework.dao.MenuMapper;
import com.qingmu.web.infrastructure.framework.service.MenuService;
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
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
