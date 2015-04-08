package com.otv.managed.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

import com.otv.contract.service.IContractService;
import com.otv.model.Contract;

/**
 * 
 */
@ManagedBean(name="contractBean")
@RequestScoped
public class ContractManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	//Spring Contract Service is injected...
	@ManagedProperty(value="#{ContractService}")
	IContractService contractService;
	
	List<Contract> contractList;
	
	private String id;
	private String name;
	
	
	/**
	 * Add contract
	 * 
	 * @return String - Response Message
	 */
	public String addContract() {
		try {
			Contract contract = new Contract();
			contract.setId(getId());
			contract.setName(getName());
			getContractService().addContract(contract);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	/**
	 * Reset Fields
	 * 
	 */
	public void reset() {
		this.setId("0");
		this.setName("");
		
	}
	
	/**
	 * Get Contract List
	 * 
	 * @return List - Contract List
	 */
	public List<Contract> getContractList() {
		contractList = new ArrayList<Contract>();
		contractList.addAll(getContractService().getContracts());
		return contractList;
	}
	
	public int getTotalContracts(){
		return getContractService().countContracts();
	}
	
	
	public String editContract(Contract contract){
		System.out.println(contract.getId());
		return null;
	}
	
	public String editContract(){
		
		return null;
	}
	
	/**
	 * Get Contract Service
	 * 
	 * @return IContractService - Contract Service
	 */
	public IContractService getContractService() {
		return contractService;
	}

	/**
	 * Set Contract Service
	 * 
	 * @param IContractService - Contract Service
	 */
	public void setContractService(IContractService contractService) {
		this.contractService = contractService;
	}
	
	/**
	 * Set Contract List
	 * 
	 * @param List - Contract List
	 */
	public void setContractList(List<Contract> contractList) {
		this.contractList = contractList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}