package cn.com.busi.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (TInstDevice)实体类
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@Data
public class TInstDevice implements Serializable {
    private static final long serialVersionUID = -30708844191865533L;
    
    private String id;
    
    private String name;
    
    private String institution;
    
    private String model;
    
    private String idno;
    
    private String trace;
    
    private String checkins;
    
    private String checkdate;
    
    private String cycle;
    
    private String nextdate;
    
    private String uselife;
    
    private String remarks;

}