package web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.Tax;
import web.service.TaxService;

@Controller
@Scope(value="prototype")
@RequestMapping("/tax")
public class TaxController {
	
	@Autowired
	private TaxService taxService;
	
	
	@RequestMapping("/findTaxById")
	public String findTaxById(Tax tax,ModelMap modelMap) {
	Tax myTax = taxService.findTaxById(tax.getTaxId());
	if(myTax!=null) {
		modelMap.put("singleTax", myTax);
		return "success";
	}else {
		return "redirect:/test/tax.jsp";
		}
	}
	
	@RequestMapping("/getTaxs")
	public String getTaxs(ModelMap modelMap) {
		List<Tax> taxs = taxService.getTaxs();
		if(!taxs.isEmpty()) {
			modelMap.put("taxs", taxs);
			return "redirect:/tax/Page";
		}else {
			return "redirect:/tax/Page";
		}
	}
	
	@RequestMapping("/addTax")
	public String addTax(Tax tax,ModelMap modelMap) {
		int result = taxService.addTax(tax);
		if(result == 1) {
			List<Tax> taxs = taxService.getTaxs();
			modelMap.put("taxs", taxs);
			return "success";
		}else {
			return "redirect:/test/tax.jsp";
		}
	}
	@RequestMapping("/deleteTaxById")
	public String deleteTaxById(int taxId,ModelMap modelMap) {
		int result = taxService.deleteTaxById(taxId);
		if(result == 1) {
			List<Tax> taxs = taxService.getTaxs();
			modelMap.put("taxs", taxs);
			return "success";
		}else {
			return "redirect:/test/tax.jsp";
		}
	}
	@RequestMapping("/updateTax")
	public String updateTax(Tax tax,ModelMap modelMap) {
		int result = taxService.updateTax(tax);
		if(result == 1) {
			List<Tax> taxs = taxService.getTaxs();
			modelMap.put("taxs", taxs);
			return "success";
		}else {
			return "redirect:/test/tax.jsp";
		}
	}
	
	@RequestMapping("/Page")
	public String TaxPage(ModelMap modelMap) {
		getTaxs(modelMap);
		return "production/HRMS_tax";
	}
}
