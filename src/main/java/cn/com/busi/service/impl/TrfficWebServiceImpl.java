package cn.com.busi.service.impl;

import cn.com.busi.common.BusinessConstant;
import cn.com.busi.service.BusiService;
import cn.com.busi.service.TrfficWebService;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.Map;

@Component
@Slf4j
@WebService(serviceName = "TrfficWebService"
            ,targetNamespace="http://service.busi.com.cn/"
            ,endpointInterface = "cn.com.busi.service.TrfficWebService")
public class TrfficWebServiceImpl implements TrfficWebService {

    private static Gson gson=new Gson();
    @Autowired
    private BusiService busiService;


    @Override
    public String insertZongHeXNJYJLD(String json, byte[] zdjygw, byte[] dgjygw, byte[] dlxjygw) {
        log.info(String.format("【收到的请求报文为data=%s】",json));
        String parsingMessage = parsingMessage(json);
        String s = busiService.insertZongHeXNJYJLD(parsingMessage, zdjygw, dgjygw, dlxjygw);
        log.info(String.format("【响应报文data=%s】",s));
        return s;
    }

    @Override
    public String insertZongHeXNJYBGD(String json) {
        log.info(String.format("【收到的请求报文data=%s】",json));
        String parsingMessage = parsingMessage(json);
        String s = busiService.insertZongHeXNJYBGD(parsingMessage);
        log.info(String.format("【响应报文data=%s】",s));
        return s;
    }

    @Override
    public String insertInstitutionInfo(String json) {
        log.info(String.format("【收到的请求报文data=%s】",json));
        String parsingMessage = parsingMessage(json);
        String s = busiService.insertInstitutionInfo(parsingMessage);
        log.info(String.format("【响应报文data=%s】",s));
        return s;
    }

    @Override
    public String insertInstitutionPerson(String json) {
        log.info(String.format("【收到的请求报文data=%s】",json));
        String parsingMessage = parsingMessage(json);
        String s = busiService.insertInstitutionPerson(parsingMessage);
        log.info(String.format("【响应报文data=%s】",s));
        return s;
    }

    @Override
    public String insertInstitutionDevice(String json) {
        log.info(String.format("【收到的请求报文data=%s】",json));
        String parsingMessage = parsingMessage(json);
        String s = busiService.insertInstitutionDevice(parsingMessage);
        log.info(String.format("【响应报文data=%s】",s));
        return s;
    }

    /**
     *
     * ********************************************
     * @method      :  parsingMessage
     * @description :  TODO
     * @date        :  2020/6/11
     * @author      :  WangXiaoTao
     * @version     :  1.0
     * *********************************************
     */
    public String parsingMessage(String message){

        String json=null;
        try{
            Map map = gson.fromJson(message, Map.class);
            json= String.valueOf(JSONObject.fromObject(map.get(BusinessConstant.JSON)));
        }catch (Exception e){
            log.info("error",e);
        }
        return json;
    }
}
