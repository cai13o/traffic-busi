package cn.com.busi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @BelongsProject: traffic-busi
 * @BelongsPackage: cn.com.busi.entity
 * @Author: Administrator
 * @CreateTime: 2020-08-12 15:22
 * @Description:
 */
@Data
public class SysLog {
    private Integer id;
    private String username;
    private String operation;
    private Integer time;
    private String method;
    private String params;
    private String ip;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
}
