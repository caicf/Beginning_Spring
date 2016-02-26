package com.caicf.beginning.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.caicf.beginning.spring.dao.AccountDao;
import com.caicf.beginning.spring.impl.AccountDaoImpl;
import com.caicf.beginning.spring.impl.AccountServiceDaoImpl;
import com.caicf.beginning.spring.service.AccountService;

@Configuration
public class BeanConfiguration {

	@Bean
	public AccountService accountService(){
		AccountServiceDaoImpl bean=new AccountServiceDaoImpl();
		bean.setAccountDao(accountDao());
		return bean;
	}
	
	@Bean
	public AccountDao accountDao() {
		AccountDaoImpl bean=new AccountDaoImpl();
		return bean;
	}
}
