package cn.com.busi.common;

import cn.com.busi.config.BusiConfig;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.saaj.SAAJInInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.w3c.dom.NodeList;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;

/**
 *
 * *********************************************
 * @class       :  AuthInterceptor
 * @description :  用户校验类
 * @date        :  2020/6/4
 * @author      :  WangXiaoTao
 * @version     :  1.0
 * *********************************************
 */
@Component
public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private static final Logger logger = LoggerFactory.getLogger(AuthInterceptor.class);
    private SAAJInInterceptor saa = new SAAJInInterceptor();


    private BusiConfig busiConfig;

    private String username;

    private String password;
    public AuthInterceptor() {
        super(Phase.PRE_PROTOCOL);
      //  getAfter().add(SAAJInInterceptor.class.getName());
    }

    public AuthInterceptor(BusiConfig busiConfig) {
        super(Phase.PRE_PROTOCOL);
        this.busiConfig=busiConfig;
        this.username = busiConfig.getUserName();
        this.password = busiConfig.getPassWord();
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {

        SOAPMessage mess = message.getContent(SOAPMessage.class);
        if(mess==null){
            saa.handleMessage(message);
            mess=message.getContent(SOAPMessage.class);
        }
        SOAPHeader header =null;
        try {
            header = mess.getSOAPHeader();
        } catch (SOAPException e) {
            logger.error("getSOAPheader error:{}",e.getMessage(),e);
            e.printStackTrace();
        }
        if(header==null){
            throw new Fault(new IllegalAccessException("找不到Header,无法验证用户信息"));
        }

        NodeList name = header.getElementsByTagName("username");
        NodeList pwd = header.getElementsByTagName("password");
        if(name.getLength()<1){
            throw new Fault(new IllegalAccessException("没有上送用户名,无法验证用户信息"));
        }
        if(pwd.getLength()<1){
            throw new Fault(new IllegalAccessException("没有上送密码,无法验证用户信息"));
        }
        String userName = name.item(0).getTextContent().trim();
        String passWord = pwd.item(0).getTextContent().trim();
        System.out.println("userName="+userName+",pwd="+passWord);
        System.out.println("userName="+username+",pwd="+password);

        if(username.equals(userName) && password.equals(passWord)){
            logger.debug("admin auth success");
        }else {
            SOAPException soapException = new SOAPException("认证错误");
            logger.debug("admin auth failed");
            throw new Fault(soapException);
        }
    }
}
