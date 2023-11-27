package com.argo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public class JDBCConfig {
    @Value("${jdbc.driver}")
    public String driver;
    @Value("${jdbc.url}")
    public String url;
    @Value("${jdbc.username}")
    public String username;
    @Value("${jdbc.password}")
    public String password;

    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setPassword(password);
        dataSource.setUsername(username);
        dataSource.setUrl(url);
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(DataSource dataSource){
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(dataSource);
        return manager;
    }
}
