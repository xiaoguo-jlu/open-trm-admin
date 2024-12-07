package com.qingmu.web.application.impl;

import com.qingmu.web.application.AbstractRestService;
import com.qingmu.web.facade.service.admin.MenuService;
import com.qingmu.web.infrastructure.framework.dao.po.Menu;

import javax.inject.Named;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qingmu
 * @since 2024-12-07
 */
@Named
public class MenuServiceImpl extends AbstractRestService<Menu, Menu> implements MenuService {
}
