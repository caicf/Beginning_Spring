package com.caicf.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.caicf.beginning.spring.beans.BeanConfiguration;
import com.caicf.beginning.spring.service.AccountService;

public class AccountServiceTest {

	private AnnotationConfigApplicationContext applicationContext;
	
	@Before
	public void setUp() throws Exception {
		applicationContext=new AnnotationConfigApplicationContext(BeanConfiguration.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		AccountService accountService=applicationContext.getBean("accountService",AccountService.class);
		System.out.println("======================");
		System.out.println(accountService.getAccount(1).getBalance());
		System.out.println(accountService.getAccount(2).getBalance());
		
		accountService.transferMoney(1, 2, 3);
		
		System.out.println("======================");
		System.out.println(accountService.getAccount(1).getBalance());
		System.out.println(accountService.getAccount(2).getBalance());
	}

}
