package cn.com.busi.common;


import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * *********************************************
 *
 * @author :  WangXiaoTao
 * @version :  1.0
 *          *********************************************
 * @class :  LoginInterceptor
 * @description :  TODO
 * @date :  2020/06/01
 */
public class LoginInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
    private String username;
    private String password;

    public LoginInterceptor() {
        super(Phase.PREPARE_SEND);
    }

    public LoginInterceptor(String username, String password) {
        //super();
        super(Phase.PREPARE_SEND);
        this.username = username;
        this.password = password;
    }

    @Override
    public void handleMessage(SoapMessage soap) throws Fault {
        List<Header> headers = soap.getHeaders();
        Document doc = DOMUtils.createDocument();
        org.w3c.dom.Element auth = doc.createElementNS("http://service.busi.com.cn/", "SecurityHeader");
        org.w3c.dom.Element UserName = doc.createElement("username");
        org.w3c.dom.Element UserPass = doc.createElement("password");
        UserName.setTextContent(username);
        UserPass.setTextContent(password);
        auth.appendChild(UserName);
        auth.appendChild(UserPass);
        headers.add(0, new Header(new QName("SecurityHeader"), auth));
    }

}