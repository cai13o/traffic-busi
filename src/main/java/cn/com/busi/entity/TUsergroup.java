package cn.com.busi.entity;

import java.io.Serializable;

/**
 * 用户与用户组对应关系(TUsergroup)实体类
 *
 * @author makejava
 * @since 2020-07-16 15:33:49
 */
public class TUsergroup implements Serializable {
    private static final long serialVersionUID = 415545915330440354L;
    /**
    * 登录名
    */
    private String username;
    /**
    * 用户组ID
    */
    private String groupid;
    /**
    * 系统标识
    */
    private String sysid;
    /**
    * 是否为组内管理员 0：否 1：是
    */
    private Integer admin;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

}