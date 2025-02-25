package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.Welfare;
import web.service.WelfareService;

@Controller
@Scope(value="prototype")
@RequestMapping("/welfare")
public class WelfareController {
	
	@Autowired
	private WelfareService welfareService;
	
	@RequestMapping("/findWelfareByName")
	public String findWelfareByNo(Welfare welfare,ModelMap modelMap) { //用welfare对象接受数据
	Welfare myWelfare = welfareService.findWelfareByName(welfare.getName());
	if(myWelfare!=null) {
		modelMap.put("singleWelfare", myWelfare);
		return "success";
	}else{
		return "redirect:/test/welfare.jsp";
		}
	}
	
	@RequestMapping("/getWelfares")
	public String getWelfares(ModelMap modelMap) {
		List<Welfare> welfares = welfareService.getWelfares();
		if(!welfares.isEmpty()) {
			modelMap.put("welfares", welfares);
			return "redirect:/welfare/Page";
		}else {
			return "redirect:/welfare/Page";
		}
	}
	
	@RequestMapping("/addWelfare")
	public String addWelfare(Welfare welfare,ModelMap modelMap) {
		int result = welfareService.addWelfare(welfare);
		if(result == 1) {
			List<Welfare> welfares = welfareService.getWelfares();
			modelMap.put("welfares", welfares);
			return "success";
		}else {
			return "redirect:/test/welfare.jsp";
		}
	}
	
	@RequestMapping("/deleteWelfareById")
	public String deleteWelfareById(int welfareId,ModelMap modelMap) {
		int result = welfareService.deleteWelfareById(welfareId);
		if(result == 1) {
			List<Welfare> welfares = welfareService.getWelfares();
			modelMap.put("welfares", welfares);
			return "redirect:/welfare/Page";
		}else {
			return "redirect:/welfare/Page";
		}
	}

	
	@RequestMapping(value = "/delWelfare", method = RequestMethod.GET)
	public String delWelfare(HttpServletRequest request,ModelMap modelMap) {
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			deleteWelfareById(Integer.parseInt(deleteList[i]),modelMap);
		}
		return "redirect:/welfare/Page";		
	}	
	
	@RequestMapping("/updateWelfare")
	public String updateWelfare(Welfare welfare,ModelMap modelMap) {
		int result = welfareService.updateWelfare(welfare);
		if(result == 1) {
			List<Welfare> welfares = welfareService.getWelfares();
			modelMap.put("welfares", welfares);
			return "redirect:/welfare/Page";
		}else {
			return "redirect:/welfare/Page";
		}
	}
	
	@RequestMapping("/Page")
	public String WelfarePage(ModelMap modelMap) {
		getWelfares(modelMap);
		return "production/HRMS_welfare";
	}
}
