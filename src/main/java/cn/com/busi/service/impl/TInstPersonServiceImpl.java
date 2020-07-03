package cn.com.busi.service.impl;

import cn.com.busi.entity.TInstPerson;
import cn.com.busi.mapper.TInstPersonDao;
import cn.com.busi.service.TInstPersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TInstPerson)表服务实现类
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@Service("tInstPersonService")
public class TInstPersonServiceImpl implements TInstPersonService {
    @Resource
    private TInstPersonDao tInstPersonDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TInstPerson queryById(String id) {
        return this.tInstPersonDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TInstPerson> queryAllByLimit(int offset, int limit) {
        return this.tInstPersonDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tInstPerson 实例对象
     * @return 实例对象
     */
    @Override
    public TInstPerson insert(TInstPerson tInstPerson) {
        this.tInstPersonDao.insert(tInstPerson);
        return tInstPerson;
    }

    /**
     * 修改数据
     *
     * @param tInstPerson 实例对象
     * @return 实例对象
     */
    @Override
    public TInstPerson update(TInstPerson tInstPerson) {
        this.tInstPersonDao.update(tInstPerson);
        return this.queryById(tInstPerson.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tInstPersonDao.deleteById(id) > 0;
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tInstPerson 实例对象
     * @return 对象列表
     */
    @Override
    public List<TInstPerson> queryAll(TInstPerson tInstPerson) {
        return this.tInstPersonDao.queryAll(tInstPerson);
    }
}