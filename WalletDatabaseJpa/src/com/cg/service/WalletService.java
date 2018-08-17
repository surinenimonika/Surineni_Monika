package com.cg.service;

import com.cg.bean.WalletBean;
import com.cg.dao.WalletDao;

public class WalletService implements IWalletService {
	int custBalance = 0;
WalletDao wdao=new WalletDao();
static String namePattern = "[A-Z]{1}[a-z]{2,10}";
static String numberPattern = "[6-9]{1}[0-9]{9}";
static String passwordPattern = "[A-Z]{1}[a-z]{2,6}(\\d){1,4}(\\W){1}";
	@Override
	public int accountCreation(WalletBean wb) {
		// TODO Auto-generated method stub
		
		return wdao.accountCreation(wb);
	}
	 public  boolean validateCustName(String name)
	 {	if(name.matches(namePattern))
	 		return true;
	 	else{
	 		System.out.println("Invalid name pattern\n(Example: Monika)");
	 		return false;
	 	}
	 }
	 
	 
	 public  boolean validateCustPhoneNumber(String number) {
			if(number.matches(numberPattern))
				return true;
			else{
				System.out.println("phone number should be 10 digits");
				return false;
		}
			}
	 
	 
public boolean validateCustAge(int age) {
	if(age<=110&&age>=1)
		return true;
	else
		System.out.println("Enter valid age");
	return false;
	
}

public  boolean validateCustPassword(String pwd) {
	if(pwd.matches(passwordPattern))
		return true;
	else
		System.out.println("Password should of pattern Monika12@");
	return false;
}

public  boolean validateCustBalance(int custBalance) {
if(custBalance>0)
	return true;
else
	System.out.println("Maintain minimum balance");
return false;
}
public WalletBean getAccDetails(int accNumber)
{
	return wdao.getAccDetails(accNumber);
	
}
@Override
public boolean isValidLogin(WalletBean wbean, String custPassword) {
	// TODO Auto-generated method stub
	return wdao.isValidLogin(wbean, custPassword);
}
@Override
public int depositAmount(int amount, int accNumber, int custbalance) {
	

	custBalance=custBalance+amount;
	return wdao.updateAccBalance(custBalance, accNumber);
}
public int amountWithdraw(int amount, int accNumber, int custBalance) {
	// TODO Auto-generated method stub
	
	
	custBalance=custBalance-amount;
	return wdao.updateAccBalance(custBalance, accNumber);
}
public int showBalance(int accNumber) {
	return wdao.showBalance(accNumber);
}
@Override
public int fundTransfer(int fromaccNumber, int toaccNumber, int amount) {
	// TODO Auto-generated method stub
	WalletBean wb = wdao.getAccDetails(toaccNumber);
	WalletBean wb1=wdao.getAccDetails(fromaccNumber);
	int a = depositAmount(amount,  toaccNumber,wb.getCustBalance() );
	 a = amountWithdraw(amount,  fromaccNumber, wb1.getCustBalance());
	 int b=wdao.updateAccBalance(a, fromaccNumber);
	return wdao.updateAccBalance(a, toaccNumber);
	
}


}
