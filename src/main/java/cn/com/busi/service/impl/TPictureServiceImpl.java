package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

import cn.com.busi.mapper.TPictureMapper;
import cn.com.busi.entity.TPicture;
import cn.com.busi.entity.TPictureExample;
import cn.com.busi.service.TPictureService;
@Service
public class TPictureServiceImpl implements TPictureService{

    @Resource
    private TPictureMapper tPictureMapper;

    @Override
    public long countByExample(TPictureExample example) {
        return tPictureMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TPictureExample example) {
        return tPictureMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return tPictureMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TPicture record) {
        return tPictureMapper.insert(record);
    }

    @Override
    public int insertSelective(TPicture record) {
        record.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        return tPictureMapper.insertSelective(record);
    }

    @Override
    public List<TPicture> selectByExample(TPictureExample example) {
        return tPictureMapper.selectByExample(example);
    }

    @Override
    public TPicture selectByPrimaryKey(String id) {
        return tPictureMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TPicture record,TPictureExample example) {
        return tPictureMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TPicture record,TPictureExample example) {
        return tPictureMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(TPicture record) {
        return tPictureMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TPicture record) {
        return tPictureMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TPicture> findByAll(TPicture tPicture) {
        return tPictureMapper.findByAll(tPicture);
    }

}
