/**
 * 
 */
package br.gov.pf.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author magalhaes.tmf
 *
 */
@Controller
@RequestMapping("*")
public class IndexController {
 
	/**
	 * @return path
	 */
	@RequestMapping("*")
	public String index(){
		return "index";
	}
	
}
