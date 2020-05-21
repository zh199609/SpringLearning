package com.zl;

import com.zl.config.BeanConfig;
import com.zl.config.BeanConfigOfLiftCyle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**j
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/21 21:56
 * @Version: 1.0
 **/
public class LifeTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigOfLiftCyle.class);


    @Test
    public void test() {
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
