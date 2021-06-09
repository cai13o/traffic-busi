package cn.com.busi.controller;


import cn.com.busi.entity.TResourceCenter;
import cn.com.busi.service.TResourceCenterService;
import com.documents4j.api.DocumentType;
import com.documents4j.api.IConverter;
import com.documents4j.job.LocalConverter;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.*;
import java.util.*;

@Api(tags = "行业标准")
@RestController
@RequestMapping("resource")
public class ResourceController {

    @Resource
    private TResourceCenterService tResourceCenterService;

    Map map;

    @ApiOperation("新增数据")
    @PostMapping("saveResource")
    public Map insertSelective(TResourceCenter tResourceCenter) {
        this.tResourceCenterService.insertSelective(tResourceCenter);
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("删除数据")
    @PostMapping("delResource")
    public Map deleteByPrimaryKey(String id) {
        this.tResourceCenterService.deleteByPrimaryKey(id);
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("根据id获取数据")
    @GetMapping("getResource")
    public Map selectByPrimaryKey(String id) {
        TResourceCenter tResourceCenter = this.tResourceCenterService.selectByPrimaryKey(id);
        Map map = new HashMap<>();
        if (null != tResourceCenter) {
            map.put("code", "20000");
            map.put("suffix", tResourceCenter.getUrl().substring(tResourceCenter.getUrl().lastIndexOf(".")));
            map.put("tResourceCentre", tResourceCenter);
            return map;
        }
        map.put("code", "400");
        return map;
    }

    @ApiOperation("修改数据")
    @PostMapping("updateResource")
    public Map updateByPrimaryKeySelective(TResourceCenter tResourceCenter) {
        this.tResourceCenterService.updateByPrimaryKeySelective(tResourceCenter);
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("添加附件")
    @RequestMapping(value = "/accessory", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Map sendMessage(@RequestParam("fileUpload") MultipartFile[] fileUpload) {
        System.out.println(fileUpload.length);
        String format = String.valueOf(new Date().getTime());
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
            String suffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);

            System.out.println(destFile);
            Map map = new HashMap<>();
            map.put("newFileName", newFileName);
            map.put("Url", newFileName);
            map.put("size", multipartFile.getSize());
            map.put("suffix", suffix);
            list.add(map);
            //将上传文件保存到路径
            try {
                multipartFile.transferTo(destFile);
                if (suffix.equals("docx")) {
                    String prefix = newFileName.substring(0, newFileName.lastIndexOf("."));
                    try {
                        File outputFile = new File("D:\\jtjsfwcenter\\file\\" + prefix + ".pdf");
                        outputFile.createNewFile();
                        InputStream docxInputStream = new FileInputStream(destFile);
                        OutputStream outputStream = new FileOutputStream(outputFile);
                        IConverter converter = LocalConverter.builder().build();
                        converter.convert(docxInputStream).as(DocumentType.DOCX).to(outputStream).as(DocumentType.PDF).execute();
                        outputStream.close();
                        System.out.println("success");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (suffix.equals("doc")) {
                    String prefix = newFileName.substring(0, newFileName.lastIndexOf("."));
                    try {
                        File outputFile = new File("D:\\jtjsfwcenter\\file\\" + prefix + ".pdf");
                        outputFile.createNewFile();
                        InputStream docxInputStream = new FileInputStream(destFile);
                        OutputStream outputStream = new FileOutputStream(outputFile);
                        IConverter converter = LocalConverter.builder().build();
                        converter.convert(docxInputStream).as(DocumentType.DOC).to(outputStream).as(DocumentType.PDF).execute();
                        outputStream.close();
                        System.out.println("success");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        map = new HashMap();
        map.put("code", "20000");
        map.put("list", list);
        return map;
    }

    @ApiOperation("删除附件")
    @PostMapping("deletefile")
    public Map deletefile(String fileUpload) {
        File file = new File("D://jtjsfwcenter//file//", fileUpload);
        file.delete();
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }

    @ApiOperation("根据条件筛选查询数据")
    @GetMapping("findByAllResource")
    public Map findByAll(String page, String limit, TResourceCenter tResourceCenter) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        PageHelper.startPage(intPage, intLimit);
        List<TResourceCenter> tResourceCenters = this.tResourceCenterService.findByAll(tResourceCenter);
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("tResourceCentres", tResourceCenters);
        map.put("total", new PageInfo(tResourceCenters, intLimit).getTotal());
        return map;
    }

    @ApiOperation("阅读量")
    @GetMapping("count")
    public Map count(String id) {
        TResourceCenter tResourceCenter = this.tResourceCenterService.selectByPrimaryKey(id);
        tResourceCenter.setCount(tResourceCenter.getCount() + 1);
        this.tResourceCenterService.updateByPrimaryKeySelective(tResourceCenter);
        map = new HashMap();
        map.put("code", "20000");
        return map;
    }
}
