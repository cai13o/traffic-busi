package cn.com.busi.mapper;

import cn.com.busi.entity.TRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TRecord)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-30 18:02:14
 */
@Mapper
public interface TRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TRecord queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tRecord 实例对象
     * @return 对象列表
     */
    List<TRecord> queryAll(TRecord tRecord);

    List<TRecord> queryAllCar(TRecord tRecord);

    List<TRecord> queryImg();

    List<TRecord> queryQX(String id);

    /**
     * 新增数据
     *
     * @param tRecord 实例对象
     * @return 影响行数
     */
    int insert(TRecord tRecord);

    /**
     * 修改数据
     *
     * @param tRecord 实例对象
     * @return 影响行数
     */
    int update(TRecord tRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    TRecord count();

}