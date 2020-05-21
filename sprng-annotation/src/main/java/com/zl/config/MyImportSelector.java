package com.zl.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName: MyImportSelector
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/19 16:23
 * @Version: 1.0
 **/
public class MyImportSelector implements ImportSelector {
    @Override
    //annotationMetadata：当前标注@Import注解的类的所有的注解信息
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        return new String[]{"com.zl.bean.SelectImportBean"};
    }
}
