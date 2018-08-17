package com.cg.service;

import com.cg.bean.WalletBean;

public interface IWalletService {
	public int accountCreation(WalletBean wb);
	public boolean isValidLogin(WalletBean wbean, String custPassword);
	public int depositAmount(int amount, int accNumber, int custBalance);
	public int amountWithdraw(int amount, int accNumber, int custBalance);
	public int showBalance(int accNumber);
	public int fundTransfer(int fromaccNumber, int toaccNumber, int amount);
	
	

}
