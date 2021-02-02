package cn.com.busi.controller;

import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TRecord;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TSintype;
import cn.com.busi.service.TReportService;

import cn.com.busi.service.TSintypeService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

/**
 * (TReport)表控制层
 *
 * @author makejava
 * @since 2020-06-30 16:47:32
 */
@RestController
@RequestMapping("tReport")
public class TReportController {
    /**
     * 服务对象
     */
    @Resource
    private TReportService tReportService;

    @Resource
    private TSintypeService tSintypeService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */

    @GetMapping("selectOne")
    public Object selectOne(String id) {
        System.out.println(id);
        TReport tReport = this.tReportService.queryById(id);
        String tDetail = tReport.getTDetail();
        JSONObject a = JSON.parseObject(tDetail);
        System.out.println(tDetail);
        Map map = new HashMap<>();
        map.put("code", "20000");
        map.put("data", a);
        return map;
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    @GetMapping("selectAll")
    public Object selectAll(String page, String limit, TReport tReport ,String numberPlate,String startDate, String endDate,String ssqy,String singlePass) {
        tReport.setCphm(numberPlate);
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        Map map = new HashMap<>();
        PageHelper.startPage(intPage, intLimit);
        List list = this.tReportService.queryAll(tReport,startDate,endDate,ssqy,singlePass);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        System.out.println(list);
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("typeCount")
    public Object typeCount(TReport tReport,String startDate, String endDate,String ssqy,String s) {
        List<TReport> list = this.tReportService.queryAll(tReport,startDate,endDate,ssqy,s);
        Set set = new HashSet();
        Set set2 = new HashSet();
        for (TReport t:list) {
            set.add(t.getClrllb());
            set2.add(t.getCllx());
        }
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("clrllb", set);
        map.put("cllx", set2);
        return map;
    }

    @GetMapping("sinType")
    public Object sinType(TSintype tSintype) {
        System.out.println(123321);
        List<TSintype> list = this.tSintypeService.queryAll(tSintype);
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", list);
        return map;
    }

}