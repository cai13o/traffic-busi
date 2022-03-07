package cn.com.busi.controller;

import cn.com.busi.entity.TInstDevice;
import cn.com.busi.entity.TInstInfo;
import cn.com.busi.service.TInstDeviceService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TInstDevice)表控制层
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@RestController
@RequestMapping("tInstDevice")
public class TInstDeviceController {
    /**
     * 服务对象
     */
    @Resource
    private TInstDeviceService tInstDeviceService;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TInstDevice selectOne(String id) {
        return this.tInstDeviceService.queryById(id);
    }

    @GetMapping("selectAllNow")
    public Object selectAll(String page, String limit, String institution, String nextdate) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        Integer offset = (intPage-1)*intPage;
        TInstDevice tInstDevice = new TInstDevice();
        tInstDevice.setInstitution(institution);
        tInstDevice.setNextdate(nextdate);
        //pageNum:表示第几页  pageSize:表示一页展示的数据
        PageHelper.startPage(intPage,intLimit);
        List<TInstDevice> list=this.tInstDeviceService.queryAll(tInstDevice);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstDevice> pageInfo=new PageInfo(list,intLimit);
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

}