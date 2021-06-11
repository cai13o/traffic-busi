package cn.com.busi.mapper;

import cn.com.busi.entity.*;
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
    List<TStatistics> carAll( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);

    /**
     * 通过实体作为筛选条件对初检合格率统计查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> firstSelect( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);

    /**
     * 通过实体作为筛选条件单项合格率统计查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> singleSelect( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);

    List<Map>  cllxStatistics();

    Integer[]  firstStatistics();

    Integer[] firstNotStatistics();

    Integer[] singleStatistics(@Param("tSintype") TSintype tSintype);

    Integer count(@Param("table") String table);

    Integer first( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);
    Integer firstNo( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);

    Integer single( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);
    Integer singleNo( @Param("tReport") TReport tReport ,@Param("tStatistics") TStatistics tStatistics);

    List<TStatistics> jcjlByAll();
    List<TStatistics> syxzByAll();



    /**
     * 通过实体作为筛选条件对车辆总数统计查询
     *
     * @param tInspectionReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> carAllNow(@Param("tInspectionReport") TInspectionReport tInspectionReport , @Param("tStatistics") TStatistics tStatistics);

    /**
     * 通过实体作为筛选条件对初检合格率统计查询
     *
     * @param tInspectionReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> firstSelectNow(@Param("tInspectionReport") TInspectionReport tInspectionReport ,@Param("tStatistics") TStatistics tStatistics);

    /**
     * 通过实体作为筛选条件单项合格率统计查询
     *
     * @param tInspectionReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> singleSelectNow(@Param("tInspectionReport") TInspectionReport tInspectionReport, @Param("tStatistics") TStatistics tStatistics, @Param("concat1") String concat1, @Param("concat2") String concat2);

    List<Map>  cllxStatisticsNow();

    Integer[]  firstStatisticsNow();

    Integer[] firstNotStatisticsNow();

    Integer[] singleStatisticsNow(@Param("tSintype") TSintypeNow tSintype);

    Integer countNow(@Param("table") String table);

    Integer firstNow( @Param("tInspectionReport") TInspectionReport tInspectionReport,@Param("tStatistics") TStatistics tStatistics);
    Integer firstNoNow( @Param("tInspectionReport") TInspectionReport tInspectionReport ,@Param("tStatistics") TStatistics tStatistics);

    Integer singleNow(@Param("tInspectionReport") TInspectionReport tInspectionReport, @Param("tStatistics") TStatistics tStatistics, @Param("concat1") String concat1, @Param("concat2") String concat2);
    Integer singleNoNow(@Param("tInspectionReport") TInspectionReport tInspectionReport, @Param("tStatistics") TStatistics tStatistics, @Param("concat1") String concat1, @Param("concat2") String concat2);

    List<TStatistics> jcjlByAllNow();
    List<TStatistics> syxzByAllNow();
}