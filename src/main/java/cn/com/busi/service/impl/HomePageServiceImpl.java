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
    private TStatisticsDao tStatisticsDao;

    @Resource
    private TSintypeDao tSintypeDao;

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
}