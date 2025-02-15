package com.qingmu.web.infrastructure.framework.dao.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("qm_data_classify_t")
public class Currency extends BaseEntity {
    @TableId(value = "classify_id", type = IdType.AUTO)
    private Long currencyId;               // 货币ID
    private String currencyCode;           // 货币编码
    private String currencyName;           // 货币名称
    private String description;            // 货币描述
    private Integer amountPrecision;       // 金额精度
    private Integer ratePrecision;         // 汇率精度
    private String roundingMethod;         // 圆整方式
    private String currencyHolidays;      // 货币节假日（存储JSON格式）
    private String dayCountConvention; // 默认年天数基准
}
