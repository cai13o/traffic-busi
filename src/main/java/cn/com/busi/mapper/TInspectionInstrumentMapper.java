package cn.com.busi.mapper;

import cn.com.busi.entity.TInspectionInstrument;
import cn.com.busi.entity.TInspectionInstrumentExample;import org.apache.ibatis.annotations.Mapper;import org.apache.ibatis.annotations.Param;import java.util.List;

@Mapper
public interface TInspectionInstrumentMapper {
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

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TInspectionInstrument selectByPrimaryKey(String id);

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

    TInspectionInstrument count();
}