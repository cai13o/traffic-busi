package cn.com.busi.service.impl;

import cn.com.busi.entity.TCache;


import cn.com.busi.mapper.TCacheMapper;
import cn.com.busi.service.TCacheService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TCacheServiceImpl implements TCacheService {

    @Resource
    private TCacheMapper tCacheMapper;



    @Override
    public int deleteByPrimaryKey(String id) {
        return tCacheMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TCache record) {
        return tCacheMapper.insert(record);
    }

    @Override
    public int insertSelective(TCache record) {
        return tCacheMapper.insertSelective(record);
    }



    @Override
    public TCache selectByPrimaryKey(String id) {
        return tCacheMapper.selectByPrimaryKey(id);
    }

    

    @Override
    public int updateByPrimaryKeySelective(TCache record) {
        return tCacheMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TCache record) {
        return tCacheMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TCache> findByAll(TCache tCache) {
        return tCacheMapper.findByAll(tCache);
    }

}

