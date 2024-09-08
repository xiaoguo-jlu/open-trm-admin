package com.qingmu.web.infrastructure.framework.dao.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qingmu.web.infrastructure.DateConstants;

import java.util.Date;

public abstract class BaseEntity {

    private String status;

    private String deleteFlag;

    @JsonFormat(pattern = DateConstants.DEFAULT_TIME_PATTERN, timezone = DateConstants.DEFAULT_TIMEZONE)
    private Date creationDate;

    private int createdBy;

    @JsonFormat(pattern = DateConstants.DEFAULT_TIME_PATTERN, timezone = DateConstants.DEFAULT_TIMEZONE)
    private Date lastUpdateDate;

    private int lastUpdatedBy;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
