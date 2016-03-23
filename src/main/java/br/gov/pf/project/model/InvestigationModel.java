/**
 * 
 */
package br.gov.pf.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author magalhaes.tmf
 *
 */
@Table(name="investigation_interest")
@Entity
public class InvestigationModel {
	
	@Id
	@Column(name="id")
	private Integer id;
	 
	@Column(name="interest_name")
	private String interestName;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the interestName
	 */
	public String getInterestName() {
		return interestName;
	}

	/**
	 * @param interestName the interestName to set
	 */
	public void setInterestName(String interestName) {
		this.interestName = interestName;
	}

}
