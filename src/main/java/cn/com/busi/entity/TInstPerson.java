package cn.com.busi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TInstPerson)实体类
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@Data
public class TInstPerson implements Serializable {
    private static final long serialVersionUID = 503476648925018682L;
    
    private String id;
    
    private String name;
    
    private String institution;
    
    private String gender;
    
    private String idno;
    
    private String major;
    
    private String recode;
    
    private String position;
    
    private String certificate;
    
    private String enddate;
    
    private String fileman;
    
    private String regidate;
    
    private String remarks;

    private String opflag;

    private String opdate;

}