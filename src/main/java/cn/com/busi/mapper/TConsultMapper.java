package cn.com.busi.mapper;

import cn.com.busi.entity.TConsult;
import org.apache.ibatis.annotations.Mapper;import java.util.List;

@Mapper
public interface TConsultMapper {
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
    int insert(TConsult record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TConsult record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TConsult selectByPrimaryKey(String id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TConsult record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TConsult record);

    List<TConsult> findByAll(TConsult tConsult);
}