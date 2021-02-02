package cn.com.busi.mapper;

import cn.com.busi.entity.TArtificialResult;
import cn.com.busi.entity.TArtificialResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TArtificialResultMapper {
    long countByExample(TArtificialResultExample example);

    int deleteByExample(TArtificialResultExample example);

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
    int insert(TArtificialResult record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TArtificialResult record);

    List<TArtificialResult> selectByExample(TArtificialResultExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TArtificialResult selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TArtificialResult record, @Param("example") TArtificialResultExample example);

    int updateByExample(@Param("record") TArtificialResult record, @Param("example") TArtificialResultExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TArtificialResult record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TArtificialResult record);
}