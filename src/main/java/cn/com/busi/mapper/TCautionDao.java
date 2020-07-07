package cn.com.busi.mapper;

import cn.com.busi.entity.TCaution;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TCaution)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-06 18:20:58
 */
public interface TCautionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TCaution queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TCaution> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


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
     * @return 影响行数
     */
    int insert(TCaution tCaution);

    /**
     * 修改数据
     *
     * @param tCaution 实例对象
     * @return 影响行数
     */
    int update(TCaution tCaution);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}