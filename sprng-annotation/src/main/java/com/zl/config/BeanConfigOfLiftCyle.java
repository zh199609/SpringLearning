package com.zl.config;

import com.zl.bean.Car;
import com.zl.bean.Dog;
import com.zl.bean.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: BeanConfigOfLiftCyle
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/21 21:24
 * @Version: 1.0
 **/
/*
    bean的生命周期
        bean创建---初始化---销毁

    自定义初始化和销毁方法，
    1）init-method
    2)InitializingBean&
    3)BeanPostProcessor:bean的后置处理器
        在bean初始化前后处理
     Spring底层对BeanPostProcessor的使用
        bean赋值，注入其他组件，@Autowired,生命周期函数注解功能，@Async……



 */
@Configuration
public class BeanConfigOfLiftCyle {

    //    @Bean(initMethod = "init", destroyMethod = "detory")
    @Bean
    public Car car() {
        return new Car();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
