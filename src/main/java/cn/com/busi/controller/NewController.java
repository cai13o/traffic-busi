package cn.com.busi.controller;

import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TNew;
import cn.com.busi.service.TNewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Api(tags = "通知公告")
@RestController
@RequestMapping("new")
public class NewController {

    @Resource
    private TNewService tNewService;


    Map map;

    @ApiOperation("新增数据")
    @PostMapping("saveNew")
    public Map insertSelective(@RequestBody TNew tNew) {
        this.tNewService.insertSelective(tNew);
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }


    @ApiOperation("删除数据")
    @PostMapping("delNew")
    public Map deleteByPrimaryKey(String id) {
        this.tNewService.deleteByPrimaryKey(id);
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("根据id获取数据")
    @GetMapping("getNew")
    public Object selectByPrimaryKey(String id) {
        TNew tNew = this.tNewService.selectByPrimaryKey(id);
        tNew.setCtr(tNew.getCtr() + 1);
        this.tNewService.updateByPrimaryKeySelective(tNew);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tNew", tNew);
        return map;
    }

    @ApiOperation("修改数据")
    @PostMapping("updateNew")
    public Map updateByPrimaryKeySelective(@RequestBody TNew tNew) {
        this.tNewService.updateByPrimaryKeySelective(tNew);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tNew", tNew);
        return map;
    }

    @ApiOperation("根据条件筛选查询数据")
    @GetMapping("findByAllNew")
    public Object findByAll(String page, String limit, TNew tNew) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TNew> tNews = this.tNewService.findByAll(tNew);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tNews", tNews);
        map.put("total", new PageInfo(tNews, intLimit));
        return map;
    }

    @ApiOperation("根据id获取图片")
    @GetMapping("getNewImg")
    public Object getNewImg(String id) {
        TNew tNew = this.tNewService.selectByPrimaryKey(id);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tNew", tNew);
        return map;
    }
    // 设置固定的日期格式

    @ApiOperation("添加附件")
    @RequestMapping(value = "/accessory", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Map sendMessage(@RequestParam("fileUpload") MultipartFile[] fileUpload) {
        System.out.println(fileUpload.length);
        String format = String.valueOf(System.currentTimeMillis());

        List<Object> list = new ArrayList<>();
        for (MultipartFile multipartFile : fileUpload) {
            System.out.println("文件" + multipartFile.getOriginalFilename());
            System.out.println(multipartFile.getSize());
            String originalFilename = multipartFile.getOriginalFilename();
            String newFileName = format + "_" + originalFilename;
            //保存路径
            String path = "D://liangkeyiwei//IMGS//" + newFileName;
            //生成保存文件
            File destFile = new File(path);
            System.out.println(destFile);

            //将上传文件保存到路径
            try {
                multipartFile.transferTo(destFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        map = new HashMap<>();
        map.put("code", "20000");
        return map;
    }

    @PostMapping("deletefile")
    public Object deletefile(String fileUpload) {
        File file = new File("d://img//", fileUpload);
        file.delete();
        map = new HashMap<>();
        map.put("code", "20000");
        return map;
    }

}
