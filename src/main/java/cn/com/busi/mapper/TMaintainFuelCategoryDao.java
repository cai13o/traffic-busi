package cn.com.busi.mapper;

import java.util.List;

/**
 * 用户表(TUser)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-14 11:09:19
 */
public interface TMaintainFuelCategoryDao {


    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    List<String> queryAll();

}