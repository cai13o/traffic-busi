package cn.com.busi.service;

import cn.com.busi.entity.TSintypeNow;
public interface TSintypeNowService{


    int deleteByPrimaryKey(String id);

    int insert(TSintypeNow record);

    int insertSelective(TSintypeNow record);

    TSintypeNow selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TSintypeNow record);

    int updateByPrimaryKey(TSintypeNow record);

}
