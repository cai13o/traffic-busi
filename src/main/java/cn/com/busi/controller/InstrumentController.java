package cn.com.busi.controller;

import cn.com.busi.entity.TInspectionInstrument;
import cn.com.busi.service.TInspectionInstrumentService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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

@Api(tags = "仪器设备检验部分")
@RestController
@RequestMapping("instrument")
public class InstrumentController {

    /**
     * 服务对象
     */
    @Resource
    private TInspectionInstrumentService tInspectionInstrumentService;

    Map map;

    @ApiOperation("根据id获取数据")
    @RequestMapping(value = "/getInstrument", method = RequestMethod.GET)
    public Map selectOne(String id) {
        map = new HashMap();
        TInspectionInstrument tInspectionInstrument = this.tInspectionInstrumentService.selectByPrimaryKey(id);
        JSONObject jsonObject = JSON.parseObject(tInspectionInstrument.getTDetail());
        map.put("code", "20000");
        map.put("data", jsonObject);
        return map;
    }

    @ApiOperation("根据条件筛选查询数据")
    @GetMapping("findByAllInstrument")
    public Map findByAll(String page, String limit, TInspectionInstrument tInspectionInstrument) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TInspectionInstrument> inspectionInstruments = this.tInspectionInstrumentService.findByAll(tInspectionInstrument);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("inspectionInstruments", inspectionInstruments);
        map.put("total", new PageInfo(inspectionInstruments, intLimit).getTotal());
        return map;
    }
}
