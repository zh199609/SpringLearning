package com.zl;

import com.zl.config.BeanConfigOfLiftCyle;
import com.zl.config.BeanConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.PanelUI;

/**
 * @ClassName: PropertyValuesTesty
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/21 22:51
 * @Version: 1.0
 **/
public class PropertyValuesTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigOfPropertyValues.class);

    @Test
    public void test(){
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
            System.out.println(context.getBean(beanDefinitionName));
        }
    }


}
