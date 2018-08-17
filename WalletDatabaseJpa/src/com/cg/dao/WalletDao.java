package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.bean.WalletBean;
import com.cg.util.DButil;

public class WalletDao implements IWalletDao{
EntityManager em;
	
	
	

	public WalletDao() {
		em = DButil.getEntityManager();
	EntityManagerFactory  factory = Persistence.createEntityManagerFactory("JPA-PU");
	
	EntityManager  em = factory.createEntityManager();
	}
	@Override
	public int accountCreation(WalletBean wb) {
		
		em.getTransaction().begin();
		em.persist(wb);
		em.getTransaction().commit();
		return wb.getAccNumber();
	}
		
	public boolean isValidLogin(WalletBean wbean, String custPassword) {
		
		try {
		if(wbean.getCustPassword().equals(custPassword))
		{
			return true;
			
					}
		}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
		return false;	

}

	public int updateAccBalance(int amount, int accNumber) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		WalletBean ref=em.find(WalletBean.class, accNumber);
		
		ref.setCustBalance(amount);
		em.merge(ref);
		em.getTransaction().commit();
		return ref.getCustBalance();
	}
		
		
	public int showBalance(int accNumber) {
		// TODO Auto-generated method stub
		WalletBean w = getAccDetails(accNumber);
		return w.getCustBalance();
		
	}

	public WalletBean getAccDetails(int accNumber) {
		WalletBean wb=em.find(WalletBean.class, accNumber);
		return wb;
		 }

	
	}
