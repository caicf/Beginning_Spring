package com.caicf.beginning.spring.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.caicf.beginning.spring.dao.AccountDao;
import com.caicf.beginning.spring.entity.Account;

public class AccountDaoImpl implements AccountDao {

	private Map<Integer, Account> accountMap=new HashMap<Integer, Account>();
	{
		Account account1=new Account();
		account1.setId(1);
		account1.setOwnerName("tom");
		account1.setBalance(5);
		
		Account account2=new Account();
		account2.setId(2);
		account2.setOwnerName("ccf");
		account2.setBalance(10);
		
		accountMap.put(account1.getId(), account1);
		accountMap.put(account2.getId(), account2);
	}
	
	public void insert(Account account) {
		
	}

	public void update(Account account) {
		accountMap.put(account.getId(), account);
	}

	public void update(List<Account> accounts) {
		// TODO Auto-generated method stub

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public Account find(int id) {
		return accountMap.get(id);
	}

	public List<Account> find(List<Integer> accountIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> find(String ownerName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Account> find(boolean locked) {
		// TODO Auto-generated method stub
		return null;
	}

}
