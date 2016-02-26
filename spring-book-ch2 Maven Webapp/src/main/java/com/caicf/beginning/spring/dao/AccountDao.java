package com.caicf.beginning.spring.dao;

import java.util.List;

import com.caicf.beginning.spring.entity.Account;

public interface AccountDao {

	public void insert(Account account);
	public void update(Account account);
	public void update(List<Account> accounts); 
	public void delete(int id);
	public Account find(int id);
	public List<Account> find(List<Integer> accountIds);
	public List<Account> find(String ownerName);
	public List<Account> find(boolean locked);
}
