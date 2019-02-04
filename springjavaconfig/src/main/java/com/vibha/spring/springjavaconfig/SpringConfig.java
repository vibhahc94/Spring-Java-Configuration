package com.vibha.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(DaoConfig.class)
public class SpringConfig {
	
	//this method is similar to configure a bean in xml configuration file
	
	
	@Bean(initMethod="init",destroyMethod="destroy")
	@Scope("prototype")
	public Service service()
	{
		return new Service();
	}

}
