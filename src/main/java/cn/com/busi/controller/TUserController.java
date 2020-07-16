package cn.com.busi.controller;

import cn.com.busi.entity.TUser;
import cn.com.busi.service.TUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户表(TUser)表控制层
 *
 * @author makejava
 * @since 2020-07-09 15:59:10
 */
@RestController
@RequestMapping("tUser")
public class TUserController {
    /**
     * 服务对象
     */
    @Resource
    private TUserService tUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param username 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Object selectOne(String username) {
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tUserService.queryById(username));
        return map;
    }

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     */
    @PostMapping("insert")
    public Object insert(TUser tUser) {
        System.out.println(tUser.toString());
        TUser insert = this.tUserService.insert(tUser);
        Map map = new HashMap();
        map.put("code","20000");
        return map;
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @PostMapping("update")
    public Object update(TUser tUser) {
        System.out.println(tUser.toString());
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tUserService.update(tUser));
        return map;

    }

    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 是否成功
     */
    @PostMapping("deleteByUsername")
    public boolean deleteById(String username) {

        return this.tUserService.deleteById(username);
    }

    /**
     * 查询多条数据
     *
     * @param page 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @GetMapping("selectAll")
    public Object queryAllByLimit(String page, String limit) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tUserService.queryAllByLimit(offset,intLimit));
        return map;
    }

    /**
     * 修改状态
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @PostMapping("status")
    public Object status(TUser tUser) {
        System.out.println(tUser.toString());
        if(tUser.getState() == 1){
            tUser.setState(0);
        }else {
            tUser.setState(1);
        }
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tUserService.status(tUser));
        return map;

    }

    /**
     * 重置密码
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @PostMapping("reset")
    public Object reset(TUser tUser) {
        tUser.setPassword("123456");
        Map map = new HashMap();
        map.put("code","20000");
        map.put("data",this.tUserService.reset(tUser));
        return map;

    }

}//
