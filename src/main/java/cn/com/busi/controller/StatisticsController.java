package cn.com.busi.controller;

import cn.com.busi.entity.TInspectionReport;
import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TStatistics;
import cn.com.busi.mapper.TStatisticsDao;
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
public class StatisticsController {
    /**
     * 服务对象
     */
    @Resource
    private TStatisticsService tStatisticsService;


    @GetMapping("carAll")
    public Object carAll(String page, String limit, String startDate, String endDate, TInspectionReport tInspectionReport) {

        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> datalist = this.tStatisticsService.carAllNow(tInspectionReport, startDate, endDate);
        String clzcs = datalist.get(0).getClzcs();
        Map<String,Object> map = new HashMap<>(3);
        map.put("code", "20000");
        map.put("data", datalist);
        map.put("clzcs",clzcs);
        map.put("total",new PageInfo(datalist, intLimit).getTotal());
        return map;
    }

    @GetMapping("firstSelect")
    public Object firstSelect(String page, String limit, String startDate, String endDate, TInspectionReport tInspectionReport) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> datalist = this.tStatisticsService.firstSelectNow(tInspectionReport,startDate,endDate);
        Map<String,Object> map = new HashMap<>(3);
        map.put("code", "20000");
        map.put("data", datalist);

        map.put("total",new PageInfo(datalist, intLimit).getTotal());
        return map;
    }

    @GetMapping("singleSelect")
    public Object singleSelect(String page, String limit, String startDate, String endDate, String singlePass, TInspectionReport tInspectionReport) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> datalist = this.tStatisticsService.singleSelectNow(tInspectionReport,startDate,endDate,singlePass);
        List<TStatistics> total = this.tStatisticsService.carAllNow(tInspectionReport,startDate,endDate);
        Map<String,Object> map = new HashMap<>(3);
        map.put("code", "20000");
        map.put("data", datalist);
        map.put("total",new PageInfo(datalist, intLimit).getTotal());
        return map;
    }

    @GetMapping("brakingAbilitySelect")
    public Object brakingAbilitySelect(String page, String limit, String startDate, String endDate, TInspectionReport tInspectionReport) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> datalist = this.tStatisticsService.brakingAbilitySelect(tInspectionReport, startDate, endDate);
        Map<String, Object> map = new HashMap(3);
        map.put("code", "20000");
        map.put("data", datalist);
        map.put("total", (new PageInfo(datalist, intLimit)).getTotal());
        return map;
    }

    //初检合格不合格数量提示
    @GetMapping("firstNow")
    public Object count(String startDate, String endDate, TInspectionReport tInspectionReport) {
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tStatisticsService.firstorNoNow(tInspectionReport,startDate,endDate));
        return map;
    }

    //单项合格不合格数量提示
    @GetMapping("singlePassNow")
    public Object single(String startDate, String endDate, TInspectionReport tInspectionReport, String singlePass) {
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tStatisticsService.singleorNoNow(tInspectionReport,startDate,endDate,singlePass));
        return map;
    }


}
