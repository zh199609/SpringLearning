package com.zl.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

/**
 * @ClassName: MyBeanPostProcessor
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/21 22:24
 * @Version: 1.0
 **/
public class MyBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {

    public MyBeanPostProcessor() {
        System.out.println("MyBeanPostProcessor构造器");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization……" + bean + "====" + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization……" + bean + "====" + beanName);

        return bean;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
