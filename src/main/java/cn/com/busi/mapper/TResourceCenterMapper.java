package cn.com.busi.mapper;
import java.util.Date;

import cn.com.busi.entity.TResourceCenter;
import cn.com.busi.entity.TResourceCenterExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TResourceCenterMapper {
    long countByExample(TResourceCenterExample example);

    int deleteByExample(TResourceCenterExample example);

    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(TResourceCenter record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TResourceCenter record);

    List<TResourceCenter> selectByExample(TResourceCenterExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TResourceCenter selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TResourceCenter record, @Param("example") TResourceCenterExample example);

    int updateByExample(@Param("record") TResourceCenter record, @Param("example") TResourceCenterExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TResourceCenter record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TResourceCenter record);

    List<TResourceCenter> findByAll(TResourceCenter tResourceCenter);


}