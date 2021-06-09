package cn.com.busi.service;

import cn.com.busi.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (TStatistics)表服务接口
 *
 * @author makejava
 * @since 2020-06-30 16:47:32
 */
public interface TStatisticsService {

    /**
     * 通过实体作为筛选条件对车辆总数统计查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> carAll(TReport tReport, String startDate, String endDate);

    /**
     * 通过实体作为筛选条件对初检合格率统计查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> firstSelect(TReport tReport, String startDate, String endDate);

    /**
     * 通过实体作为筛选条件单项合格率统计查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> singleSelect(TReport tReport, String startDate, String endDate, String singlePass);

    Integer count(String table);

    Map firstorNo(TReport tReport ,String startDate, String endDate);
    Map singleorNo(TReport tReport ,String startDate, String endDate,String singlePass);

    /**
     * 通过实体作为筛选条件对车辆总数统计查询
     *
     * @param tInspectionReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> carAllNow(TInspectionReport tInspectionReport, String startDate, String endDate);

    /**
     * 通过实体作为筛选条件对初检合格率统计查询
     *
     * @param tInspectionReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> firstSelectNow(TInspectionReport tInspectionReport, String startDate, String endDate);

    /**
     * 通过实体作为筛选条件单项合格率统计查询
     *
     * @param tInspectionReport 实例对象
     * @return 对象列表
     */
    List<TStatistics> singleSelectNow(TInspectionReport tInspectionReport, String startDate, String endDate, String singlePass);

}