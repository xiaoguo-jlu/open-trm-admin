package com.qingmu.web.infrastructure.framework.dao.po;

import lombok.Data;

import java.util.Date;

@Data
public class Currency extends BaseEntity {
    private Long currencyId;               // 货币ID
    private String currencyCode;           // 货币编码
    private String currencyName;           // 货币名称
    private String description;            // 货币描述
    private Integer amountPrecision;       // 金额精度
    private Integer ratePrecision;         // 汇率精度
    private String roundingMethod;         // 圆整方式
    private String currencyHolidays;      // 货币节假日（存储JSON格式）
}
