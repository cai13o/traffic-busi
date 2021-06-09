package cn.com.busi.mapper;

import cn.com.busi.entity.TNew;
import cn.com.busi.entity.TNewExample;import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;import java.util.List;

@Mapper
public interface TNewMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(String id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(TNew record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TNew record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TNew selectByPrimaryKey(String id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TNew record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TNew record);

    long countByExample(TNewExample example);

    int deleteByExample(TNewExample example);

    List<TNew> selectByExample(TNewExample example);

    int updateByExampleSelective(@Param("record") TNew record, @Param("example") TNewExample example);

    int updateByExample(@Param("record") TNew record, @Param("example") TNewExample example);

    List<TNew> findByAll(TNew tNew);
}