package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.com.busi.mapper.TNewMapper;
import cn.com.busi.entity.TNew;
import cn.com.busi.entity.TNewExample;
import cn.com.busi.service.TNewService;

@Service
public class TNewServiceImpl implements TNewService {

    @Resource
    private TNewMapper tNewMapper;

    @Override
    public long countByExample(TNewExample example) {
        return tNewMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TNewExample example) {
        return tNewMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return tNewMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TNew record) {
        return tNewMapper.insert(record);
    }

    @Override
    public int insertSelective(TNew record) {
        return tNewMapper.insertSelective(record);
    }

    @Override
    public List<TNew> selectByExample(TNewExample example) {
        return tNewMapper.selectByExample(example);
    }

    @Override
    public TNew selectByPrimaryKey(String id) {
        return tNewMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TNew record, TNewExample example) {
        return tNewMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TNew record, TNewExample example) {
        return tNewMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TNew record) {
        return tNewMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TNew record) {
        return tNewMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TNew> findByAll(TNew tNew) {
        return tNewMapper.findByAll(tNew);
    }

}

