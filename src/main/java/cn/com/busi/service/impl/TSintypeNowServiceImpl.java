package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.busi.entity.TSintypeNow;
import cn.com.busi.mapper.TSintypeNowMapper;
import cn.com.busi.service.TSintypeNowService;

import java.util.List;

@Service
public class TSintypeNowServiceImpl implements TSintypeNowService{

    @Resource
    private TSintypeNowMapper tSintypeNowMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return tSintypeNowMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TSintypeNow record) {
        return tSintypeNowMapper.insert(record);
    }

    @Override
    public int insertSelective(TSintypeNow record) {
        return tSintypeNowMapper.insertSelective(record);
    }

    @Override
    public TSintypeNow selectByPrimaryKey(String id) {
        return tSintypeNowMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TSintypeNow record) {
        return tSintypeNowMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TSintypeNow record) {
        return tSintypeNowMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TSintypeNow> findByAll(TSintypeNow tSintypeNow) {
        return tSintypeNowMapper.findByAll(tSintypeNow);
    }

}
