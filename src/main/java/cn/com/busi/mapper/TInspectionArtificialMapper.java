package cn.com.busi.mapper;
import java.util.Date;

import cn.com.busi.entity.TInspectionArtificial;
import cn.com.busi.entity.TInspectionArtificialExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TInspectionArtificialMapper {
    long countByExample(TInspectionArtificialExample example);

    int deleteByExample(TInspectionArtificialExample example);

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
    int insert(TInspectionArtificial record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TInspectionArtificial record);

    List<TInspectionArtificial> selectByExample(TInspectionArtificialExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TInspectionArtificial selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TInspectionArtificial record, @Param("example") TInspectionArtificialExample example);

    int updateByExample(@Param("record") TInspectionArtificial record, @Param("example") TInspectionArtificialExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TInspectionArtificial record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TInspectionArtificial record);


    List<TInspectionArtificial> findByAll(TInspectionArtificial tInspectionArtificial);


}