package cn.com.busi.service;

import cn.com.busi.entity.TInstDevice;
import java.util.List;

/**
 * (TInstDevice)表服务接口
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
public interface TInstDeviceService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TInstDevice queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TInstDevice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tInstDevice 实例对象
     * @return 实例对象
     */
    TInstDevice insert(TInstDevice tInstDevice);

    /**
     * 修改数据
     *
     * @param tInstDevice 实例对象
     * @return 实例对象
     */
    TInstDevice update(TInstDevice tInstDevice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tInstDevice 实例对象
     * @return 对象列表
     */
    List<TInstDevice> queryAll(TInstDevice tInstDevice);

}