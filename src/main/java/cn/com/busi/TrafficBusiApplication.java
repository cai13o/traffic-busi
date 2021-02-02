package cn.com.busi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@ServletComponentScan
@MapperScan({"cn.com.busi.mapper"})
@EnableScheduling
public class TrafficBusiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrafficBusiApplication.class, args);
    }

}

