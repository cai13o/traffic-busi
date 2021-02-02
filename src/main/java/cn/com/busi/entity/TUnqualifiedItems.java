package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value = "cn-com-busi-entity-TUnqualifiedItems")
@Data
public class TUnqualifiedItems implements Serializable {
    /**
     * 编号
     */
    @ApiModelProperty(value = "编号")
    private String id;

    /**
     * 名称
     */
    @ApiModelProperty(value = "名称")
    private String name;

    /**
     * 不合格项说明
     */
    @ApiModelProperty(value = "不合格项说明")
    private String bhgxsm;

    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String bz;

    /**
     * aid
     */
    @ApiModelProperty(value = "aid")
    private String aid;

    private static final long serialVersionUID = 1L;
}