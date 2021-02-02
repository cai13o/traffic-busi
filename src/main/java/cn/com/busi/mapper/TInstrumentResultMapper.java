package cn.com.busi.mapper;

import cn.com.busi.entity.TInstrumentResult;
import cn.com.busi.entity.TInstrumentResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TInstrumentResultMapper {
    long countByExample(TInstrumentResultExample example);

    int deleteByExample(TInstrumentResultExample example);

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
    int insert(TInstrumentResult record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TInstrumentResult record);

    List<TInstrumentResult> selectByExample(TInstrumentResultExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TInstrumentResult selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TInstrumentResult record, @Param("example") TInstrumentResultExample example);

    int updateByExample(@Param("record") TInstrumentResult record, @Param("example") TInstrumentResultExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TInstrumentResult record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TInstrumentResult record);
}