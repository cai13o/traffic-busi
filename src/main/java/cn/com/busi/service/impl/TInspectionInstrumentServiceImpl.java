package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.com.busi.entity.TInspectionInstrumentExample;
import cn.com.busi.entity.TInspectionInstrument;
import cn.com.busi.mapper.TInspectionInstrumentMapper;
import cn.com.busi.service.TInspectionInstrumentService;

@Service
public class TInspectionInstrumentServiceImpl implements TInspectionInstrumentService {

    @Resource
    private TInspectionInstrumentMapper tInspectionInstrumentMapper;


    @Override
    public int deleteByPrimaryKey(String id) {
        return tInspectionInstrumentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TInspectionInstrument record) {
        return tInspectionInstrumentMapper.insert(record);
    }

    @Override
    public int insertSelective(TInspectionInstrument record) {
        return tInspectionInstrumentMapper.insertSelective(record);
    }


    @Override
    public TInspectionInstrument selectByPrimaryKey(String id) {
        return tInspectionInstrumentMapper.selectByPrimaryKey(id);
    }


    @Override
    public int updateByPrimaryKeySelective(TInspectionInstrument record) {
        return tInspectionInstrumentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TInspectionInstrument record) {
        return tInspectionInstrumentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TInspectionInstrument> findByAll(TInspectionInstrument tInspectionInstrument) {
        return tInspectionInstrumentMapper.findByAll(tInspectionInstrument);
    }

}


