package cn.com.busi.service;

import java.util.List;
import cn.com.busi.entity.TPicture;
import cn.com.busi.entity.TPictureExample;
public interface TPictureService{


    long countByExample(TPictureExample example);

    int deleteByExample(TPictureExample example);

    int deleteByPrimaryKey(String id);

    int insert(TPicture record);

    int insertSelective(TPicture record);

    List<TPicture> selectByExample(TPictureExample example);

    TPicture selectByPrimaryKey(String id);

    int updateByExampleSelective(TPicture record,TPictureExample example);

    int updateByExample(TPicture record,TPictureExample example);

    int updateByPrimaryKeySelective(TPicture record);

    int updateByPrimaryKey(TPicture record);

    List<TPicture> findByAll(TPicture tPicture);
}
