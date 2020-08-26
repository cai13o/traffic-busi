package cn.com.busi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @BelongsProject: traffic-busi
 * @BelongsPackage: cn.com.busi.annotation
 * @Author: Administrator
 * @CreateTime: 2020-08-12 15:14
 * @Description: 标注需要监控的方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
    String value() default "";
}
