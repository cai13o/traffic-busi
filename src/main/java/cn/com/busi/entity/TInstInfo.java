package cn.com.busi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TInstInfo)实体类
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@Data
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

    private String opflag;

    private String opdate;

    private String lng;

    private String lat;
}