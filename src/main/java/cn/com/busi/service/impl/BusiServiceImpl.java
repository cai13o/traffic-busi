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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
        TRecord tRecord = new TRecord();
        //一、判断并保存三张图片
        if (null != zdjygw) {
            //制动检验工位照片
            tRecord.setZdjygw(new String(zdjygw));
        }
        if (null != dgjygw) {
            //灯光检验工位照片
            tRecord.setDgjygw(new String(dgjygw));
        }
        if (null != dlxjygw) {
            //动力性检验工位照片
            tRecord.setDlxjygw(new String(dlxjygw));
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
            tRecord.setJcrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.JCRQ)), "yyyyMMdd"));
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
        //
        tRecord.setDgjygw(String.valueOf(info.get(BusinessConstant.DGJYGW)));
        //
        tRecord.setDlxjygw(String.valueOf(info.get(BusinessConstant.DLXJYGW)));
        //
        tRecord.setRllb(String.valueOf(info.get(BusinessConstant.RLLB)));
        //
        tRecord.setXzqy(String.valueOf(info.get(BusinessConstant.XZQY)));
        //
        tRecord.setJyjgdz(String.valueOf(info.get(BusinessConstant.JYJGDZ)));
        //
        tRecord.setCllx(String.valueOf(info.get(BusinessConstant.CLLX)));
        //总信息
        tRecord.setTDetail(json);
        try {
            String.valueOf(info.get(BusinessConstant.YRPD));
            String.valueOf(info.get(BusinessConstant.ZWPD));
            String.valueOf(info.get(BusinessConstant.YWPD));
            tRecordDao.insert(tRecord);
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
            tReport.setJcrq(DateTimeUtil.formateDate(String.valueOf(info.get(BusinessConstant.JYRQ)), "yyyyMMdd"));
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
        tReport.setDlx(String.valueOf(info.get(BusinessConstant.DLX)));
        //经济性
        tReport.setJjx(String.valueOf(info.get(BusinessConstant.JJX)));
        //一轴制动性
        tReport.setYzzdl(String.valueOf(info.get(BusinessConstant.YZZDL)));
        tReport.setYzbphl(String.valueOf(info.get(BusinessConstant.YZBPHL)));
        tReport.setEzzdl(String.valueOf(info.get(BusinessConstant.EZZDL)));
        tReport.setEzbphl(String.valueOf(info.get(BusinessConstant.EZBPHL)));
        tReport.setTzzdl(String.valueOf(info.get(BusinessConstant.TZZDL)));
        tReport.setDcqyczheczdl(String.valueOf(info.get(BusinessConstant.DCQYCZHECZDL)));
        tReport.setDcqyczhuczdl(String.valueOf(info.get(BusinessConstant.DCQYCZHUCZDL)));
        tReport.setMark(String.valueOf(info.get(BusinessConstant.MARK)));
        tReport.setJcjl(String.valueOf(info.get(BusinessConstant.JCJL)));
        tReport.setZjcs(String.valueOf(info.get(BusinessConstant.ZJCS)));
        tReport.setJcjgmc(String.valueOf(info.get(BusinessConstant.JCJGMC)));
        tReport.setSqqzr(String.valueOf(info.get(BusinessConstant.SQQZR)));
        tReport.setClzbzl(String.valueOf(info.get(BusinessConstant.CLZBZL)));


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

                tInstInfoDao.insert(tInstInfo);

            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sf.parse(tInstInfo.getEnddate());
            if( date.getTime() < new Date().getTime()){
                TCaution tCaution = new TCaution();
                tCaution.setId(UUID.randomUUID().toString().replaceAll("-",""));
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

                tInstPersonDao.insert(tInstPerson);


            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sf.parse(tInstPerson.getEnddate());
            if( date.getTime() < new Date().getTime()){
                TCaution tCaution = new TCaution();
                tCaution.setId(UUID.randomUUID().toString().replaceAll("-",""));
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

                tInstDeviceDao.insert(tInstDevice);


            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sf.parse(tInstDevice.getNextdate());
            if( date.getTime() < new Date().getTime()){
                TCaution tCaution = new TCaution();
                tCaution.setId(UUID.randomUUID().toString().replaceAll("-",""));
                tCaution.setJglx("设备检定/校准超过有效期");
                tCaution.setSbxh(tInstDevice.getIdno());
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
