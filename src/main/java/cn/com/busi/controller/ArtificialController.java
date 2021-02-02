package cn.com.busi.controller;

import cn.com.busi.entity.TInspectionArtificial;
import cn.com.busi.service.TInspectionArtificialService;
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

@Api(tags = "人工检验部分")
@RestController
@RequestMapping("articial")
public class ArtificialController {

    /**
     * 服务对象
     */
    @Resource
    private TInspectionArtificialService tInspectionArtificialService;

    Map map;

    @ApiOperation("根据id获取数据")
    @RequestMapping(value = "/getArticial", method = RequestMethod.GET)
    public Map selectOne(String id) {
        map = new HashMap();
        TInspectionArtificial tInspectionArtificial = this.tInspectionArtificialService.selectByPrimaryKey(id);
        map.put("code", "20000");
        map.put("data", tInspectionArtificial);
        return null;
    }

    @ApiOperation("根据条件筛选查询数据")
    @GetMapping("findByAllArticial")
    public Map findByAll(String page, String limit, TInspectionArtificial tInspectionArtificial) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TInspectionArtificial> inspectionArtificials = this.tInspectionArtificialService.findByAll(tInspectionArtificial);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tNews", inspectionArtificials);
        map.put("total", new PageInfo(inspectionArtificials, intLimit).getTotal());
        return map;
    }
}
