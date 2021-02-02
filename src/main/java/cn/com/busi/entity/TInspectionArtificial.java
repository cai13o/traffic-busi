package cn.com.busi.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "cn-com-busi-entity-TInspectionArtificial")
@Data
public class TInspectionArtificial implements Serializable {
    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private String id;

    /**
     * 号牌号码（编号）
     */
    @ApiModelProperty(value = "	号牌号码（编号）	 ")
    private String cphm;

    /**
     * 车辆类别
     */
    @ApiModelProperty(value = "	车辆类别	 ")
    private String cllb;

    /**
     * 里程表读数
     */
    @ApiModelProperty(value = "	里程表读数	 ")
    private String lcbds;

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
     * 车辆出厂日期
     */
    @ApiModelProperty(value = "	车辆出厂日期	 ")
    private Date clccrq;

    /**
     * 初次登记日期
     */
    @ApiModelProperty(value = "	初次登记日期	 ")
    private Date ccdjrq;

    /**
     * 检验日期
     */
    @ApiModelProperty(value = "	检验日期	 ")
    private Date jyrq;

    /**
     * 机动车所有人申报使用性质
     */
    @ApiModelProperty(value = "	机动车所有人申报使用性质	 ")
    private String jdcsyrsyxz;

    /**
     * 全时/适时四驱
     */
    @ApiModelProperty(value = "	全时/适时四驱	 ")
    private String qssssq;

    /**
     * 转向轴数量
     */
    @ApiModelProperty(value = "	转向轴数量	 ")
    private String zxzsl;

    /**
     * 配置空气悬架
     */
    @ApiModelProperty(value = "	配置空气悬架	 ")
    private String pzkxxj;

    /**
     * 联网查询（填空1）
     */
    @ApiModelProperty(value = "	联网查询（填空1）	 ")
    private String lwcx1;

    /**
     * 联网查询（填空2）
     */
    @ApiModelProperty(value = "	联网查询（填空2）	 ")
    private String lwcx2;

    /**
     * 联网查询判定
     */
    @ApiModelProperty(value = "	联网查询判定	 ")
    private String lwcxpd;

    /**
     * 号牌号码和分类
     */
    @ApiModelProperty(value = "	号牌号码和分类	 ")
    private String hphmhflpd;

    /**
     * 车辆品牌和型号
     */
    @ApiModelProperty(value = "	车辆品牌和型号	 ")
    private String clpppd;

    /**
     * 车辆识别代码（或整车出厂编号）
     */
    @ApiModelProperty(value = "	车辆识别代码（或整车出厂编号）	 ")
    private String vinpd;

    /**
     * 发动机号码/驱动电机号码
     */
    @ApiModelProperty(value = "	发动机号码/驱动电机号码	 ")
    private String fdjhmpd;

    /**
     * 车身颜色和车辆外形
     */
    @ApiModelProperty(value = "	车身颜色和车辆外形	 ")
    private String csyspd;

    /**
     * 外廓尺寸
     */
    @ApiModelProperty(value = "	外廓尺寸	 ")
    private String wkccpd;

    /**
     * 轴距
     */
    @ApiModelProperty(value = "	轴距	 ")
    private String zjpd;

    /**
     * 核定载人数和座椅布置
     */
    @ApiModelProperty(value = "	核定载人数和座椅布置	 ")
    private String hdrspd;

    /**
     * 栏板高度
     */
    @ApiModelProperty(value = "	栏板高度	 ")
    private String lbgdpd;

    /**
     * 悬架判定
     */
    @ApiModelProperty(value = "	悬架判定	 ")
    private String xjpd;

    /**
     * 客车出口判定
     */
    @ApiModelProperty(value = "	客车出口判定	 ")
    private String kcckpd;

    /**
     * 客车乘客通道和引道判定
     */
    @ApiModelProperty(value = "	客车乘客通道和引道判定	 ")
    private String kccktdpd;

    /**
     * 货箱/罐体判定
     */
    @ApiModelProperty(value = "	货箱/罐体判定	 ")
    private String hxpd;

    /**
     * 车身外观判定
     */
    @ApiModelProperty(value = "	车身外观判定	 ")
    private String cswgpd;

    /**
     * 外观标识、标注和标牌判定
     */
    @ApiModelProperty(value = "	外观标识、标注和标牌判定	 ")
    private String wgbspd;

    /**
     * 外部照明和信号装置判定
     */
    @ApiModelProperty(value = "	外部照明和信号装置判定	 ")
    private String wbzmpd;

    /**
     * 轮胎判定
     */
    @ApiModelProperty(value = "	轮胎判定	 ")
    private String ltpd;

    /**
     * 号牌/号牌板（架）判定
     */
    @ApiModelProperty(value = "	号牌/号牌板（架）判定	 ")
    private String hppd;

    /**
     * 加装/改装灯具判定
     */
    @ApiModelProperty(value = "	加装/改装灯具判定	 ")
    private String jzpd;

    /**
     * 汽车安全带判定
     */
    @ApiModelProperty(value = "	汽车安全带判定	 ")
    private String qcaqdpd;

    /**
     * 应急停车安全附体判定
     */
    @ApiModelProperty(value = "	应急停车安全附体判定	 ")
    private String yjtcaqftpd;

    /**
     * 灭火器判定
     */
    @ApiModelProperty(value = "	灭火器判定	 ")
    private String mhqpd;

    /**
     * 行驶记录装置判定
     */
    @ApiModelProperty(value = "	行驶记录装置判定	 ")
    private String xsjlzzpd;

    /**
     * 车身反光标识判定
     */
    @ApiModelProperty(value = "	车身反光标识判定	 ")
    private String csfgbspd;

    /**
     * 车辆尾部标志板判定
     */
    @ApiModelProperty(value = "	车辆尾部标志板判定	 ")
    private String clwbbzbpd;

    /**
     * 侧、后、前下部防护判定
     */
    @ApiModelProperty(value = "	侧、后、前下部防护判定	 ")
    private String chqxbfhpd;

    /**
     * 应急锤判定
     */
    @ApiModelProperty(value = "	应急锤判定	 ")
    private String yjcpd;

    /**
     * 车速限制/报警功能或装置判定
     */
    @ApiModelProperty(value = "	车速限制/报警功能或装置判定	 ")
    private String csxzpd;

    /**
     * 放抱制动装置判定
     */
    @ApiModelProperty(value = "	放抱制动装置判定	 ")
    private String fbzdzzpd;

    /**
     * 辅助制动装置判定
     */
    @ApiModelProperty(value = "	辅助制动装置判定	 ")
    private String fzzdzzpd;

    /**
     * 盘式制动器判定
     */
    @ApiModelProperty(value = "	盘式制动器判定	 ")
    private String pszdqpd;

    /**
     * 制动间隙自动调整装置判定
     */
    @ApiModelProperty(value = "	制动间隙自动调整装置判定	 ")
    private String zdjxzdtzzzpd;

    /**
     * 紧急切断装置判定
     */
    @ApiModelProperty(value = "	紧急切断装置判定	 ")
    private String jjqdzzpd;

    /**
     * 发动机舱自动灭火装置判定
     */
    @ApiModelProperty(value = "	发动机舱自动灭火装置判定	 ")
    private String fdjczdmhzzpd;

    /**
     * 手动机械断电开关判定
     */
    @ApiModelProperty(value = "	手动机械断电开关判定	 ")
    private String sdjxddkgpd;

    /**
     * 副制动踏板判定
     */
    @ApiModelProperty(value = "	副制动踏板判定	 ")
    private String fzdtbpd;

    /**
     * 校车标志灯和停车指示标志牌判定
     */
    @ApiModelProperty(value = "	校车标志灯和停车指示标志牌判定	 ")
    private String xcbzdpd;

    /**
     * 危险货物运输车辆标志判定
     */
    @ApiModelProperty(value = "	危险货物运输车辆标志判定	 ")
    private String wxhwysclbzpd;

    /**
     * 驾驶区隔离设施判定
     */
    @ApiModelProperty(value = "	驾驶区隔离设施判定	 ")
    private String jsqglsspd;

    /**
     * 肢体残疾人操纵辅助装置判定
     */
    @ApiModelProperty(value = "	肢体残疾人操纵辅助装置判定	 ")
    private String ztcjrpd;

    /**
     * 转向判定
     */
    @ApiModelProperty(value = "	转向判定	 ")
    private String zxpd;

    /**
     * 传动判定
     */
    @ApiModelProperty(value = "	传动判定	 ")
    private String cspd;

    /**
     * 制动判定
     */
    @ApiModelProperty(value = "	制动判定	 ")
    private String zdpd;

    /**
     * 仪表和指示器判定
     */
    @ApiModelProperty(value = "	仪表和指示器判定	 ")
    private String ybpd;

    /**
     * 转向系部件判定
     */
    @ApiModelProperty(value = "	转向系部件判定	 ")
    private String zxxbjpd;

    /**
     * 传动系部件判定
     */
    @ApiModelProperty(value = "	传动系部件判定	 ")
    private String cdxbjpd;

    /**
     * 行驶系部件判定
     */
    @ApiModelProperty(value = "	行驶系部件判定	 ")
    private String xsxbjpd;

    /**
     * 制动系部件判定
     */
    @ApiModelProperty(value = "	制动系部件判定	 ")
    private String zdxbjpd;

    /**
     * 其他部件判定
     */
    @ApiModelProperty(value = "	其他部件判定	 ")
    private String qtbjpd;

    /**
     * 车辆外廓尺寸
     */
    @ApiModelProperty(value = "	车辆外廓尺寸	 ")
    private String clwkcc;

    /**
     * 轴距
     */
    @ApiModelProperty(value = "	轴距	 ")
    private String zj;

    /**
     * 轮胎花纹深度转向轮
     */
    @ApiModelProperty(value = "	轮胎花纹深度转向轮	 ")
    private String zxtlthwsd;

    /**
     * 轮胎花纹深度其他轮
     */
    @ApiModelProperty(value = "	轮胎花纹深度其他轮	 ")
    private String qttlthwsd;

    /**
     * 轮胎花纹深度挂车
     */
    @ApiModelProperty(value = "	轮胎花纹深度挂车	 ")
    private String gclthwsd;

    /**
     * 车身对称部位高度差单车前左
     */
    @ApiModelProperty(value = "	车身对称部位高度差单车前左	 ")
    private String zqdccsdc;

    /**
     * 车身对称部位高度差单车前右
     */
    @ApiModelProperty(value = "	车身对称部位高度差单车前右	 ")
    private String yqdccsdc;

    /**
     * 车身对称部位高度差单车前高度差
     */
    @ApiModelProperty(value = "	车身对称部位高度差单车前高度差	 ")
    private String qdccsdcbwgdc;

    /**
     * 车身对称部位高度差单车后左
     */
    @ApiModelProperty(value = "	车身对称部位高度差单车后左	 ")
    private String zhdccsdc;

    /**
     * 车身对称部位高度差单车后右
     */
    @ApiModelProperty(value = "	车身对称部位高度差单车后右	 ")
    private String yhdccsdc;

    /**
     * 车身对称部位高度差单车后高度差
     */
    @ApiModelProperty(value = "	车身对称部位高度差单车后高度差	 ")
    private String hdccsdcbwgdc;

    /**
     * 车身对称部位高度差挂车左
     */
    @ApiModelProperty(value = "	车身对称部位高度差挂车左	 ")
    private String zgccsdc;

    /**
     * 车身对称部位高度差挂车右
     */
    @ApiModelProperty(value = "	车身对称部位高度差挂车右	 ")
    private String ygccsdc;

    /**
     * 车身对称部位高度差挂车高度差
     */
    @ApiModelProperty(value = "	车身对称部位高度差挂车高度差	 ")
    private String gcgsdcbwgdc;

    /**
     * 车厢栏板高度单车
     */
    @ApiModelProperty(value = "	车厢栏板高度单车	 ")
    private String dccxlbgd;

    /**
     * 车厢栏板高度挂车
     */
    @ApiModelProperty(value = "	车厢栏板高度挂车	 ")
    private String gccxlbgd;

    /**
     * 方向盘最大自由转动量(°)
     */
    @ApiModelProperty(value = "	方向盘最大自由转动量(°)	 ")
    private String fxpzdzyzdl;

    /**
     * 外观检验员建议
     */
    @ApiModelProperty(value = "	外观检验员建议	 ")
    private String wgjyyjy;

    /**
     * 地盘动态检验员建议
     */
    @ApiModelProperty(value = "	地盘动态检验员建议	 ")
    private String dpdtjjyjy;

    /**
     * 底盘部件检验员建议
     */
    @ApiModelProperty(value = "	底盘部件检验员建议	 ")
    private String dpbjjjyjy;

    /**
     * 引车员建议
     */
    @ApiModelProperty(value = "	引车员建议	 ")
    private String ycyjy;

    /**
     * 外观检验员检验时间
     */
    @ApiModelProperty(value = "	外观检验员检验时间	 ")
    private String wgjyyjysj;

    /**
     * 地盘动态检验员检验时间
     */
    @ApiModelProperty(value = "	地盘动态检验员检验时间	 ")
    private String dpdtjjyjysj;

    /**
     * 底盘部件检验员检验时间
     */
    @ApiModelProperty(value = "	底盘部件检验员检验时间	 ")
    private String dpbjjjyjysj;

    /**
     * 引车员检验时间
     */
    @ApiModelProperty(value = "	引车员检验时间	 ")
    private String ycyjysj;

    /**
     * 机动车所有人
     */
    @ApiModelProperty(value = "	机动车所有人	 ")
    private String jdcsyr;

    /**
     * 手机电话
     */
    @ApiModelProperty(value = "	手机电话	 ")
    private String sjhm;

    /**
     * 地址/邮编
     */
    @ApiModelProperty(value = "	地址/邮编	 ")
    private String dzyb;

    /**
     * 不合格项
     */
    @ApiModelProperty(value = "不合格项")
    private String bhgx;

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