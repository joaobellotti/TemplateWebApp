package com.otv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 *
 */
@Entity
@Table(name="MCONFL")
public class Contract {

	private String id;
	private String name;
	
	
	/**
	 * Get Contract Id
	 * 
	 * @return Contract - Contract Id
	 */
	@Id
	@Column(name="CONA_CONTRACT_NO", unique = true, nullable = false)
	public String getId() {
		return id;
	}
	
	/**
	 * Set Contract Id
	 * 
	 * @param String - Contract Id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Get Contract Name
	 * 
	 * @return String - Contract Name
	 */
	@Column(name="CONA_CONTRACT_NAME", nullable = false)
	public String getName() {
		return name;
	}
	
	/**
	 * Set Contract Name
	 * 
	 * @param String - Contract Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
