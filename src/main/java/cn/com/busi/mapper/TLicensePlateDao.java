package cn.com.busi.mapper;

import cn.com.busi.entity.TInstPerson;
import cn.com.busi.entity.TLicensePlate;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TLicensePlate)表数据库访问层
 *
 * @author makejava
 * @since 2020-09-03 14:12:09
 */
public interface TLicensePlateDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TLicensePlate queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TLicensePlate> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tLicensePlate 实例对象
     * @return 对象列表
     */
    List<TLicensePlate> queryAll(TLicensePlate tLicensePlate);

    /**
     * 新增数据
     *
     * @param tLicensePlate 实例对象
     * @return 影响行数
     */
    int insert(TLicensePlate tLicensePlate);

    /**
     * 修改数据
     *
     * @param tLicensePlate 实例对象
     * @return 影响行数
     */
    int update(TLicensePlate tLicensePlate);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

    List<TLicensePlate> selectByLicense(String[] lincenses);

}