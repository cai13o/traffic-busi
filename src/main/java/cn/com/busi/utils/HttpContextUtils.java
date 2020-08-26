package cn.com.busi.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @BelongsProject: traffic-busi
 * @BelongsPackage: cn.com.busi.utils
 * @Author: Administrator
 * @CreateTime: 2020-08-12 15:50
 * @Description:
 */
public class HttpContextUtils {
    public static HttpServletRequest getHttpServletRequest() {
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }
}
