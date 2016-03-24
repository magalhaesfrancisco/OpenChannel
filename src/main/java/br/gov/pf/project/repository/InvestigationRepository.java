/**
 * 
 */
package br.gov.pf.project.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import org.springframework.stereotype.Repository;

import br.gov.pf.project.model.InvestigationModel;

/**
 * Persistence class for InvestigationModel
 * 
 * @author magalhaes.tmf
 *
 */
@Repository
public class InvestigationRepository {
	
	/**
	 * EntityManager storage with Wildfly auto management
	 */
	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	private EntityManager manager;
   
	/**
	 * InvestigationModel instance by id 
	 * @param id
	 * @return InvestigationModel
	 */	
	public InvestigationModel getModel(int id){
		return manager.find(InvestigationModel.class, id);		
	}
	
	/**
	 * InvestigationModel list
	 * @return List<InvestigationModel>
	 */
	public List<InvestigationModel> listModel(){
		 
		return manager.createQuery("SELECT t FROM InvestigationModel t ORDER BY t.interestName ", InvestigationModel.class).getResultList();	
	}

}
