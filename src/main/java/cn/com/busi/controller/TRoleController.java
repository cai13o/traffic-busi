package cn.com.busi.controller;

import cn.com.busi.annotation.Log;
import cn.com.busi.entity.TPgroup;
import cn.com.busi.entity.TRole;
import cn.com.busi.service.TRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 角色(TRole)表控制层
 *
 * @author makejava
 * @since 2020-07-23 13:27:29
 */
@RestController
@RequestMapping("tRole")
public class TRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TRoleService tRoleService;

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
        map.put("data",this.tRoleService.queryById(groupid));
        return map;

    }

    @GetMapping("selectAdmin")
    public Object selectAdmin() {
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tRoleService.queryById("admin"));
        return map;
    }

    /**
     * 修改数据
     *
     * @param
     * @return 实例对象
     */
    @Log("权限修改")
    @PostMapping("update")
    public Object update(String groupid,String sysid,String rolename ,String releid,String rout) {


        TRole tRole = new TRole();
        tRole.setRoleid(releid);
        tRole.setRolename(rolename);
        tRole.setGroupid(groupid);
        tRole.setAreacode(rout);
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tRoleService.update(tRole));
        return map;
    }

}