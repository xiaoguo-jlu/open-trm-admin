package com.qingmu.web.infrastructure.framework.service.impl;

import com.qingmu.web.infrastructure.framework.dao.po.DataItem;
import com.qingmu.web.infrastructure.framework.dao.DataItemMapper;
import com.qingmu.web.infrastructure.framework.service.DataItemService;
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
public class DataItemServiceImpl extends ServiceImpl<DataItemMapper, DataItem> implements DataItemService {

}
