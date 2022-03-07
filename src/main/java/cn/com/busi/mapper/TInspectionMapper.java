package cn.com.busi.mapper;

import cn.com.busi.entity.TInspection;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TInspectionMapper {
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
    int insert(TInspection record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TInspection record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TInspection selectByPrimaryKey(String id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TInspection record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TInspection record);

    List<TInspection> createTempTable();
}