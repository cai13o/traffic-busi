package cn.com.busi.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.com.busi.entity.TInspectionReportExample;
import java.util.List;
import cn.com.busi.mapper.TInspectionReportMapper;
import cn.com.busi.entity.TInspectionReport;
import cn.com.busi.service.TInspectionReportService;

@Service
public class TInspectionReportServiceImpl implements TInspectionReportService {

    @Resource
    private TInspectionReportMapper tInspectionReportMapper;

    @Override
    public long countByExample(TInspectionReportExample example) {
        return tInspectionReportMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TInspectionReportExample example) {
        return tInspectionReportMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return tInspectionReportMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TInspectionReport record) {
        return tInspectionReportMapper.insert(record);
    }

    @Override
    public int insertSelective(TInspectionReport record) {
        return tInspectionReportMapper.insertSelective(record);
    }

    @Override
    public List<TInspectionReport> selectByExample(TInspectionReportExample example) {
        return tInspectionReportMapper.selectByExample(example);
    }

    @Override
    public TInspectionReport selectByPrimaryKey(String id) {
        return tInspectionReportMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(TInspectionReport record, TInspectionReportExample example) {
        return tInspectionReportMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(TInspectionReport record, TInspectionReportExample example) {
        return tInspectionReportMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(TInspectionReport record) {
        return tInspectionReportMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TInspectionReport record) {
        return tInspectionReportMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TInspectionReport> findByAll(TInspectionReport tInspectionReport) {
        return tInspectionReportMapper.findByAll(tInspectionReport);
    }

}


