package cn.com.busi.service.impl;

import cn.com.busi.entity.TSintype;
import cn.com.busi.mapper.TSintypeDao;
import cn.com.busi.service.TSintypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TSintype)表服务实现类
 *
 * @author makejava
 * @since 2020-08-06 11:40:16
 */
@Service("tSintypeService")
public class TSintypeServiceImpl implements TSintypeService {
    @Resource
    private TSintypeDao tSintypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TSintype queryById(String id) {
        return this.tSintypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TSintype> queryAllByLimit(int offset, int limit) {
        return this.tSintypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tSintype 实例对象
     * @return 实例对象
     */
    @Override
    public TSintype insert(TSintype tSintype) {
        this.tSintypeDao.insert(tSintype);
        return tSintype;
    }

    /**
     * 修改数据
     *
     * @param tSintype 实例对象
     * @return 实例对象
     */
    @Override
    public TSintype update(TSintype tSintype) {
        this.tSintypeDao.update(tSintype);
        return this.queryById(tSintype.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tSintypeDao.deleteById(id) > 0;
    }

    @Override
    public List<TSintype> queryAll(TSintype tSintype) {
        return this.tSintypeDao.queryAll(tSintype);
    }
}