package cn.com.busi.service;

import java.util.List;
import cn.com.busi.entity.TArtificialResult;
import cn.com.busi.entity.TArtificialResultExample;

public interface TArtificialResultService {


    long countByExample(TArtificialResultExample example);

    int deleteByExample(TArtificialResultExample example);

    int deleteByPrimaryKey(String id);

    int insert(TArtificialResult record);

    int insertSelective(TArtificialResult record);

    List<TArtificialResult> selectByExample(TArtificialResultExample example);

    TArtificialResult selectByPrimaryKey(String id);

    int updateByExampleSelective(TArtificialResult record, TArtificialResultExample example);

    int updateByExample(TArtificialResult record, TArtificialResultExample example);

    int updateByPrimaryKeySelective(TArtificialResult record);

    int updateByPrimaryKey(TArtificialResult record);

}


