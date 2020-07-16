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

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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
    private TDetailMapper tDetailMapper;
    @Resource
    private TInfoMapper tInfoMapper;
    @Resource
    private TInstInfoDao tInstInfoDao;
    @Resource
    private TInstPersonDao tInstPersonDao;
    @Resource
    private TInstDeviceDao  tInstDeviceDao;
    @Resource
    private TCautionDao tCautionDao;

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

        Map<String, Object> resMap = new HashMap<>();
        resMap.put(BusinessConstant.RETCODE, BusiEnum.E0000.getCode());
        resMap.put(BusinessConstant.RETMSG, BusiEnum.E0000.getMessage());

        TInfo tInfo = new TInfo();
        //一、判断并保存三张图片
        if (null != zdjygw) {
            //制动检验工位照片
            tInfo.setZdjygw(new String(zdjygw));
        }
        if (null != dgjygw) {
            //灯光检验工位照片
            tInfo.setDgjygw(new String(dgjygw));
        }
        if (null != dlxjygw) {
            //动力性检验工位照片
            tInfo.setDlxjygw(new String(dlxjygw));
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
        tInfo.setId(id);
        //检验流水号
        tInfo.setJylsh(String.valueOf(info.get(BusinessConstant.JYLSH)));
        //检验机构编号
        tInfo.setJyjgbh(String.valueOf(info.get(BusinessConstant.JYJGBH)));
        //检验机构名称
        tInfo.setJyjgmc(String.valueOf(info.get(BusinessConstant.JYJGMC)));
        //检测线代号
        tInfo.setJcxdh(String.valueOf(info.get(BusinessConstant.JCXDH)));
        //委托人
        tInfo.setWtr(String.valueOf(info.get(BusinessConstant.WTR)));
        //道路运输证号
        tInfo.setDlyszh(String.valueOf(info.get(BusinessConstant.DLYSZH)));
        //检验类别
        tInfo.setJylb(String.valueOf(info.get(BusinessConstant.JYLB)));
        //业务类型
        tInfo.setYwlx(String.valueOf(info.get(BusinessConstant.YWLX)));
        //检测线别
        tInfo.setJcxb(String.valueOf(info.get(BusinessConstant.JCXB)));
        //检测日期
        if (null != info.get(BusinessConstant.JCRQ) && !"".equals(info.get(BusinessConstant.JCRQ))) {
            tInfo.setJcrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.JCRQ)), "yyyyMMdd"));
        }
        //检测记录单编号
        tInfo.setJcjldbh(String.valueOf(info.get(BusinessConstant.JCJLDBH)));
        //号牌号码
        tInfo.setCphm(String.valueOf(info.get(BusinessConstant.CPHM)));
        //号牌种类
        tInfo.setHpzl(String.valueOf(info.get(BusinessConstant.HPZL)));
        //挂车牌照号
        tInfo.setGcpzh(String.valueOf(info.get(BusinessConstant.GCPZH)));
        //挂车类型
        tInfo.setGclx(String.valueOf(info.get(BusinessConstant.GCLX)));
        //车辆出厂日期
        if (null != info.get(BusinessConstant.CLCCRQ) && !"".equals(info.get(BusinessConstant.CLCCRQ))) {
            tInfo.setClccrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.CLCCRQ)), "yyyyMMdd"));
        }
        //微机登录员
        tInfo.setWjdly(String.valueOf(info.get(BusinessConstant.WJDLY)));
        //引车员
        tInfo.setYcy(String.valueOf(info.get(BusinessConstant.YCY)));
        //尾气操作员
        tInfo.setWqczy(String.valueOf(info.get(BusinessConstant.WQCZY)));
        //注册登记日期
        if (null != info.get(BusinessConstant.ZCDJRQ) && !"".equals(info.get(BusinessConstant.ZCDJRQ))) {
            tInfo.setZcdjrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.ZCDJRQ)), "yyyyMMdd"));
        }
        //VIN号
        tInfo.setVin(String.valueOf(info.get(BusinessConstant.VIN)));
        //车辆型号
        tInfo.setClxh(String.valueOf(info.get(BusinessConstant.CLXH)));
        //发动机号
        tInfo.setFdjh(String.valueOf(info.get(BusinessConstant.FDJH)));
        //车身颜色
        tInfo.setCsys(String.valueOf(info.get(BusinessConstant.CSYS)));
        //行驶总里程（km）
        tInfo.setXszlc(String.valueOf(info.get(BusinessConstant.XSZLC)));
        //驱动形式
        tInfo.setQdxs(String.valueOf(info.get(BusinessConstant.QDXS)));
        //转向轴悬架形式
        tInfo.setZxzxjxs(String.valueOf(info.get(BusinessConstant.ZXZXJXS)));
        //挂车轴数
        tInfo.setGczs(String.valueOf(info.get(BusinessConstant.GCZS)));
        //总信息
        tInfo.setTDetail(json);
        try {
            tInfoMapper.inserTInfo(tInfo);
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
        TDetail tDetail = new TDetail();
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
        tDetail.setId(String.valueOf(info.get(BusinessConstant.ID)));
        //检验流水号
        tDetail.setJylsh(String.valueOf(info.get(BusinessConstant.JYLSH)));
        //报告编号
        tDetail.setBgbh(String.valueOf(info.get(BusinessConstant.BGBH)));
        //资质认定证书编号
        tDetail.setZzrdzsbh(String.valueOf(info.get(BusinessConstant.ZZRDZSBH)));
        //检验机构地址
        tDetail.setJyjgdz(String.valueOf(info.get(BusinessConstant.JYJGDZ)));
        //检验机构电话
        tDetail.setJyjgdh(String.valueOf(info.get(BusinessConstant.JYJGDH)));
        //号牌号码
        tDetail.setCphm(String.valueOf(info.get(BusinessConstant.CPHM)));
        //委托人
        tDetail.setWtr(String.valueOf(info.get(BusinessConstant.WTR)));
        //道路运输证号
        tDetail.setDlyszh(String.valueOf(info.get(BusinessConstant.DLYSZH)));
        //车辆类型
        tDetail.setCllx(String.valueOf(info.get(BusinessConstant.CLLX)));
        //品牌型号
        tDetail.setPpxh(String.valueOf(info.get(BusinessConstant.PPXH)));
        //注册登记日期
        if (null != info.get(BusinessConstant.ZCDJRQ) && !"".equals(info.get(BusinessConstant.ZCDJRQ))) {
            tDetail.setZcdjrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.ZCDJRQ)), "yyyyMMdd"));
        }
        //出厂年月
        if (null != info.get(BusinessConstant.CCNY) && !"".equals(info.get(BusinessConstant.CCNY))) {
            tDetail.setCcny(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.CCNY)), "yyyyMMdd"));
        }
        //车身颜色
        tDetail.setCsys(String.valueOf(info.get(BusinessConstant.CSYS)));
        //车辆识别代号
        tDetail.setVin(String.valueOf(info.get(BusinessConstant.VIN)));
        //发动机号码
        tDetail.setFdjhm(String.valueOf(info.get(BusinessConstant.FDJHM)));
        //行政区域
        tDetail.setXzqy(String.valueOf(info.get(BusinessConstant.XZQY)));
        //挂车号牌号码
        tDetail.setGcphm(String.valueOf(info.get(BusinessConstant.GCPHM)));
        //挂车委托人
        tDetail.setGwtr(String.valueOf(info.get(BusinessConstant.GWTR)));
        //挂车道路运输证号
        tDetail.setGdlyszh(String.valueOf(info.get(BusinessConstant.GDLYSZH)));
        //挂车车辆类型
        tDetail.setGcllx(String.valueOf(info.get(BusinessConstant.GCLLX)));
        //挂车品牌型号
        tDetail.setGppxh(String.valueOf(info.get(BusinessConstant.GPPXH)));
        //挂车注册登记日期
        if (null != info.get(BusinessConstant.GZCDJRQ) && !"".equals(info.get(BusinessConstant.GZCDJRQ))) {
            tDetail.setGzcdjrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.GZCDJRQ)), "yyyyMMdd"));

        }
        //车出厂年月
        if (null != info.get(BusinessConstant.GCCNY) && !"".equals(info.get(BusinessConstant.GCCNY))) {
            tDetail.setGccny(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.GCCNY)), "yyyyMMdd"));

        }
        //挂车车辆识别代号
        tDetail.setGvin(String.valueOf(info.get(BusinessConstant.GVIN)));
        //挂车有效行驶证件
        tDetail.setGxsz(String.valueOf(info.get(BusinessConstant.GXSZ)));
        //检验类别
        tDetail.setJylb(String.valueOf(info.get(BusinessConstant.JYLB)));
        //业务类型
        tDetail.setYwlx(String.valueOf(info.get(BusinessConstant.YWLX)));
        //检验日期
        if (null != info.get(BusinessConstant.JYRQ) && !"".equals(info.get(BusinessConstant.JYRQ))) {
            tDetail.setJyrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.JYRQ)), "yyyyMMdd"));
        }
        //详细信息
        tDetail.setTDetail(json);
        try {
            tDetailMapper.insertTDetail(tDetail);
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
        tInstInfo.setOpflag(String.valueOf(info.get(BusinessConstant.ENDDATE)));
        //操作日期
        tInstInfo.setOpdate(String.valueOf(info.get(BusinessConstant.ENDDATE)));

        try {
            tInstInfoDao.insert(tInstInfo);
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
        tInstPerson.setOpflag(String.valueOf(info.get(BusinessConstant.ENDDATE)));
        //操作日期
        tInstPerson.setOpdate(String.valueOf(info.get(BusinessConstant.ENDDATE)));

        try {
            tInstPersonDao.insert(tInstPerson);
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
        tInstDevice.setOpflag(String.valueOf(info.get(BusinessConstant.ENDDATE)));
        //操作日期
        tInstDevice.setOpdate(String.valueOf(info.get(BusinessConstant.ENDDATE)));
        try {
            tInstDeviceDao.insert(tInstDevice);
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
