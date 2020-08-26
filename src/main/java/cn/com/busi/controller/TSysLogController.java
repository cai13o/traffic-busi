package cn.com.busi.controller;

import cn.com.busi.entity.SysLog;
import cn.com.busi.entity.TInstInfo;
import cn.com.busi.service.TSysLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TSysLog)表控制层
 *
 * @author makejava
 * @since 2020-08-13 11:05:46
 */
@RestController
@RequestMapping("tSysLog")
public class TSysLogController {
    /**
     * 服务对象
     */
    @Resource
    private TSysLogService tSysLogService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysLog selectOne(Integer id) {
        return this.tSysLogService.queryById(id);
    }

    @GetMapping("selectAll")
    public Object selectAll(String page, String limit, SysLog sysLog) {
        System.out.println(1231131);
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        PageHelper.startPage(intPage, intLimit);
        List<SysLog> list = this.tSysLogService.queryAll(sysLog);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

}