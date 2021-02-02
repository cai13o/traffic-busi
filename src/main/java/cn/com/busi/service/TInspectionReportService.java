package cn.com.busi.service;

import cn.com.busi.entity.TInspectionReportExample;
import java.util.List;
import cn.com.busi.entity.TInspectionReport;

public interface TInspectionReportService {


    long countByExample(TInspectionReportExample example);

    int deleteByExample(TInspectionReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(TInspectionReport record);

    int insertSelective(TInspectionReport record);

    List<TInspectionReport> selectByExample(TInspectionReportExample example);

    TInspectionReport selectByPrimaryKey(String id);

    int updateByExampleSelective(TInspectionReport record, TInspectionReportExample example);

    int updateByExample(TInspectionReport record, TInspectionReportExample example);

    int updateByPrimaryKeySelective(TInspectionReport record);

    int updateByPrimaryKey(TInspectionReport record);

    List<TInspectionReport> findByAll(TInspectionReport tInspectionReport);
}


