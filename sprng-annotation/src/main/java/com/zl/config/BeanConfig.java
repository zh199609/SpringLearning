package com.zl.config;

import com.zl.bean.Color;
import com.zl.bean.PersonFactoryBean;
import com.zl.bean.User;
import org.springframework.context.annotation.*;

/**
 * @ClassName: BeanCOnfig
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/19 14:30
 * @Version: 1.0
 **/
//@Configuration
@ComponentScan("com.zl")
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class BeanConfig {

    @Bean
    public User user() {
        return new User("张磊", 24);
    }

    @Bean
    @Conditional(value = WindowsCondition.class)
    public User userOne() {
        return new User("张磊", 24);
    }

    @Bean
    public PersonFactoryBean personFactoryBean() {
        return new PersonFactoryBean();
    }
}
