package cn.com.busi.entity;

import java.io.Serializable;

/**
 * 角色(TRole)实体类
 *
 * @author makejava
 * @since 2020-07-23 13:27:29
 */
public class TRole implements Serializable {
    private static final long serialVersionUID = 673503693719945902L;
    /**
    * 角色ID
    */
    private String roleid;
    /**
    * 用户组ID
    */
    private String groupid;
    /**
    * 系统标识
    */
    private String sysid;
    /**
    * 角色名称
    */
    private String rolename;
    /**
    * 角色描述
    */
    private String roledesc;
    /**
    * 地区码
    */
    private String areacode;


    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
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

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

}