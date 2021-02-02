package cn.com.busi.controller;

import cn.com.busi.annotation.Log;
import cn.com.busi.annotation.UserLoginToken;
import cn.com.busi.entity.TInstInfo;
import cn.com.busi.entity.TPgroup;
import cn.com.busi.entity.TUser;
import cn.com.busi.service.TPgroupService;
import cn.com.busi.service.TUserService;
import cn.com.busi.service.TokenService;
import cn.com.busi.utils.HttpContextUtils;
import cn.com.busi.utils.TokenUtil;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.com.busi.utils.HttpContextUtils.getHttpServletRequest;

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

    @Resource
    private TPgroupService tPgroupService;

    @Resource
    TokenService tokenService;

    /**
     * 通过主键查询单条数据
     *
     * @param username 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Object selectOne(String username) {
        Map map = new HashMap();
        map.put("code", "20000");
        TUser tUser = this.tUserService.queryById(username);
        TPgroup tPgroup = tPgroupService.queryById(tUser.getDept());
        if(tPgroup == null){
            map.put("groupname", "");
        }else {
            map.put("groupname", tPgroup.getGroupname());
        }
        map.put("data", tUser);
        return map;
    }

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     */
    @Log("添加用户")
    @PostMapping("insert")
    public Object insert(TUser tUser) {
        String trim = tUser.getUsername().trim();
        String pass = tUser.getPassword().trim();
        tUser.setUsername(trim);
        tUser.setPassword(pass);
        tUser.setDept("");
        System.out.println(tUser.toString());
        String md5Password = DigestUtils.md5DigestAsHex(tUser.getPassword().getBytes());
        tUser.setPassword(md5Password);
        TUser insert = this.tUserService.insert(tUser);


        if(insert == null){
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", "50000");
            jsonObject.put("message", "用户已存在");
            return jsonObject;
        } else {
            Map map = new HashMap();
            map.put("code", "20000");
            return map;
        }

    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Log("修改个人信息")
    @PostMapping("update")
    public Object update(TUser tUser) {

        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tUserService.update(tUser));
        return map;

    }

    /**
     * 修改密码
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Log("修改密码")
    @PostMapping("upPassword")
    public Object upPassword(TUser tUser, String newpassword) {
        System.out.println(tUser.toString());
        String Password = DigestUtils.md5DigestAsHex(tUser.getPassword().getBytes());
        TUser user = this.tUserService.getUserByUsername(tUser.getUsername(), Password);
        if (user != null) {
            String md5Password = DigestUtils.md5DigestAsHex(newpassword.trim().getBytes());
            tUser.setPassword(md5Password);
            Map map = new HashMap();
            map.put("code", "20000");
            map.put("data", this.tUserService.upPassword(tUser));
            return map;
        } else {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code", "50000");
            jsonObject.put("message", "原密码错误");
            return jsonObject;
        }
    }

    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 是否成功
     */
    @Log("删除用户")
    @PostMapping("deleteByUsername")
    public Object deleteById(String username) {
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tUserService.deleteById(username));
        return map;
    }

    /**
     * 查询多条数据
     *
     * @param page  查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @GetMapping("selectAll")
    public Object selectAll(String page, String limit, TUser tUser) {
        Integer intPage = Integer.parseInt(page);
        Integer intLimit = Integer.parseInt(limit);
        int offset = (intPage - 1) * intPage;
        PageHelper.startPage(intPage, intLimit);
        List<TUser> list = this.tUserService.queryAll(tUser);
        //将查询到的数据封装到PageInfo对象
        PageInfo<TInstInfo> pageInfo = new PageInfo(list, intLimit);
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", list);
        map.put("total",pageInfo.getTotal());
        return map;
    }

    /**
     * 修改状态
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Log("用户激活状态更改")
    @PostMapping("status")
    public Object status(TUser tUser) {
        System.out.println(tUser.toString());
        if (tUser.getState() == 1) {
            tUser.setState(0);
        } else {
            tUser.setState(1);
        }
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tUserService.status(tUser));
        return map;

    }

    /**
     * 重置密码
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Log("重置密码")
    @PostMapping("reset")
    public Object reset(TUser tUser) {

        String md5Password = DigestUtils.md5DigestAsHex("123456".getBytes());
        tUser.setPassword(md5Password);
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tUserService.reset(tUser));
        return map;

    }


    @GetMapping("queryByUsername")
    public Object queryAllBy() {

        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tUserService.queryByUsername());
        return map;
    }


    // 登录
    @Log("登录")
    @ApiOperation(value = "登陆", notes = "登陆")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Object login(TUser user, HttpServletResponse response) {
        JSONObject jsonObject = new JSONObject();
        String md5Password = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        TUser userForBase = tUserService.getUserByUsername(user.getUsername(), md5Password );
        if (userForBase == null) {
            jsonObject.put("message", "登录失败,密码错误");
            return jsonObject;
        } else {
            System.out.println(userForBase.toString());
            if (!userForBase.getUsername().equals("admin")) {
                if (userForBase.getState() == 0) {
                    jsonObject.put("message", "账号未激活");
                    return jsonObject;
                } else if (userForBase.getEfftime().getTime() > new Date().getTime()) {
                    jsonObject.put("message", "账号未生效");
                    return jsonObject;
                } else if (userForBase.getLosetime().getTime() < new Date().getTime()) {
                    jsonObject.put("message", "账号已失效");
                    return jsonObject;
                } else if (userForBase.getDept().equals("")) {
                    jsonObject.put("message", "账号未分配权限");
                    return jsonObject;
                }
            }
            HttpContextUtils.getHttpServletRequest().getSession().setAttribute("username",
                    userForBase.getUsername());
            String token = tokenService.getToken(userForBase);
            jsonObject.put("code", "20000");
            jsonObject.put("token", user.getUsername() + "-token");

            Cookie cookie = new Cookie("token", token);
            cookie.setPath("/");
            response.addCookie(cookie);
            return jsonObject;

        }

    }

    /***
     * 这个请求需要验证token才能访问
     *
     * @author: qiaoyn
     * @date 2019/06/14
     * @return String 返回类型
     */
    @UserLoginToken
    @ApiOperation(value = "获取信息", notes = "获取信息")
    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public String getMessage() {

        // 取出token中带的用户id 进行操作
        System.out.println(TokenUtil.getTokenUserId());

        return "您已通过验证";
    }
    @Log("退出登录")
    @GetMapping("/logout")
    public Object loginOut(String username) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", "20000");
        jsonObject.put("message", "退出登录");
        return jsonObject;
    }
    @Log("更新头像")
    @PostMapping("updateImg")
    public Object updateImg(@RequestBody TUser tUser) {
        System.out.println(tUser.toString());
        Map map = new HashMap();
        map.put("code", "20000");
        map.put("data", this.tUserService.updateImg(tUser));
        return map;
    }


//    @Log("更新头像")
//    @PostMapping("updateImg")
//    public Object updateImg(@RequestBody TUser tUser) {
//        System.out.println(tUser.toString());
//        Map map = new HashMap();
//        map.put("code", "20000");
//        map.put("data", this.tUserService.updateImg(tUser));
//        return map;
//    }
}
