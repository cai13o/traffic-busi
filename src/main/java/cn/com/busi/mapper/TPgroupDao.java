package cn.com.busi.mapper;

import cn.com.busi.entity.TPgroup;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户组(TPgroup)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-14 13:27:09
 */
public interface TPgroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param groupid 主键
     * @return 实例对象
     */
    TPgroup queryById(String groupid);

    /**
     * 通过ID查询单条数据
     *
     * @param groupid 主键
     * @return 实例对象
     */
    TPgroup queryByName(String groupid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TPgroup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tPgroup 实例对象
     * @return 对象列表
     */
    List<TPgroup> queryAll(TPgroup tPgroup);

    List<TPgroup> queryAllNoAdmin(TPgroup tPgroup);

    /**
     * 新增数据
     *
     * @param tPgroup 实例对象
     * @return 影响行数
     */
    int insert(TPgroup tPgroup);

    /**
     * 修改数据
     *
     * @param tPgroup 实例对象
     * @return 影响行数
     */
    int update(TPgroup tPgroup);

    /**
     * 通过主键删除数据
     *
     * @param groupid 主键
     * @return 影响行数
     */
    int deleteById(String groupid);

}