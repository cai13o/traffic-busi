package cn.com.busi.controller;

import cn.com.busi.entity.TInstDevice;
import cn.com.busi.entity.TInstPerson;
import cn.com.busi.service.TInstPersonService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TInstPerson)表控制层
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@RestController
@RequestMapping("tInstPerson")
public class TInstPersonController {
    /**
     * 服务对象
     */
    @Resource
    private TInstPersonService tInstPersonService;

    Map map = new HashMap();
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TInstPerson selectOne(String id) {
        return this.tInstPersonService.queryById(id);
    }

    @GetMapping("selectAll")
    public Object selectAll(String page, String limit, String institution, String enddate , String name) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        System.out.println(enddate);
        Integer offset = (intPage-1)*intPage;
        TInstPerson tInstPerson = new TInstPerson();
        tInstPerson.setInstitution(institution);
        tInstPerson.setEnddate(enddate);
        tInstPerson.setName(name);
        //pageNum:表示第几页  pageSize:表示一页展示的数据
        PageHelper.startPage(intPage,intLimit);
        List<TInstPerson> list=this.tInstPersonService.queryAll(tInstPerson);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstPerson> pageInfo=new PageInfo(list,intLimit);
        map.put("code","20000");
        map.put("data",list);
        return map;
    }

}