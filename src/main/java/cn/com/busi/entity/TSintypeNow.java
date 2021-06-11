package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="cn-com-busi-entity-TSintypeNow")
@Data
public class TSintypeNow implements Serializable {
    @ApiModelProperty(value="")
    private String id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private Integer num;

    private static final long serialVersionUID = 1L;
}