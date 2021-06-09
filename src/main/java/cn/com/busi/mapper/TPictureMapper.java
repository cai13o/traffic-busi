package cn.com.busi.mapper;

import cn.com.busi.entity.TPicture;
import cn.com.busi.entity.TPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TPictureMapper {
    long countByExample(TPictureExample example);

    int deleteByExample(TPictureExample example);

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
    int insert(TPicture record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(TPicture record);

    List<TPicture> selectByExample(TPictureExample example);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    TPicture selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TPicture record, @Param("example") TPictureExample example);

    int updateByExample(@Param("record") TPicture record, @Param("example") TPictureExample example);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(TPicture record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(TPicture record);

    List<TPicture> findByAll(TPicture tPicture);


}