package cn.com.busi.service.impl;

import cn.com.busi.entity.TInspectionArtificial;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.com.busi.entity.TArtificialResult;
import cn.com.busi.mapper.TArtificialResultMapper;
import cn.com.busi.entity.TArtificialResultExample;
import cn.com.busi.service.TArtificialResultService;

@Service
public class TArtificialResultServiceImpl implements TArtificialResultService {

    @Resource
    private TArtificialResultMapper tArtificialResultMapper;

    @Override
    public long countByExample(TArtificialResultExample example) {
        return tArtificialResultMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TArtificialResultExample example) {
        return tArtificialResultMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return tArtificialResultMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TArtificialResult record) {
        return tArtificialResultMapper.insert(record);
    }

    @Override
    public int insertSelective(TArtificialResult record) {
        return tArtificialResultMapper.insertSelective(record);
    }

    @Override
    public List<TArtificialResult> selectByExample(TArtificialResultExample example) {
        return tArtificialResultMapper.selectByExample(example);
    }

    @Override
    public TArtificialResult selectByPrimaryKey(String id) {
        return tArtificialResultMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TArtificialResult record, TArtificialResultExample example) {
        return tArtificialResultMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TArtificialResult record, TArtificialResultExample example) {
        return tArtificialResultMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TArtificialResult record) {
        return tArtificialResultMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TArtificialResult record) {
        return tArtificialResultMapper.updateByPrimaryKey(record);
    }


}


