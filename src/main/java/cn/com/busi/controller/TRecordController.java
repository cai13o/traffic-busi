package cn.com.busi.controller;

import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TRecord;
import cn.com.busi.service.TRecordService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Decoder;

import javax.annotation.Resource;
import java.util.*;

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
//        byte[] Zdjygw = new byte[0];
//        byte[] Dgjygw = new byte[0];
//        byte[] Dlxjygw = new byte[0];
//        JSONObject b = null;
//        JSONObject c = null;
//        JSONObject d = null;
//        try {
//            Zdjygw = new BASE64Decoder().decodeBuffer(tRecord.getZdjygw());
//            Dgjygw = new BASE64Decoder().decodeBuffer(tRecord.getDgjygw());
//            Dlxjygw = new BASE64Decoder().decodeBuffer(tRecord.getDlxjygw());
//            b = JSON.parseObject(String.valueOf(Zdjygw));
//            c = JSON.parseObject(String.valueOf(Dgjygw));
//            d = JSON.parseObject(String.valueOf(Dlxjygw));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String zdj = new String(tRecord.getZdjygw());
        String dgj = new String(tRecord.getDgjygw());
        String dlx = new String(tRecord.getDlxjygw());
        JSONObject a = JSON.parseObject(tDetail);
        System.out.println(tDetail);
        Map map = new HashMap<>();
        map.put("code", "20000");
        map.put("data", a);
        map.put("zdjygw", zdj);
        map.put("dgjygw", dgj);
        map.put("dlxjygw", dlx);
        return map;
    }

    @GetMapping("selectAll")
    public Object selectAll(String page, String limit, TRecord tRecord,String numberPlate) {
        tRecord.setCphm(numberPlate);
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        Map map = new HashMap<>();
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
        Map map = new HashMap<>();
        PageHelper.startPage(intPage, intLimit);
        List<TRecord> list = this.tRecordService.queryAllCar(tRecord);
        Set set = new HashSet();
        Set set2 = new HashSet();
        for (TRecord t:list) {
            set.add(t.getHpzl());
            set2.add(t.getCllx());
        }
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
        map.put("hpzl",set);
        map.put("cllx",set2);
        map.put("total",pageInfo.getTotal());
        return map;

    }

}