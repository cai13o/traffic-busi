package cn.com.busi.tack;

import cn.com.busi.entity.*;
import cn.com.busi.mapper.*;
import cn.com.busi.service.HomePageService;
import cn.com.busi.service.TCacheService;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;


@Component
@Slf4j
//@Async //可加在类或方法，开启异步事件的支持
public class SchedulerTask {

    @Resource
    private TInspectionMapper tInspectionMapper;

    @Resource
    private HomePageService homePageService;
    @Resource
    private TCacheService tCacheService;
    Logger log = LoggerFactory.getLogger(SchedulerTask.class);

    //cron表达式：每天执行一次
    @Scheduled(cron = "0 0 3 * * *")
    public void scheduled() throws ParseException {
        log.info("定时任务");
//        List<TInstDevice> tInstDevices = this.tInstDeviceDao.queryAll(new TInstDevice());
//        boolean flag = true;
//        for (TInstDevice tInstDevice:tInstDevices){
//            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
//            Date date = sf.parse(tInstDevice.getNextdate());
//            if (date.getTime() < new Date().getTime()) {
//                List<TCaution> tCautions = this.tCautionDao.queryAll(new TCaution());
//                for (TCaution tCaution:tCautions){
//                    if (tCaution.getSbxh().equals(tInstDevice.getModel())&&tCaution.getSsjg().equals(tInstDevice.getInstitution())){
//                        flag = false;
//                    }
//                }
//                if(flag) {
//                    TCaution tCaution = new TCaution();
//                    tCaution.setId(UUID.randomUUID().toString().replaceAll("-", ""));
//                    tCaution.setJglx("设备检定/校准超过有效期");
//                    tCaution.setSbxh(tInstDevice.getModel());
//                    tCaution.setSsjg(tInstDevice.getInstitution());
//                    tCaution.setLrsj(new Date());
//                    tCautionDao.insert(tCaution);
//                }
//            }
//        }
        Map allNow = this.homePageService.queryAllNow();
        Map syxzByAllNow = this.homePageService.syxzByAllNow();
        Map jcjlByAllNow = this.homePageService.jcjlByAllNow();
        JSONObject jsonObjectallNow = JSONObject.fromObject(allNow);
        JSONObject jsonObjectsyxzByAllNow= JSONObject.fromObject(syxzByAllNow);
        JSONObject jsonObjectjcjlByAllNow= JSONObject.fromObject(jcjlByAllNow);
        TCache tCache = new TCache();
        tCache.setId("pageNow");
        tCache.setResult(jsonObjectallNow.toString());
        TCache tCache2 = new TCache();
        tCache2.setId("syxzByAllNow");
        tCache2.setResult(jsonObjectsyxzByAllNow.toString());
        TCache tCache3 = new TCache();
        tCache3.setId("jcjlByAllNow");
        tCache3.setResult(jsonObjectjcjlByAllNow.toString());
        this.tCacheService.updateByPrimaryKey(tCache);
        this.tCacheService.updateByPrimaryKey(tCache2);
        this.tCacheService.updateByPrimaryKey(tCache3);
        List<TInspection> tInspections = this.tInspectionMapper.createTempTable();
        for (TInspection tIn :
                tInspections) {
            this.tInspectionMapper.insertSelective(tIn);
        }

    }
    //上一次 启动时间点之后每5秒执行一次
    //如果任务时长超过 fixedRate不会启动多个任务实例，只不过会在上次任务执行完后立即启动下一轮
    //除非这个类或 Job 方法用 @Async 注解了，使得任务不在 TaskScheduler 线程池中执行，而是每次创建新线程来执行。
//    @Scheduled(fixedRate = 5000)
//    public void scheduled1() {
//        log.info("使用fixedRate {}");
//    }
    //上一次 结束时间点之后 每5秒执行一次
//    @Scheduled(fixedDelay = 5000)
//    public void scheduled2() {
//        log.info("使用fixedDelay {}");
//    }
    //第一次延迟 10秒执行，之后按照fixedRate的规则每6秒执行
//    @Scheduled(initialDelay = 10000,fixedRate = 6000)
//    public void scheduled3() {
//        log.info("使用initialDelay {}");
//    }
}
