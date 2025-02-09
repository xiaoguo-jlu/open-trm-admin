package com.qingmu.web.repository;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qingmu.web.infrastructure.framework.dao.po.Currency;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author qingmu
 * @since 2025-02-10
 */
@Named
public class CurrencyRepository extends AbstractRepository<Currency, Currency> {

    @Override
    public BaseMapper<Currency> getMapper() {
        return super.getMapper();
    }
}

