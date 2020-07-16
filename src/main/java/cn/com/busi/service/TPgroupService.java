package cn.com.busi.service;

import cn.com.busi.entity.TPgroup;
import java.util.List;

/**
 * 用户组(TPgroup)表服务接口
 *
 * @author makejava
 * @since 2020-07-14 13:27:09
 */
public interface TPgroupService {

    /**
     * 通过ID查询单条数据
     *
     * @param groupid 主键
     * @return 实例对象
     */
    TPgroup queryById(String groupid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TPgroup> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tPgroup 实例对象
     * @return 实例对象
     */
    TPgroup insert(TPgroup tPgroup);

    /**
     * 修改数据
     *
     * @param tPgroup 实例对象
     * @return 实例对象
     */
    TPgroup update(TPgroup tPgroup);

    /**
     * 通过主键删除数据
     *
     * @param groupid 主键
     * @return 是否成功
     */
    boolean deleteById(String groupid);

}