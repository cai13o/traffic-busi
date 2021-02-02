package cn.com.busi.service;

import java.util.List;
import cn.com.busi.entity.TInspectionInstrumentExample;
import cn.com.busi.entity.TInspectionInstrument;

public interface TInspectionInstrumentService {


    long countByExample(TInspectionInstrumentExample example);

    int deleteByExample(TInspectionInstrumentExample example);

    int deleteByPrimaryKey(String id);

    int insert(TInspectionInstrument record);

    int insertSelective(TInspectionInstrument record);

    List<TInspectionInstrument> selectByExample(TInspectionInstrumentExample example);

    TInspectionInstrument selectByPrimaryKey(String id);

    int updateByExampleSelective(TInspectionInstrument record, TInspectionInstrumentExample example);

    int updateByExample(TInspectionInstrument record, TInspectionInstrumentExample example);

    int updateByPrimaryKeySelective(TInspectionInstrument record);

    int updateByPrimaryKey(TInspectionInstrument record);

    List<TInspectionInstrument> findByAll(TInspectionInstrument tInspectionInstrument);
}

