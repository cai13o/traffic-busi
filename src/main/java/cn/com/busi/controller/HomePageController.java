package cn.com.busi.controller;

import cn.com.busi.entity.TCache;
import cn.com.busi.entity.TCaution;
import cn.com.busi.entity.TInstInfo;
import cn.com.busi.service.HomePageService;
import cn.com.busi.service.TCacheService;
import cn.com.busi.service.TCautionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("home")
public class HomePageController {
    /**
     * 服务对象
     */
    @Resource
    private HomePageService homePageService;
    @Resource
    private TCacheService tCacheService;

    @GetMapping("page")
    public Object selectOne(String id) {
        return this.homePageService.queryAll();
    }

    @GetMapping("syxzByAll")
    public Object syxzByAll() {
        return this.homePageService.syxzByAll();
    }

    @GetMapping("jcjlByAll")
    public Object jcjlByAll() {
        return this.homePageService.jcjlByAll();
    }
//------------------------------------------------------------------------------
    @GetMapping("pageNow")
    public Object selectOneNow(String id) {
        TCache tCache = this.tCacheService.selectByPrimaryKey("pageNow");
        System.out.println(tCache.getResult().replaceAll(" ",""));
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<String, Object>();
        map = gson.fromJson(tCache.getResult().replaceAll(" ",""), map.getClass());
        return map;
    }

    @GetMapping("syxzByAllNow")
    public Object syxzByAllNow() {
        TCache tCache = this.tCacheService.selectByPrimaryKey("syxzByAllNow");
        return tCache.getResult();
    }

    @GetMapping("jcjlByAllNow")
    public Object jcjlByAllNow() {
        TCache tCache = this.tCacheService.selectByPrimaryKey("jcjlByAllNow");
        return tCache.getResult();
    }
}