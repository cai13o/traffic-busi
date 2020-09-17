package cn.com.busi.controller;

import cn.com.busi.entity.TCaution;
import cn.com.busi.entity.TInstInfo;
import cn.com.busi.service.TCautionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TCaution)表控制层
 *
 * @author makejava
 * @since 2020-07-06 18:20:58
 */
@RestController
@RequestMapping("tCaution")
public class TCautionController {
    /**
     * 服务对象
     */
    @Resource
    private TCautionService tCautionService;

    Map map;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TCaution selectOne(String id) {
        return this.tCautionService.queryById(id);
    }

    @GetMapping("selectAll")
    public Object selectAll(String page, String limit,TCaution tCaution) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        map = new HashMap<>();
        PageHelper.startPage(intPage, intLimit);
        List list = this.tCautionService.queryAll(tCaution);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

    @GetMapping("selectCaution")
    public Object selectCaution(TCaution tCaution) {

        map = new HashMap<>();

        List list = this.tCautionService.queryAll(tCaution);
        map.put("code", "20000");
        map.put("data", list);
        return map;
    }

}