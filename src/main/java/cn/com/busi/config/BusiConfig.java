package cn.com.busi.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties("webservices")
@Component
public class BusiConfig {
    String userName;
    String passWord;
}
