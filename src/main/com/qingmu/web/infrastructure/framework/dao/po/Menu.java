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
@TableName("qm_menu_t")
public class Menu extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "menu_id", type = IdType.AUTO)
    private Long menuId;

    private String menuName;

    private String menuPath;

    private Long parentMenuId;


    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
    }

    public Long getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Long parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    @Override
    public String toString() {
        return "Menu{" +
        "menuId=" + menuId +
        ", menuName=" + menuName +
        ", menuPath=" + menuPath +
        ", parentMenuId=" + parentMenuId +
        ", status=" + getStatus() +
        ", deleteFlag=" + getDeleteFlag() +
        ", creationDate=" + getCreationDate() +
        ", lastUpdateDate=" + getLastUpdateDate() +
        "}";
    }
}
