package com.caicf.beginning.spring.service;

import com.caicf.beginning.spring.entity.Account;

public interface AccountService {

	public void transferMoney(int sourceAccountId,int targetAccountId,double amount);
	
	public void depoistMoney(int accountId,double amount) throws Exception;
	
	public Account getAccount(int id);
	
	
}
