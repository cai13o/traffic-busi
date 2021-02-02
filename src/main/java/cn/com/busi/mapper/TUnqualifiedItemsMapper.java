package cn.com.busi.mapper;

import cn.com.busi.entity.TUnqualifiedItems;
import cn.com.busi.entity.TUnqualifiedItemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUnqualifiedItemsMapper {
    long countByExample(TUnqualifiedItemsExample example);

    int deleteByExample(TUnqualifiedItemsExample example);

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
    int insert(TUnqualifiedItems record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TUnqualifiedItems record);

    List<TUnqualifiedItems> selectByExample(TUnqualifiedItemsExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TUnqualifiedItems selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TUnqualifiedItems record, @Param("example") TUnqualifiedItemsExample example);

    int updateByExample(@Param("record") TUnqualifiedItems record, @Param("example") TUnqualifiedItemsExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TUnqualifiedItems record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TUnqualifiedItems record);
}