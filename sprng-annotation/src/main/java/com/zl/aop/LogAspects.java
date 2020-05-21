package com.zl.aop;

import org.aspectj.lang.annotation.*;

/**
 * @ClassName: LogAspects
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/26 21:40
 * @Version: 1.0
 **/
@Aspect
public class LogAspects {

    //抽取公共切入点表达式
    @Pointcut("execution(public int com.zl.aop.MathUtil.*(..))")
    public void pointCut() {

    }


    @Before(value = "pointCut()")
    public void logStart() {
        System.out.println("除法运行……参数列表：{}");
    }

    @After(value = "pointCut()")
    public void logEnd() {
        System.out.println("除法结束……");
    }

    @AfterReturning(value = "pointCut()")
    public void logReturn() {
        System.out.println("除法正常返回……返回值：{}");
    }

    @AfterThrowing(value = "pointCut()")
    public void logEx() {
        System.out.println("除法发生异常……异常信息：{}");
    }
}
