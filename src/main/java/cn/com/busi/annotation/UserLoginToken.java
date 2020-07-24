package cn.com.busi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @BelongsProject: traffic-busi
 * @BelongsPackage: cn.com.busi.annotation
 * @Author: Administrator
 * @CreateTime: 2020-07-23 09:12
 * @Description: 用于登录后才能操作的token
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {
    boolean required() default true;
}

/*RetentionPolicy.RUNTIME:这种类型的Annotations将被JVM保留,
所以他们能在运行时被JVM或其他使用反射机制的代码所读取和使用。*/
