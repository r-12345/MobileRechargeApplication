package com.cg.mra.service;

import com.cg.mra.beans.Account;
import com.cg.mra.dao.AccountDao;
import com.cg.mra.dao.AccountDaoImpl;

public class AccountserviceImpl implements AccountService {

	AccountDao dao;
	
	public AccountserviceImpl() {
		// TODO Auto-generated constructor stub
		dao = new AccountDaoImpl();
	}
	
	@Override
	public Account getAccountDetails(String mobileNo) {
		// TODO Auto-generated method stub
		
		return dao.getAccountDetails(mobileNo);
	}

	@Override
	public double rechargeAccount(String mobileNo, Double rechargeAmount) {
		// TODO Auto-generated method stub
		return dao.rechargeAccount(mobileNo, rechargeAmount);
	}
	
	
	
	

}
