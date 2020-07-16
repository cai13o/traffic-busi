package cn.com.busi.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(TUser)实体类
 *
 * @author makejava
 * @since 2020-07-14 11:09:17
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = 119485885517401121L;
    /**
    * 登陆名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 0　女 1  男 2  未知
    */
    private Integer sex;
    /**
    * 1 身份证 2 护照 3 员工证
    */
    private Integer cardtype;
    /**
    * 证件号码
    */
    private String cardno;
    /**
    * 中文名
    */
    private String cnname;
    /**
    * 所属部门
    */
    private String dept;
    /**
    * 通讯地址
    */
    private String address;
    /**
    * 手机号码
    */
    private String mobileid;
    /**
    * 邮编
    */
    private String postcode;
    /**
    * 注册时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date regtime;
    /**
    * 生效时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date efftime;
    /**
    * 失效时间
    */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date losetime;
    /**
    * 0 冻结 1 正常
    */
    private Integer state;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getCardtype() {
        return cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getCnname() {
        return cnname;
    }

    public void setCnname(String cnname) {
        this.cnname = cnname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileid() {
        return mobileid;
    }

    public void setMobileid(String mobileid) {
        this.mobileid = mobileid;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Date getEfftime() {
        return efftime;
    }

    public void setEfftime(Date efftime) {
        this.efftime = efftime;
    }

    public Date getLosetime() {
        return losetime;
    }

    public void setLosetime(Date losetime) {
        this.losetime = losetime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", cardtype=" + cardtype +
                ", cardno='" + cardno + '\'' +
                ", cnname='" + cnname + '\'' +
                ", dept='" + dept + '\'' +
                ", address='" + address + '\'' +
                ", mobileid='" + mobileid + '\'' +
                ", postcode='" + postcode + '\'' +
                ", regtime=" + regtime +
                ", efftime=" + efftime +
                ", losetime=" + losetime +
                ", state=" + state +
                '}';
    }
}