/**
 * 
 */
package br.gov.pf.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.gov.pf.project.model.*;
import br.gov.pf.project.repository.*;

/**
 *Essa é a classe que o Spring vai gerenciar (Controller para o usuário)
 *
 * @author magalhaes.tmf
 * @Controller Spring management
 * @RequestMapping Access path
 * 
 */
@Controller
@RequestMapping("/investigation")
public class InvestigationController {
	
	/**
	 * @Autowired ResultModel instance injection
	 */
	@Autowired
	public ResultModel resultModel;
 
	/**
	 * @Autowired InvestigationRepository instance injection
	 */
	@Autowired
	public InvestigationRepository investigationRepository;
	
	/**
	 * Call view investigation.jsp
	 * @return ModelAndView
	 */
	@RequestMapping(value ="/view", method= RequestMethod.GET)
	public ModelAndView displayView(){
		return new ModelAndView("investigation");
	}
 
	/**
	 * Display InvestigationModel list
	 * @return List<InvestigationModel>
	 */
	@RequestMapping(value="/list", method= RequestMethod.GET)
	public @ResponseBody List<InvestigationModel> displayList(){
		return investigationRepository.listModel();
	}
 
	/**
	 * Display InvestigationModel by id
	 * @return InvestigationModel
	 */
	@RequestMapping(value="/list/{id}", method= RequestMethod.GET)
	public @ResponseBody InvestigationModel displayModel(@PathVariable int id) {
		return investigationRepository.getModel(id);
	}

}
