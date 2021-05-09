package com.oak.security.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages ="com.oak.security.controller,com.oak.security.configuration" )

public class appConfigure {
	
	@Bean
	public InternalResourceViewResolver resolver() {
	
	InternalResourceViewResolver vr=new InternalResourceViewResolver();
	vr.setPrefix("/WEB-INF/");
	vr.setSuffix(".jsp");
	return vr;

	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	DataSource dataSource() {
	
		DriverManagerDataSource source =new  DriverManagerDataSource();
		source.setUsername("root");
		source.setPassword("");
		source.setUrl("jdbc:mysql://127.0.0.1:3306/secure");
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");		
		return source;
	}
	
	
}
