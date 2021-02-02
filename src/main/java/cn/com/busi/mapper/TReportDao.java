package cn.com.busi.mapper;

import cn.com.busi.entity.TRecord;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

/**
 * (TReport)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-30 16:47:34
 */
@Mapper
public interface TReportDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TReport queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TReport> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<TReport> queryAll(@Param("tReport") TReport tReport,@Param("startDate") String startDate, @Param("endDate") String endDate,@Param("ssqy") String ssqy,@Param("singlePass")String singlePass);

    /**
     * 新增数据
     *
     * @param tReport 实例对象
     * @return 影响行数
     */
    int insert(TReport tReport);

    /**
     * 修改数据
     *
     * @param tReport 实例对象
     * @return 影响行数
     */
    int update(TReport tReport);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

    TReport count();

    TReport countByName(@Param("jcjgmc") String jcjgmc);

}