package com.zl.config;

import com.zl.bean.ImportBeanRegistrar;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: MyImportBeanDefinitionRegistrar
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/19 16:36
 * @Version: 1.0
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("ImportBeanRegistrar", new RootBeanDefinition(ImportBeanRegistrar.class));
    }
}
