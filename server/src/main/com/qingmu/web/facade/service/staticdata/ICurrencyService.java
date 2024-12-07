package com.qingmu.web.facade.service.staticdata;

import com.qingmu.web.facade.IRestService;
import com.qingmu.web.infrastructure.framework.dao.po.Currency;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author qingmu
 * @since 2024-12-07
 */
@Path("/currency")
@Produces("application/json")
@Consumes("application/json")
public interface ICurrencyService extends IRestService<Currency, Currency> {

}