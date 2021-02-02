package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.busi.entity.TInspectionArtificial;
import java.util.List;
import cn.com.busi.entity.TInspectionArtificialExample;
import cn.com.busi.mapper.TInspectionArtificialMapper;
import cn.com.busi.service.TInspectionArtificialService;

@Service
public class TInspectionArtificialServiceImpl implements TInspectionArtificialService {

    @Resource
    private TInspectionArtificialMapper tInspectionArtificialMapper;

    @Override
    public long countByExample(TInspectionArtificialExample example) {
        return tInspectionArtificialMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TInspectionArtificialExample example) {
        return tInspectionArtificialMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return tInspectionArtificialMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TInspectionArtificial record) {
        return tInspectionArtificialMapper.insert(record);
    }

    @Override
    public int insertSelective(TInspectionArtificial record) {
        return tInspectionArtificialMapper.insertSelective(record);
    }

    @Override
    public List<TInspectionArtificial> selectByExample(TInspectionArtificialExample example) {
        return tInspectionArtificialMapper.selectByExample(example);
    }

    @Override
    public TInspectionArtificial selectByPrimaryKey(String id) {
        return tInspectionArtificialMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TInspectionArtificial record, TInspectionArtificialExample example) {
        return tInspectionArtificialMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TInspectionArtificial record, TInspectionArtificialExample example) {
        return tInspectionArtificialMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TInspectionArtificial record) {
        return tInspectionArtificialMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TInspectionArtificial record) {
        return tInspectionArtificialMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TInspectionArtificial> findByAll(TInspectionArtificial tInspectionArtificial) {
        return tInspectionArtificialMapper.findByAll(tInspectionArtificial);
    }
}


