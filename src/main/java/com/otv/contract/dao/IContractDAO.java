package com.otv.contract.dao;

import java.util.List;

import com.otv.model.Contract;

/**
 * 
 */
public interface IContractDAO {

	/**
	 * Add Contract
	 * 
	 * @param  Contract contract
	 */
	public void addContract(Contract contract);
	
	/**
	 * Update Contract
	 * 
	 * @param  Contract contract
	 */
	public void updateContract(Contract contract);
	
	/**
	 * Delete Contract
	 * 
	 * @param  Contract contract
	 */
	public void deleteContract(Contract contract);
	
	/**
	 * Get Contract
	 * 
	 * @param  String Contract Id
	 */
	public Contract getContractById(String id);
	
	/**
	 * Get Contract List
	 * 
	 */
	public List<Contract> getContracts();

	
	
	
	public int countContracts();
}
