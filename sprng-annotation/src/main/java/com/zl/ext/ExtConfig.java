package com.zl.ext;

import com.zl.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * BeanPostProcessor:bean后置处理器，bean创建对象初始化前后进行拦截工作
 * <p>
 * BeanFactoryPostProcessor:beanFactory的后置处理器
 * 在BeanFactory标准初始化之后调用，所有的bean定义已经保存加载到beanFactory,但是bean的实例还未创建
 *
 * 1)ioc容器创建对象
 * 2）invokeBeanFactoryPostProcessors(beanFactory);执行BeanFactoryPostProcessors
 *      如何找到所有的BeanFactoryPostProcessor并执行他们的方法
 *          1.直接在BeanFactory中找到所有执行BeanFactoryPostProcessors类型的组件，并执行他们的方法
 *          2.在初始化创建其他组件之前执行
 *  3)BeanDefinitionRegistryPostProcessor extends BeanFactoryPostProcessor
 *      postProcessBeanDefinitionRegistry()方法，在所有bean定义信息将要被加载，bean实例还未被创建的时候
 *      优于BeanFactoryPostProcessor执行，
 *      利用BeanDefinitionRegistryPostProcessor给容器中再额外添加添加一些组件
 *    原理：
 *          1.ioc容器创建
 *          2.refresh-》invokeBeanFactoryPostProcessors(beanFactory);
 *          3.从容器中获取到所有的BeanDefinitionRegistryPostProcessor组件，执行方法postProcessBeanDefinitionRegistry
 *          4.在触发postProcessBeanFactory方法BeanFactoryPostProcessor
 *
 *
 * 监听器：
 *  ApplicationListener<E extends ApplicationEvent>:监听容器中发布的事件，事件驱动模型开发
 *         监听ApplicationEvent及其下面的子事件
 *
 *
 *
 */
@Configuration
@ComponentScan("com.zl.ext")
public class ExtConfig {

    @Bean
    public Person person() {
        return new Person();
    }
}
