package cn.com.busi.entity;

import java.io.Serializable;

/**
 * (TLicensePlate)实体类
 *
 * @author makejava
 * @since 2020-09-03 14:12:09
 */
public class TLicensePlate implements Serializable {
    private static final long serialVersionUID = 939280049467653440L;
    
    private Integer id;
    
    private String name;
    
    private String license;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public String toString() {
        return "TLicensePlate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", license='" + license + '\'' +
                '}';
    }
}