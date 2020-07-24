package cn.com.busi.service;

import cn.com.busi.entity.TRole;
import java.util.List;

/**
 * 角色(TRole)表服务接口
 *
 * @author makejava
 * @since 2020-07-23 13:27:29
 */
public interface TRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    TRole queryById(String roleid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    TRole insert(TRole tRole);

    /**
     * 修改数据
     *
     * @param tRole 实例对象
     * @return 实例对象
     */
    TRole update(TRole tRole);

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 是否成功
     */
    boolean deleteById(String roleid);

}