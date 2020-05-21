package com.zl.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName: PersonFactoryBean
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/19 17:25
 * @Version: 1.0
 **/
public class PersonFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
