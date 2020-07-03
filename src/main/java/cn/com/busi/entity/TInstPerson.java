package cn.com.busi.entity;

import java.io.Serializable;

/**
 * (TInstPerson)实体类
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
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

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRecode() {
        return recode;
    }

    public void setRecode(String recode) {
        this.recode = recode;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getFileman() {
        return fileman;
    }

    public void setFileman(String fileman) {
        this.fileman = fileman;
    }

    public String getRegidate() {
        return regidate;
    }

    public void setRegidate(String regidate) {
        this.regidate = regidate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

}