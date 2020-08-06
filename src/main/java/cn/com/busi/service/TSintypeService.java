package cn.com.busi.service;

import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TSintype;
import java.util.List;

/**
 * (TSintype)表服务接口
 *
 * @author makejava
 * @since 2020-08-06 11:40:16
 */
public interface TSintypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TSintype queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSintype> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tSintype 实例对象
     * @return 实例对象
     */
    TSintype insert(TSintype tSintype);

    /**
     * 修改数据
     *
     * @param tSintype 实例对象
     * @return 实例对象
     */
    TSintype update(TSintype tSintype);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<TSintype> queryAll(TSintype tSintype);
}