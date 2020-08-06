package cn.com.busi.service.impl;

import cn.com.busi.entity.TCartype;
import cn.com.busi.entity.TReport;
import cn.com.busi.entity.TSintype;
import cn.com.busi.entity.TStatistics;
import cn.com.busi.mapper.TCartypeDao;
import cn.com.busi.mapper.TStatisticsDao;
import cn.com.busi.service.TStatisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    TStatistics tStatistics;

    @Override
    public List<Map> carAll(TReport tReport, String startDate, String endDate) {
        tStatistics = new TStatistics();
//       System.out.println("".equals(xzqy.trim()));
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


        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJcrq("jcrq");
                } catch (ParseException e) {
                    throw new RuntimeException();
                }
            }
        }

        if ((tReport.getXzqy() == null || "".equals(tReport.getXzqy().trim())) && (tReport.getCllx() == null || "".equals(tReport.getCllx().trim())) && (tReport.getPpxh() == null || "".equals(tReport.getPpxh().trim())) && (tReport.getJcjgmc() == null || "".equals(tReport.getJcjgmc().trim())) && (tReport.getClrllb() == null || "".equals(tReport.getClrllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            return null;
        }
        return this.tStatisticsDao.carAll(tReport, tStatistics);
    }

    @Override
    public List<Map> firstSelect(TReport tReport, String startDate, String endDate) {
        tStatistics = new TStatistics();
//       System.out.println("".equals(xzqy.trim()));
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


        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJcrq("jcrq");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }

        if ((tReport.getXzqy() == null || "".equals(tReport.getXzqy().trim())) && (tReport.getCllx() == null || "".equals(tReport.getCllx().trim())) && (tReport.getPpxh() == null || "".equals(tReport.getPpxh().trim())) && (tReport.getJcjgmc() == null || "".equals(tReport.getJcjgmc().trim())) && (tReport.getClrllb() == null || "".equals(tReport.getClrllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            System.out.println("返回空");
            return null;
        }
        return this.tStatisticsDao.firstSelect(tReport, tStatistics);
    }

    @Override
    public List<Map> singleSelect(TReport tReport, String startDate, String endDate, String singlePass) {
        tStatistics = new TStatistics();
//       System.out.println("".equals(xzqy.trim()));
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
        if (null != startDate && null != endDate) {
            if (!startDate.trim().isEmpty() && !endDate.trim().isEmpty()) {
                try {
                    tStatistics.setStartDate(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
                    tStatistics.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
                    tStatistics.setJcrq("jcrq");
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }

        if ((tReport.getXzqy() == null || "".equals(tReport.getXzqy().trim())) && (tReport.getCllx() == null || "".equals(tReport.getCllx().trim())) && (tReport.getPpxh() == null || "".equals(tReport.getPpxh().trim())) && (tReport.getJcjgmc() == null || "".equals(tReport.getJcjgmc().trim())) && (tReport.getClrllb() == null || "".equals(tReport.getClrllb().trim())) && (startDate == null || "".equals(startDate.trim())) && (endDate == null || "".equals(endDate.trim()))) {
            return null;
        }
        return this.tStatisticsDao.singleSelect(tReport, tStatistics);
    }

    @Override
    public Integer count(String table) {
        System.out.println(table);
        return this.tStatisticsDao.count(table);
    }


}