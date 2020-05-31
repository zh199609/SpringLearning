package com.zl;

import com.zl.ext.ExtConfig;
import com.zl.tx.TxConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOC_EXT {
 
    @Test
    public void test111() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ExtConfig.class);
        context.close();
    }

    public static void main(String[] args) {
        System.out.println("aaaaaaaaa");
    }
}
