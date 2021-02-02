package cn.com.busi.service;

import cn.com.busi.entity.TInstrumentResult;
import java.util.List;
import cn.com.busi.entity.TInstrumentResultExample;
public interface TInstrumentResultService{


    long countByExample(TInstrumentResultExample example);

    int deleteByExample(TInstrumentResultExample example);

    int deleteByPrimaryKey(String id);

    int insert(TInstrumentResult record);

    int insertSelective(TInstrumentResult record);

    List<TInstrumentResult> selectByExample(TInstrumentResultExample example);

    TInstrumentResult selectByPrimaryKey(String id);

    int updateByExampleSelective(TInstrumentResult record,TInstrumentResultExample example);

    int updateByExample(TInstrumentResult record,TInstrumentResultExample example);

    int updateByPrimaryKeySelective(TInstrumentResult record);

    int updateByPrimaryKey(TInstrumentResult record);

}
