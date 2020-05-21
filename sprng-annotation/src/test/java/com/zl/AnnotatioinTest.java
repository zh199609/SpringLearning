package com.zl;

import com.zl.config.BeanConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: AnnotatioinTest
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/19 14:32
 * @Version: 1.0
 **/
public class AnnotatioinTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName + "===" + context.getBean(beanDefinitionName));
        }
    }

    /*
    import导入外部组件
     */
    @Test
    public void importTest() {
        printBeans();
    }

    public void printBeans() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName + "===" + context.getBean(beanDefinitionName));
        }
    }
}
