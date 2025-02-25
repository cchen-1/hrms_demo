package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.StaffWelfare;
import web.service.StaffWelfareService;

@Controller
@Scope(value="prototype")
@RequestMapping("/staffWelfare")
public class StaffWelfareController {
	
	@Autowired
	private StaffWelfareService staffWelfareService;
	
	
	@RequestMapping("/findStaffWelfareByNo")
	public String findStaffWelfareByNo(StaffWelfare staffWelfare,ModelMap modelMap) {
	StaffWelfare myStaffWelfare = staffWelfareService.findStaffWelfareByNo(staffWelfare.getStaffNo());
	if(myStaffWelfare!=null) {
		modelMap.put("singleStaffWelfare", myStaffWelfare);
		return "success";
	}else {
		return "redirect:/test/staffWelfare.jsp";
		}
	}
	
	@RequestMapping("/getStaffWelfares")
	public String getStaffWelfares(ModelMap modelMap) {
		List<StaffWelfare> staffWelfares = staffWelfareService.getStaffWelfares();
		if(!staffWelfares.isEmpty()) {
			modelMap.put("staffWelfares", staffWelfares);
			return "redirect:/staffWelfare/Page";
		}else {
			return "redirect:/staffWelfare/Page";
		}
	}
	
	@RequestMapping("/addStaffWelfare")
	public String addStaffWelfare(StaffWelfare staffWelfare,ModelMap modelMap) {
		int result = staffWelfareService.addStaffWelfare(staffWelfare);
		if(result == 1) {
			List<StaffWelfare> staffWelfares = staffWelfareService.getStaffWelfares();
			modelMap.put("staffWelfares", staffWelfares);
			return "success";
		}else if(result==-1) {
			//TODO 员工查无此人
			return "redirect:/staffWelfare/Page"; 
		}else {
			//TODO 已有该员工福利记录或其他错误
			return "redirect:/staffWelfare/Page";
		}
	}
	@RequestMapping("/deleteStaffWelfareById")
	public String deleteStaffWelfareById(int staffWelfareId,ModelMap modelMap) {
		int result = staffWelfareService.deleteStaffWelfareById(staffWelfareId);
		if(result == 1) {
			List<StaffWelfare> staffWelfares = staffWelfareService.getStaffWelfares();
			modelMap.put("staffWelfares", staffWelfares);
			return "success";
		}else {
			return "redirect:/staffWelfare/Page";
		}
	}
	
	@RequestMapping(value = "/delStaffWelfare", method = RequestMethod.GET)
	public String delStaffWelfare(HttpServletRequest request,ModelMap modelMap) {
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			deleteStaffWelfareById(Integer.parseInt(deleteList[i]),modelMap);
		}
		return "redirect:/staffWelfare/Page";		
	}	
	
	@RequestMapping("/updateStaffWelfare")
	public String updateStaffWelfare(StaffWelfare staffWelfare,ModelMap modelMap) {
		int result = staffWelfareService.updateStaffWelfare(staffWelfare);
		if(result == 1) {
			List<StaffWelfare> staffWelfares = staffWelfareService.getStaffWelfares();
			modelMap.put("staffWelfares", staffWelfares);
			return "redirect:/staffWelfare/Page";
		}else {
			return "redirect:/staffWelfare/Page";
		}
	}
	
	@RequestMapping("/Page")
	public String StaffWelfaresPage(ModelMap modelMap) {
		getStaffWelfares(modelMap);
		return "production/HRMS_salary_conf";
	}
}
