package com.zl.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName: Dog
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/21 22:07
 * @Version: 1.0
 **/
public class Dog implements InitializingBean, DisposableBean {

    public Dog() {
        System.out.println("dog构造器");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("dog初始化");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("dog销毁");
    }
}
