package com.zl;

import com.zl.aop.MathUtil;
import com.zl.config.AopConfig;
import com.zl.config.BeanConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName: AopTest
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/26 21:53
 * @Version: 1.0
 **/
public class AopTest {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

    @Test
    public void test1() {
        MathUtil mathUtil = (MathUtil) context.getBean("calculator");
        int div = mathUtil.div(10, 0);
        System.out.println(div);

    }

}
