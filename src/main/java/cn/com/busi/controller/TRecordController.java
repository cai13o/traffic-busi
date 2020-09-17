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
import sun.misc.BASE64Decoder;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
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
        JSONObject a= JSON.parseObject(tRecord.getTDetail());
        Map map = new HashMap<>();
        map.put("code", "20000");
        map.put("data", a);
        map.put("zdjygw", tRecord.getZdjygw());
        map.put("dgjygw", tRecord.getDgjygw());
        map.put("dlxjygw", tRecord.getDlxjygw());
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
        map.put("total",pageInfo.getTotal());
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
//        TRecord tRecord1 = new TRecord();
//        List<TRecord> list1 = this.tRecordService.queryAllCar(tRecord1);
//        Set set = new HashSet();
//        Set set2 = new HashSet();
//        for (TRecord t:list1) {
//            set.add(t.getHpzl());
//            set2.add(t.getCllx());
//        }
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        map.put("code", "20000");
        map.put("data", list);
//        map.put("hpzl",set);
//        map.put("cllx",set2);
        map.put("total",pageInfo.getTotal());
        return map;

    }

    @GetMapping("typeCount")
    public Object typeCount(TRecord tRecord) {
        List<TRecord> list = this.tRecordService.queryAllCar(tRecord);
        Set set = new HashSet();
        Set set2 = new HashSet();
        for (TRecord t:list) {
            set.add(t.getHpzl());
            set2.add(t.getCllx());
        }
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("hpzl", set);
        map.put("cllx", set2);
        return map;
    }

    @GetMapping("selectImg")
    public Object selectImg() {
        System.out.println(1);
        List<TRecord> tRecords = this.tRecordService.queryImg();
        BASE64Decoder decoder = new sun.misc.BASE64Decoder();
        try {
            for (TRecord tRecord : tRecords) {
                byte[] bytes1 = decoder.decodeBuffer(tRecord.getZdjygw());
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes1);
                BufferedImage bi1 = ImageIO.read(bais);
                String filename1 = tRecord.getId() + "zdjygw.jpg";
                File f1 = new File("d://liangkeyiwei//IMG", filename1);
                if(bi1 != null) {
                    ImageIO.write(bi1, "jpg", f1);
                }
                byte[] bytes2 = decoder.decodeBuffer(tRecord.getDgjygw());
                ByteArrayInputStream bais2 = new ByteArrayInputStream(bytes2);
                BufferedImage bi2 = ImageIO.read(bais2);
                String filename2 = tRecord.getId() + "dgjygw.jpg";
                File f2 = new File("d://liangkeyiwei//IMG", filename2);
                if(bi2 != null) {
                    ImageIO.write(bi2, "jpg", f2);
                }
                byte[] bytes3 = decoder.decodeBuffer(tRecord.getDlxjygw());
                ByteArrayInputStream bais3 = new ByteArrayInputStream(bytes3);
                BufferedImage bi3 = ImageIO.read(bais3);
                String filename3 = tRecord.getId() + "dlxjygw.jpg";
                File f3 = new File("d://liangkeyiwei//IMG", filename3);
                if(bi3 != null) {
                    ImageIO.write(bi3, "jpg", f3);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @GetMapping("selectQX")
    public Object selectQX(String id) {
        Map map = new HashMap<>();
        map.put("code", "20000");
        map.put("data", this.tRecordService.queryQX(id));
        return map;
    }
}