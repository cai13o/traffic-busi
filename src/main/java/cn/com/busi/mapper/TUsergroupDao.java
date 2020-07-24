package cn.com.busi.mapper;

import cn.com.busi.entity.TUsergroup;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 用户与用户组对应关系(TUsergroup)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-16 15:36:15
 */
public interface TUsergroupDao {

    /**
     * 通过ID查询单条数据
     *
     * @param groupid 主键
     * @return 实例对象
     */
    List<TUsergroup> queryById(String groupid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUsergroup> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUsergroup 实例对象
     * @return 对象列表
     */
    List<TUsergroup> queryAll(TUsergroup tUsergroup);

    /**
     * 新增数据
     *
     * @param tUsergroup 实例对象
     * @return 影响行数
     */
    int insert(TUsergroup tUsergroup);

    /**
     * 修改数据
     *
     * @param tUsergroup 实例对象
     * @return 影响行数
     */
    int update(TUsergroup tUsergroup);

    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 影响行数
     */
    int deleteById(TUsergroup tUsergroup);

}