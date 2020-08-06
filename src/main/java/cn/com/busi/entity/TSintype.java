package cn.com.busi.entity;

import java.io.Serializable;

/**
 * (TSintype)实体类
 *
 * @author makejava
 * @since 2020-08-06 11:40:16
 */
public class TSintype implements Serializable {
    private static final long serialVersionUID = -19167888416318122L;
    
    private String id;
    
    private String name;


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

}