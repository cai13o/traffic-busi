package cn.com.busi.service.impl;

import cn.com.busi.entity.*;
import cn.com.busi.mapper.TInstDeviceDao;
import cn.com.busi.mapper.TInstInfoDao;
import cn.com.busi.mapper.TInstPersonDao;
import cn.com.busi.mapper.TReportDao;
import cn.com.busi.service.TInstInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TInstInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-06-24 11:39:11
 */
@Service("tInstInfoService")
public class TInstInfoServiceImpl implements TInstInfoService {

    @Resource
    private TInstInfoDao tInstInfoDao;

    @Resource
    private TInstPersonDao tInstPersonDao;

    @Resource
    private TInstDeviceDao tInstDeviceDao;

    @Resource
    private TReportDao tReportDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TInstInfo queryById(String id) {
        return this.tInstInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TInstInfo> queryAllByLimit(int offset, int limit) {
        return this.tInstInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tInstInfo 实例对象
     * @return 实例对象
     */
    @Override
    public TInstInfo insert(TInstInfo tInstInfo) {
        this.tInstInfoDao.insert(tInstInfo);
        return tInstInfo;
    }

    /**
     * 修改数据
     *
     * @param tInstInfo 实例对象
     * @return 实例对象
     */
    @Override
    public TInstInfo update(TInstInfo tInstInfo) {
        this.tInstInfoDao.update(tInstInfo);
        return this.queryById(tInstInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tInstInfoDao.deleteById(id) > 0;
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tInstInfo 实例对象
     * @return 对象列表
     */
    @Override
    public List<TInstInfo> queryAll(TInstInfo tInstInfo) {
        return this.tInstInfoDao.queryAll(tInstInfo);
    }

    @Override
    public Map nameByAll(String name) {

        TInstPerson tInstPerson = this.tInstPersonDao.countByName(name);
        TInstDevice tInstDevice = this.tInstDeviceDao.countByName(name);
        TReport tReport = this.tReportDao.countByName(name);


        Map map = new HashMap();

        map.put("code","20000");

        //机构人员数量
        map.put("personCount" , tInstPerson.getRemarks());
        //机构设备数量
        map.put("deviceCount" , tInstDevice.getRemarks());
        //检测车辆数量
        map.put("carCount", tReport.getCllx());

        return map;
    }
}