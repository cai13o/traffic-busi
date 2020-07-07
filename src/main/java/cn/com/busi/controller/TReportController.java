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

    Map map;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Object selectOne(String id) {
        System.out.println(id);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("data", this.tReportService.queryById(id));
        return map;
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    @GetMapping("selectAll")
    public Object selectAll(String page, String limit, TReport tReport) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        map = new HashMap<>();
        PageHelper.startPage(intPage, intLimit);
        List list = this.tReportService.queryAll(tReport);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        return map;
    }

}