package cn.com.busi.service;

import cn.com.busi.entity.TUsergroup;
import java.util.List;

/**
 * 用户与用户组对应关系(TUsergroup)表服务接口
 *
 * @author makejava
 * @since 2020-07-16 15:33:49
 */
public interface TUsergroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param groupid 主键
     * @return 实例对象
     */
    List<TUsergroup> queryById(String groupid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUsergroup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tUsergroup 实例对象
     * @return 实例对象
     */
    TUsergroup insert(TUsergroup tUsergroup);

    /**
     * 修改数据
     *
     * @param tUsergroup 实例对象
     * @return 实例对象
     */
    TUsergroup update(TUsergroup tUsergroup);

    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 是否成功
     */
    boolean deleteById(TUsergroup tUsergroup);

}