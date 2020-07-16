package cn.com.busi.entity;

import java.io.Serializable;

/**
 * 用户组(TPgroup)实体类
 *
 * @author makejava
 * @since 2020-07-14 13:27:09
 */
public class TPgroup implements Serializable {
    private static final long serialVersionUID = -83229892734510688L;
    /**
    * 用户组ID
    */
    private String groupid;
    /**
    * 系统标识
    */
    private String sysid;
    /**
    * 用户组名称
    */
    private String groupname;
    /**
    * 用户组描述
    */
    private String groupdesc;


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

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupdesc() {
        return groupdesc;
    }

    public void setGroupdesc(String groupdesc) {
        this.groupdesc = groupdesc;
    }

}