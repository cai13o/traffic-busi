package cn.com.busi.mapper;

import cn.com.busi.entity.TInstPerson;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (TInstPerson)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-24 11:41:49
 */
@Mapper
public interface TInstPersonDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TInstPerson queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TInstPerson> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tInstPerson 实例对象
     * @return 对象列表
     */
    List<TInstPerson> queryAll(TInstPerson tInstPerson);

    /**
     * 新增数据
     *
     * @param tInstPerson 实例对象
     * @return 影响行数
     */
    int insert(TInstPerson tInstPerson);

    /**
     * 修改数据
     *
     * @param tInstPerson 实例对象
     * @return 影响行数
     */
    int update(TInstPerson tInstPerson);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    TInstPerson count();

    TInstPerson countByName(@Param("institution") String institution);

    List<Map> countByRecode();

}