package com.qingmu.web.facade;

import lombok.Data;

@Data
public class ActionResponse<D> {
    private String code;
    private String msg;
    private D data;
}
