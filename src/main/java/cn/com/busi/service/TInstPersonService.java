package cn.com.busi.service;

import cn.com.busi.entity.TInstPerson;
import java.util.List;

/**
 * (TInstPerson)表服务接口
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
public interface TInstPersonService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TInstPerson queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TInstPerson> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tInstPerson 实例对象
     * @return 实例对象
     */
    TInstPerson insert(TInstPerson tInstPerson);

    /**
     * 修改数据
     *
     * @param tInstPerson 实例对象
     * @return 实例对象
     */
    TInstPerson update(TInstPerson tInstPerson);

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
     * @param tInstPerson 实例对象
     * @return 对象列表
     */
    List<TInstPerson> queryAll(TInstPerson tInstPerson);

}