package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.busi.entity.TInstrumentResult;
import java.util.List;
import cn.com.busi.entity.TInstrumentResultExample;
import cn.com.busi.mapper.TInstrumentResultMapper;
import cn.com.busi.service.TInstrumentResultService;
@Service
public class TInstrumentResultServiceImpl implements TInstrumentResultService{

    @Resource
    private TInstrumentResultMapper tInstrumentResultMapper;

    @Override
    public long countByExample(TInstrumentResultExample example) {
        return tInstrumentResultMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TInstrumentResultExample example) {
        return tInstrumentResultMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return tInstrumentResultMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TInstrumentResult record) {
        return tInstrumentResultMapper.insert(record);
    }

    @Override
    public int insertSelective(TInstrumentResult record) {
        return tInstrumentResultMapper.insertSelective(record);
    }

    @Override
    public List<TInstrumentResult> selectByExample(TInstrumentResultExample example) {
        return tInstrumentResultMapper.selectByExample(example);
    }

    @Override
    public TInstrumentResult selectByPrimaryKey(String id) {
        return tInstrumentResultMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TInstrumentResult record,TInstrumentResultExample example) {
        return tInstrumentResultMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TInstrumentResult record,TInstrumentResultExample example) {
        return tInstrumentResultMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TInstrumentResult record) {
        return tInstrumentResultMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TInstrumentResult record) {
        return tInstrumentResultMapper.updateByPrimaryKey(record);
    }

}
