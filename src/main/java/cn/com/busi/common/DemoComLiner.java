//package cn.com.busi.common;
//
//import cn.com.busi.entity.TInspection;
//import cn.com.busi.mapper.TInspectionMapper;
//import cn.com.busi.mapper.TStatisticsDao;
//import com.alibaba.fastjson.JSONObject;
//import com.google.gson.Gson;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.UUID;
//
//@Component
//public class DemoComLiner implements CommandLineRunner {
//
//    @Autowired
//    TInspectionMapper tInspectionMapper;
//
//    @Override
//    public void run(String... args) throws Exception {
//        List<TInspection> tInspections = this.tInspectionMapper.createTempTable();
//        for (TInspection tIn :
//                tInspections) {
//            this.tInspectionMapper.insertSelective(tIn);
//        }
//    }
//}
