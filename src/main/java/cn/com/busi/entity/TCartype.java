package cn.com.busi.entity;

import java.io.Serializable;

/**
 * (TCartype)实体类
 *
 * @author makejava
 * @since 2020-08-06 11:51:49
 */
public class TCartype implements Serializable {
    private static final long serialVersionUID = 673439086015225041L;
    
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