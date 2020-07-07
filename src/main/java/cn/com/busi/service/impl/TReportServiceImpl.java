package cn.com.busi.service.impl;

import cn.com.busi.entity.TRecord;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TStatistics;
import cn.com.busi.mapper.TReportDao;
import cn.com.busi.service.TReportService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (TReport)表服务实现类
 *
 * @author makejava
 * @since 2020-06-30 16:47:32
 */
@Service("tReportService")
public class TReportServiceImpl implements TReportService {
    @Resource
    private TReportDao tReportDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TReport queryById(String id) {
        return this.tReportDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TReport> queryAllByLimit(int offset, int limit) {
        return this.tReportDao.queryAllByLimit(offset, limit);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tReport 实例对象
     * @return 对象列表
     */
    @Override
    public List<TReport> queryAll(TReport tReport) {
        return this.tReportDao.queryAll(tReport);
    }

    /**
     * 新增数据
     *
     * @param tReport 实例对象
     * @return 实例对象
     */
    @Override
    public TReport insert(TReport tReport) {
        this.tReportDao.insert(tReport);
        return tReport;
    }

    /**
     * 修改数据
     *
     * @param tReport 实例对象
     * @return 实例对象
     */
    @Override
    public TReport update(TReport tReport) {
        this.tReportDao.update(tReport);
        return this.queryById(tReport.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tReportDao.deleteById(id) > 0;
    }

}