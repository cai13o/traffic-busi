package cn.com.busi.controller;

import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TRecord;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TStatistics;
import cn.com.busi.service.TReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    Map<String,Object> map;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TReport selectOne(String id) {
        return this.tReportService.queryById(id);
    }

    @GetMapping("firstSelect")
    public Object firstSelect(String page, String limit, String xzqy, String cllx, String ppxh, String clrllb, String jcjgmc, String jcjl, String startDate, String endDate) {
        map = new HashMap<String,Object>();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        TReport tReport = new TReport();
        TRecord tRecord = new TRecord();
        System.out.println(tReport.toString());
        tReport.setCllx(cllx);
        tReport.setPpxh(ppxh);
        tReport.setJcjgmc(jcjgmc);
        tReport.setClrllb(clrllb);
        tReport.setJcjl(jcjl);
        TStatistics tStatistics = new TStatistics();
        tReport.setXzqy(xzqy);
        System.out.println(endDate.trim().isEmpty() + ":" + endDate.length());
        if (null != xzqy) {
            if (!xzqy.trim().isEmpty()) {
                tStatistics.setXzqy("xzqy");
                tReport.setXzqy(xzqy.trim());
            }
        }
        if (null != jcjgmc) {
            if (!jcjgmc.trim().isEmpty()) {
                tStatistics.setJcjgmc("jcjgmc");
                tReport.setJcjgmc(jcjgmc.trim());
            }
        }
        if (null != jcjl) {
            if (!jcjl.trim().isEmpty()) {
                tStatistics.setJcjl("jcjl");
                tReport.setJcjl(jcjl.trim());
            }
        }
        if (null != clrllb) {
            if (!clrllb.trim().isEmpty()) {
                tStatistics.setClrllb("clrllb");
                tReport.setClrllb(clrllb.trim());
            }
        }
        if (null != cllx) {
            if (!cllx.trim().isEmpty()) {
                tStatistics.setCllx("cllx");
                tReport.setCllx(cllx.trim());
            }
        }
        if (null != ppxh) {
            if (!ppxh.trim().isEmpty()) {
                tStatistics.setPpxh("ppxh");
                tReport.setPpxh(ppxh.trim());
            }
        }


        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                tStatistics.setStartDate(startDate);
                tStatistics.setEndDate(endDate);
                tStatistics.setJcrq("jcrq");
            }
        }

        if ((xzqy == null || xzqy.isEmpty()) && (cllx == null || cllx.isEmpty()) && (ppxh == null || ppxh.isEmpty()) && (jcjgmc == null || jcjgmc.isEmpty()) && (startDate == null || startDate.isEmpty()) && (endDate == null || endDate.isEmpty())) {
            return map;
        }

        PageHelper.startPage(intPage, intLimit);
        List<Map> list = this.tReportService.firstSelect(tReport, tStatistics);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        return map;
    }

    @GetMapping("carAll")
    public Object carAll(String page, String limit, String xzqy, String cllx, String ppxh, String rllb, String
            jyjgmc, String jcjl, String startDate, String endDate) {
        map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        TReport tReport = new TReport();
        tReport.setXzqy(xzqy);
        tReport.setCllx(cllx);
        tReport.setPpxh(ppxh);
        tReport.setJcjgmc(jyjgmc);
        tReport.setClrllb(rllb);
        tReport.setJcjl(jcjl);
        TStatistics tStatistics = new TStatistics();
        tReport.setXzqy(xzqy);
        if (xzqy != null && !xzqy.isEmpty()) {
            tStatistics.setXzqy("xzqy");
        }
        if (cllx != null && !cllx.isEmpty()) {
            tStatistics.setCllx("cllx");
        }
        if (ppxh != null && !ppxh.isEmpty()) {
            tStatistics.setPpxh("ppxh");
        }
        if (jyjgmc != null && !jyjgmc.isEmpty()) {
            tStatistics.setJcjgmc("jyjgmc");
        }
        if (jcjl != null && !jcjl.isEmpty()) {
            tStatistics.setJcjl("jcjl");
        }
        if (startDate != null && endDate != null && !startDate.isEmpty() && !endDate.isEmpty()) {
            tStatistics.setStartDate(startDate);
            tStatistics.setEndDate(endDate);
            tStatistics.setJcrq("jcrq");
        }


        PageHelper.startPage(intPage, intLimit);
        List<Map> list = this.tReportService.carAll(tReport, tStatistics);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        return map;
    }

    @GetMapping("singleSelect")
    public Object singleSelect(String page, String limit, String xzqy, String cllx, String ppxh, String
            rllb, String jyjgmc, String jcjl, String startDate, String endDate, String dxhgl) {
        map = new HashMap();
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        TReport tReport = new TReport();
        TRecord tRecord = new TRecord();
        tReport.setXzqy(xzqy);
        tReport.setCllx(cllx);
        tReport.setPpxh(ppxh);
        tRecord.setJyjgmc(jyjgmc);
        tRecord.setRllb(rllb);
        tReport.setJcjl(jcjl);
        TStatistics tStatistics = new TStatistics();
        tReport.setXzqy(xzqy);
        tStatistics.setHgl(dxhgl);
        if (xzqy != null && !xzqy.isEmpty()) {
            tStatistics.setXzqy("xzqy");
        }
        if (cllx != null && !cllx.isEmpty()) {
            tStatistics.setCllx("cllx");
        }
        if (ppxh != null && !ppxh.isEmpty()) {
            tStatistics.setPpxh("ppxh");
        }
        if (jyjgmc != null && !jyjgmc.isEmpty()) {
            tStatistics.setJcjgmc("jyjgmc");
        }
        if (jcjl != null && !jcjl.isEmpty()) {
            tStatistics.setJcjl("jcjl");
        }
        if (startDate != null && endDate != null && !startDate.isEmpty() && !endDate.isEmpty()) {
            tStatistics.setStartDate(startDate);
            tStatistics.setEndDate(endDate);
            tStatistics.setJcrq("jcrq");
        }

//        if ((xzqy == null || xzqy == "")&&(cllx == null || cllx == "")&&(ppxh == null || ppxh == "")&&(jyjgmc == null || jyjgmc == "")&&startDate == null && endDate == null){
//            return map;
//        }

        PageHelper.startPage(intPage, intLimit);
        List<Map> list = this.tReportService.firstSelect(tReport, tStatistics);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        return map;
    }

}