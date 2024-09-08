package com.qingmu.web.application.impl;

import com.qingmu.web.facade.service.AuditLogService;
import com.qingmu.web.infrastructure.framework.dao.po.AuditLog;
import com.qingmu.web.infrastructure.framework.dao.AuditLogMapper;
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
public class AuditLogServiceImpl extends ServiceImpl<AuditLogMapper, AuditLog> implements AuditLogService {

}
