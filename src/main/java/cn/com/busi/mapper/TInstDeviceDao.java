package cn.com.busi.mapper;

import cn.com.busi.entity.TInstDevice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TInstDevice)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-24 11:41:51
 */
@Mapper
public interface TInstDeviceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TInstDevice queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TInstDevice> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tInstDevice 实例对象
     * @return 对象列表
     */
    List<TInstDevice> queryAll(TInstDevice tInstDevice);

    /**
     * 新增数据
     *
     * @param tInstDevice 实例对象
     * @return 影响行数
     */
    int insert(TInstDevice tInstDevice);

    /**
     * 修改数据
     *
     * @param tInstDevice 实例对象
     * @return 影响行数
     */
    int update(TInstDevice tInstDevice);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    TInstDevice count();
    TInstDevice countByName(@Param("institution") String institution);

}