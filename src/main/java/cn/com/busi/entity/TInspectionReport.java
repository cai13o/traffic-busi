package cn.com.busi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@ApiModel(value = "cn-com-busi-entity-TInspectionReport")
@Data
public class TInspectionReport implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private String id;

    /**
     * 机构代号
     */
    @ApiModelProperty(value = "	机构代号	 ")
    private String jgdh;

    /**
     * 线号
     */
    @ApiModelProperty(value = "	线号	 ")
    private String xh;

    /**
     * 地址
     */
    @ApiModelProperty(value = "	地址	 ")
    private String dz;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "	联系电话	 ")
    private String lxdh;

    /**
     * 资质认定证书编号
     */
    @ApiModelProperty(value = "	资质认定证书编号	 ")
    private String zzrdzsbh;

    /**
     * 检验报告编号
     */
    @ApiModelProperty(value = "	检验报告编号	 ")
    private String jybgbh;

    /**
     * 检验机构名称
     */
    @ApiModelProperty(value = "	检验机构名称	 ")
    private String jyjgmc;
    private String jcjgmc;

    /**
     * 号牌号码
     */
    @ApiModelProperty(value = "	号牌号码	 ")
    private String cphm;

    /**
     * 所有人
     */
    @ApiModelProperty(value = "	所有人	 ")
    private String syr;

    /**
     * 车辆类型
     */
    @ApiModelProperty(value = "	车辆类型	 ")
    private String cllx;

    /**
     * 品牌/型号
     */
    @ApiModelProperty(value = "	品牌/型号	 ")
    private String ppxh;

    /**
     * 使用性质
     */
    @ApiModelProperty(value = "	使用性质	 ")
    private String syxz;

    /**
     * 道路运输证号
     */
    @ApiModelProperty(value = "	道路运输证号	 ")
    private String dlyszh;

    /**
     * 注册登记日期
     */
    @ApiModelProperty(value = "	注册登记日期	 ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date zcdjrq;

    /**
     * 出厂日期
     */
    @ApiModelProperty(value = "	出厂日期	 ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date ccrq;

    /**
     * 检验日期
     */
    @ApiModelProperty(value = "	检验日期	 ")
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "GMT+8")
    private Date jyrq;

    /**
     * 车辆识别代号
     */
    @ApiModelProperty(value = "	车辆识别代号	 ")
    private String vin;

    /**
     * 发动机号码
     */
    @ApiModelProperty(value = "	发动机号码	 ")
    private String fdjhm;

    /**
     * 驱动电机号码
     */
    @ApiModelProperty(value = "	驱动电机号码	 ")
    private String qddjhm;

    /**
     * 检验类别
     */
    @ApiModelProperty(value = "	检验类别	 ")
    private String jylb;

    /**
     * 型号
     */
    @ApiModelProperty(value = "	型号	 ")
    private String model;

    /**
     * 出厂编号
     */
    @ApiModelProperty(value = "	出厂编号	 ")
    private String ccbh;

    /**
     * 检验结论
     */
    @ApiModelProperty(value = "	检验结论	 ")
    private String jyjl;
    private String jcjl;

    /**
     * 授权签字人
     */
    @ApiModelProperty(value = "	授权签字人	 ")
    private String sqqzr;

    /**
     * 单位名称
     */
    @ApiModelProperty(value = "	单位名称")
    private String dwmc;

    /**
     * 盖章
     */
    @ApiModelProperty(value = "盖章")
    private String seal;

    /**
     * 建议
     */
    @ApiModelProperty(value = "	建议	 ")
    private String jy;

    /**
     * 二维条码
     */
    @ApiModelProperty(value = "	二维条码	 ")
    private String ewtm;

    /**
     * 压燃式发动机额定功率（kW）
     */
    @ApiModelProperty(value = "	压燃式发动机额定功率（kW）	 ")
    private String yrsfdjedg;

    /**
     * 燃料类别
     */
    @ApiModelProperty(value = "	燃料类别	 ")
    private String rllb;

    @ApiModelProperty(value = "")
    private String tDetail;

    private static final long serialVersionUID = 1L;
}