package cn.com.busi.service;

import cn.com.busi.entity.TCaution;
import java.util.List;

/**
 * (TCaution)表服务接口
 *
 * @author makejava
 * @since 2020-07-06 18:20:57
 */
public interface TCautionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TCaution queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TCaution> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tCaution 实例对象
     * @return 对象列表
     */
    List<TCaution> queryAll(TCaution tCaution);

    /**
     * 新增数据
     *
     * @param tCaution 实例对象
     * @return 实例对象
     */
    TCaution insert(TCaution tCaution);

    /**
     * 修改数据
     *
     * @param tCaution 实例对象
     * @return 实例对象
     */
    TCaution update(TCaution tCaution);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}