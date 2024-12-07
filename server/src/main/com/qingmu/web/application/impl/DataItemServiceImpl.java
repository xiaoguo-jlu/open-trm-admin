package com.qingmu.web.application.impl;

import com.qingmu.web.facade.service.admin.DataItemService;
import com.qingmu.web.infrastructure.framework.dao.po.DataItem;
import com.qingmu.web.infrastructure.framework.dao.DataItemMapper;
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
public class DataItemServiceImpl extends ServiceImpl<DataItemMapper, DataItem> implements DataItemService {

}
