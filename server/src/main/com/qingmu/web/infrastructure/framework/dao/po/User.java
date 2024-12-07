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
 * @since 2024-12-07
 */
@TableName("qm_user_t")
public class User extends BaseEntity {

    private static final long serialVersionUID=1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    private String userName;

    private String cuteName;

    private String profileUrl;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCuteName() {
        return cuteName;
    }

    public void setCuteName(String cuteName) {
        this.cuteName = cuteName;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }


    @Override
    public String toString() {
        return "User{" +
        "userId=" + userId +
        ", userName=" + userName +
        ", cuteName=" + cuteName +
        ", profileUrl=" + profileUrl +
        ", status=" + getStatus() +
        ", deleteFlag=" + getDeleteFlag() +
        ", creationDate=" + getCreationDate() +
        ", lastUpdateDate=" + getLastUpdateDate() +
        "}";
    }
}
