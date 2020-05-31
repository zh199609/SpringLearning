package com.zl.ext;

import com.zl.bean.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    /*
    BeanDefinitionRegistry Bean定义信息的保存中心，以后beanfactory就是按照BeanDefinitionRegistry里面
    保存的定义信息创建bean实例
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor------postProcessBeanDefinitionRegistry---bean数量:" + registry.getBeanDefinitionCount());
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Car.class);
//        BeanDefinitionBuilder.rootBeanDefinition()
        registry.registerBeanDefinition("hello", rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor----postProcessBeanFactory--bean数量：" + beanFactory.getBeanDefinitionCount());
    }
}
