package cn.com.busi.mapper;

import cn.com.busi.entity.SysLog;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TSysLog)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-12 15:38:44
 */
public interface TSysLogDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysLog queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysLog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param SysLog 实例对象
     * @return 对象列表
     */
    List<SysLog> queryAll(SysLog SysLog);

    /**
     * 新增数据
     *
     * @param SysLog 实例对象
     * @return 影响行数
     */
    int insert(SysLog SysLog);

    /**
     * 修改数据
     *
     * @param SysLog 实例对象
     * @return 影响行数
     */
    int update(SysLog SysLog);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}