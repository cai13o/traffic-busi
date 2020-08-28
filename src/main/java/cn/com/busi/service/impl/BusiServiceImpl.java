package cn.com.busi.service.impl;


import cn.com.busi.common.BusinessConstant;
import cn.com.busi.entity.*;
import cn.com.busi.enums.BusiEnum;
import cn.com.busi.mapper.*;
import cn.com.busi.service.BusiService;
import cn.com.busi.utils.DateTimeUtil;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * *********************************************
 *
 * @author :  WangXiaoTao
 * @version :  1.0
 * *********************************************
 * @class :  BusiServiceImpl
 * @description :  业务service
 * @date :  2020/5/29
 */
@Service
@Slf4j
public class BusiServiceImpl implements BusiService {

    @Resource
    private TReportDao tReportDao;
    @Resource
    private TRecordDao tRecordDao;
    @Resource
    private TInstInfoDao tInstInfoDao;
    @Resource
    private TInstPersonDao tInstPersonDao;
    @Resource
    private TInstDeviceDao tInstDeviceDao;
    @Resource
    private TCautionDao tCautionDao;
    @Resource
    private TCartypeDao tCartypeDao;

    /**
     * *********************************************
     *
     * @method :  insertZongHeXNJYJLD
     * @description :  TODO
     * @date :  2020/5/29
     * @author :  WangXiaoTao
     * @version :  1.0
     * *********************************************
     */
    @Override
    public String insertZongHeXNJYJLD(String json, byte[] zdjygw, byte[] dgjygw, byte[] dlxjygw) {
        System.out.println(zdjygw.length + "111" + dgjygw.length + "222" + dlxjygw);
        Map<String, Object> resMap = new HashMap<>();
        resMap.put(BusinessConstant.RETCODE, BusiEnum.E0000.getCode());
        resMap.put(BusinessConstant.RETMSG, BusiEnum.E0000.getMessage());
        System.out.println("本地图片:" + zdjygw);
        System.out.println("本地图片:" + dgjygw);
        System.out.println("本地图片:" + dlxjygw);
        TRecord tRecord = new TRecord();
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串

        //一、判断并保存三张图片
        if (null != zdjygw) {
            //制动检验工位照片
            tRecord.setZdjygw(encoder.encode(Objects.requireNonNull(zdjygw)));
            System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(zdjygw)));
        }
        if (null != dgjygw) {
            //灯光检验工位照片
            tRecord.setDgjygw(encoder.encode(Objects.requireNonNull(dgjygw)));
            System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(dgjygw)));
        }
        if (null != dlxjygw) {
            //动力性检验工位照片
            tRecord.setDlxjygw(encoder.encode(Objects.requireNonNull(dlxjygw)));
            System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(dlxjygw)));
        }

        //二、解析报文
        JSONObject info = getInfo(json);
        log.info("解析后的报文为" + info.toString());
        if (null == info) {
            //返回null，说明报文格式不对
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1001.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1001.getMessage());
            return resMap.toString();
        }
        String id = String.valueOf(info.get(BusinessConstant.ID));
        if (null == id) {
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1002.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1002.getMessage());
            return resMap.toString();
        }

        //三、获取数据并入库
        //主键
        tRecord.setId(id);
        //检验流水号
        tRecord.setJylsh(String.valueOf(info.get(BusinessConstant.JYLSH)));
        //检验机构编号
        tRecord.setJyjgbh(String.valueOf(info.get(BusinessConstant.JYJGBH)));
        //检验机构名称
        tRecord.setJyjgmc(String.valueOf(info.get(BusinessConstant.JYJGMC)));
        //检测线代号
        tRecord.setJcxdh(String.valueOf(info.get(BusinessConstant.JCXDH)));
        //委托人
        tRecord.setWtr(String.valueOf(info.get(BusinessConstant.WTR)));
        //道路运输证号
        tRecord.setDlyszh(String.valueOf(info.get(BusinessConstant.DLYSZH)));
        //检验类别
        tRecord.setJylb(String.valueOf(info.get(BusinessConstant.JYLB)));
        //业务类型
        tRecord.setYwlx(String.valueOf(info.get(BusinessConstant.YWLX)));
        //检测线别
        tRecord.setJcxb(String.valueOf(info.get(BusinessConstant.JCXB)));
        //检测日期
        if (null != info.get(BusinessConstant.JCRQ) && !"".equals(info.get(BusinessConstant.JCRQ))) {
            tRecord.setJcrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.JCRQ)), "yyyy-MM-dd hh:mm:ss"));
        }
        //检测记录单编号
        tRecord.setJcjldbh(String.valueOf(info.get(BusinessConstant.JCJLDBH)));
        //号牌号码
        tRecord.setCphm(String.valueOf(info.get(BusinessConstant.CPHM)));
        //号牌种类
        tRecord.setHpzl(String.valueOf(info.get(BusinessConstant.HPZL)));
        //挂车牌照号
        tRecord.setGcpzh(String.valueOf(info.get(BusinessConstant.GCPZH)));
        //挂车类型
        tRecord.setGclx(String.valueOf(info.get(BusinessConstant.GCLX)));
        //车辆出厂日期
        if (null != info.get(BusinessConstant.CLCCRQ) && !"".equals(info.get(BusinessConstant.CLCCRQ))) {
            tRecord.setClccrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.CLCCRQ)), "yyyyMMdd"));
        }
        //微机登录员
        tRecord.setWjdly(String.valueOf(info.get(BusinessConstant.WJDLY)));
        //引车员
        tRecord.setYcy(String.valueOf(info.get(BusinessConstant.YCY)));
        //尾气操作员
        tRecord.setWqczy(String.valueOf(info.get(BusinessConstant.WQCZY)));
        //注册登记日期
        if (null != info.get(BusinessConstant.ZCDJRQ) && !"".equals(info.get(BusinessConstant.ZCDJRQ))) {
            tRecord.setZcdjrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.ZCDJRQ)), "yyyyMMdd"));
        }
        //VIN号
        tRecord.setVin(String.valueOf(info.get(BusinessConstant.VIN)));
        //车辆型号
        tRecord.setClxh(String.valueOf(info.get(BusinessConstant.CLXH)));
        //发动机号
        tRecord.setFdjh(String.valueOf(info.get(BusinessConstant.FDJH)));
        //车身颜色
        tRecord.setCsys(String.valueOf(info.get(BusinessConstant.CSYS)));
        //行驶总里程（km）
        tRecord.setXszlc(String.valueOf(info.get(BusinessConstant.XSZLC)));
        //驱动形式
        tRecord.setQdxs(String.valueOf(info.get(BusinessConstant.QDXS)));
        //转向轴悬架形式
        tRecord.setZxzxjxs(String.valueOf(info.get(BusinessConstant.ZXZXJXS)));
        //挂车轴数
        tRecord.setGczs(String.valueOf(info.get(BusinessConstant.GCZS)));
        //燃料类别
        tRecord.setRllb(String.valueOf(info.get(BusinessConstant.RLLB)));
        //行政区域
        tRecord.setXzqy(String.valueOf(info.get(BusinessConstant.XZQY)));
        //检验机构地址
        tRecord.setJyjgdz(String.valueOf(info.get(BusinessConstant.JYJGDZ)));
        //车辆类型
        tRecord.setCllx(String.valueOf(info.get(BusinessConstant.CLLX)));
        //总检验次数
        tRecord.setZjycs(String.valueOf(info.get(BusinessConstant.ZJYCS)));
        //
        tRecord.setClzbzl(String.valueOf(info.get(BusinessConstant.CLZBZL)));
        //使用性质
        tRecord.setSyxz(String.valueOf(info.get(BusinessConstant.SYXZ)));
        //车辆用途
        tRecord.setClyt(String.valueOf(info.get(BusinessConstant.CLYT)));
        System.out.println(tRecord.getClzbzl());
        //总信息
        tRecord.setTDetail(json);
        try {
            String.valueOf(info.get(BusinessConstant.YRPD));
            String.valueOf(info.get(BusinessConstant.ZWPD));
            String.valueOf(info.get(BusinessConstant.YWPD));
            System.out.println(tRecord + "111111111`````````````````````````");
            tRecordDao.insert(tRecord);
            String dzzdcs1 = String.valueOf(info.get(BusinessConstant.DZZDCS1));
            String yrpd = String.valueOf(info.get(BusinessConstant.YRPD));
            String zwpd = String.valueOf(info.get(BusinessConstant.ZWPD));
            String ywpd = String.valueOf(info.get(BusinessConstant.YWPD));


//            StringBuffer strBuf = new StringBuffer();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:\\liangkeyiwei\\cllx.txt")), "gbk"));
//            int tempchar;
//            while ((tempchar = bufferedReader.read()) != -1) {
//                strBuf.append((char) tempchar);
//            }
//            bufferedReader.close();
//            List<TCartype> tCartypes = this.tCartypeDao.queryAll();


//            for(TCartype tCartype:tCartypes) {
            if (tRecord.getCllx().contains("货车")) {
                if(info.get(BusinessConstant.DCSPCZ) != null && !tRecord.getClzbzl().equals("")) {
                    if(!info.get(BusinessConstant.DCSPCZ).equals("")) {
                        if ((Integer.parseInt(tRecord.getClzbzl()) - Integer.parseInt(String.valueOf(info.get(BusinessConstant.DCSPCZ)))) >= 500 || (Integer.parseInt(tRecord.getClzbzl()) - Integer.parseInt(String.valueOf(info.get(BusinessConstant.DCSPCZ)))) <= -500) {
                            System.out.println(tRecord.getClzbzl());
                            TCaution tCaution = new TCaution();
                            tCaution.setId(UUID.randomUUID().toString().replaceAll("-", ""));
                            tCaution.setJglx("整备质量不合格");
                            tCaution.setSsqy(tRecord.getXzqy());
                            tCaution.setSsjg(tRecord.getJyjgmc());
                            tCaution.setCphm(tRecord.getCphm());
                            tCaution.setLrsj(new Date());
                            tCautionDao.insert(tCaution);
                        }
                    }
                }
            }
//            }

            if (tRecord.getCllx().contains("客车")) {
                if (dzzdcs1.equals("-") || yrpd.equals("-") || zwpd.equals("-") || ywpd.equals("-") || dzzdcs1.equals("") || yrpd.equals("") || zwpd.equals("") || ywpd.equals("")) {
                    TCaution tCaution = new TCaution();
                    tCaution.setId(UUID.randomUUID().toString().replaceAll("-", ""));
                    tCaution.setJglx("检测项目不全");
                    tCaution.setSsqy(tRecord.getXzqy());
                    tCaution.setSsjg(tRecord.getJyjgmc());
                    tCaution.setCphm(tRecord.getCphm());
                    tCaution.setLrsj(new Date());
                    tCautionDao.insert(tCaution);
                }

                String bhgx = String.valueOf(info.get(BusinessConstant.BHGX));
                if (!bhgx.equals("无") && !bhgx.equals("")) {
                    TCaution tCaution = new TCaution();
                    tCaution.setId(UUID.randomUUID().toString().replaceAll("-", ""));
                    tCaution.setJglx(bhgx + "不合格");
                    tCaution.setSsqy(tRecord.getXzqy());
                    tCaution.setSsjg(tRecord.getJyjgmc());
                    tCaution.setCphm(tRecord.getCphm());
                    tCaution.setLrsj(new Date());
                    tCautionDao.insert(tCaution);
                }
            }
        } catch (Exception e) {
            log.info("error", e);
            log.info("【操作数据库异常】");
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E8999.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E8999.getMessage());
            return resMap.toString();
        }
        return resMap.toString();
    }

    /**
     * *********************************************
     *
     * @method :  insertZongHeXNJYBGD
     * @description :  TODO
     * @date :  2020/5/29
     * @author :  WangXiaoTao
     * @version :  1.0
     * *********************************************
     */
    @Override
    public String insertZongHeXNJYBGD(String json) {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put(BusinessConstant.RETCODE, BusiEnum.E0000.getCode());
        resMap.put(BusinessConstant.RETMSG, BusiEnum.E0000.getMessage());
        TReport tReport = new TReport();
        //一、解析报文
        JSONObject info = getInfo(json);
        log.info("解析后的报文为" + info.toString());
        if (null == info) {
            //返回null，说明报文格式不对
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1001.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1001.getMessage());
            return resMap.toString();
        }
        String id = String.valueOf(info.get(BusinessConstant.ID));
        if (null == id) {
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1002.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1002.getMessage());
            return resMap.toString();
        }
        //二、获取数据并入库
        //主键
        tReport.setId(String.valueOf(info.get(BusinessConstant.ID)));
        //报告编号
        tReport.setBgbh(String.valueOf(info.get(BusinessConstant.BGBH)));
        //资质认定证书编号
        tReport.setZzrdzsbh(String.valueOf(info.get(BusinessConstant.ZZRDZSBH)));
        //检验机构地址
        tReport.setJyjgdz(String.valueOf(info.get(BusinessConstant.JYJGDZ)));
        //检验机构电话
        tReport.setJyjgdh(String.valueOf(info.get(BusinessConstant.JYJGDH)));
        //号牌号码
        tReport.setCphm(String.valueOf(info.get(BusinessConstant.CPHM)));
        //委托人
        tReport.setWtr(String.valueOf(info.get(BusinessConstant.WTR)));
        //道路运输证号
        tReport.setDlyszh(String.valueOf(info.get(BusinessConstant.DLYSZH)));
        //车辆类型
        tReport.setCllx(String.valueOf(info.get(BusinessConstant.CLLX)));
        //品牌型号
        tReport.setPpxh(String.valueOf(info.get(BusinessConstant.PPXH)));
        //注册登记日期
        if (null != info.get(BusinessConstant.ZCDJRQ) && !"".equals(info.get(BusinessConstant.ZCDJRQ))) {
            tReport.setZcdjrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.ZCDJRQ)), "yyyyMMdd"));
        }
        //出厂年月
        if (null != info.get(BusinessConstant.CCNY) && !"".equals(info.get(BusinessConstant.CCNY))) {
            tReport.setCcny(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.CCNY)), "yyyyMMdd"));
        }
        //车身颜色
        tReport.setCsys(String.valueOf(info.get(BusinessConstant.CSYS)));
        //车辆识别代号
        tReport.setVin(String.valueOf(info.get(BusinessConstant.VIN)));
        //发动机号码
        tReport.setFdjhm(String.valueOf(info.get(BusinessConstant.FDJHM)));
        //行政区域
        tReport.setXzqy(String.valueOf(info.get(BusinessConstant.XZQY)));

        //检验类别
        tReport.setJylb(String.valueOf(info.get(BusinessConstant.JYLB)));
        //业务类型
        tReport.setYwlx(String.valueOf(info.get(BusinessConstant.YWLX)));
        //检验日期
        if (null != info.get(BusinessConstant.JYRQ) && !"".equals(info.get(BusinessConstant.JYRQ))) {
            tReport.setJcrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.JYRQ)), "yyyy-MM-dd hh:mm:ss"));
        }
        //唯一性
        tReport.setWyxrd(String.valueOf(info.get(BusinessConstant.WYXRD)));
        //故障信息诊断
        tReport.setGzxxzd(String.valueOf(info.get(BusinessConstant.GZXXZD)));
        //门窗
        tReport.setWgjc(String.valueOf(info.get(BusinessConstant.WGJC)));
        //运行检测
        tReport.setYxjc(String.valueOf(info.get(BusinessConstant.YXJC)));
        //底盘评定
        tReport.setDpjc(String.valueOf(info.get(BusinessConstant.DPJC)));
        //核查评定
        tReport.setHcpd(String.valueOf(info.get(BusinessConstant.HCPD)));
        //动力性
        tReport.setDlx(String.valueOf(info.get(BusinessConstant.DLXPD)));
        //经济性
        tReport.setJjx(String.valueOf(info.get(BusinessConstant.JJXPD)));
        //一轴制动性
        tReport.setYzzdl(String.valueOf(info.get(BusinessConstant.YZZDLPD)));
        tReport.setYzbphl(String.valueOf(info.get(BusinessConstant.YZBPHLPD)));
        tReport.setEzzdl(String.valueOf(info.get(BusinessConstant.EZZDLPD)));
        tReport.setEzbphl(String.valueOf(info.get(BusinessConstant.EZBPHLPD)));
        tReport.setTzzdl(String.valueOf(info.get(BusinessConstant.TZZDLPD)));
        tReport.setTzbphl(String.valueOf(info.get(BusinessConstant.TZBPHLPD)));
        tReport.setDcqyczheczdl(String.valueOf(info.get(BusinessConstant.DCQYCZHECZDLPD)));
        tReport.setDcqyczhuczdl(String.valueOf(info.get(BusinessConstant.DCQYCZHUCZDLPD)));
        tReport.setMark(String.valueOf(info.get(BusinessConstant.MARK)));
        tReport.setJcjl(String.valueOf(info.get(BusinessConstant.JCJL)));
        tReport.setZjcs(String.valueOf(info.get(BusinessConstant.ZJCS)));
        tReport.setJcjgmc(String.valueOf(info.get(BusinessConstant.JCJGMC)));
        tReport.setSqqzr(String.valueOf(info.get(BusinessConstant.SQQZR)));
        tReport.setClzbzl(String.valueOf(info.get(BusinessConstant.CLZBZL)));
        tReport.setClrllb(String.valueOf(info.get(BusinessConstant.CLRLLB)));

        //四轴制动率判定
        tReport.setFzzdlpd(String.valueOf(info.get(BusinessConstant.FZZDLPD)));
        //四轴不平衡率判定
        tReport.setFzbphlpd(String.valueOf(info.get(BusinessConstant.FZBPHLPD)));
        //使用性质
        tReport.setSyxz(String.valueOf(info.get(BusinessConstant.SYXZ)));
        //车辆用途
        tReport.setClyt(String.valueOf(info.get(BusinessConstant.CLYT)));
        //喇叭声级判定
        tReport.setLbsyjpd(String.valueOf(info.get(BusinessConstant.LBSYJPD)));
        //灯光 ZWDYGGQPD,YWDYGGQPD
        String ZWDYGGQPD = String.valueOf(info.get(BusinessConstant.ZWDYGGQPD));
        String YWDYGGQPD = String.valueOf(info.get(BusinessConstant.YWDYGGQPD));
        boolean ZWDYGGQ = (ZWDYGGQPD.equals("合格") || ZWDYGGQPD.equals("一级") || ZWDYGGQPD.equals("二级"));
        boolean YWDYGGQ = (YWDYGGQPD.equals("合格") || YWDYGGQPD.equals("一级") || YWDYGGQPD.equals("二级"));
        System.out.println(ZWDYGGQ + " " + YWDYGGQ);
        if (ZWDYGGQ && YWDYGGQ) {
            tReport.setDg("合格");
        } else {
            tReport.setDg("不合格");
        }
        //侧滑 DYZLCHLPD,DEZLCHLPD
        String DYZLCHLPD = String.valueOf(info.get(BusinessConstant.DYZLCHLPD));
        String DEZLCHLPD = String.valueOf(info.get(BusinessConstant.DEZLCHLPD));
        boolean DYZLCHL = (DYZLCHLPD.equals("合格") || DYZLCHLPD.equals("一级") || DYZLCHLPD.equals("二级"));
        boolean DEZLCHL = (DEZLCHLPD.equals("合格") || DEZLCHLPD.equals("一级") || DEZLCHLPD.equals("二级"));

        if (DYZLCHL && DEZLCHL) {
            tReport.setCh("合格");
        } else {
            tReport.setCh("不合格");
        }
        //排放
        List<String> list = new ArrayList<String>();
        list.add(String.valueOf(info.get(BusinessConstant.GDSHCPD)));
        list.add(String.valueOf(info.get(BusinessConstant.GDSCOPD)));
        list.add(String.valueOf(info.get(BusinessConstant.GDSLMNPD)));
        list.add(String.valueOf(info.get(BusinessConstant.DSHCPD)));
        list.add(String.valueOf(info.get(BusinessConstant.DSCOPD)));
        list.add(String.valueOf(info.get(BusinessConstant.WT5025GKCOPD)));
        list.add(String.valueOf(info.get(BusinessConstant.WT5025GKHCPD)));
        list.add(String.valueOf(info.get(BusinessConstant.WT5025GKNOPD)));
        list.add(String.valueOf(info.get(BusinessConstant.WT2540GKCOPD)));
        list.add(String.valueOf(info.get(BusinessConstant.WT2540GKHCPD)));
        list.add(String.valueOf(info.get(BusinessConstant.WT2540GKNOPD)));
        list.add(String.valueOf(info.get(BusinessConstant.GXSXSPD)));
        list.add(String.valueOf(info.get(BusinessConstant.LZYDPD)));
        list.add(String.valueOf(info.get(BusinessConstant.JZJSGK100PD)));
        list.add(String.valueOf(info.get(BusinessConstant.JZJSGK90PD)));
        list.add(String.valueOf(info.get(BusinessConstant.JZJSGK80PD)));
        list.add(String.valueOf(info.get(BusinessConstant.SCZDGLPD)));
        boolean flag = true;
        for (String s : list) {
            if (!(s.equals("合格") || s.equals("一级") || s.equals("二级")))
                flag = false;
        }
        if (flag) {
            tReport.setPf("合格");
        } else {
            tReport.setPf("不合格");
        }
        //详细信息
        tReport.setTDetail(json);
        try {
            tReportDao.insert(tReport);

        } catch (Exception e) {
            log.info("error", e);
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E8999.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E8999.getMessage());
            return resMap.toString();
        }
        return resMap.toString();
    }


    public String insertInstitutionInfo(String json) {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put(BusinessConstant.RETCODE, BusiEnum.E0000.getCode());
        resMap.put(BusinessConstant.RETMSG, BusiEnum.E0000.getMessage());
        TInstInfo tInstInfo = new TInstInfo();

        //一、解析报文
        JSONObject info = getInfo(json);
        log.info("解析后的报文为" + info.toString());
        if (null == info) {
            //返回null，说明报文格式不对
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1001.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1001.getMessage());
            return resMap.toString();
        }
        String id = String.valueOf(info.get(BusinessConstant.ID));
        if (null == id) {
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1002.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1002.getMessage());
            return resMap.toString();
        }
        //二、获取数据并入库
        //主键
        tInstInfo.setId(String.valueOf(info.get(BusinessConstant.ID)));
        //机构名称
        tInstInfo.setName(String.valueOf(info.get(BusinessConstant.NAME)));
        //法人代表
        tInstInfo.setOwner(String.valueOf(info.get(BusinessConstant.OWNER)));
        //联系电话
        tInstInfo.setPhone(String.valueOf(info.get(BusinessConstant.PHONE)));
        //联系人
        tInstInfo.setContact(String.valueOf(info.get(BusinessConstant.CONTACT)));
        //所属区域
        tInstInfo.setArea(String.valueOf(info.get(BusinessConstant.AREA)));
        //机构地址
        tInstInfo.setAddress(String.valueOf(info.get(BusinessConstant.ADDRESS)));
        //资质证书号
        tInstInfo.setCertificate(String.valueOf(info.get(BusinessConstant.CERTIFICATE)));
        //资质证书下发日期
        tInstInfo.setStartdate(String.valueOf(info.get(BusinessConstant.STARTDATE)));
        //资质证书有效期
        tInstInfo.setEnddate(String.valueOf(info.get(BusinessConstant.ENDDATE)));
        //操作表示
        tInstInfo.setOpflag(String.valueOf(info.get(BusinessConstant.OPFLAG)));
        //操作日期
        tInstInfo.setOpdate(String.valueOf(info.get(BusinessConstant.OPDATE)));

        try {
            if (tInstInfo.getOpflag().equals("1")) {
                tInstInfoDao.insert(tInstInfo);
            } else {
                tInstInfoDao.update(tInstInfo);
            }
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sf.parse(tInstInfo.getEnddate());
//            System.out.println(date);
            if (date.getTime() < new Date().getTime()) {
//                System.out.println("=================================================================================");
                TCaution tCaution = new TCaution();
                tCaution.setId(UUID.randomUUID().toString().replaceAll("-", ""));
                tCaution.setJglx("资质证书超过有效期");
                tCaution.setSsqy(tInstInfo.getArea());
                tCaution.setJgzzrdzsbh(tInstInfo.getCertificate());
                tCaution.setSsjg(tInstInfo.getName());
                tCaution.setJglxr(tInstInfo.getContact());
                tCaution.setLrsj(new Date());
                tCautionDao.insert(tCaution);
            }
        } catch (Exception e) {
            log.info("error", e);
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E8999.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E8999.getMessage());
            return resMap.toString();
        }
        return resMap.toString();
    }

    @Override
    public String insertInstitutionPerson(String json) {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put(BusinessConstant.RETCODE, BusiEnum.E0000.getCode());
        resMap.put(BusinessConstant.RETMSG, BusiEnum.E0000.getMessage());
        TInstPerson tInstPerson = new TInstPerson();

        //一、解析报文
        JSONObject info = getInfo(json);
        log.info("解析后的报文为" + info.toString());
        if (null == info) {
            //返回null，说明报文格式不对
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1001.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1001.getMessage());
            return resMap.toString();
        }
        String id = String.valueOf(info.get(BusinessConstant.ID));
        if (null == id) {
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1002.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1002.getMessage());
            return resMap.toString();
        }
        //二、获取数据并入库
        //主键
        tInstPerson.setId(String.valueOf(info.get(BusinessConstant.ID)));
        //人员姓名
        tInstPerson.setName(String.valueOf(info.get(BusinessConstant.NAME)));
        //机构名称
        tInstPerson.setInstitution(String.valueOf(info.get(BusinessConstant.INSTITUTION)));
        //性别
        tInstPerson.setGender(String.valueOf(info.get(BusinessConstant.GENDER)));
        //身份证号码
        tInstPerson.setIdno(String.valueOf(info.get(BusinessConstant.IDNO)));
        //所学专业
        tInstPerson.setMajor(String.valueOf(info.get(BusinessConstant.MAJOR)));
        //学历
        tInstPerson.setRecode(String.valueOf(info.get(BusinessConstant.RECODE)));
        //现在部门岗位
        tInstPerson.setPosition(String.valueOf(info.get(BusinessConstant.POSITION)));
        //上岗证书编号
        tInstPerson.setCertificate(String.valueOf(info.get(BusinessConstant.CERTIFICATE)));
        //上岗证书截止日期
        tInstPerson.setEnddate(String.valueOf(info.get(BusinessConstant.ENDDATE)));
        //档案管理员
        tInstPerson.setFileman(String.valueOf(info.get(BusinessConstant.FILEMAN)));
        //登记日期
        tInstPerson.setRegidate(String.valueOf(info.get(BusinessConstant.REGIDATE)));
        //备注
        tInstPerson.setRemarks(String.valueOf(info.get(BusinessConstant.REMARKS)));
        //操作表示
        tInstPerson.setOpflag(String.valueOf(info.get(BusinessConstant.OPFLAG)));
        //操作日期
        tInstPerson.setOpdate(String.valueOf(info.get(BusinessConstant.OPDATE)));

        try {
            if (tInstPerson.getOpflag().equals("1")) {
                tInstPersonDao.insert(tInstPerson);
            } else {
                tInstPersonDao.update(tInstPerson);
            }
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sf.parse(tInstPerson.getEnddate());
            if (date.getTime() < new Date().getTime()) {
                TCaution tCaution = new TCaution();
                tCaution.setId(UUID.randomUUID().toString().replaceAll("-", ""));
                tCaution.setJglx("人员无证上岗");
                tCaution.setRymc(tInstPerson.getName());
                tCaution.setSsjg(tInstPerson.getInstitution());
                tCaution.setLrsj(new Date());
                tCautionDao.insert(tCaution);
            }
        } catch (Exception e) {
            log.info("error", e);
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E8999.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E8999.getMessage());
            return resMap.toString();
        }
        return resMap.toString();
    }

    @Override
    public String insertInstitutionDevice(String json) {
        Map<String, Object> resMap = new HashMap<>();
        resMap.put(BusinessConstant.RETCODE, BusiEnum.E0000.getCode());
        resMap.put(BusinessConstant.RETMSG, BusiEnum.E0000.getMessage());
        TInstDevice tInstDevice = new TInstDevice();

        //一、解析报文
        JSONObject info = getInfo(json);
        log.info("解析后的报文为" + info.toString());
        if (null == info) {
            //返回null，说明报文格式不对
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1001.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1001.getMessage());
            return resMap.toString();
        }
        String id = String.valueOf(info.get(BusinessConstant.ID));
        if (null == id) {
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E1002.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E1002.getMessage());
            return resMap.toString();
        }
        //二、获取数据并入库
        //主键
        tInstDevice.setId(String.valueOf(info.get(BusinessConstant.ID)));
        //仪器设备名称
        tInstDevice.setName(String.valueOf(info.get(BusinessConstant.NAME)));
        //机构名称
        tInstDevice.setInstitution(String.valueOf(info.get(BusinessConstant.INSTITUTION)));
        //型号
        tInstDevice.setModel(String.valueOf(info.get(BusinessConstant.MODEL)));
        //设备编号
        tInstDevice.setIdno(String.valueOf(info.get(BusinessConstant.IDNO)));
        //溯源方式
        tInstDevice.setTrace(String.valueOf(info.get(BusinessConstant.TRACE)));
        //检定/校准机构
        tInstDevice.setCheckins(String.valueOf(info.get(BusinessConstant.CHECKINS)));
        //最近检定/校准日期
        tInstDevice.setCheckdate(String.valueOf(info.get(BusinessConstant.CHECKDATE)));
        //检定/校准周期
        tInstDevice.setCycle(String.valueOf(info.get(BusinessConstant.CYCLE)));
        //下次检定/校准日期
        tInstDevice.setNextdate(String.valueOf(info.get(BusinessConstant.NEXTDATE)));
        //设备使用年限
        tInstDevice.setUselife(String.valueOf(info.get(BusinessConstant.USELIFE)));
        //备注
        tInstDevice.setRemarks(String.valueOf(info.get(BusinessConstant.REMARKS)));
        //操作表示
        tInstDevice.setOpflag(String.valueOf(info.get(BusinessConstant.OPFLAG)));
        //操作日期
        tInstDevice.setOpdate(String.valueOf(info.get(BusinessConstant.OPDATE)));
        try {
            System.out.println(tInstDevice.getOpflag().getClass());
            if (tInstDevice.getOpflag().equals("1")) {
                tInstDeviceDao.insert(tInstDevice);
            } else {
                tInstDeviceDao.update(tInstDevice);
            }
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sf.parse(tInstDevice.getNextdate());
            if (date.getTime() < new Date().getTime()) {
                TCaution tCaution = new TCaution();
                tCaution.setId(UUID.randomUUID().toString().replaceAll("-", ""));
                tCaution.setJglx("设备检定/校准超过有效期");
                tCaution.setSbxh(tInstDevice.getModel());
                tCaution.setSsjg(tInstDevice.getInstitution());
                tCaution.setLrsj(new Date());
                tCautionDao.insert(tCaution);
            }
        } catch (Exception e) {
            log.info("error", e);
            resMap.put(BusinessConstant.RETCODE, BusiEnum.E8999.getCode());
            resMap.put(BusinessConstant.RETMSG, BusiEnum.E8999.getMessage());
            return resMap.toString();
        }
        return resMap.toString();
    }


    /**
     * *********************************************
     *
     * @method :  getInfo
     * @description :  获取报文信息
     * @date :  2020/5/29
     * @author :  WangXiaoTao
     * @version :  1.0
     * *********************************************
     */
    public JSONObject getInfo(String json) {
        JSONObject jsonObject = null;
        try {
            //转成json
            jsonObject = JSONObject.fromObject(json);
            //取出Talble，然后再转成JSON
            jsonObject = JSONObject.fromObject(JSONArray.fromObject(jsonObject.get(BusinessConstant.TABLE)).get(0));

        } catch (Exception e) {
            log.info("【报文解析异常】");
        }
        return jsonObject;
    }

}
