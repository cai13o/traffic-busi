package cn.com.busi.service;

import cn.com.busi.entity.TConsult;

import java.util.List;

public interface TConsultService {


    int deleteByPrimaryKey(String id);

    int insert(TConsult record);

    int insertSelective(TConsult record);

    TConsult selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TConsult record);

    int updateByPrimaryKey(TConsult record);

    List<TConsult> findByAll(TConsult tConsult);
}

