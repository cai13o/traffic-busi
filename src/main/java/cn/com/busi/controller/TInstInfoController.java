package cn.com.busi.controller;

import cn.com.busi.entity.TInstInfo;
import cn.com.busi.service.TInstInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TInstInfo)表控制层
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@Slf4j
@RestController
@RequestMapping("tInstInfo")
public class TInstInfoController {
    /**
     * 服务对象
     */
    @Resource
    private TInstInfoService tInstInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TInstInfo selectOne(String id) {
        return this.tInstInfoService.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @GetMapping("selectAll")
    public Object selectAll(String page, String limit, String area, String name ,String owner) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        TInstInfo tInstInfo = new TInstInfo();
        tInstInfo.setArea(area);
        tInstInfo.setOwner(owner);
        tInstInfo.setName(name);
        int offset = (intPage-1)*intPage;
        //pageNum:表示第几页  pageSize:表示一页展示的数据
        PageHelper.startPage(intPage,intLimit);
        List<TInstInfo> list=this.tInstInfoService.queryAll(tInstInfo);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo=new PageInfo(list,intLimit);
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",list);
        return map;
    }




}