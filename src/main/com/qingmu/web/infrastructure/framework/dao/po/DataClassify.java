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
@TableName("qm_data_classify_t")
public class DataClassify extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "classify_id", type = IdType.AUTO)
    private Long classifyId;

    private String classifyCode;

    private String classifyDesc;

    private String parentClassifyCode;


    public Long getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Long classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyCode() {
        return classifyCode;
    }

    public void setClassifyCode(String classifyCode) {
        this.classifyCode = classifyCode;
    }

    public String getClassifyDesc() {
        return classifyDesc;
    }

    public void setClassifyDesc(String classifyDesc) {
        this.classifyDesc = classifyDesc;
    }

    public String getParentClassifyCode() {
        return parentClassifyCode;
    }

    public void setParentClassifyCode(String parentClassifyCode) {
        this.parentClassifyCode = parentClassifyCode;
    }

    @Override
    public String toString() {
        return "DataClassifyT{" +
        "classifyId=" + classifyId +
        ", classifyCode=" + classifyCode +
        ", classifyDesc=" + classifyDesc +
        ", parentClassifyCode=" + parentClassifyCode +
        ", status=" + getStatus() +
        ", deleteFlag=" + getDeleteFlag() +
        ", creationDate=" + getCreationDate() +
        ", lastUpdateDate=" + getLastUpdateDate() +
        "}";
    }
}
