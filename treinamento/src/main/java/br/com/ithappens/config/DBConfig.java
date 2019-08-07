package br.com.ithappens.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("br.com.ithappens.mapper")
@EnableTransactionManagement
public class DBConfig {
}