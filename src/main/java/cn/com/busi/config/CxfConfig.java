package cn.com.busi.config;

import cn.com.busi.common.AuthInterceptor;
import cn.com.busi.service.TrfficWebService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private TrfficWebService trfficWebService;

    @Autowired
    private BusiConfig busiConfig;
    @Bean
    public Endpoint endpoint() {

        EndpointImpl endpoint = new EndpointImpl(bus,trfficWebService);

        endpoint.publish("/webService");//接口发布在 /NetbarServices 目录下
        //服务终端加拦截器
//        endpoint.getInInterceptors().add(new AuthInterceptor(busiConfig));
      //  return Endpoint.publish("http://127.0.0.1:9999/TransportWebService.asmx",trfficWebService);
        return endpoint;
    }
}
