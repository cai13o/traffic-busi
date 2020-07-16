package cn.com.busi.controller;

import cn.com.busi.entity.TPgroup;
import cn.com.busi.entity.TUser;
import cn.com.busi.service.TPgroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户组(TPgroup)表控制层
 *
 * @author makejava
 * @since 2020-07-14 13:27:09
 */
@RestController
@RequestMapping("tPgroup")
public class TPgroupController {
    /**
     * 服务对象
     */
    @Resource
    private TPgroupService tPgroupService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TPgroup selectOne(String id) {
        return this.tPgroupService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param tPgroup 实例对象
     */
    @PostMapping("insert")
    public Object insert(TPgroup tPgroup) {
        System.out.println(tPgroup.toString());
        TPgroup insert = this.tPgroupService.insert(tPgroup);
        Map map = new HashMap();
        map.put("code","20000");
        return map;
    }

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @GetMapping("selectAll")
    public Object queryAllByLimit(String page, String limit) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tPgroupService.queryAllByLimit(offset,intLimit));
        return map;
    }

}