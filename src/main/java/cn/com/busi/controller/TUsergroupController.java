package cn.com.busi.controller;

import cn.com.busi.entity.TUser;
import cn.com.busi.entity.TUsergroup;
import cn.com.busi.service.TUserService;
import cn.com.busi.service.TUsergroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户与用户组对应关系(TUsergroup)表控制层
 *
 * @author makejava
 * @since 2020-07-16 15:33:49
 */
@RestController
@RequestMapping("tUsergroup")
public class TUsergroupController {
    /**
     * 服务对象
     */
    @Resource
    private TUsergroupService tUsergroupService;

    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param groupid 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Object selectOne(String groupid) {
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tUserService.queryByDept(groupid));
        return map;
    }

    @PostMapping("insert")
    public Object insert(String groupid,String username) {
        System.out.println(groupid +"  "+username.toString());
        String[] uname = username.split(",");
        for (int i = 0; i < uname.length; i++) {
            TUsergroup tUsergroup = new TUsergroup();
            tUsergroup.setGroupid(groupid);
            tUsergroup.setUsername(uname[i]);
            tUsergroup.setAdmin(0);
            TUser tUser = new TUser();
            tUser.setUsername(uname[i]);
            tUser.setDept(groupid);
            this.tUsergroupService.insert(tUsergroup);
            this.tUserService.upDept(tUser);
        }
        Map map = new HashMap();
        map.put("code","20000");
        return map;
    }

    @PostMapping("deleteById")
    public Object deleteById(String groupid,String username) {

        String[] uname = username.split(",");
        for (int i = 0; i < uname.length; i++) {
            TUsergroup tUsergroup = new TUsergroup();
            tUsergroup.setGroupid(groupid);
            tUsergroup.setUsername(uname[i]);
            tUsergroup.setAdmin(0);
            this.tUsergroupService.deleteById(tUsergroup);
            TUser tUser = new TUser();
            tUser.setUsername(uname[i]);
            tUser.setDept("");
            this.tUserService.upDept(tUser);
        }
        Map map = new HashMap();
        map.put("code","20000");
        return map;
    }

}