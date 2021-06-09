package cn.com.busi.service;

import java.util.List;
import cn.com.busi.entity.TNew;
import cn.com.busi.entity.TNewExample;

public interface TNewService {


    long countByExample(TNewExample example);

    int deleteByExample(TNewExample example);

    int deleteByPrimaryKey(String id);

    int insert(TNew record);

    int insertSelective(TNew record);

    List<TNew> selectByExample(TNewExample example);

    TNew selectByPrimaryKey(String id);

    int updateByExampleSelective(TNew record, TNewExample example);

    int updateByExample(TNew record, TNewExample example);

    int updateByPrimaryKeySelective(TNew record);

    int updateByPrimaryKey(TNew record);

    List<TNew> findByAll(TNew tNew);
}

