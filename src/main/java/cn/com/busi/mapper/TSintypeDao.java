package cn.com.busi.mapper;

import cn.com.busi.entity.TSintype;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TSintype)表数据库访问层
 *
 * @author makejava
 * @since 2020-08-06 11:40:17
 */
public interface TSintypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TSintype queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSintype> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tSintype 实例对象
     * @return 对象列表
     */
    List<TSintype> queryAll(TSintype tSintype);

    /**
     * 新增数据
     *
     * @param tSintype 实例对象
     * @return 影响行数
     */
    int insert(TSintype tSintype);

    /**
     * 修改数据
     *
     * @param tSintype 实例对象
     * @return 影响行数
     */
    int update(TSintype tSintype);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    List<TSintype> queryAllNow(TSintype tSintype);

}