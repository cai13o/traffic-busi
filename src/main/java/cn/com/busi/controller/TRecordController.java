package cn.com.busi.controller;

import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TRecord;
import cn.com.busi.entity.TReport;
import cn.com.busi.service.TRecordService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TRecord)表控制层
 *
 * @author makejava
 * @since 2020-07-06 17:09:42
 */
@RestController
@RequestMapping("tRecord")
public class TRecordController {
    /**
     * 服务对象
     */
    @Resource
    private TRecordService tRecordService;

    Map map;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Object selectOne(String id) {

        TRecord tRecord = this.tRecordService.queryById(id);
        String tDetail = tRecord.getTDetail();
        JSONObject a = JSON.parseObject(tDetail);
        System.out.println(tDetail);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("data", a);
        return map;
    }

    @GetMapping("selectAll")
    public Object selectAll(String page, String limit, TRecord tRecord) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        map = new HashMap<>();
        PageHelper.startPage(intPage, intLimit);
        List list = this.tRecordService.queryAll(tRecord);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        return map;

    }

    @GetMapping("selectCar")
    public Object selectCar(String page, String limit, TRecord tRecord) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        map = new HashMap<>();
        PageHelper.startPage(intPage, intLimit);
        List list = this.tRecordService.queryAllCar(tRecord);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        return map;

    }

}