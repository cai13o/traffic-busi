package cn.com.busi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;
import java.io.Serializable;

/**
 * (TReport)实体类
 *
 * @author makejava
 * @since 2020-07-07 16:11:18
 */
@Data
public class TReport implements Serializable {
    private static final long serialVersionUID = -86701982713684710L;
    
    private String id;
    
    private String bgbh;
    
    private String zzrdzsbh;
    
    private String jyjgdz;
    
    private String jyjgdh;
    
    private String cphm;
    
    private String wtr;
    
    private String cllx;
    
    private String ppxh;
    
    private String dlyszh;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date zcdjrq;

    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ccny;
    
    private String csys;
    
    private String vin;
    
    private String fdjhm;
    
    private String xzqy;
    
    private String jylb;
    
    private String ywlx;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date jcrq;
    
    private String wyxrd;
    
    private String gzxxzd;
    
    private String wgjc;
    
    private String yxjc;
    
    private String dpjc;
    
    private String hcpd;
    
    private String dlx;
    
    private String jjx;
    
    private String yzzdl;
    
    private String yzbphl;
    
    private String ezzdl;
    
    private String ezbphl;
    
    private String tzzdl;
    
    private String tzbphl;
    
    private String dcqyczheczdl;
    
    private String dcqyczhuczdl;
    
    private String mark;
    
    private String jcjl;
    
    private String zjcs;
    
    private String jcjgmc;
    
    private String clrllb;
    
    private String sqqzr;
    
    private String clzbzl;

    private String tDetail;

    private String syxz;

    private String clyt;

    private String lbsyjpd;
    //灯光
    private String dg;
    //侧滑
    private String ch;
    //排放
    private String pf;

    private String fzzdlpd;
    private String fzbphlpd;
}