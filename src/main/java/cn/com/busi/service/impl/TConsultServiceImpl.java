package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.busi.entity.TConsult;
import cn.com.busi.mapper.TConsultMapper;
import cn.com.busi.service.TConsultService;

import java.util.List;
import java.util.UUID;

@Service
public class TConsultServiceImpl implements TConsultService {

    @Resource
    private TConsultMapper tConsultMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return tConsultMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TConsult record) {
        return tConsultMapper.insert(record);
    }

    @Override
    public int insertSelective(TConsult record) {
        record.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        return tConsultMapper.insertSelective(record);
    }

    @Override
    public TConsult selectByPrimaryKey(String id) {
        return tConsultMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TConsult record) {
        return tConsultMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TConsult record) {
        return tConsultMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TConsult> findByAll(TConsult tConsult) {
        return tConsultMapper.findByAll(tConsult);
    }

}

