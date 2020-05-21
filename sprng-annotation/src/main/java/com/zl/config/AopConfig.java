package com.zl.config;

import com.zl.aop.LogAspects;
import com.zl.aop.MathUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName: AopConfig
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/26 21:34
 * @Version: 1.0
 **/
@Configuration
@EnableAspectJAutoProxy//开启基于注解的aop
public class AopConfig {

    @Bean
    public MathUtil calculator() {
        return new MathUtil();
    }


    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }
}
