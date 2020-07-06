package cn.com.busi.service;

import cn.com.busi.entity.TRecord;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TStatistics;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * (TReport)表服务接口
 *
 * @author makejava
 * @since 2020-06-30 16:47:32
 */
public interface TReportService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TReport queryById(String id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TReport> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tReport 实例对象
     * @return 实例对象
     */
    TReport insert(TReport tReport);

    /**
     * 修改数据
     *
     * @param tReport 实例对象
     * @return 实例对象
     */
    TReport update(TReport tReport);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

    List<Map> firstSelect(TReport tReport, TStatistics tStatistics);

    List<Map> carAll(TReport tReport, TStatistics tStatistics);

    List<Map> singleSelect(TReport tReport, TStatistics tStatistics);


}