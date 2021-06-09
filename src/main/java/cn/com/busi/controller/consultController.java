package cn.com.busi.controller;

import cn.com.busi.entity.TConsult;
import cn.com.busi.service.TConsultService;
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

@Api(tags = "咨询管理")
@RestController
@RequestMapping("consult")
public class consultController {

    @Resource
    private TConsultService tConsultService;

    Map map;

    @ApiOperation("根据id获取数据")
    @RequestMapping(value = "/getConsult", method = RequestMethod.GET)
    public Map selectOne(String id) {
        map = new HashMap();
        TConsult tConsult = this.tConsultService.selectByPrimaryKey(id);
        map.put("code", "20000");
        map.put("data", tConsult);

        return map;
    }

    @ApiOperation("根据条件筛选查询数据")
    @GetMapping("findByAllConsult")
    public Map findByAll(String page, String limit, TConsult tConsult) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TConsult> tConsults = this.tConsultService.findByAll(tConsult);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tConsults", tConsults);
        map.put("total", new PageInfo(tConsults, intLimit).getTotal());
        return map;
    }

    @ApiOperation("根据id修改数据")
    @RequestMapping(value = "/updateConsult", method = RequestMethod.POST)
    public Map updateConsult(TConsult tConsult) {
        map = new HashMap();
        this.tConsultService.updateByPrimaryKeySelective(tConsult);
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("添加数据")
    @RequestMapping(value = "/saveConsult", method = RequestMethod.POST)
    public Map saveConsult(TConsult tConsult) {
        map = new HashMap();
        this.tConsultService.insertSelective(tConsult);
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("删除数据")
    @RequestMapping(value = "/delConsult", method = RequestMethod.POST)
    public Map deleteByPrimaryKey(String id) {
        this.tConsultService.deleteByPrimaryKey(id);
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }
}
