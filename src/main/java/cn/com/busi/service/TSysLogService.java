package cn.com.busi.service;

import cn.com.busi.entity.SysLog;
import java.util.List;

/**
 * (TSysLog)表服务接口
 *
 * @author makejava
 * @since 2020-08-13 11:05:46
 */
public interface TSysLogService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysLog queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysLog> queryAllByLimit(int offset, int limit);

    List<SysLog> queryAll(SysLog sysLog);

    /**
     * 新增数据
     *
     * @param SysLog 实例对象
     * @return 实例对象
     */
    SysLog insert(SysLog SysLog);

    /**
     * 修改数据
     *
     * @param SysLog 实例对象
     * @return 实例对象
     */
    SysLog update(SysLog SysLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}