package cn.com.busi.controller;

import cn.com.busi.entity.TPicture;
import cn.com.busi.service.TPictureService;
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

@Api(tags = "首页图片")
@RestController
@RequestMapping("picture")
public class PictureController {
    @Resource
    private TPictureService tPictureService;

    Map map;

    @ApiOperation("根据id获取数据")
    @RequestMapping(value = "/getPicture", method = RequestMethod.GET)
    public Map selectOne(String id) {
        map = new HashMap();
        TPicture tPicture = this.tPictureService.selectByPrimaryKey(id);
        map.put("code", "20000");
        map.put("data", tPicture);
        return map;
    }
    @ApiOperation("添加图片数据")
    @RequestMapping(value = "/savePicture", method = RequestMethod.POST)
    public Map saveImg(TPicture tPicture) {
        map = new HashMap();
        this.tPictureService.insertSelective(tPicture);
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("根据条件筛选查询数据")
    @RequestMapping(value = "/findByAllPicture", method = RequestMethod.GET)
    public Map findByAll(String page, String limit, TPicture tPicture) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TPicture> tPictures = this.tPictureService.findByAll(tPicture);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tPictures", tPictures);
        map.put("total", new PageInfo(tPictures, intLimit).getTotal());
        return map;
    }

    @ApiOperation("根据条件筛选查询数据")
    @RequestMapping(value = "/AllPicture", method = RequestMethod.GET)
    public Map findByAll(TPicture tPicture) {
        List<TPicture> tPictures = this.tPictureService.findByAll(tPicture);
        map = new HashMap<>();
        map.put("code", "20000");
        map.put("tPictures", tPictures);
        return map;
    }

    @ApiOperation("根据id修改数据")
    @RequestMapping(value = "/updatePicture", method = RequestMethod.GET)
    public Map updatePicture(TPicture tPicture) {
        map = new HashMap();
        this.tPictureService.updateByPrimaryKeySelective(tPicture);
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("添加数据")
    @RequestMapping(value = "/accessory", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Map savePicture(@RequestParam("fileUpload") MultipartFile[] fileUpload) {
        System.out.println(fileUpload.length);
        String format = String.valueOf(new Date().getTime());
        List<Object> list = new ArrayList<>();
        map = new HashMap();
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
            map.put("newFileName", newFileName);


            //将上传文件保存到路径
            try {
                multipartFile.transferTo(destFile);
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
        map.put("code", "20000");

        return map;

    }

    @ApiOperation("删除数据")
    @RequestMapping(value = "/delPicture", method = RequestMethod.POST)
    public Map deleteByPrimaryKey(String id) {
        this.tPictureService.deleteByPrimaryKey(id);
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }
}
