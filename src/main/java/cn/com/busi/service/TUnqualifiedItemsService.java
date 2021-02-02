package cn.com.busi.service;

import java.util.List;
import cn.com.busi.entity.TUnqualifiedItemsExample;
import cn.com.busi.entity.TUnqualifiedItems;

public interface TUnqualifiedItemsService {


    long countByExample(TUnqualifiedItemsExample example);

    int deleteByExample(TUnqualifiedItemsExample example);

    int deleteByPrimaryKey(String id);

    int insert(TUnqualifiedItems record);

    int insertSelective(TUnqualifiedItems record);

    List<TUnqualifiedItems> selectByExample(TUnqualifiedItemsExample example);

    TUnqualifiedItems selectByPrimaryKey(String id);

    int updateByExampleSelective(TUnqualifiedItems record, TUnqualifiedItemsExample example);

    int updateByExample(TUnqualifiedItems record, TUnqualifiedItemsExample example);

    int updateByPrimaryKeySelective(TUnqualifiedItems record);

    int updateByPrimaryKey(TUnqualifiedItems record);

}

