package cn.com.busi.service.impl;


import cn.com.busi.entity.TInstDevice;
import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TInstPerson;
import cn.com.busi.entity.TRecord;
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
    private TRecordDao tRecordDao;

    @Resource
    private TStatisticsDao tStatisticsDao;

    /**
     * 首页数据
     * @return
     */
    @Override
    public Map queryAll() {
        TInstInfo tInstInfo = this.tInstInfoDao.count();

        TInstPerson tInstPerson = this.tInstPersonDao.count();
        TInstDevice tInstDevice = this.tInstDeviceDao.count();
        TRecord tRecord = this.tRecordDao.count();
        List<Map> cllxStatistics = this.tStatisticsDao.cllxStatistics();
        Integer[] firstStatistics = this.tStatisticsDao.firstStatistics();
        Integer[] firstNotStatistics = this.tStatisticsDao.firstNotStatistics();
        Integer[] singleDLXStatistics = this.tStatisticsDao.singleDLXStatistics();
        Integer[] singleJJXStatistics = this.tStatisticsDao.singleJJXStatistics();
        Map map = new HashMap();
        map.put("code","20000");
        //检测机构数量
        map.put("infoCount" , tInstInfo.getName());
        //机构人员数量
        map.put("personCount" , tInstPerson.getRemarks());
        //机构设备数量
        map.put("deviceCount" , tInstDevice.getRemarks());
        //检测车辆数量
        map.put("carCount", tRecord.getCllx());
        //车辆类别分布统计
        map.put("cllxStatistics", cllxStatistics);
        //初检合格数量
        map.put("firstStatistics", firstStatistics);
        //初检不合格数量
        map.put("firstNotStatistics", firstNotStatistics);
        //动力性合格数量
        map.put("singleDLXStatistics", singleDLXStatistics);
        //经济性合格数量
        map.put("singleJJXStatistics", singleJJXStatistics);
        return map;
    }
}