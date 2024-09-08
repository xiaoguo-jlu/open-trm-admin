package com.qingmu.web.application.impl;

import com.qingmu.web.facade.service.DataClassifyService;
import com.qingmu.web.infrastructure.framework.dao.po.DataClassify;
import com.qingmu.web.infrastructure.framework.dao.DataClassifyMapper;
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
public class DataClassifyServiceImpl extends ServiceImpl<DataClassifyMapper, DataClassify> implements DataClassifyService {

}
