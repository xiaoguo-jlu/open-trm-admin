package com.qingmu.web.application.impl;

import com.qingmu.web.application.AbstractRestService;
import com.qingmu.web.facade.service.MenuService;
import com.qingmu.web.infrastructure.framework.dao.po.Menu;
import com.qingmu.web.infrastructure.framework.dao.MenuMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.inject.Named;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qingmu
 * @since 2022-07-23
 */
@Named
public class MenuServiceImpl extends AbstractRestService<Menu, Menu> implements MenuService {

}
