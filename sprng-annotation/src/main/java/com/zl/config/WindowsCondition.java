package com.zl.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.lang.annotation.Annotation;


/**
 * @ClassName: WindowsCondition
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/19 15:22
 * @Version: 1.0
 **/
//判断是否windows系统
public class WindowsCondition implements Condition {


    @Override
    /*
     * @Author i-leizh
     * @Description //TODO
     * @Date 2020/4/19 15:24
     * @Param [conditionContext, annotatedTypeMetadata]
     * conditionContext：判断条件能使用的上下文环境
     * annotatedTypeMetadata：注解信息
     * @return boolean
     **/
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        //ioc使用的beanfactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        //当前环境信息
        Environment environment = conditionContext.getEnvironment();
        //bean定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        BeanDefinition user = registry.getBeanDefinition("user");
        boolean user1 = registry.containsBeanDefinition("user");
        System.out.println("容器中是否有user的定义：" + user1);
        System.out.println("BeanDefinition====" + user);
        return true;
    }
}
