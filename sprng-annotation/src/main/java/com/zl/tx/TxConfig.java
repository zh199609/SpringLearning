package com.zl.tx;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 声明式事务：
 *
 * @EnableTransactionManagement   开始注解事务
 * 注入PlatformTransactionManager 事务管理器
 *
 *
 *
 * 原理：
 *  1）：@EnableTransactionManagement利用
 *          TransactionManagementConfigurationSelector给容器中导入组件
 *              导入AutoProxyRegistrar 和 ProxyTransactionManagementConfiguration
 * 2）：AutoProxyRegistrar给容器中注册一个 InfrastructureAdvisorAutoProxyCreator 组件【后置处理器】
 *          利用后置处理器机制在对象创建之后，包装对象，返回一个代理对象（增强器），代理对象执行方法利用拦截器链进行调用
 * 3）：ProxyTransactionManagementConfiguration：
 *          1.给容器中注册事务增强器，事务增强器要用事务注解的信息 AnnotationTransactionAttributeSource解析事务注解
 *              TransactionInterceptor 事务拦截器  保存了事务属性信息，事务管理器
 *              他是一个MethodInterceptor 方法拦截器  在目标方法执行的时候，执行拦截器链  事务拦截器
 *                  1)先获取事务相关属性
 *                  2)在获取PlatformTransactionManager
 *                  3)
 *          2.
 *
 */
@Configuration
@ComponentScan("com.zl.tx")
@EnableTransactionManagement
public class TxConfig {

    //数据源
    @Bean
    public DataSource dataSource() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("root");
        dataSource.setPassword("Zh199609!");
        dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://39.106.141.9:3306/zl?useUnicode=true&characterEncoding=utf-8&useSSL=false");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public PlatformTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

}
