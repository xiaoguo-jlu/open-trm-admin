package com.qingmu.web.infrastructure.framework.dao.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * 
 * </p>
 *
 * @author qingmu
 * @since 2022-07-23
 */
@TableName("qm_property_t")
public class Property extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "property_id", type = IdType.AUTO)
    private Long propertyId;

    private String propertyKey;

    private String propertyValue;

    private String propertyDesc;

    private String path;

    private Long parentPropertyId;


    public Long getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(Long propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyKey() {
        return propertyKey;
    }

    public void setPropertyKey(String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPropertyDesc() {
        return propertyDesc;
    }

    public void setPropertyDesc(String propertyDesc) {
        this.propertyDesc = propertyDesc;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getParentPropertyId() {
        return parentPropertyId;
    }

    public void setParentPropertyId(Long parentPropertyId) {
        this.parentPropertyId = parentPropertyId;
    }

    @Override
    public String toString() {
        return "Property{" +
        "propertyId=" + propertyId +
        ", propertyKey=" + propertyKey +
        ", propertyValue=" + propertyValue +
        ", propertyDesc=" + propertyDesc +
        ", path=" + path +
        ", parentPropertyId=" + parentPropertyId +
        ", status=" + getStatus() +
        ", deleteFlag=" + getDeleteFlag() +
        ", creationDate=" + getCreationDate() +
        ", lastUpdateDate=" + getLastUpdateDate() +
        "}";
    }
}
