package com.fj.jwebframework.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 安全配置项
 * @author apple
 *
 */
@SpringBootConfiguration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/**
	 * 配置
	 */
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/static/**").permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/")
			.failureUrl("/login?error=true")
			.permitAll()
			.and()
			.logout()
			.logoutUrl("/logout")
			.permitAll();
		
		http.csrf().disable();
			
	}
	
	
	/**
	 * 指定密码加密方式
	 */
	@Bean
	public static PasswordEncoder passwordEncode() {
		return new BCryptPasswordEncoder();
	}
	
}
