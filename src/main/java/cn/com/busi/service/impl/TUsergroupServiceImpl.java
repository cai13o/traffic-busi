package cn.com.busi.service.impl;

import cn.com.busi.entity.TUsergroup;
import cn.com.busi.mapper.TUsergroupDao;
import cn.com.busi.service.TUsergroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户与用户组对应关系(TUsergroup)表服务实现类
 *
 * @author makejava
 * @since 2020-07-16 15:33:49
 */
@Service("tUsergroupService")
public class TUsergroupServiceImpl implements TUsergroupService {
    @Resource
    private TUsergroupDao tUsergroupDao;

    /**
     * 通过ID查询单条数据
     *
     * @param groupid 主键
     * @return 实例对象
     */
    @Override
    public List<TUsergroup> queryById(String groupid) {
        return this.tUsergroupDao.queryById(groupid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TUsergroup> queryAllByLimit(int offset, int limit) {
        return this.tUsergroupDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tUsergroup 实例对象
     * @return 实例对象
     */
    @Override
    public TUsergroup insert(TUsergroup tUsergroup) {
        this.tUsergroupDao.insert(tUsergroup);
        return tUsergroup;
    }

    /**
     * 修改数据
     *
     * @param tUsergroup 实例对象
     * @return 实例对象
     */
    @Override
    public TUsergroup update(TUsergroup tUsergroup) {
        this.tUsergroupDao.update(tUsergroup);
        return null;
    }

    /**
     * 通过主键删除数据
     *
     * @param tUsergroup 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(TUsergroup tUsergroup) {
        return this.tUsergroupDao.deleteById(tUsergroup) > 0;
    }
}