package cn.com.busi.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (TCaution)实体类
 *
 * @author makejava
 * @since 2020-07-06 18:20:57
 */
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
    
    private Date lrsj;
    
    private String status;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJglx() {
        return jglx;
    }

    public void setJglx(String jglx) {
        this.jglx = jglx;
    }

    public String getSsqy() {
        return ssqy;
    }

    public void setSsqy(String ssqy) {
        this.ssqy = ssqy;
    }

    public String getRymc() {
        return rymc;
    }

    public void setRymc(String rymc) {
        this.rymc = rymc;
    }

    public String getSbxh() {
        return sbxh;
    }

    public void setSbxh(String sbxh) {
        this.sbxh = sbxh;
    }

    public String getJgzzrdzsbh() {
        return jgzzrdzsbh;
    }

    public void setJgzzrdzsbh(String jgzzrdzsbh) {
        this.jgzzrdzsbh = jgzzrdzsbh;
    }

    public String getSsjg() {
        return ssjg;
    }

    public void setSsjg(String ssjg) {
        this.ssjg = ssjg;
    }

    public String getJglxr() {
        return jglxr;
    }

    public void setJglxr(String jglxr) {
        this.jglxr = jglxr;
    }

    public Date getLrsj() {
        return lrsj;
    }

    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}