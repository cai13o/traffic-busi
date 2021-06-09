package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import cn.com.busi.entity.TResourceCenter;
import cn.com.busi.entity.TResourceCenterExample;
import cn.com.busi.mapper.TResourceCenterMapper;
import cn.com.busi.service.TResourceCenterService;
@Service
public class TResourceCenterServiceImpl implements TResourceCenterService{

    @Resource
    private TResourceCenterMapper tResourceCenterMapper;

    @Override
    public long countByExample(TResourceCenterExample example) {
        return tResourceCenterMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TResourceCenterExample example) {
        return tResourceCenterMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return tResourceCenterMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TResourceCenter record) {
        return tResourceCenterMapper.insert(record);
    }

    @Override
    public int insertSelective(TResourceCenter record) {
        return tResourceCenterMapper.insertSelective(record);
    }

    @Override
    public List<TResourceCenter> selectByExample(TResourceCenterExample example) {
        return tResourceCenterMapper.selectByExample(example);
    }

    @Override
    public TResourceCenter selectByPrimaryKey(String id) {
        return tResourceCenterMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TResourceCenter record,TResourceCenterExample example) {
        return tResourceCenterMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TResourceCenter record,TResourceCenterExample example) {
        return tResourceCenterMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TResourceCenter record) {
        return tResourceCenterMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TResourceCenter record) {
        return tResourceCenterMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TResourceCenter> findByAll(TResourceCenter tResourceCenter) {
        return tResourceCenterMapper.findByAll(tResourceCenter);
    }

}
