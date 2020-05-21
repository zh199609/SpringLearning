package com.zl.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName: Person
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/19 17:24
 * @Version: 1.0
 **/
public class Person {

    @Value("${person.name}")
    private String name;

    public Person() {
        System.out.println("person构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
