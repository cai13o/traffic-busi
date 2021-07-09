package cn.com.busi.service.impl;


import cn.com.busi.entity.*;
import cn.com.busi.mapper.*;
import cn.com.busi.service.HomePageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service("HomePageService")
public class HomePageServiceImpl implements HomePageService {
    @Resource
    private TInstInfoDao tInstInfoDao;

    @Resource
    private TInstPersonDao tInstPersonDao;

    @Resource
    private TInstDeviceDao tInstDeviceDao;

    @Resource
    private TReportDao tReportDao;

    @Resource
    private TInspectionInstrumentMapper tInspectionInstrumentMapper;

    @Resource
    private TStatisticsDao tStatisticsDao;

    @Resource
    private TSintypeDao tSintypeDao;

    @Resource
    private TSintypeNowMapper tSintypeNowMapper;

    @Resource
    private TInstPersonDao instPersonDao;

    /**
     * 首页数据
     * @return
     */
    @Override
    public Map queryAll() {
        TInstInfo tInstInfo = this.tInstInfoDao.count();
        TInstPerson tInstPerson = this.tInstPersonDao.count();
        TInstDevice tInstDevice = this.tInstDeviceDao.count();
        TReport tReport = this.tReportDao.count();
        List<Map> cllxStatistics = this.tStatisticsDao.cllxStatistics();
        Integer[] firstStatistics = this.tStatisticsDao.firstStatistics();
        Integer[] firstNotStatistics = this.tStatisticsDao.firstNotStatistics();
        List<TStatistics> jcjlByAll = this.tStatisticsDao.jcjlByAll();
        List<TStatistics> syxzByAll = this.tStatisticsDao.syxzByAll();
        List<Map> countByRecode = instPersonDao.countByRecode();
        Map map = new HashMap();

        //单项合格数量统计
        TSintype sintype = new TSintype();
        List<TSintype> tSintypes = this.tSintypeDao.queryAll(sintype);
        for(TSintype ts:tSintypes){
            Integer[] arr = this.tStatisticsDao.singleStatistics(ts);
            map.put(ts.getId(),arr);
        }

        map.put("code","20000");
        //检测机构数量
        map.put("infoCount" , tInstInfo.getName());
        //机构人员数量
        map.put("personCount" , tInstPerson.getRemarks());
        //机构设备数量
        map.put("deviceCount" , tInstDevice.getRemarks());
        //检测车辆数量
        map.put("carCount", tReport.getCllx());
        //车辆类别分布统计
        map.put("cllxStatistics", cllxStatistics);
        //初检合格数量
        map.put("firstStatistics", firstStatistics);
        //初检不合格数量
        map.put("firstNotStatistics", firstNotStatistics);

        map.put("jcjlByAll", jcjlByAll);

        map.put("syxzByAll", syxzByAll);

        //按学历统计
        map.put("countByRecode", countByRecode);

        return map;
    }

    @Override
    public Map syxzByAll() {

        List<TStatistics> syxzByAll = this.tStatisticsDao.syxzByAll();
        Map map = new HashMap();

        map.put("code","20000");
        map.put("syxzByAll", syxzByAll);

        return map;
    }

    @Override
    public Map jcjlByAll() {

        List<TStatistics> jcjlByAll = this.tStatisticsDao.jcjlByAll();

        Map map = new HashMap();

        map.put("code","20000");

        map.put("jcjlByAll", jcjlByAll);

        return map;
    }

    @Override
    public Map queryAllNow() {
        TInstInfo tInstInfo = this.tInstInfoDao.count();
        TInstPerson tInstPerson = this.tInstPersonDao.count();
        TInstDevice tInstDevice = this.tInstDeviceDao.count();
        TInspectionInstrument tInspectionInstrument = this.tInspectionInstrumentMapper.count();
        List<Map> cllxStatistics = this.tStatisticsDao.cllxStatisticsNow();
        Integer[] firstStatistics = this.tStatisticsDao.firstStatisticsNow();
        Integer[] firstNotStatistics = this.tStatisticsDao.firstNotStatisticsNow();
        List<TStatistics> jcjlByAll = this.tStatisticsDao.jcjlByAllNow();
        List<TStatistics> syxzByAll = this.tStatisticsDao.syxzByAllNow();
        List<Map> countByRecode = instPersonDao.countByRecode();
        TSintypeNow sintype = new TSintypeNow();
        List<TSintypeNow> tSintypeNows = this.tSintypeNowMapper.findByAll(sintype);
        Map<String,Object> map = new HashMap(2);
        map.put("code","20000");
        //单项合格数量统计
        String concat1 = "";
        String concat2 = "";
        String concat3 = "";
        for(TSintypeNow ts:tSintypeNows){
            if(ts.getId().equals("kzzdxczd1")){
                concat3 = "'/',1";
                concat1 = "一轴制动率";
                concat2 = "一轴，行车制动率";
            }else if(ts.getId().equals("kzzdxczd2")){
                concat3 = "'/',1";
                concat1 = "二轴制动率";
                concat2 = "二轴，行车制动率";
            }else if(ts.getId().equals("kzzdxczd3")){
                concat3 = "'/',1";
                concat1 = "三轴制动率";
                concat2 = "三轴，行车制动率";
            }else if(ts.getId().equals("kzzdxczd4")){
                concat3 = "'/',1";
                concat1 = "四轴制动率";
                concat2 = "四轴，行车制动率";
            }else if(ts.getId().equals("kzzdbphl1")){
                concat3 = "'/', -1";
                concat1 = "一轴不平衡率";
                concat2 = "一轴，不平衡率";
            }else if(ts.getId().equals("kzzdbphl2")){
                concat3 = "'/', -1";
                concat1 = "二轴不平衡率";
                concat2 = "二轴，不平衡率";
            }else if(ts.getId().equals("kzzdbphl3")){
                concat3 = "'/', -1";
                concat1 = "三轴不平衡率";
                concat2 = "三轴，不平衡率";
            }else if(ts.getId().equals("kzzdbphl4")){
                concat3 = "'/', -1";
                concat1 = "四轴不平衡率";
                concat2 = "四轴，不平衡率";
            }else if(ts.getId().equals("chA1")){
                concat3 = "'o',-1";
                concat1 = "侧滑";
            }else if(ts.getId().equals("zhuxmpd")){
                concat3 = "'o',-1";
                concat1 = "驻车制动率";
            }else if(ts.getId().equals("zhexmpd")){
                concat3 = "'o',-1";
                concat1 = "整车制动率";
            }else if(ts.getId().equals("zwdxmpd")){
                concat3 = "'o',-1";
                concat1 = "左";
                concat2 = "灯";
            }
            Integer[] arr = this.tStatisticsDao.singleStatisticsNow(concat1,concat2,concat3);
            map.put(ts.getId(),arr);
        }

        //检测机构数量
        map.put("infoCount" , tInstInfo.getName());
        //机构人员数量
        map.put("personCount" , tInstPerson.getRemarks());
        //机构设备数量
        map.put("deviceCount" , tInstDevice.getRemarks());
        //检测车辆数量
        map.put("carCount", tInspectionInstrument.getCllb());
        //车辆类别分布统计
        map.put("cllxStatistics", cllxStatistics);
        //初检合格数量
        map.put("firstStatistics", firstStatistics);
        //初检不合格数量
        map.put("firstNotStatistics", firstNotStatistics);

        map.put("jcjlByAll", jcjlByAll);

        map.put("syxzByAll", syxzByAll);

        //按学历统计
        map.put("countByRecode", countByRecode);

        return map;
    }

    @Override
    public Map syxzByAllNow() {
        List<TStatistics> syxzByAll = this.tStatisticsDao.syxzByAllNow();
        Map map = new HashMap();
        map.put("code","20000");
        map.put("syxzByAll", syxzByAll);

        return map;
    }

    @Override
    public Map jcjlByAllNow() {
        List<TStatistics> jcjlByAll = this.tStatisticsDao.jcjlByAllNow();
        Map map = new HashMap();
        map.put("code","20000");
        map.put("jcjlByAll", jcjlByAll);
        return map;
    }
}