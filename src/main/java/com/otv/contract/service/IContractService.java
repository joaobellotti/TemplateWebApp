package com.otv.contract.service;

import java.util.List;

import com.otv.model.Contract;

/**
 * 
 *
 */
public interface IContractService {
	
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
	 * @param  int Contract Id
	 */
	public Contract getContractById(String id);
	
	/**
	 * Get Contract List
	 * 
	 * @return List - Contract list
	 */
	public List<Contract> getContracts();

	public int countContracts();
}
