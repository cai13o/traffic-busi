package cn.com.busi.controller;

import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TPgroup;
import cn.com.busi.entity.TRole;
import cn.com.busi.entity.TUser;
import cn.com.busi.service.TPgroupService;
import cn.com.busi.service.TRoleService;
import cn.com.busi.service.TUserService;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 用户组(TPgroup)表控制层
 *
 * @author makejava
 * @since 2020-07-14 13:27:09
 */
@RestController
@RequestMapping("tPgroup")
public class TPgroupController {
    /**
     * 服务对象
     */
    @Resource
    private TPgroupService tPgroupService;

    @Resource
    private TRoleService tRoleService;

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
        map.put("data",this.tPgroupService.queryById(groupid));
        return map;
    }

    /**
     * 新增数据
     *
     * @param tPgroup 实例对象
     */
    @Transactional
    @PostMapping("insert")
    public Object insert(TPgroup tPgroup) {
        tPgroup.toString();
        TPgroup tp = this.tPgroupService.queryById(tPgroup.getGroupid());
        if (tp == null){
            TPgroup insert = this.tPgroupService.insert(tPgroup);
            TRole tRole = new TRole();
            tRole.setRoleid(UUID.randomUUID().toString().replaceAll("-",""));
            tRole.setGroupid(tPgroup.getGroupid());
            tRole.setRolename(tPgroup.getGroupname());
            TRole role = this.tRoleService.insert(tRole);
            Map map = new HashMap();
            map.put("code","20000");
            return map;
        }else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("message", "用户组已存在");
            return jsonObject;
        }

    }

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @GetMapping("selectAll")
    public Object selectAll(String page, String limit,TPgroup tPgroup) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        PageHelper.startPage(intPage,intLimit);
        List<TPgroup> list=this.tPgroupService.queryAll(tPgroup);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo=new PageInfo(list,intLimit);
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",list);
        return map;
    }


    @GetMapping("selectNotAdmin")
    public Object selectNotAdmin(String page, String limit,TPgroup tPgroup) {
        System.out.println("12321321312312312321");
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        PageHelper.startPage(intPage,intLimit);
        List<TPgroup> list=this.tPgroupService.queryAllNoAdmin(tPgroup);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo=new PageInfo(list,intLimit);
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",list);
        return map;
    }

    /**
     * 修改数据
     *
     * @param tPgroup 实例对象
     * @return 实例对象
     */
    @PostMapping("update")
    public Object update(TPgroup tPgroup) {
        System.out.println(tPgroup.toString());
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tPgroupService.update(tPgroup));
        return map;

    }

    /**
     * 通过主键删除数据
     *
     * @param groupid 主键
     * @return 是否成功
     */
    @PostMapping("deleteById")
    public Object deleteById(String groupid) {
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tPgroupService.deleteById(groupid));
        return map;
    }

    /**
     * 获取没有组的成员
     *
     * @param
     * @return 是否成功
     */
    @GetMapping("selectNoDept")
    public Object selectNoDept() {
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tUserService.queryByUsername());
        return map;
    }

    @PostMapping("insUser")
    public Object insUser(String groupid,String username) {
        String[] uname = username.split(",");
        for (int i = 0; i < uname.length; i++) {
            TUser tUser = new TUser();
            tUser.setUsername(uname[i]);
            tUser.setDept(groupid);
            this.tUserService.upDept(tUser);
        }
        Map map = new HashMap();
        map.put("code","20000");
        return map;
    }

    /**
     * 获取没有组的成员
     *
     * @param
     * @return 是否成功
     */
    @GetMapping("selectDept")
    public Object selectDept(String groupid) {
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tUserService.queryByDept(groupid));
        return map;
    }

    @PostMapping("delUser")
    public Object delUser(String groupid,String username) {
        String[] uname = username.split(",");
        for (int i = 0; i < uname.length; i++) {
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