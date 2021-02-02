package cn.com.busi.service;

import cn.com.busi.entity.TInspectionArtificial;
import java.util.List;
import cn.com.busi.entity.TInspectionArtificialExample;

public interface TInspectionArtificialService {


    long countByExample(TInspectionArtificialExample example);

    int deleteByExample(TInspectionArtificialExample example);

    int deleteByPrimaryKey(String id);

    int insert(TInspectionArtificial record);

    int insertSelective(TInspectionArtificial record);

    List<TInspectionArtificial> selectByExample(TInspectionArtificialExample example);

    TInspectionArtificial selectByPrimaryKey(String id);

    int updateByExampleSelective(TInspectionArtificial record, TInspectionArtificialExample example);

    int updateByExample(TInspectionArtificial record, TInspectionArtificialExample example);

    int updateByPrimaryKeySelective(TInspectionArtificial record);

    int updateByPrimaryKey(TInspectionArtificial record);

    List<TInspectionArtificial> findByAll(TInspectionArtificial tInspectionArtificial);
}


