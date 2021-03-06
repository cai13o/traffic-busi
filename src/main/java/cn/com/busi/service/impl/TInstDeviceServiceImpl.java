package cn.com.busi.service.impl;

import cn.com.busi.entity.TInstDevice;
import cn.com.busi.mapper.TInstDeviceDao;
import cn.com.busi.service.TInstDeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TInstDevice)表服务实现类
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@Service("tInstDeviceService")
public class TInstDeviceServiceImpl implements TInstDeviceService {
    @Resource
    private TInstDeviceDao tInstDeviceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TInstDevice queryById(String id) {
        return this.tInstDeviceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TInstDevice> queryAllByLimit(int offset, int limit) {
        return this.tInstDeviceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tInstDevice 实例对象
     * @return 实例对象
     */
    @Override
    public TInstDevice insert(TInstDevice tInstDevice) {
        this.tInstDeviceDao.insert(tInstDevice);
        return tInstDevice;
    }

    /**
     * 修改数据
     *
     * @param tInstDevice 实例对象
     * @return 实例对象
     */
    @Override
    public TInstDevice update(TInstDevice tInstDevice) {
        this.tInstDeviceDao.update(tInstDevice);
        return this.queryById(tInstDevice.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tInstDeviceDao.deleteById(id) > 0;
    }

    @Override
    public List<TInstDevice> queryAll(TInstDevice tInstDevice) {
        return this.tInstDeviceDao.queryAll(tInstDevice);
    }
}