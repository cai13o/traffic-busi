package cn.com.busi.service.impl;

import cn.com.busi.entity.TPgroup;
import cn.com.busi.mapper.TPgroupDao;
import cn.com.busi.service.TPgroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户组(TPgroup)表服务实现类
 *
 * @author makejava
 * @since 2020-07-14 13:27:09
 */
@Service("tPgroupService")
public class TPgroupServiceImpl implements TPgroupService {
    @Resource
    private TPgroupDao tPgroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param groupid 主键
     * @return 实例对象
     */
    @Override
    public TPgroup queryById(String groupid) {
        return this.tPgroupDao.queryById(groupid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TPgroup> queryAllByLimit(int offset, int limit) {
        return this.tPgroupDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<TPgroup> queryAll(TPgroup tPgroup) {
        return this.tPgroupDao.queryAll(tPgroup);
    }

    @Override
    public List<TPgroup> queryAllNoAdmin(TPgroup tPgroup) {
        return this.tPgroupDao.queryAllNoAdmin(tPgroup);
    }

    /**
     * 新增数据
     *
     * @param tPgroup 实例对象
     * @return 实例对象
     */
    @Override
    public TPgroup insert(TPgroup tPgroup) {

        this.tPgroupDao.insert(tPgroup);
        return tPgroup;
    }

    /**
     * 修改数据
     *
     * @param tPgroup 实例对象
     * @return 实例对象
     */
    @Override
    public TPgroup update(TPgroup tPgroup) {
        this.tPgroupDao.update(tPgroup);
        return this.queryById(tPgroup.getGroupid());
    }

    /**
     * 通过主键删除数据
     *
     * @param groupid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String groupid) {
        return this.tPgroupDao.deleteById(groupid) > 0;
    }
}