package org.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.model.User;

@Configuration
@ComponentScan
public class JavaConfig {
	@Bean
	public User user(){
		return new User("001","Jack");
	}
}
