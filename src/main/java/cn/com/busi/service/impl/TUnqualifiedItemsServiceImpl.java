package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.busi.mapper.TUnqualifiedItemsMapper;
import java.util.List;
import cn.com.busi.entity.TUnqualifiedItemsExample;
import cn.com.busi.entity.TUnqualifiedItems;
import cn.com.busi.service.TUnqualifiedItemsService;

@Service
public class TUnqualifiedItemsServiceImpl implements TUnqualifiedItemsService {

    @Resource
    private TUnqualifiedItemsMapper tUnqualifiedItemsMapper;

    @Override
    public long countByExample(TUnqualifiedItemsExample example) {
        return tUnqualifiedItemsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TUnqualifiedItemsExample example) {
        return tUnqualifiedItemsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return tUnqualifiedItemsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TUnqualifiedItems record) {
        return tUnqualifiedItemsMapper.insert(record);
    }

    @Override
    public int insertSelective(TUnqualifiedItems record) {
        return tUnqualifiedItemsMapper.insertSelective(record);
    }

    @Override
    public List<TUnqualifiedItems> selectByExample(TUnqualifiedItemsExample example) {
        return tUnqualifiedItemsMapper.selectByExample(example);
    }

    @Override
    public TUnqualifiedItems selectByPrimaryKey(String id) {
        return tUnqualifiedItemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TUnqualifiedItems record, TUnqualifiedItemsExample example) {
        return tUnqualifiedItemsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TUnqualifiedItems record, TUnqualifiedItemsExample example) {
        return tUnqualifiedItemsMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TUnqualifiedItems record) {
        return tUnqualifiedItemsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUnqualifiedItems record) {
        return tUnqualifiedItemsMapper.updateByPrimaryKey(record);
    }

}

