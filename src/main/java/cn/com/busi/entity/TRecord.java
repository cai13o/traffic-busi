package cn.com.busi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.Serializable;

/**
 * (TRecord)实体类
 *
 * @author makejava
 * @since 2020-06-30 18:02:13
 */
@Data
public class TRecord implements Serializable {
    private static final long serialVersionUID = 491560107503027008L;

    private String id;

    private String jylsh;

    private String jyjgbh;

    private String jyjgmc;

    private String jcxdh;

    private String wtr;

    private String dlyszh;

    private String jylb;

    private String ywlx;

    private String jcxb;


    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date jcrq;

    private String jcjldbh;

    private String cphm;

    private String hpzl;

    private String gcpzh;

    private String gclx;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date clccrq;

    private String wjdly;

    private String ycy;

    private String wqczy;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date zcdjrq;

    private String vin;

    private String clxh;

    private String fdjh;

    private String csys;

    private String xszlc;

    private String qdxs;

    private String zxzxjxs;

    private String gczs;

    private String zdjygw;

    private String dgjygw;

    private String dlxjygw;

    private String tDetail;

    private String rllb;

    private String xzqy;

    private String zjycs;

    private String jyjgdz;

    private String cllx;

    private String clzbzl;

}