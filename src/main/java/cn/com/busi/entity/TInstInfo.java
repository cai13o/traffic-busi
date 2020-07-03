package cn.com.busi.entity;

import java.io.Serializable;

/**
 * (TInstInfo)实体类
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
public class TInstInfo implements Serializable {
    private static final long serialVersionUID = 323768849962994018L;
    
    private String id;
    
    private String name;
    
    private String owner;
    
    private String phone;
    
    private String contact;
    
    private String area;
    
    private String address;
    
    private String certificate;
    
    private String startdate;
    
    private String enddate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

}