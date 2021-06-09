package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "cn-com-busi-entity-TNew")
@Data
public class TNew implements Serializable {
    @ApiModelProperty(value = "")
    private String id;

    @ApiModelProperty(value = "")
    private String type;

    @ApiModelProperty(value = "")
    private String title;

    @ApiModelProperty(value = "")
    private String author;

    @ApiModelProperty(value = "")
    private String dept;

    @ApiModelProperty(value = "")
    private Date validity;

    @ApiModelProperty(value = "")
    private Date issuedate;

    @ApiModelProperty(value = "")
    private String brief;

    @ApiModelProperty(value = "")
    private String text;

    @ApiModelProperty(value = "")
    private String accessory;

    @ApiModelProperty(value = "")
    private String titlepicfile;

    @ApiModelProperty(value = "")
    private String auditStatus;

    /**
     * 审核意见
     */
    @ApiModelProperty(value = "审核意见")
    private String auditOpinion;

    /**
     * 审核人
     */
    @ApiModelProperty(value = "审核人")
    private String auditor;

    @ApiModelProperty(value = "")
    private Date auditdate;

    @ApiModelProperty(value = "")
    private String importance;

    @ApiModelProperty(value = "")
    private String newsSource;

    @ApiModelProperty(value = "")
    private String disc;

    @ApiModelProperty(value = "")
    private String tag;

    @ApiModelProperty(value = "")
    private String top;

    @ApiModelProperty(value = "")
    private String label;

    @ApiModelProperty(value = "")
    private Integer ctr;

    private static final long serialVersionUID = 1L;
}