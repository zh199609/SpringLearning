package com.zl.bean;

/**
 * @ClassName: Car
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/21 21:53
 * @Version: 1.0
 **/
public class Car {

    public Car() {
        System.out.println("Car构造器");
    }

    public void init() {
        System.out.println("Car初始化");
    }

    public void detory() {
        System.out.println("Car销毁");
    }
}
