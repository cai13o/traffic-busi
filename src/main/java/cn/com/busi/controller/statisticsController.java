package cn.com.busi.controller;

import cn.com.busi.entity.TInspectionReport;
import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TStatistics;
import cn.com.busi.service.TStatisticsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("statistics")
public class statisticsController {
    /**
     * 服务对象
     */
    @Resource
    private TStatisticsService tStatisticsService;

    Map map;

    @GetMapping("carAll")
    public Object carAll(String page, String limit, String startDate, String endDate, TInspectionReport tInspectionReport) {
        map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> list = this.tStatisticsService.carAllNow(tInspectionReport,startDate,endDate);
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("firstSelect")
    public Object firstSelect(String page, String limit, String startDate, String endDate, TInspectionReport tInspectionReport) {
        map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> list = this.tStatisticsService.firstSelectNow(tInspectionReport,startDate,endDate);
        List<TStatistics> total = this.tStatisticsService.carAllNow(tInspectionReport,startDate,endDate);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(total, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("singleSelect")
    public Object singleSelect(String page, String limit, String startDate, String endDate, String singlePass, TInspectionReport tInspectionReport) {
        map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> list = this.tStatisticsService.singleSelectNow(tInspectionReport,startDate,endDate,singlePass);
        List<TStatistics> total = this.tStatisticsService.carAllNow(tInspectionReport,startDate,endDate);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(total, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

}
