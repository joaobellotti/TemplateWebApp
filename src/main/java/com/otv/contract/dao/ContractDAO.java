package com.otv.contract.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.otv.model.Contract;

/**
 * 

 */

public class ContractDAO implements IContractDAO {
	
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	/**
	 * Add Contract
	 * 
	 * @param  Contract contract
	 */
	public void addContract(Contract contract) {
		getSessionFactory().getCurrentSession().save(contract);
	}

	/**
	 * Delete Contract
	 * 
	 * @param  Contract contract
	 */
	public void deleteContract(Contract contract) {
		getSessionFactory().getCurrentSession().delete(contract);
	}

	/**
	 * Update Contract
	 * 
	 * @param  Contract contract
	 */
	public void updateContract(Contract contract) {
		getSessionFactory().getCurrentSession().update(contract);
	}

	/**
	 * Get Contract
	 * 
	 * @param  int Contract Id
	 * @return Contract 
	 */
	public Contract getContractById(String id) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Contract where id=?")
									        .setParameter(0, id).list();
		return (Contract)list.get(0);
	}

	/**
	 * Get Contract List
	 * 
	 * @return List - Contract list
	 */
	public List<Contract> getContracts() {
		
		List list = getSessionFactory().getCurrentSession().createQuery("from Contract").list();
		return list.subList(0, 10);
	}

	public int countContracts() {
		List list = getSessionFactory().getCurrentSession().createQuery("select count(c.id) from Contract c").list();
		
		return ((Long) list.get(0)).intValue();
	}

}
