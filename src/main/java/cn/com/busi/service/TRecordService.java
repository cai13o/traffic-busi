package cn.com.busi.service;

import cn.com.busi.entity.TRecord;
import java.util.List;

/**
 * (TRecord)表服务接口
 *
 * @author makejava
 * @since 2020-07-06 17:05:18
 */
public interface TRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRecord queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TRecord> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tRecord 实例对象
     * @return 对象列表
     */
    List<TRecord> queryAll(TRecord tRecord);

    List<TRecord> queryAllCar(TRecord tRecord);

    List<TRecord> queryImg();

    List<TRecord> queryQX(String id);

    /**
     * 新增数据
     *
     * @param tRecord 实例对象
     * @return 实例对象
     */
    TRecord insert(TRecord tRecord);

    /**
     * 修改数据
     *
     * @param tRecord 实例对象
     * @return 实例对象
     */
    TRecord update(TRecord tRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}