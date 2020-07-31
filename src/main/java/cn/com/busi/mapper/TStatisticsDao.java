package cn.com.busi.mapper;

import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TStatistics;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (TStatistics)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-30 16:47:34
 */
@Mapper
public interface TStatisticsDao {


    /**
     * 通过实体作为筛选条件对车辆总数统计查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<Map> carAll( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);

    /**
     * 通过实体作为筛选条件对初检合格率统计查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<Map> firstSelect( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);

    /**
     * 通过实体作为筛选条件单项合格率统计查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<Map> singleSelect( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);

    List<Map>  cllxStatistics();

    Integer[]  firstStatistics();

    Integer[] firstNotStatistics();

    Integer[] singleDLXStatistics();

    Integer[] singleJJXStatistics();

    Integer count(@Param("table") String table);

}