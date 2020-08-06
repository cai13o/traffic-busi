package cn.com.busi.service;

import cn.com.busi.entity.TUser;
import java.util.List;

/**
 * 用户表(TUser)表服务接口
 *
 * @author makejava
 * @since 2020-07-09 15:59:10
 */
public interface TUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param username 主键
     * @return 实例对象
     */
    TUser queryById(String username);

    TUser getUserByUsername(String username,String password);



    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TUser> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param tUser 实例对象
     * @return 对象列表
     */
    List<TUser> queryAll(TUser tUser);

    /**
     * 新增数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser insert(TUser tUser);

    /**
     * 修改数据
     *
     * @param tUser 实例对象
     * @return 实例对象
     */
    TUser update(TUser tUser);

    int updateImg(TUser tUser);
    /**
     * 通过主键删除数据
     *
     * @param username 主键
     * @return 是否成功
     */
    boolean deleteById(String username);

    /**
     * 修改密码
     *
     * @param tUser 实例对象
     * @return 影响行数
     */
    int upPassword(TUser tUser);

    int status(TUser tUser);

    int reset(TUser tUser);

    List<TUser> queryByUsername();

    List<TUser> queryByDept(String dept);

    int upDept(TUser tUser);

}