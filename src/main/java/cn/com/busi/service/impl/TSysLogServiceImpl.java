package cn.com.busi.service.impl;

import cn.com.busi.entity.SysLog;
import cn.com.busi.mapper.TSysLogDao;
import cn.com.busi.service.TSysLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TSysLog)表服务实现类
 *
 * @author makejava
 * @since 2020-08-13 11:05:46
 */
@Service("tSysLogService")
public class TSysLogServiceImpl implements TSysLogService {
    @Resource
    private TSysLogDao tSysLogDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysLog queryById(Integer id) {
        return this.tSysLogDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysLog> queryAllByLimit(int offset, int limit) {
        return this.tSysLogDao.queryAllByLimit(offset, limit);
    }

    @Override
    public List<SysLog> queryAll(SysLog sysLog) {
        return this.tSysLogDao.queryAll(sysLog);
    }

    /**
     * 新增数据
     *
     * @param SysLog 实例对象
     * @return 实例对象
     */
    @Override
    public SysLog insert(SysLog SysLog) {
        this.tSysLogDao.insert(SysLog);
        return SysLog;
    }

    /**
     * 修改数据
     *
     * @param SysLog 实例对象
     * @return 实例对象
     */
    @Override
    public SysLog update(SysLog SysLog) {
        this.tSysLogDao.update(SysLog);
        return this.queryById(SysLog.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tSysLogDao.deleteById(id) > 0;
    }
}