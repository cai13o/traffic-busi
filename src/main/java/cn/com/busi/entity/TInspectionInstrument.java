package cn.com.busi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@ApiModel(value = "cn-com-busi-entity-TInspectionInstrument")
@Data
public class TInspectionInstrument implements Serializable {
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
     * 机构名称
     */
    @ApiModelProperty(value = "	机构名称	 ")
    private String jgmc;

    /**
     * 机构地址
     */
    @ApiModelProperty(value = "	机构地址	 ")
    private String jgdz;

    /**
     * 联系电话
     */
    @ApiModelProperty(value = "	联系电话	 ")
    private String lxdh;

    /**
     * 检验流水号
     */
    @ApiModelProperty(value = "	检验流水号	 ")
    private String jylsh;

    /**
     * 检验类别
     */
    @ApiModelProperty(value = "	检验类别	 ")
    private String jylb;

    /**
     * 检验项目
     */
    @ApiModelProperty(value = "	检验项目	 ")
    private String jyxm;

    /**
     * 机动车所有人
     */
    @ApiModelProperty(value = "	机动车所有人	 ")
    private String jdcsyr;

    /**
     * 出厂日期
     */
    @ApiModelProperty(value = "	出厂日期	 ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date ccrq;

    /**
     * 初次登记日期
     */
    @ApiModelProperty(value = "	初次登记日期	 ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date ccdjrq;

    /**
     * 号牌（自编）号
     */
    @ApiModelProperty(value = "	号牌（自编）号	 ")
    private String cphm;

    /**
     * 号牌种类
     */
    @ApiModelProperty(value = "	号牌种类	 ")
    private String hpzl;

    /**
     * 车辆类别
     */
    @ApiModelProperty(value = "	车辆类别	 ")
    private String cllb;

    /**
     * 道路运输证号
     */
    @ApiModelProperty(value = "	道路运输证号	 ")
    private String dlyszh;

    /**
     * 品牌/型号
     */
    @ApiModelProperty(value = "	品牌/型号	 ")
    private String ppxh;

    /**
     * 燃料类别
     */
    @ApiModelProperty(value = "	燃料类别	 ")
    private String rllb;

    /**
     * 整备质量
     */
    @ApiModelProperty(value = "	整备质量	 ")
    private String zbzl;

    /**
     * 总质量（kg）
     */
    @ApiModelProperty(value = "	总质量（kg）	 ")
    private String zzl;

    /**
     * 驱动形式
     */
    @ApiModelProperty(value = "	驱动形式	 ")
    private String qdxs;

    /**
     * 驻车轴
     */
    @ApiModelProperty(value = "	驻车轴	 ")
    private String zcz;

    /**
     * 引车员
     */
    @ApiModelProperty(value = "	引车员	 ")
    private String ycy;

    /**
     * 登录员
     */
    @ApiModelProperty(value = "	登录员	 ")
    private String dly;

    /**
     * 检验日期/时间
     */
    @ApiModelProperty(value = "	检验日期/时间	 ")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
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
     * 前照灯制
     */
    @ApiModelProperty(value = "	前照灯制	 ")
    private String qzdz;

    /**
     * 驻车制动是否使用电子制动装置
     */
    @ApiModelProperty(value = "	驻车制动是否使用电子制动装置	 ")
    private String zczddzkz;

    /**
     * 转向轴悬架形式
     */
    @ApiModelProperty(value = "	转向轴悬架形式	 ")
    private String zxzxjxs;

    /**
     * 前轴数量
     */
    @ApiModelProperty(value = "	前轴数量	 ")
    private String qzsl;

    /**
     * 转向轴
     */
    @ApiModelProperty(value = "	转向轴	 ")
    private String zxz;

    /**
     * 空气悬架轴
     */
    @ApiModelProperty(value = "	空气悬架轴	 ")
    private String kqxjz;

    /**
     * 一轴空载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	一轴空载制动轴荷（kg）	 ")
    private String kzzdzh1;

    /**
     * 二轴空载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	二轴空载制动轴荷（kg）	 ")
    private String kzzdzh2;

    /**
     * 三轴空载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	三轴空载制动轴荷（kg）	 ")
    private String kzzdzh3;

    /**
     * 四轴空载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	四轴空载制动轴荷（kg）	 ")
    private String kzzdzh4;

    /**
     * 五轴空载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	五轴空载制动轴荷（kg）	 ")
    private String kzzdzh5;

    /**
     * 一轴加载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	一轴加载制动轴荷（kg）	 ")
    private String jzzdzh1;

    /**
     * 二轴加载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	二轴加载制动轴荷（kg）	 ")
    private String jzzdzh2;

    /**
     * 三轴加载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	三轴加载制动轴荷（kg）	 ")
    private String jzzdzh3;

    /**
     * 四轴加载制动轴荷（kg）
     */
    @ApiModelProperty(value = "	四轴加载制动轴荷（kg）	 ")
    private String jzzdzh4;

    /**
     * 整车空载/加载轴荷（kg）
     */
    @ApiModelProperty(value = "	整车空载/加载轴荷（kg）	 ")
    private String zheckzjzzh;

    /**
     * 驻车空载/加载轴荷（kg）
     */
    @ApiModelProperty(value = "	驻车空载/加载轴荷（kg）	 ")
    private String zhuckzjzzh;

    /**
     * 一轴空载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	一轴空载制动最大行车制动力（10N）左	 ")
    private String zkzzdzdxczdl1;

    /**
     * 二轴空载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	二轴空载制动最大行车制动力（10N）左	 ")
    private String zkzzdzdxczdl2;

    /**
     * 三轴空载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	三轴空载制动最大行车制动力（10N）左	 ")
    private String zkzzdzdxczdl3;

    /**
     * 四轴空载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	四轴空载制动最大行车制动力（10N）左	 ")
    private String zkzzdzdxczdl4;

    /**
     * 五轴空载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	五轴空载制动最大行车制动力（10N）左	 ")
    private String zkzzdzdxczdl5;

    /**
     * 一轴加载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	一轴加载制动最大行车制动力（10N）左	 ")
    private String zjzzdzdxczdl1;

    /**
     * 二轴加载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	二轴加载制动最大行车制动力（10N）左	 ")
    private String zjzzdzdxczdl2;

    /**
     * 三轴加载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	三轴加载制动最大行车制动力（10N）左	 ")
    private String zjzzdzdxczdl3;

    /**
     * 四轴加载制动最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	四轴加载制动最大行车制动力（10N）左	 ")
    private String zjzzdzdxczdl4;

    /**
     * 整车空载/加载最大行车制动力（10N）
     */
    @ApiModelProperty(value = "	整车空载/加载最大行车制动力（10N）	 ")
    private String zhekzjzzdxczdl;

    /**
     * 一轴空载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	一轴空载制动最大行车制动力（10N）右	 ")
    private String ykzzdzdxczdl1;

    /**
     * 二轴空载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	二轴空载制动最大行车制动力（10N）右	 ")
    private String ykzzdzdxczdl2;

    /**
     * 三轴空载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	三轴空载制动最大行车制动力（10N）右	 ")
    private String ykzzdzdxczdl3;

    /**
     * 四轴空载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	四轴空载制动最大行车制动力（10N）右	 ")
    private String ykzzdzdxczdl4;

    /**
     * 五轴空载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	五轴空载制动最大行车制动力（10N）右	 ")
    private String ykzzdzdxczdl5;

    /**
     * 一轴加载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	一轴加载制动最大行车制动力（10N）右	 ")
    private String yjzzdzdxczdl1;

    /**
     * 二轴加载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	二轴加载制动最大行车制动力（10N）右	 ")
    private String yjzzdzdxczdl2;

    /**
     * 三轴加载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	三轴加载制动最大行车制动力（10N）右	 ")
    private String yjzzdzdxczdl3;

    /**
     * 四轴加载制动最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	四轴加载制动最大行车制动力（10N）右	 ")
    private String yjzzdzdxczdl4;

    /**
     * 一轴空载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	一轴空载制动过程差最大差值点（10N）左	 ")
    private String zkzzdgcczdczd1;

    /**
     * 二轴空载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	二轴空载制动过程差最大差值点（10N）左	 ")
    private String zkzzdgcczdczd2;

    /**
     * 三轴空载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	三轴空载制动过程差最大差值点（10N）左	 ")
    private String zkzzdgcczdczd3;

    /**
     * 四轴空载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	四轴空载制动过程差最大差值点（10N）左	 ")
    private String zkzzdgcczdczd4;

    /**
     * 五轴空载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	五轴空载制动过程差最大差值点（10N）左	 ")
    private String zkzzdgcczdczd5;

    /**
     * 一轴加载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	一轴加载制动过程差最大差值点（10N）左	 ")
    private String zjzzdgcczdczd1;

    /**
     * 二轴加载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	二轴加载制动过程差最大差值点（10N）左	 ")
    private String zjzzdgcczdczd2;

    /**
     * 三轴加载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	三轴加载制动过程差最大差值点（10N）左	 ")
    private String zjzzdgcczdczd3;

    /**
     * 四轴加载制动过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	四轴加载制动过程差最大差值点（10N）左	 ")
    private String zjzzdgcczdczd4;

    /**
     * 一轴空载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	一轴空载制动过程差最大差值点（10N）右	 ")
    private String ykzzdgcczdczd1;

    /**
     * 二轴空载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	二轴空载制动过程差最大差值点（10N）右	 ")
    private String ykzzdgcczdczd2;

    /**
     * 三轴空载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	三轴空载制动过程差最大差值点（10N）右	 ")
    private String ykzzdgcczdczd3;

    /**
     * 四轴空载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	四轴空载制动过程差最大差值点（10N）右	 ")
    private String ykzzdgcczdczd4;

    /**
     * 五轴空载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	五轴空载制动过程差最大差值点（10N）右	 ")
    private String ykzzdgcczdczd5;

    /**
     * 一轴加载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	一轴加载制动过程差最大差值点（10N）右	 ")
    private String yjzzdgcczdczd1;

    /**
     * 二轴加载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	二轴加载制动过程差最大差值点（10N）右	 ")
    private String yjzzdgcczdczd2;

    /**
     * 三轴加载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	三轴加载制动过程差最大差值点（10N）右	 ")
    private String yjzzdgcczdczd3;

    /**
     * 四轴加载制动过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	四轴加载制动过程差最大差值点（10N）右	 ")
    private String yjzzdgcczdczd4;

    /**
     * 一轴空载制动行车制动（%）
     */
    @ApiModelProperty(value = "	一轴空载制动行车制动（%）	 ")
    private String kzzdxczd1;

    /**
     * 二轴空载制动行车制动（%）
     */
    @ApiModelProperty(value = "	二轴空载制动行车制动（%）	 ")
    private String kzzdxczd2;

    /**
     * 三轴空载制动行车制动（%）
     */
    @ApiModelProperty(value = "	三轴空载制动行车制动（%）	 ")
    private String kzzdxczd3;

    /**
     * 四轴空载制动行车制动（%）
     */
    @ApiModelProperty(value = "	四轴空载制动行车制动（%）	 ")
    private String kzzdxczd4;

    /**
     * 五轴空载制动行车制动（%）
     */
    @ApiModelProperty(value = "	五轴空载制动行车制动（%）	 ")
    private String kzzdxczd5;

    /**
     * 一轴加载制动行车制动（%）
     */
    @ApiModelProperty(value = "	一轴加载制动行车制动（%）	 ")
    private String jzzdxczd1;

    /**
     * 二轴加载制动行车制动（%）
     */
    @ApiModelProperty(value = "	二轴加载制动行车制动（%）	 ")
    private String jzzdxczd2;

    /**
     * 三轴加载制动行车制动（%）
     */
    @ApiModelProperty(value = "	三轴加载制动行车制动（%）	 ")
    private String jzzdxczd3;

    /**
     * 四轴加载制动行车制动（%）
     */
    @ApiModelProperty(value = "	四轴加载制动行车制动（%）	 ")
    private String jzzdxczd4;

    /**
     * 整车空载/加载行车制动（%）
     */
    @ApiModelProperty(value = "	整车空载/加载行车制动（%）	 ")
    private String zhekzjzxczd;

    /**
     * 一轴空载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	一轴空载制动不平衡率（%）	 ")
    private String kzzdbphl1;

    /**
     * 二轴空载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	二轴空载制动不平衡率（%）	 ")
    private String kzzdbphl2;

    /**
     * 三轴空载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	三轴空载制动不平衡率（%）	 ")
    private String kzzdbphl3;

    /**
     * 四轴空载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	四轴空载制动不平衡率（%）	 ")
    private String kzzdbphl4;

    /**
     * 五轴空载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	五轴空载制动不平衡率（%）	 ")
    private String kzzdbphl5;

    /**
     * 一轴加载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	一轴加载制动不平衡率（%）	 ")
    private String jzzdbphl1;

    /**
     * 二轴加载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	二轴加载制动不平衡率（%）	 ")
    private String jzzdbphl2;

    /**
     * 三轴加载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	三轴加载制动不平衡率（%）	 ")
    private String jzzdbphl3;

    /**
     * 四轴加载制动不平衡率（%）
     */
    @ApiModelProperty(value = "	四轴加载制动不平衡率（%）	 ")
    private String jzzdbphl4;

    /**
     * 一轴空载驻车制动力（10N）
     */
    @ApiModelProperty(value = "	一轴空载驻车制动力（10N）	 ")
    private String kzzhuzdl1;

    /**
     * 二轴空载驻车制动力（10N）
     */
    @ApiModelProperty(value = "	二轴空载驻车制动力（10N）	 ")
    private String kzzhuzdl2;

    /**
     * 三轴空载驻车制动力（10N）
     */
    @ApiModelProperty(value = "	三轴空载驻车制动力（10N）	 ")
    private String kzzhuzdl3;

    /**
     * 四轴空载驻车制动力（10N）
     */
    @ApiModelProperty(value = "	四轴空载驻车制动力（10N）	 ")
    private String kzzhuzdl4;

    /**
     * 五轴空载驻车制动力（10N）
     */
    @ApiModelProperty(value = "	五轴空载驻车制动力（10N）	 ")
    private String kzzhuzdl5;

    /**
     * 驻车空载驻车制动力（10N）
     */
    @ApiModelProperty(value = "	驻车空载驻车制动力（10N）	 ")
    private String zhukzzhuzdl;

    /**
     * 驻车空载驻车制动率（%）
     */
    @ApiModelProperty(value = "	驻车空载驻车制动率（%）	 ")
    private String zhukzzhuzdv;

    /**
     * 一轴空载项目判定
     */
    @ApiModelProperty(value = "	一轴空载项目判定	 ")
    private String kzxmpd1;

    /**
     * 二轴空载项目判定
     */
    @ApiModelProperty(value = "	二轴空载项目判定	 ")
    private String kzxmpd2;

    /**
     * 三轴空载项目判定
     */
    @ApiModelProperty(value = "	三轴空载项目判定	 ")
    private String kzxmpd3;

    /**
     * 四轴空载项目判定
     */
    @ApiModelProperty(value = "	四轴空载项目判定	 ")
    private String kzxmpd4;

    /**
     * 五轴空载项目判定
     */
    @ApiModelProperty(value = "	五轴空载项目判定	 ")
    private String kzxmpd5;

    /**
     * 一轴加载项目判定
     */
    @ApiModelProperty(value = "	一轴加载项目判定	 ")
    private String jzxmpd1;

    /**
     * 二轴加载项目判定
     */
    @ApiModelProperty(value = "	二轴加载项目判定	 ")
    private String jzxmpd2;

    /**
     * 三轴加载项目判定
     */
    @ApiModelProperty(value = "	三轴加载项目判定	 ")
    private String jzxmpd3;

    /**
     * 四轴加载项目判定
     */
    @ApiModelProperty(value = "	四轴加载项目判定	 ")
    private String jzxmpd4;

    /**
     * 整车项目判定
     */
    @ApiModelProperty(value = "	整车项目判定	 ")
    private String zhexmpd;

    /**
     * 驻车项目判定
     */
    @ApiModelProperty(value = "	驻车项目判定	 ")
    private String zhuxmpd;

    /**
     * 一轴空载单项次数
     */
    @ApiModelProperty(value = "	一轴空载单项次数	 ")
    private String kzdxcs1;

    /**
     * 二轴空载单项次数
     */
    @ApiModelProperty(value = "	二轴空载单项次数	 ")
    private String kzdxcs2;

    /**
     * 三轴空载单项次数
     */
    @ApiModelProperty(value = "	三轴空载单项次数	 ")
    private String kzdxcs3;

    /**
     * 四轴空载单项次数
     */
    @ApiModelProperty(value = "	四轴空载单项次数	 ")
    private String kzdxcs4;

    /**
     * 五轴空载单项次数
     */
    @ApiModelProperty(value = "	五轴空载单项次数	 ")
    private String kzdxcs5;

    /**
     * 一轴加载单项次数
     */
    @ApiModelProperty(value = "	一轴加载单项次数	 ")
    private String jzdxcs1;

    /**
     * 二轴加载单项次数
     */
    @ApiModelProperty(value = "	二轴加载单项次数	 ")
    private String jzdxcs2;

    /**
     * 三轴加载单项次数
     */
    @ApiModelProperty(value = "	三轴加载单项次数	 ")
    private String jzdxcs3;

    /**
     * 四轴加载单项次数
     */
    @ApiModelProperty(value = "	四轴加载单项次数	 ")
    private String jzdxcs4;

    /**
     * 整车单项次数
     */
    @ApiModelProperty(value = "	整车单项次数	 ")
    private String zhedxcs;

    /**
     * 驻车单项次数
     */
    @ApiModelProperty(value = "	驻车单项次数	 ")
    private String zhudxcs;

    /**
     * 1轴静态轮荷左（kg）
     */
    @ApiModelProperty(value = "	1轴静态轮荷左（kg）	 ")
    private String zjtlh1;

    /**
     * 1轴静态轮荷右（kg）
     */
    @ApiModelProperty(value = "	1轴静态轮荷右（kg）	 ")
    private String yjtlh1;

    /**
     * 2轴静态轮荷左（kg）
     */
    @ApiModelProperty(value = "	2轴静态轮荷左（kg）	 ")
    private String zjtlh2;

    /**
     * 2轴静态轮荷右（kg）
     */
    @ApiModelProperty(value = "	2轴静态轮荷右（kg）	 ")
    private String yjtlh2;

    /**
     * 3轴静态轮荷左（kg）
     */
    @ApiModelProperty(value = "	3轴静态轮荷左（kg）	 ")
    private String zjtlh3;

    /**
     * 3轴静态轮荷右（kg）
     */
    @ApiModelProperty(value = "	3轴静态轮荷右（kg）	 ")
    private String yjtlh3;

    /**
     * 4轴静态轮荷左（kg）
     */
    @ApiModelProperty(value = "	4轴静态轮荷左（kg）	 ")
    private String zjtlh4;

    /**
     * 4轴静态轮荷右（kg）
     */
    @ApiModelProperty(value = "	4轴静态轮荷右（kg）	 ")
    private String yjtlh4;

    /**
     * 5轴静态轮荷左（kg）
     */
    @ApiModelProperty(value = "	5轴静态轮荷左（kg）	 ")
    private String zjtlh5;

    /**
     * 5轴静态轮荷右（kg）
     */
    @ApiModelProperty(value = "	5轴静态轮荷右（kg）	 ")
    private String yjtlh5;

    /**
     * 1轴动态轮荷左（kg）
     */
    @ApiModelProperty(value = "	1轴动态轮荷左（kg）	 ")
    private String zdtlh1;

    /**
     * 1轴动态轮荷右（kg）
     */
    @ApiModelProperty(value = "	1轴动态轮荷右（kg）	 ")
    private String ydtlh1;

    /**
     * 2轴动态轮荷左（kg）
     */
    @ApiModelProperty(value = "	2轴动态轮荷左（kg）	 ")
    private String zdtlh2;

    /**
     * 2轴动态轮荷右（kg）
     */
    @ApiModelProperty(value = "	2轴动态轮荷右（kg）	 ")
    private String ydtlh2;

    /**
     * 整车静态轮荷左（kg）
     */
    @ApiModelProperty(value = "	整车静态轮荷左（kg）	 ")
    private String zhejtlh;

    /**
     * 驻车静态轮荷右（kg）
     */
    @ApiModelProperty(value = "	驻车静态轮荷右（kg）	 ")
    private String zhujtlh;

    /**
     * 一轴最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	一轴最大行车制动力（10N）左	 ")
    private String zzdxczdl1;

    /**
     * 二轴最大行车制动力（10N）左
     */
    @ApiModelProperty(value = "	二轴最大行车制动力（10N）左	 ")
    private String zzdxczdl2;

    /**
     * 一轴最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	一轴最大行车制动力（10N）右	 ")
    private String yzdxczdl1;

    /**
     * 二轴最大行车制动力（10N）右
     */
    @ApiModelProperty(value = "	二轴最大行车制动力（10N）右	 ")
    private String yzdxczdl2;

    /**
     * 整车最大行车制动力（10N）
     */
    @ApiModelProperty(value = "	整车最大行车制动力（10N）	 ")
    private String zhezdxczdl;

    /**
     * 一轴过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	一轴过程差最大差值点（10N）左	 ")
    private String zgcczdczd1;

    /**
     * 二轴过程差最大差值点（10N）左
     */
    @ApiModelProperty(value = "	二轴过程差最大差值点（10N）左	 ")
    private String zgcczdczd2;

    /**
     * 一轴过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	一轴过程差最大差值点（10N）右	 ")
    private String ygcczdczd1;

    /**
     * 二轴过程差最大差值点（10N）右
     */
    @ApiModelProperty(value = "	二轴过程差最大差值点（10N）右	 ")
    private String ygcczdczd2;

    /**
     * 一轴项目判定
     */
    @ApiModelProperty(value = "	一轴项目判定	 ")
    private String xmpd1;

    /**
     * 二轴项目判定
     */
    @ApiModelProperty(value = "	二轴项目判定	 ")
    private String xmpd2;

    /**
     * 一轴单项次数
     */
    @ApiModelProperty(value = "	一轴单项次数	 ")
    private String dxcs1;

    /**
     * 二轴单项次数
     */
    @ApiModelProperty(value = "	二轴单项次数	 ")
    private String dxcs2;

    /**
     * 左外灯远光发光强度
     */
    @ApiModelProperty(value = "	左外灯远光发光强度	 ")
    private String zwdygfgqd;

    /**
     * 左内灯远光发光强度
     */
    @ApiModelProperty(value = "	左内灯远光发光强度	 ")
    private String zndygfgqd;

    /**
     * 右内灯远光发光强度
     */
    @ApiModelProperty(value = "	右内灯远光发光强度	 ")
    private String yndygfgqd;

    /**
     * 右外灯远光发光强度
     */
    @ApiModelProperty(value = "	右外灯远光发光强度	 ")
    private String ywdygfgqd;

    /**
     * 一轴侧滑A
     */
    @ApiModelProperty(value = "	一轴侧滑A	 ")
    private String cha1;

    /**
     * 二轴侧滑A
     */
    @ApiModelProperty(value = "	二轴侧滑A	 ")
    private String cha2;

    /**
     * 路试制动MFDD
     */
    @ApiModelProperty(value = "	路试制动MFDD	 ")
    private String lsmfdd;

    /**
     * 路试制动协调时间（s）
     */
    @ApiModelProperty(value = "	路试制动协调时间（s）	 ")
    private String lsxtsj;

    /**
     * 路试制动稳定性
     */
    @ApiModelProperty(value = "	路试制动稳定性	 ")
    private String lszdwdx;

    /**
     * 路试检验员
     */
    @ApiModelProperty(value = "	路试检验员	 ")
    private String lsjyy;

    /**
     * 车辆外廓尺寸M
     */
    @ApiModelProperty(value = "	车辆外廓尺寸M	 ")
    private String clwkcc;

    /**
     * 整备质量
     */
    @ApiModelProperty(value = "	整备质量	 ")
    private String zbzlz;

    /**
     * 空车质量Z
     */
    @ApiModelProperty(value = "	空车质量Z	 ")
    private String kczl;

    /**
     * 主车号牌号码
     */
    @ApiModelProperty(value = "	主车号牌号码	 ")
    private String zchphm;

    /**
     * 驻车准牵引质量（kg）
     */
    @ApiModelProperty(value = "	驻车准牵引质量（kg）	 ")
    private String zczqyzl;

    /**
     * 左外灯项目判定
     */
    @ApiModelProperty(value = "	左外灯项目判定	 ")
    private String zwdxmpd;

    /**
     * 左内灯项目判定
     */
    @ApiModelProperty(value = "	左内灯项目判定	 ")
    private String zndxmpd;

    /**
     * 右内灯项目判定
     */
    @ApiModelProperty(value = "	右内灯项目判定	 ")
    private String yndxmpd;

    /**
     * 右外灯项目判定
     */
    @ApiModelProperty(value = "	右外灯项目判定	 ")
    private String ywdxmpd;

    /**
     * 一轴侧滑项目判定
     */
    @ApiModelProperty(value = "	一轴侧滑项目判定	 ")
    private String chxmpd1;

    /**
     * 二轴侧滑项目判定
     */
    @ApiModelProperty(value = "	二轴侧滑项目判定	 ")
    private String chxmpd2;

    /**
     * 路试制动项目判定
     */
    @ApiModelProperty(value = "	路试制动项目判定	 ")
    private String lsxmpd;

    /**
     * 车辆外廓尺寸项目判定
     */
    @ApiModelProperty(value = "	车辆外廓尺寸项目判定	 ")
    private String clwkccxmpd;

    /**
     * 整备质量/空气质量Z项目判定
     */
    @ApiModelProperty(value = "	整备质量/空气质量Z项目判定	 ")
    private String zbzlkqzlxmpd;

    /**
     * 左外灯单项次数
     */
    @ApiModelProperty(value = "	左外灯单项次数	 ")
    private String zwddxcs;

    /**
     * 左内灯单项次数
     */
    @ApiModelProperty(value = "	左内灯单项次数	 ")
    private String znddxcs;

    /**
     * 右内灯单项次数
     */
    @ApiModelProperty(value = "	右内灯单项次数	 ")
    private String ynddxcs;

    /**
     * 右外灯单项次数
     */
    @ApiModelProperty(value = "	右外灯单项次数	 ")
    private String ywddxcs;

    /**
     * 一轴侧滑单项次数
     */
    @ApiModelProperty(value = "	一轴侧滑单项次数	 ")
    private String chdxcs1;

    /**
     * 二轴侧滑单项次数
     */
    @ApiModelProperty(value = "	二轴侧滑单项次数	 ")
    private String chdxcs2;

    /**
     * 路试制动单项次数
     */
    @ApiModelProperty(value = "	路试制动单项次数	 ")
    private String lsdxcs;

    /**
     * 车辆外廓尺寸单项次数
     */
    @ApiModelProperty(value = "	车辆外廓尺寸单项次数	 ")
    private String clwkccdxcs;

    /**
     * 整备质量/空气质量Z单项次数
     */
    @ApiModelProperty(value = "	整备质量/空气质量Z单项次数	 ")
    private String zbzlkqzldxcs;

    /**
     * 总检次数
     */
    @ApiModelProperty(value = "	总检次数	 ")
    private String zjcs;

    /**
     * 备注
     */
    @ApiModelProperty(value = "	备注	 ")
    private String bz;

    @ApiModelProperty(value = "")
    private String tDetail;

    /**
     * 一轴制动力曲线
     */
    @ApiModelProperty(value = "一轴制动力曲线")
    private String yzzdlqx;

    /**
     * 二轴制动力曲线
     */
    @ApiModelProperty(value = "二轴制动力曲线")
    private String ezzdlqx;

    /**
     * 三轴制动力曲线
     */
    @ApiModelProperty(value = "三轴制动力曲线")
    private String tzzdlqx;

    /**
     * 四轴制动力曲线
     */
    @ApiModelProperty(value = "四轴制动力曲线")
    private String fzzdlqx;

    private static final long serialVersionUID = 1L;
}