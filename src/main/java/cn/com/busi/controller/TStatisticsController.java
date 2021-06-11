package cn.com.busi.controller;

import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TRecord;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TStatistics;
import cn.com.busi.service.TReportService;
import cn.com.busi.service.TStatisticsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.*;

/**
 * @BelongsProject: traffic-busi
 * @BelongsPackage: cn.com.busi.controller
 * @Author: Administrator
 * @CreateTime: 2020-07-07 09:22
 * @Description:
 */
@RestController
@RequestMapping("tStatistics")
public class TStatisticsController {
    /**
     * 服务对象
     */
    @Resource
    private TStatisticsService tStatisticsService;



    @GetMapping("carAll")
    public Object carAll(String page, String limit, String startDate, String endDate,TReport tReport) {
        Map map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> list = this.tStatisticsService.carAll(tReport,startDate,endDate);
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("firstSelect")
    public Object firstSelect(String page, String limit, String startDate, String endDate, TReport tReport) {
        Map map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> list = this.tStatisticsService.firstSelect(tReport,startDate,endDate);
        List<TStatistics> total = this.tStatisticsService.carAll(tReport,startDate,endDate);
        PageInfo<TInstInfo> pageInfo0 = new PageInfo(total, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo0.getTotal());
        return map;
    }

    @GetMapping("singleSelect")
    public Object singleSelect(String page, String limit, String startDate, String endDate, String singlePass, TReport tReport) {
        Map map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TStatistics> list = this.tStatisticsService.singleSelect(tReport,startDate,endDate,singlePass);
        List<TStatistics> total = this.tStatisticsService.carAll(tReport,startDate,endDate);
        PageInfo<TInstInfo> pageInfo0 = new PageInfo(total, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo0.getTotal());
        return map;
    }

    @GetMapping("count")
    public Object count(String table) {
        System.out.println(table);
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tStatisticsService.count(table));
        return map;
    }

    //初检合格不合格数量提示
    @GetMapping("first")
    public Object count(String startDate, String endDate, TReport tReport) {
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tStatisticsService.firstorNo(tReport,startDate,endDate));
        return map;
    }

    //单项合格不合格数量提示
    @GetMapping("singlePass")
    public Object single(String startDate, String endDate, TReport tReport, String singlePass) {
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tStatisticsService.singleorNo(tReport,startDate,endDate,singlePass));
        return map;
    }
}
