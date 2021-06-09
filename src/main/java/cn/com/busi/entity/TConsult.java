package cn.com.busi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@ApiModel(value = "cn-com-busi-entity-TConsult")
@Data
public class TConsult implements Serializable {
    @ApiModelProperty(value = "")
    private String id;

    /**
     * 答案
     */
    @ApiModelProperty(value = "答案")
    private String answer;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdate;

    /**
     * 解答时间
     */
    @ApiModelProperty(value = "解答时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date answerdate;

    /**
     * 标题
     */
    @ApiModelProperty(value = "标题")
    private String title;

    /**
     * 内容
     */
    @ApiModelProperty(value = "内容")
    private String context;

    /**
     * 单位
     */
    @ApiModelProperty(value = "单位")
    private String unit;

    /**
     * 名字
     */
    @ApiModelProperty(value = "名字")
    private String name;

    /**
     * 电话
     */
    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "")
    private String email;

    @ApiModelProperty(value = "")
    private String stutas;

    private static final long serialVersionUID = 1L;
}