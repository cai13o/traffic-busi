package cn.com.busi.service;

import java.util.List;
import cn.com.busi.entity.TInspectionInstrumentExample;
import cn.com.busi.entity.TInspectionInstrument;

public interface TInspectionInstrumentService {

    int deleteByPrimaryKey(String id);

    int insert(TInspectionInstrument record);

    int insertSelective(TInspectionInstrument record);

    TInspectionInstrument selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TInspectionInstrument record);

    int updateByPrimaryKey(TInspectionInstrument record);

    List<TInspectionInstrument> findByAll(TInspectionInstrument tInspectionInstrument);
}


