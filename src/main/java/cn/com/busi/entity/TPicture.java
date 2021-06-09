package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="cn-com-busi-entity-TPicture")
@Data
public class TPicture implements Serializable {
    @ApiModelProperty(value="")
    private String id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private String img;

    private static final long serialVersionUID = 1L;
}