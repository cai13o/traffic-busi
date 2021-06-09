package cn.com.busi.mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import cn.com.busi.entity.TSintypeNow;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TSintypeNowMapper {
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
    int insert(TSintypeNow record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TSintypeNow record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TSintypeNow selectByPrimaryKey(String id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TSintypeNow record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TSintypeNow record);


    List<TSintypeNow> findByAll(TSintypeNow tSintypeNow);


}