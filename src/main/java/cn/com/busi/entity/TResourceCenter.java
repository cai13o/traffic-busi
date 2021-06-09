package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value="cn-com-busi-entity-TResourceCenter")
@Data
public class TResourceCenter implements Serializable {
    @ApiModelProperty(value="")
    private String id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private String url;

    @ApiModelProperty(value="")
    private String size;

    @ApiModelProperty(value="")
    private Date opdate;

    @ApiModelProperty(value="")
    private String auditStatus;

    @ApiModelProperty(value="")
    private Date auditdate;

    @ApiModelProperty(value="")
    private String operator;

    @ApiModelProperty(value="")
    private Integer count;

    @ApiModelProperty(value="")
    private String dept;

    /**
    * 审核意见
    */
    @ApiModelProperty(value="审核意见")
    private String auditOpinion;

    /**
    * 审核人
    */
    @ApiModelProperty(value="审核人")
    private String auditor;

    @ApiModelProperty(value="")
    private String disc;

    private static final long serialVersionUID = 1L;
}