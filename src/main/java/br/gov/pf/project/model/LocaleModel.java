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
@Table(name="locale_state")
@Entity
public class LocaleModel {
	
	@Id
	@Column(name="id")
	private Integer id;
	 
	@Column(name="state_name")
	private String stateName;
	
	@Column(name="state_iso")
	private String stateIso;

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
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	/**
	 * @return the stateIso
	 */
	public String getStateIso() {
		return stateIso;
	}

	/**
	 * @param stateIso the stateIso to set
	 */
	public void setStateIso(String stateIso) {
		this.stateIso = stateIso;
	}

}
