package com.cg.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Wallet")

public class WalletBean implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int accNumber;
	String custName;
	String custPhoneNo;
	int custAge;
	int custBalance;
	String custPassword;
	//static private int accNumGen = 10000;
	//int x= (int) (Math.random()*10000); 
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber() {
		this.accNumber = accNumber;
	}
	@Override
	public String toString() {
		return "WalletBean [accNumber=" + accNumber + ", custName=" + custName + ", custPhoneNo=" + custPhoneNo
				+ ", custAge=" + custAge + ", custBalance=" + custBalance + ", custPassword=" + custPassword + ", accNumber="
				+accNumber + "]";
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPhoneNo() {
		return custPhoneNo;
	}
	public void setCustPhoneNo(String custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	public int getCustBalance() {
		return custBalance;
	}
	public void setCustBalance(int custBalance) {
		this.custBalance = custBalance;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	
	
}
