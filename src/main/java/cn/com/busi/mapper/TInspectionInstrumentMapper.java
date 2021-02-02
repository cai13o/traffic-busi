package cn.com.busi.mapper;
import java.util.Date;

import cn.com.busi.entity.TInspectionInstrument;
import cn.com.busi.entity.TInspectionInstrumentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TInspectionInstrumentMapper {
    long countByExample(TInspectionInstrumentExample example);

    int deleteByExample(TInspectionInstrumentExample example);

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
    int insert(TInspectionInstrument record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TInspectionInstrument record);

    List<TInspectionInstrument> selectByExample(TInspectionInstrumentExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TInspectionInstrument selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TInspectionInstrument record, @Param("example") TInspectionInstrumentExample example);

    int updateByExample(@Param("record") TInspectionInstrument record, @Param("example") TInspectionInstrumentExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TInspectionInstrument record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TInspectionInstrument record);

    List<TInspectionInstrument> findByAll(TInspectionInstrument tInspectionInstrument);


}