package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="cn-com-busi-entity-TInstrumentResult")
@Data
public class TInstrumentResult implements Serializable {
    /**
    * id
    */
    @ApiModelProperty(value="id")
    private String id;

    /**
    * 检验项目
    */
    @ApiModelProperty(value="检验项目")
    private String jyxm;

    /**
    * 检验结果
    */
    @ApiModelProperty(value="检验结果")
    private String jyjg;

    /**
    * 标准限值
    */
    @ApiModelProperty(value="标准限值")
    private String bzxz;

    /**
    * 结果判定
    */
    @ApiModelProperty(value="结果判定")
    private String jgpd;

    /**
    * 备注
    */
    @ApiModelProperty(value="备注")
    private String bz;

    /**
    * rid
    */
    @ApiModelProperty(value="rid")
    private String rid;

    private static final long serialVersionUID = 1L;
}