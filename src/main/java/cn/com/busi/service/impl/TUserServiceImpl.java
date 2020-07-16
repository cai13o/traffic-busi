package cn.com.busi.service.impl;

import cn.com.busi.entity.TUser;
import cn.com.busi.mapper.TUserDao;
import cn.com.busi.service.TUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * 用户表(TUser)表服务实现类
 *
 * @author makejava
 * @since 2020-07-09 15:59:10
 */
@Service("tUserService")
public class TUserServiceImpl implements TUserService {
    @Resource
    private TUserDao tUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param username 主键
     * @return 实例对象
     */
    @Override
    public TUser queryById(String username) {
        return this.tUserDao.queryById(username);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUser> queryAllByLimit(int offset, int limit) {
        return this.tUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser insert(TUser tUser) {
        tUser.setRegtime(new Date());

        this.tUserDao.insert(tUser);
        return tUser;
    }

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    @Override
    public TUser update(TUser tUser) {
        this.tUserDao.update(tUser);
        return this.queryById(tUser.getUsername());
    }

    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String username) {
        return this.tUserDao.deleteById(username) > 0;
    }

    @Override
    public int status(TUser tUser) {
        return this.tUserDao.status(tUser);
    }
    @Override
    public int reset(TUser tUser) {
        return this.tUserDao.reset(tUser);
    }


}