package cn.com.busi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (TCaution)实体类
 *
 * @author makejava
 * @since 2020-07-06 18:20:57
 */
@Data
public class TCaution implements Serializable {
    private static final long serialVersionUID = -98254171522712883L;
    
    private String id;
    
    private String jglx;
    
    private String ssqy;
    
    private String rymc;
    
    private String sbxh;
    
    private String jgzzrdzsbh;
    
    private String ssjg;
    
    private String jglxr;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date lrsj;
    
    private String status;

    private String cphm;


}