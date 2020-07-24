package cn.com.busi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @BelongsProject: traffic-busi
 * @BelongsPackage: cn.com.busi.annotation
 * @Author: Administrator
 * @CreateTime: 2020-07-23 09:18
 * @Description: 用来跳过验证的PassToken
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface PassToken {
    boolean required() default true;
}
