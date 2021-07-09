package cn.com.busi.service.impl;

import cn.com.busi.entity.*;
import cn.com.busi.mapper.TCartypeDao;
import cn.com.busi.mapper.TStatisticsDao;
import cn.com.busi.service.TStatisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TStatistics)表服务实现类
 *
 * @author makejava
 * @since 2020-06-30 16:47:32
 */
@Service("tStatisticsService")
public class TStatisticsServiceImpl implements TStatisticsService {
    @Resource
    private TStatisticsDao tStatisticsDao;
    @Resource
    private TCartypeDao tCartypeDao;


    @Override
    public List<TStatistics> carAll(TReport tReport, String startDate, String endDate) {
        TStatistics tStatistics = new TStatistics();
        if (null != tReport.getXzqy()) {
            if (!tReport.getXzqy().trim().isEmpty()) {
                tStatistics.setXzqy("xzqy");
                tReport.setXzqy(tReport.getXzqy().trim());
            }
        }
        if (null != tReport.getJcjgmc()) {
            if (!tReport.getJcjgmc().trim().isEmpty()) {
                tStatistics.setJcjgmc("jcjgmc");
                tReport.setJcjgmc(tReport.getJcjgmc().trim());
            }
        }
        if (null != tReport.getJcjl()) {
            if (!tReport.getJcjl().trim().isEmpty()) {
                tStatistics.setJcjl("jcjl");
                tReport.setJcjl(tReport.getJcjl().trim());
            }
        }
        if (null != tReport.getClrllb()) {
            if (!tReport.getClrllb().trim().isEmpty()) {
                tStatistics.setClrllb("clrllb");
                tReport.setClrllb(tReport.getClrllb().trim());
            }
        }
        if (null != tReport.getCllx()) {
            if (!tReport.getCllx().trim().isEmpty()) {
                tStatistics.setCllx("cllx");
                tReport.setCllx(tReport.getCllx().trim());
            }
        }
        if (null != tReport.getPpxh()) {
            if (!tReport.getPpxh().trim().isEmpty()) {
                tStatistics.setPpxh("ppxh");
                tReport.setPpxh(tReport.getPpxh().trim());
            }
        }

        if (null != tReport.getSyxz()) {
            if (!tReport.getSyxz().trim().isEmpty()) {
                tStatistics.setSyxz("syxz");
                tReport.setSyxz(tReport.getSyxz().trim());
            }
        }

        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJyrq("jcrq");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        List list = new ArrayList();
        if ((tReport.getSyxz() == null || "".equals(tReport.getSyxz().trim())) &&(tReport.getXzqy() == null || "".equals(tReport.getXzqy().trim())) && (tReport.getCllx() == null || "".equals(tReport.getCllx().trim())) && (tReport.getPpxh() == null || "".equals(tReport.getPpxh().trim())) && (tReport.getJcjgmc() == null || "".equals(tReport.getJcjgmc().trim())) && (tReport.getClrllb() == null || "".equals(tReport.getClrllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            System.out.println("返回空");
            return list;
        }
        List<TStatistics> tStatisticses = this.tStatisticsDao.carAll(tReport, tStatistics);
        if(null != tReport.getPpxh()) {
            if (!tReport.getPpxh().trim().isEmpty()) {
                for (int i = 0; i < tStatisticses.size(); i++) {
                    tStatisticses.get(i).setPpxh(tReport.getPpxh());
                }
            }
        }

        return tStatisticses;
    }

    @Override
    public List<TStatistics> firstSelect(TReport tReport, String startDate, String endDate) {
        TStatistics tStatistics = new TStatistics();
        if (null != tReport.getXzqy()) {
            if (!tReport.getXzqy().trim().isEmpty()) {
                tStatistics.setXzqy("xzqy");
                tReport.setXzqy(tReport.getXzqy().trim());
            }
        }
        if (null != tReport.getJcjgmc()) {
            if (!tReport.getJcjgmc().trim().isEmpty()) {
                tStatistics.setJcjgmc("jcjgmc");
                tReport.setJcjgmc(tReport.getJcjgmc().trim());
            }
        }
        if (null != tReport.getJcjl()) {
            if (!tReport.getJcjl().trim().isEmpty()) {
                tStatistics.setJcjl("jcjl");
                tReport.setJcjl(tReport.getJcjl().trim());
            }
        }
        if (null != tReport.getClrllb()) {
            if (!tReport.getClrllb().trim().isEmpty()) {
                tStatistics.setClrllb("clrllb");
                tReport.setClrllb(tReport.getClrllb().trim());
            }
        }
        if (null != tReport.getCllx()) {
            if (!tReport.getCllx().trim().isEmpty()) {
                tStatistics.setCllx("cllx");
                tReport.setCllx(tReport.getCllx().trim());
            }
        }
        if (null != tReport.getPpxh()) {
            if (!tReport.getPpxh().trim().isEmpty()) {
                tStatistics.setPpxh("ppxh");
                tReport.setPpxh(tReport.getPpxh().trim());
            }
        }

        if (null != tReport.getSyxz()) {
            if (!tReport.getSyxz().trim().isEmpty()) {
                tStatistics.setSyxz("syxz");
                tReport.setSyxz(tReport.getSyxz().trim());
            }
        }


        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJyrq("jcrq");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        List list = new ArrayList();
        if ((tReport.getSyxz() == null || "".equals(tReport.getSyxz().trim())) &&(tReport.getXzqy() == null || "".equals(tReport.getXzqy().trim())) && (tReport.getCllx() == null || "".equals(tReport.getCllx().trim())) && (tReport.getPpxh() == null || "".equals(tReport.getPpxh().trim())) && (tReport.getJcjgmc() == null || "".equals(tReport.getJcjgmc().trim())) && (tReport.getClrllb() == null || "".equals(tReport.getClrllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            System.out.println("返回空");
            return list;
        }
        List<TStatistics> tStatisticses = this.tStatisticsDao.firstSelect(tReport, tStatistics);
        if(null != tReport.getPpxh()) {
            if (!tReport.getPpxh().trim().isEmpty()) {
                for (int i = 0; i < tStatisticses.size(); i++) {
                    tStatisticses.get(i).setPpxh(tReport.getPpxh());
                }
            }
        }
        return tStatisticses;
    }

    @Override
    public List<TStatistics> singleSelect(TReport tReport, String startDate, String endDate, String singlePass) {
        TStatistics tStatistics = new TStatistics();
        tStatistics.setSinglePass(singlePass);
        if (null != tReport.getXzqy()) {
            if (!tReport.getXzqy().trim().isEmpty()) {
                tStatistics.setXzqy("xzqy");
                tReport.setXzqy(tReport.getXzqy().trim());
            }
        }
        if (null != tReport.getJcjgmc()) {
            if (!tReport.getJcjgmc().trim().isEmpty()) {
                tStatistics.setJcjgmc("jcjgmc");
                tReport.setJcjgmc(tReport.getJcjgmc().trim());
            }
        }
        if (null != tReport.getJcjl()) {
            if (!tReport.getJcjl().trim().isEmpty()) {
                tStatistics.setJcjl("jcjl");
                tReport.setJcjl(tReport.getJcjl().trim());
            }
        }
        if (null != tReport.getClrllb()) {
            if (!tReport.getClrllb().trim().isEmpty()) {
                tStatistics.setClrllb("clrllb");
                tReport.setClrllb(tReport.getClrllb().trim());
            }
        }
        if (null != tReport.getCllx()) {
            if (!tReport.getCllx().trim().isEmpty()) {
                tStatistics.setCllx("cllx");
                tReport.setCllx(tReport.getCllx().trim());
            }
        }
        if (null != tReport.getPpxh()) {
            if (!tReport.getPpxh().trim().isEmpty()) {
                tStatistics.setPpxh("ppxh");
                tReport.setPpxh(tReport.getPpxh().trim());
            }
        }

        if (null != tReport.getSyxz()) {
            if (!tReport.getSyxz().trim().isEmpty()) {
                tStatistics.setSyxz("syxz");
                tReport.setSyxz(tReport.getSyxz().trim());
            }
        }
        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJyrq("jcrq");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        List list = new ArrayList();
        if ((tReport.getSyxz() == null || "".equals(tReport.getSyxz().trim())) &&(tReport.getXzqy() == null || "".equals(tReport.getXzqy().trim())) && (tReport.getCllx() == null || "".equals(tReport.getCllx().trim())) && (tReport.getPpxh() == null || "".equals(tReport.getPpxh().trim())) && (tReport.getJcjgmc() == null || "".equals(tReport.getJcjgmc().trim())) && (tReport.getClrllb() == null || "".equals(tReport.getClrllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            return list;
        }
        List<TStatistics> tStatisticses = this.tStatisticsDao.singleSelect(tReport, tStatistics);
        if(null != tReport.getPpxh()) {
            if (!tReport.getPpxh().trim().isEmpty()) {
                for (int i = 0; i < tStatisticses.size(); i++) {
                    tStatisticses.get(i).setPpxh(tReport.getPpxh());
                }
            }
        }
        return tStatisticses;
    }

    @Override
    public Integer count(String table) {
        System.out.println(table);
        return this.tStatisticsDao.count(table);
    }

    @Override
    public Map firstorNo(TReport tReport, String startDate, String endDate) {
        TStatistics statistics = new TStatistics();
        HashMap map = new HashMap();
        try {
            if (null != startDate && null != endDate) {
                if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                    statistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    statistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                }
            }
            Integer first = this.tStatisticsDao.first(tReport, statistics);
            Integer firstNo = this.tStatisticsDao.firstNo(tReport, statistics);
            map.put("first",first);
            map.put("firstNo",firstNo);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map singleorNo(TReport tReport, String startDate, String endDate,String singlePass) {
        TStatistics statistics = new TStatistics();
        statistics.setSinglePass(singlePass);
        HashMap map = new HashMap();
        try {
            if (null != startDate && null != endDate) {
                if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                    statistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    statistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                }
            }
            Integer first = this.tStatisticsDao.single(tReport, statistics);
            Integer firstNo = this.tStatisticsDao.singleNo(tReport, statistics);
            map.put("first",first);
            map.put("firstNo",firstNo);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public List<TStatistics> carAllNow(TInspectionReport tInspectionReport, String startDate, String endDate) {
        TStatistics tStatistics = new TStatistics();
        if (null != tInspectionReport.getJcjgmc()) {
            if (!tInspectionReport.getJcjgmc().trim().isEmpty()) {
                tStatistics.setJcjgmc("jyjgmc");
                tInspectionReport.setJyjgmc(tInspectionReport.getJcjgmc().trim());
            }
        }
        if (null != tInspectionReport.getJcjl()) {
            if (!tInspectionReport.getJcjl().trim().isEmpty()) {
                tStatistics.setJcjl("jyjl");
                tInspectionReport.setJyjl(tInspectionReport.getJcjl().trim());
            }
        }
        if (null != tInspectionReport.getRllb()) {
            if (!tInspectionReport.getRllb().trim().isEmpty()) {
                tStatistics.setRllb("rllb");
                tInspectionReport.setRllb(tInspectionReport.getRllb().trim());
            }
        }
        if (null != tInspectionReport.getCllx()) {
            if (!tInspectionReport.getCllx().trim().isEmpty()) {
                tStatistics.setCllx("cllx");
                tInspectionReport.setCllx(tInspectionReport.getCllx().trim());
            }
        }
        if (null != tInspectionReport.getPpxh()) {
            if (!tInspectionReport.getPpxh().trim().isEmpty()) {
                tStatistics.setPpxh("ppxh");
                tInspectionReport.setPpxh(tInspectionReport.getPpxh().trim());
            }
        }

        if (null != tInspectionReport.getSyxz()) {
            if (!tInspectionReport.getSyxz().trim().isEmpty()) {
                tStatistics.setSyxz("syxz");
                tInspectionReport.setSyxz(tInspectionReport.getSyxz().trim());
            }
        }

        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJyrq("jyrq");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        List list = new ArrayList();
        if ((tInspectionReport.getSyxz() == null || "".equals(tInspectionReport.getSyxz().trim())) && (tInspectionReport.getCllx() == null || "".equals(tInspectionReport.getCllx().trim())) && (tInspectionReport.getPpxh() == null || "".equals(tInspectionReport.getPpxh().trim())) && (tInspectionReport.getJyjgmc() == null || "".equals(tInspectionReport.getJyjgmc().trim())) && (tInspectionReport.getRllb() == null || "".equals(tInspectionReport.getRllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            System.out.println("返回空");
            return list;
        }
        List<TStatistics> tStatisticses = this.tStatisticsDao.carAllNow(tInspectionReport, tStatistics);
        if(null != tInspectionReport.getPpxh()) {
            if (!tInspectionReport.getPpxh().trim().isEmpty()) {
                for (int i = 0; i < tStatisticses.size(); i++) {
                    tStatisticses.get(i).setPpxh(tInspectionReport.getPpxh());
                }
            }
        }

        return tStatisticses;
    }

    @Override
    public List<TStatistics> firstSelectNow(TInspectionReport tInspectionReport, String startDate, String endDate) {
        TStatistics tStatistics = new TStatistics();
        if (null != tInspectionReport.getJcjgmc()) {
            if (!tInspectionReport.getJcjgmc().trim().isEmpty()) {
                tStatistics.setJcjgmc("jyjgmc");
                tInspectionReport.setJyjgmc(tInspectionReport.getJcjgmc().trim());
            }
        }
        if (null != tInspectionReport.getJyjl()) {
            if (!tInspectionReport.getJyjl().trim().isEmpty()) {
                tStatistics.setJcjl("jyjl");
                tInspectionReport.setJyjl(tInspectionReport.getJyjl().trim());
            }
        }
        if (null != tInspectionReport.getRllb()) {
            if (!tInspectionReport.getRllb().trim().isEmpty()) {
                tStatistics.setRllb("rllb");
                tInspectionReport.setRllb(tInspectionReport.getRllb().trim());
            }
        }
        if (null != tInspectionReport.getCllx()) {
            if (!tInspectionReport.getCllx().trim().isEmpty()) {
                tStatistics.setCllx("cllx");
                tInspectionReport.setCllx(tInspectionReport.getCllx().trim());
            }
        }
        if (null != tInspectionReport.getPpxh()) {
            if (!tInspectionReport.getPpxh().trim().isEmpty()) {
                tStatistics.setPpxh("ppxh");
                tInspectionReport.setPpxh(tInspectionReport.getPpxh().trim());
            }
        }

        if (null != tInspectionReport.getSyxz()) {
            if (!tInspectionReport.getSyxz().trim().isEmpty()) {
                tStatistics.setSyxz("syxz");
                tInspectionReport.setSyxz(tInspectionReport.getSyxz().trim());
            }
        }

        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJyrq("jyrq");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }
        List list = new ArrayList();
        if ((tInspectionReport.getSyxz() == null || "".equals(tInspectionReport.getSyxz().trim())) && (tInspectionReport.getCllx() == null || "".equals(tInspectionReport.getCllx().trim())) && (tInspectionReport.getPpxh() == null || "".equals(tInspectionReport.getPpxh().trim())) && (tInspectionReport.getJyjgmc() == null || "".equals(tInspectionReport.getJyjgmc().trim())) && (tInspectionReport.getRllb() == null || "".equals(tInspectionReport.getRllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            System.out.println("返回空");
            return list;
        }
        List<TStatistics> tStatisticses = this.tStatisticsDao.firstSelectNow(tInspectionReport, tStatistics);
        if(null != tInspectionReport.getPpxh()) {
            if (!tInspectionReport.getPpxh().trim().isEmpty()) {
                for (int i = 0; i < tStatisticses.size(); i++) {
                    tStatisticses.get(i).setPpxh(tInspectionReport.getPpxh());
                }
            }
        }

        return tStatisticses;
    }

    @Override
    public List<TStatistics> singleSelectNow(TInspectionReport tInspectionReport, String startDate, String endDate, String singlePass) {
        TStatistics tStatistics = new TStatistics();
        String concat1 = "";
        String concat2 = "";
        if(singlePass.equals("kzzdxczd1")){
            tStatistics.setSinglePass("'/',1");
            concat1 = "一轴制动率";
            concat2 = "一轴，行车制动率";
        }else if(singlePass.equals("kzzdxczd2")){
            tStatistics.setSinglePass("'/',1");
            concat1 = "二轴制动率";
            concat2 = "二轴，行车制动率";
        }else if(singlePass.equals("kzzdxczd3")){
            tStatistics.setSinglePass("'/',1");
            concat1 = "三轴制动率";
            concat2 = "三轴，行车制动率";
        }else if(singlePass.equals("kzzdxczd4")){
            tStatistics.setSinglePass("'/',1");
            concat1 = "四轴制动率";
            concat2 = "四轴，行车制动率";
        }else if(singlePass.equals("kzzdbphl1")){
            tStatistics.setSinglePass("'/',-1");
            concat1 = "一轴不平衡率";
            concat2 = "一轴，不平衡率";
        }else if(singlePass.equals("kzzdbphl2")){
            tStatistics.setSinglePass("'/',-1");
            concat1 = "二轴不平衡率";
            concat2 = "二轴，不平衡率";
        }else if(singlePass.equals("kzzdbphl3")){
            tStatistics.setSinglePass("'/',-1");
            concat1 = "三轴不平衡率";
            concat2 = "三轴，不平衡率";
        }else if(singlePass.equals("kzzdbphl4")){
            tStatistics.setSinglePass("'/',-1");
            concat1 = "四轴不平衡率";
            concat2 = "四轴，不平衡率";
        }else if(singlePass.equals("chA1")){
            tStatistics.setSinglePass("'o',-1");
            concat1 = "侧滑";
        }else if(singlePass.equals("zhuxmpd")){
            tStatistics.setSinglePass("'o',-1");
            concat1 = "驻车制动率";
        }else if(singlePass.equals("zhexmpd")){
            tStatistics.setSinglePass("'o',-1");
            concat1 = "整车制动率";
        }else if(singlePass.equals("zwdxmpd")){
            tStatistics.setSinglePass("'o',-1");
            concat1 = "左";
            concat2 = "灯";
        }

        if (null != tInspectionReport.getJcjgmc()) {
            if (!tInspectionReport.getJcjgmc().trim().isEmpty()) {
                tStatistics.setJcjgmc("jyjgmc");
                tInspectionReport.setJyjgmc(tInspectionReport.getJcjgmc().trim());
            }
        }
        if (null != tInspectionReport.getJyjl()) {
            if (!tInspectionReport.getJyjl().trim().isEmpty()) {
                tStatistics.setJcjl("jyjl");
                tInspectionReport.setJyjl(tInspectionReport.getJyjl().trim());
            }
        }
        if (null != tInspectionReport.getRllb()) {
            if (!tInspectionReport.getRllb().trim().isEmpty()) {
                tStatistics.setRllb("rllb");
                tInspectionReport.setRllb(tInspectionReport.getRllb().trim());
            }
        }
        if (null != tInspectionReport.getCllx()) {
            if (!tInspectionReport.getCllx().trim().isEmpty()) {
                tStatistics.setCllx("cllx");
                tInspectionReport.setCllx(tInspectionReport.getCllx().trim());
            }
        }
        if (null != tInspectionReport.getPpxh()) {
            if (!tInspectionReport.getPpxh().trim().isEmpty()) {
                tStatistics.setPpxh("ppxh");
                tInspectionReport.setPpxh(tInspectionReport.getPpxh().trim());
            }
        }

        if (null != tInspectionReport.getSyxz()) {
            if (!tInspectionReport.getSyxz().trim().isEmpty()) {
                tStatistics.setSyxz("syxz");
                tInspectionReport.setSyxz(tInspectionReport.getSyxz().trim());
            }
        }

        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJyrq("jyrq");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }

        if ((tInspectionReport.getSyxz() == null || "".equals(tInspectionReport.getSyxz().trim())) && (tInspectionReport.getCllx() == null || "".equals(tInspectionReport.getCllx().trim())) && (tInspectionReport.getPpxh() == null || "".equals(tInspectionReport.getPpxh().trim())) && (tInspectionReport.getJyjgmc() == null || "".equals(tInspectionReport.getJyjgmc().trim())) && (tInspectionReport.getRllb() == null || "".equals(tInspectionReport.getRllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            System.out.println("返回空");
            return null;
        }
        List<TStatistics> tStatisticses = this.tStatisticsDao.singleSelectNow(tInspectionReport, tStatistics, concat1, concat2);
        if(null != tInspectionReport.getPpxh()) {
            if (!tInspectionReport.getPpxh().trim().isEmpty()) {
                for (int i = 0; i < tStatisticses.size(); i++) {
                    tStatisticses.get(i).setPpxh(tInspectionReport.getPpxh());
                }
            }
        }

        return tStatisticses;
    }

    @Override
    public Map firstorNoNow(TInspectionReport tInspectionReport, String startDate, String endDate) {
        TStatistics statistics = new TStatistics();
        HashMap map = new HashMap();
        try {
            if (null != startDate && null != endDate) {
                if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                    statistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    statistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                }
            }
            Integer first = this.tStatisticsDao.firstNow(tInspectionReport, statistics);
            Integer firstNo = this.tStatisticsDao.firstNoNow(tInspectionReport, statistics);
            map.put("first",first);
            map.put("firstNo",firstNo);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return map;
    }

    @Override
    public Map singleorNoNow(TInspectionReport tInspectionReport, String startDate, String endDate, String singlePass) {
        TStatistics tStatistics = new TStatistics();
        tStatistics.setSinglePass(singlePass);
        String concat1 = "";
        String concat2 = "";
        if(singlePass.equals("kzzdxczd1")){
            tStatistics.setSinglePass("'/',1");
            concat1 = "一轴制动率";
            concat2 = "一轴，行车制动率";
        }else if(singlePass.equals("kzzdxczd2")){
            tStatistics.setSinglePass("'/',1");
            concat1 = "二轴制动率";
            concat2 = "二轴，行车制动率";
        }else if(singlePass.equals("kzzdxczd3")){
            tStatistics.setSinglePass("'/',1");
            concat1 = "三轴制动率";
            concat2 = "三轴，行车制动率";
        }else if(singlePass.equals("kzzdxczd4")){
            tStatistics.setSinglePass("'/',1");
            concat1 = "四轴制动率";
            concat2 = "四轴，行车制动率";
        }else if(singlePass.equals("kzzdbphl1")){
            tStatistics.setSinglePass("'/',-1");
            concat1 = "一轴不平衡率";
            concat2 = "一轴，不平衡率";
        }else if(singlePass.equals("kzzdbphl2")){
            tStatistics.setSinglePass("'/',-1");
            concat1 = "二轴不平衡率";
            concat2 = "二轴，不平衡率";
        }else if(singlePass.equals("kzzdbphl3")){
            tStatistics.setSinglePass("'/',-1");
            concat1 = "三轴不平衡率";
            concat2 = "三轴，不平衡率";
        }else if(singlePass.equals("kzzdbphl4")){
            tStatistics.setSinglePass("'/',-1");
            concat1 = "四轴不平衡率";
            concat2 = "四轴，不平衡率";
        }else if(singlePass.equals("chA1")){
            tStatistics.setSinglePass("'o',-1");
            concat1 = "侧滑";
        }else if(singlePass.equals("zhuxmpd")){
            tStatistics.setSinglePass("'o',-1");
            concat1 = "驻车制动率";
        }else if(singlePass.equals("zhexmpd")){
            tStatistics.setSinglePass("'o',-1");
            concat1 = "整车制动率";
        }else if(singlePass.equals("zwdxmpd")){
            tStatistics.setSinglePass("'o',-1");
            concat1 = "左";
            concat2 = "灯";
        }
        HashMap map = new HashMap();
        try {
            if (null != startDate && null != endDate) {
                if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                }
            }
            Integer first = this.tStatisticsDao.singleNow(tInspectionReport, tStatistics,concat1,concat2);
            Integer firstNo = this.tStatisticsDao.singleNoNow(tInspectionReport, tStatistics,concat1,concat2);
            map.put("first",first);
            map.put("firstNo",firstNo);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return map;
    }

}