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
@TableName("qm_permission_t")
public class Permission extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "permission_id", type = IdType.AUTO)
    private Long permissionId;

    private String resourceOperationName;

    private String resourceCode;

    private String resourceName;

    private String operationCode;

    private String operationName;


    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getResourceOperationName() {
        return resourceOperationName;
    }

    public void setResourceOperationName(String resourceOperationName) {
        this.resourceOperationName = resourceOperationName;
    }

    public String getResourceCode() {
        return resourceCode;
    }

    public void setResourceCode(String resourceCode) {
        this.resourceCode = resourceCode;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    @Override
    public String toString() {
        return "Permission{" +
        "permissionId=" + permissionId +
        ", resourceOperationName=" + resourceOperationName +
        ", resourceCode=" + resourceCode +
        ", resourceName=" + resourceName +
        ", operationCode=" + operationCode +
        ", operationName=" + operationName +
        ", status=" + getStatus() +
        ", deleteFlag=" + getDeleteFlag() +
        ", creationDate=" + getCreationDate() +
        ", lastUpdateDate=" + getLastUpdateDate() +
        "}";
    }
}
