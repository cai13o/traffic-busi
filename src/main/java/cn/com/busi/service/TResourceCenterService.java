package cn.com.busi.service;

import java.util.List;
import cn.com.busi.entity.TResourceCenter;
import cn.com.busi.entity.TResourceCenterExample;
public interface TResourceCenterService{


    long countByExample(TResourceCenterExample example);

    int deleteByExample(TResourceCenterExample example);

    int deleteByPrimaryKey(String id);

    int insert(TResourceCenter record);

    int insertSelective(TResourceCenter record);

    List<TResourceCenter> selectByExample(TResourceCenterExample example);

    TResourceCenter selectByPrimaryKey(String id);

    int updateByExampleSelective(TResourceCenter record,TResourceCenterExample example);

    int updateByExample(TResourceCenter record,TResourceCenterExample example);

    int updateByPrimaryKeySelective(TResourceCenter record);

    int updateByPrimaryKey(TResourceCenter record);

    List<TResourceCenter> findByAll(TResourceCenter tResourceCenter);
}
