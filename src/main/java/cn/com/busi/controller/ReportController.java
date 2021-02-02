package cn.com.busi.controller;

import cn.com.busi.entity.TInspectionReport;
import cn.com.busi.service.TInspectionReportService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "检验报告")
@RestController
@RequestMapping("report")
public class ReportController {
    /**
     * 服务对象
     */
    @Resource
    private TInspectionReportService tInspectionReportService;

    Map map;

    @ApiOperation("根据id获取数据")
    @RequestMapping(value = "/getReport", method = RequestMethod.GET)
    public Map selectOne(String id) {
        map = new HashMap();
        TInspectionReport tInspectionReport = this.tInspectionReportService.selectByPrimaryKey(id);
        map.put("code", "20000");
        map.put("data", tInspectionReport);
        return null;
    }

    @ApiOperation("根据条件筛选查询数据")
    @GetMapping("findByAllReport")
    public Map findByAll(String page, String limit, TInspectionReport tInspectionReport) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TInspectionReport> inspectionReports = this.tInspectionReportService.findByAll(tInspectionReport);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tNews", inspectionReports);
        map.put("total", new PageInfo(inspectionReports, intLimit).getTotal());
        return map;
    }
}
