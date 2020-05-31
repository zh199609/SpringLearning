package com.zl.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor……………………postProcessBeanFactory");
        int beanDefinitionCount = configurableListableBeanFactory.getBeanDefinitionCount();
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println("当前BeanFactory中有" + beanDefinitionCount + "个Bean");
        System.out.println(Arrays.asList(beanDefinitionNames));
    }
}
