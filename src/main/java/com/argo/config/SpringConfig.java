package com.argo.config;


import com.argo.config.JDBCConfig;
import com.argo.config.MybatisConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.argo.service")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCConfig.class, MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
