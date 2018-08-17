package com.cg.dao;

import com.cg.bean.WalletBean;

public interface IWalletDao {
	public int accountCreation(WalletBean wb);
	public boolean isValidLogin(WalletBean wbean, String custPassword);
	public int updateAccBalance(int amount, int accNumber);
	public int showBalance(int accNumber);
	
}
