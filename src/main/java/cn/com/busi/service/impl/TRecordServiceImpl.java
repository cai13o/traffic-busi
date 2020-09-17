package cn.com.busi.service.impl;

import cn.com.busi.entity.TRecord;

import cn.com.busi.mapper.TRecordDao;
import cn.com.busi.service.TRecordService;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Decoder;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * (TRecord)表服务实现类
 *
 * @author makejava
 * @since 2020-07-06 17:05:18
 */
@Service("tRecordService")
public class TRecordServiceImpl implements TRecordService {
    @Resource
    private TRecordDao tRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TRecord queryById(String id) {

        return this.tRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TRecord> queryAllByLimit(int offset, int limit) {
        return this.tRecordDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<TRecord> queryAll(TRecord tRecord) {
        return this.tRecordDao.queryAll(tRecord);
    }

    @Override
    public List<TRecord> queryAllCar(TRecord tRecord) {
        return this.tRecordDao.queryAllCar(tRecord);
    }

    @Override
    public List<TRecord> queryImg() {
        return this.tRecordDao.queryImg();
    }

    @Override
    public List<TRecord> queryQX(String id) {
        return this.tRecordDao.queryQX(id);
    }

    /**
     * 新增数据
     *
     * @param tRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TRecord insert(TRecord tRecord) {
        this.tRecordDao.insert(tRecord);
        return tRecord;
    }

    /**
     * 修改数据
     *
     * @param tRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TRecord update(TRecord tRecord) {
        this.tRecordDao.update(tRecord);
        return this.queryById(tRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tRecordDao.deleteById(id) > 0;
    }
}