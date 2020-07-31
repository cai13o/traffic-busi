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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.println(tReport.getClrllb());
        Map map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        PageHelper.startPage(intPage, intLimit);
        List<Map> list = this.tStatisticsService.carAll(tReport,startDate,endDate);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        return map;
    }

    @GetMapping("firstSelect")
    public Object firstSelect(String page, String limit, String startDate, String endDate, TReport tReport) {
        System.out.println(tReport.toString());
        Map map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        PageHelper.startPage(intPage, intLimit);
        List<Map> list = this.tStatisticsService.firstSelect(tReport,startDate,endDate);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        return map;
    }

    @GetMapping("singleSelect")
    public Object singleSelect(String page, String limit, String startDate, String endDate, String singlePass, TReport tReport) {
        Map map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        PageHelper.startPage(intPage, intLimit);
        List<Map> list = this.tStatisticsService.singleSelect(tReport,startDate,endDate,singlePass);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
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
}
