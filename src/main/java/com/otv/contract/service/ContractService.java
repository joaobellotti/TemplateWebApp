package com.otv.contract.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.otv.contract.dao.IContractDAO;
import com.otv.model.Contract;

/**
 * 

 */
@Transactional(readOnly = true)
public class ContractService implements IContractService {

	// ContractDAO is injected...
	IContractDAO contractDAO;
	
	/**
	 * Add Contract
	 * 
	 * @param  Contract contract
	 */
	@Transactional(readOnly = false)
	public void addContract(Contract contract) {
		getContractDAO().addContract(contract);
	}

	/**
	 * Delete Contract
	 * 
	 * @param  Contract contract
	 */
	@Transactional(readOnly = false)
	public void deleteContract(Contract contract) {
		getContractDAO().deleteContract(contract);
	}
	
	/**
	 * Update Contract
	 * 
	 * @param  Contract contract
	 */
	@Transactional(readOnly = false)
	public void updateContract(Contract contract) {
		getContractDAO().updateContract(contract);
	}
	
	/**
	 * Get Contract
	 * 
	 * @param  int Contract Id
	 */
	public Contract getContractById(String id) {
		return getContractDAO().getContractById(id);
	}

	/**
	 * Get Contract List
	 * 
	 */
	public List<Contract> getContracts() {	
		return getContractDAO().getContracts();
	}

	/**
	 * Get Contract DAO
	 * 
	 * @return IContractDAO - Contract DAO
	 */
	public IContractDAO getContractDAO() {
		return contractDAO;
	}

	/**
	 * Set Contract DAO
	 * 
	 * @param IContractDAO - Contract DAO
	 */
	public void setContractDAO(IContractDAO contractDAO) {
		this.contractDAO = contractDAO;
	}

	public int countContracts() {
		return getContractDAO().countContracts();
	}

}
