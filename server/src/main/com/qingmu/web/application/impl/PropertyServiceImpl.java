package com.qingmu.web.application.impl;

import com.qingmu.web.facade.service.admin.PropertyService;
import com.qingmu.web.infrastructure.framework.dao.po.Property;
import com.qingmu.web.infrastructure.framework.dao.PropertyMapper;
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
public class PropertyServiceImpl extends ServiceImpl<PropertyMapper, Property> implements PropertyService {

}
