package com.qingmu.web.infrastructure.framework.dao.po;

import lombok.Data;

@Data
public class Currency extends BaseEntity {
    private Long id;
    private String currencyCode;
    private String currencyName;
}
