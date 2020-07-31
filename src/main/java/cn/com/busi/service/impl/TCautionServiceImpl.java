package cn.com.busi.service.impl;

import cn.com.busi.entity.TCaution;
import cn.com.busi.mapper.TCautionDao;
import cn.com.busi.service.TCautionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * (TCaution)表服务实现类
 *
 * @author makejava
 * @since 2020-07-06 18:20:58
 */
@Service("tCautionService")
public class TCautionServiceImpl implements TCautionService {
    @Resource
    private TCautionDao tCautionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TCaution queryById(String id) {
        return this.tCautionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TCaution> queryAllByLimit(int offset, int limit) {
        return this.tCautionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 通过实体作为筛选条件查询
     *
     * @param entryTime 实例对象
     * @return 对象列表
     */
    @Override
    public List<TCaution> queryAll(String entryTime) {
        TCaution tCaution = new TCaution();
        if (entryTime != null) {
            try {
                tCaution.setLrsj(new SimpleDateFormat("yyyy-MM-dd").parse(entryTime));
                return this.tCautionDao.queryAll(tCaution);
            } catch (ParseException e) {
                throw new RuntimeException();
            }
        }
        return this.tCautionDao.queryAll(tCaution);

    }
    /**
     * 新增数据
     *
     * @param tCaution 实例对象
     * @return 实例对象
     */
    @Override
    public TCaution insert(TCaution tCaution) {
        this.tCautionDao.insert(tCaution);
        return tCaution;
    }

    /**
     * 修改数据
     *
     * @param tCaution 实例对象
     * @return 实例对象
     */
    @Override
    public TCaution update(TCaution tCaution) {
        this.tCautionDao.update(tCaution);
        return this.queryById(tCaution.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tCautionDao.deleteById(id) > 0;
    }
}