package com.qingmu.web.facade.service;

import com.qingmu.web.facade.IRestService;
import com.qingmu.web.infrastructure.framework.dao.po.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.inject.Named;
import javax.ws.rs.Path;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qingmu
 * @since 2022-07-23
 */
@Path("/menu")
@Named
public interface MenuService extends IRestService<Menu, Menu> {

}
