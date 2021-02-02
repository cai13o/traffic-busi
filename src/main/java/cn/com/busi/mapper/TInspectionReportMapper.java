package cn.com.busi.mapper;

import cn.com.busi.entity.TInspectionReport;
import cn.com.busi.entity.TInspectionReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TInspectionReportMapper {
    long countByExample(TInspectionReportExample example);

    int deleteByExample(TInspectionReportExample example);

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
    int insert(TInspectionReport record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(TInspectionReport record);

    List<TInspectionReport> selectByExample(TInspectionReportExample example);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    TInspectionReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TInspectionReport record, @Param("example") TInspectionReportExample example);

    int updateByExample(@Param("record") TInspectionReport record, @Param("example") TInspectionReportExample example);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TInspectionReport record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TInspectionReport record);

    List<TInspectionReport> findByAll(TInspectionReport tInspectionReport);


}