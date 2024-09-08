package com.qingmu.web.infrastructure.framework.service.impl;

import com.qingmu.web.infrastructure.framework.dao.po.Property;
import com.qingmu.web.infrastructure.framework.dao.PropertyMapper;
import com.qingmu.web.infrastructure.framework.service.PropertyService;
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
public class PropertyServiceImpl extends ServiceImpl<PropertyMapper, Property> implements PropertyService {

}
