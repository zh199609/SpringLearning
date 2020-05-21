package com.zl.config;

import com.zl.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName: BeanConfigOfPropertyValues
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/21 22:50
 * @Version: 1.0
 **/
@Configuration
//加载外部文件
@PropertySource(value = "classpath:/person.properties")
public class BeanConfigOfPropertyValues {

    @Bean
    public Person person() {
        return new Person();
    }
}
