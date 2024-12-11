package com.qingmu.web.application.impl;

import com.qingmu.web.application.AbstractRestService;
import com.qingmu.web.facade.ActionResponse;
import com.qingmu.web.facade.service.staticdata.ICurrencyService;
import com.qingmu.web.infrastructure.framework.dao.po.Currency;

import javax.inject.Named;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Named
public class CurrencyService extends AbstractRestService<Currency, Currency> implements ICurrencyService {
    @Override
    public List<Currency> getAll(Currency currency) {
        List<Currency> result = new LinkedList<>();
        for (int id : Arrays.asList(1,2,3,4)) {
            Currency currency1 = new Currency();
            currency1.setId(Long.valueOf(id));
            currency1.setCurrencyCode(String.valueOf(id));
            currency1.setCurrencyName(String.valueOf(id));
            result.add(currency1);
        }
        return result;
    }

    @Override
    public ActionResponse<Integer> export(Currency currency) {
        return super.export(currency);
    }

    @Override
    public ActionResponse<Currency> getSingle(Currency currency) {
        return super.getSingle(currency);
    }

    @Override
    public ActionResponse<Currency> getById(Long id) {
        return super.getById(id);
    }

    @Override
    public ActionResponse<Currency> insert(Currency currency) {
        return super.insert(currency);
    }

    @Override
    public ActionResponse<Currency> update(Long id, Currency currency) {
        return super.update(id, currency);
    }

    @Override
    public ActionResponse<Currency> save(Currency currency) {
        return super.save(currency);
    }

    @Override
    public ActionResponse<Integer> delete(Long id) {
        return super.delete(id);
    }
}
