package cn.com.busi.service;

import cn.com.busi.entity.TCache;


import java.util.List;

public interface TCacheService {

    int deleteByPrimaryKey(String id);

    int insert(TCache record);

    int insertSelective(TCache record);

    TCache selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TCache record);

    int updateByPrimaryKey(TCache record);

    List<TCache> findByAll(TCache tCache);
}

