package com.zl;

import com.zl.config.BeanConfig;
import com.zl.tx.TxConfig;
import com.zl.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestTx {

    AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(TxConfig.class);


    @Test
    public void testTx(){
        UserService bean = context.getBean(UserService.class);
        bean.insertUSer();
    }
}
