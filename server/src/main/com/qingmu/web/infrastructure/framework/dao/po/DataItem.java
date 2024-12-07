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
@TableName("qm_data_item_t")
public class DataItem extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "item_id", type = IdType.AUTO)
    private Long itemId;

    private String itemCode;

    private String itemName;

    private String parentItemCode;

    private String extendAttr01;

    private String extendAttr02;

    private String extendAttr03;

    private String extendAttr04;

    private String extendAttr05;


    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getParentItemCode() {
        return parentItemCode;
    }

    public void setParentItemCode(String parentItemCode) {
        this.parentItemCode = parentItemCode;
    }

    public String getExtendAttr01() {
        return extendAttr01;
    }

    public void setExtendAttr01(String extendAttr01) {
        this.extendAttr01 = extendAttr01;
    }

    public String getExtendAttr02() {
        return extendAttr02;
    }

    public void setExtendAttr02(String extendAttr02) {
        this.extendAttr02 = extendAttr02;
    }

    public String getExtendAttr03() {
        return extendAttr03;
    }

    public void setExtendAttr03(String extendAttr03) {
        this.extendAttr03 = extendAttr03;
    }

    public String getExtendAttr04() {
        return extendAttr04;
    }

    public void setExtendAttr04(String extendAttr04) {
        this.extendAttr04 = extendAttr04;
    }

    public String getExtendAttr05() {
        return extendAttr05;
    }

    public void setExtendAttr05(String extendAttr05) {
        this.extendAttr05 = extendAttr05;
    }

    @Override
    public String toString() {
        return "DataItem{" +
        "itemId=" + itemId +
        ", itemCode=" + itemCode +
        ", itemName=" + itemName +
        ", parentItemCode=" + parentItemCode +
        ", extendAttr01=" + extendAttr01 +
        ", extendAttr02=" + extendAttr02 +
        ", extendAttr03=" + extendAttr03 +
        ", extendAttr04=" + extendAttr04 +
        ", extendAttr05=" + extendAttr05 +
        ", status=" + getStatus() +
        ", deleteFlag=" + getDeleteFlag() +
        ", creationDate=" + getCreationDate() +
        ", lastUpdateDate=" + getLastUpdateDate() +
        "}";
    }
}
