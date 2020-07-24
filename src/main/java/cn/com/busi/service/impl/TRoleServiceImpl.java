package cn.com.busi.service.impl;

import cn.com.busi.entity.TRole;
import cn.com.busi.mapper.TRoleDao;
import cn.com.busi.service.TRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色(TRole)表服务实现类
 *
 * @author makejava
 * @since 2020-07-23 13:27:29
 */
@Service("tRoleService")
public class TRoleServiceImpl implements TRoleService {
    @Resource
    private TRoleDao tRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    @Override
    public TRole queryById(String roleid) {
        return this.tRoleDao.queryById(roleid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TRole> queryAllByLimit(int offset, int limit) {
        return this.tRoleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    @Override
    public TRole insert(TRole tRole) {
        this.tRoleDao.insert(tRole);
        return tRole;
    }

    /**
     * 修改数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    @Override
    public TRole update(TRole tRole) {
        this.tRoleDao.update(tRole);
        return this.queryById(tRole.getRoleid());
    }

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String roleid) {
        return this.tRoleDao.deleteById(roleid) > 0;
    }
}