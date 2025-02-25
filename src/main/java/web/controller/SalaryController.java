package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.Salary;
import web.service.SalaryService;
@Controller
@Scope(value="prototype")
@RequestMapping("/salary")
public class SalaryController {
	@Autowired
	private SalaryService salaryService;
	
	@RequestMapping("/findSalaryByNo")  //1.增加一个判断是否有该no的方法  2.前端实现按钮，下拉框等控件
	public String findSalaryByNo(Salary salary,ModelMap modelMap) {
	List<Salary> salarys = salaryService.findSalaryByNo(salary.getStaffNo());
	if(!salarys.isEmpty()) {
		modelMap.put("salarys", salarys);
		return "success";
		}else {
			return "redirect:/test/salary.jsp";
		}
	}
	
	@RequestMapping("/getSalarys")
	public String getSalarys(ModelMap modelMap) {
		List<Salary> salarys = salaryService.getSalarys();
		if(!salarys.isEmpty()) {
		modelMap.put("salarys", salarys);
		return "redirect:/salary/Page";
		}else {
			return "redirect:/salary/Page";
		}
	}
	
	@RequestMapping("/addSalary")
	public String addSalary(Salary salary,ModelMap modelMap) {
		int result = salaryService.addSalary(salary);
		if(result == 1) {
			List<Salary> salarys = salaryService.getSalarys();
			modelMap.put("salarys", salarys);
			return "success";
		}else if(result == -1){
			//TODO 员工查无此人
			return "redirect:/test/salary.jsp";
		}else {
			//TODO 其他错误
			return "redirect:/test/salary.jsp";
		}
	}
	@RequestMapping("/deleteSalaryById")
	public String deleteSalaryById(int salaryId,ModelMap modelMap) {
		int result = salaryService.deleteSalaryById(salaryId);
		if(result == 1) {
			List<Salary> salarys = salaryService.getSalarys();
			modelMap.put("salarys", salarys);
			return "success";
		}else {
			return "redirect:/salary/Pag";
		}
	}
	
	@RequestMapping("/delSalary")
	public String delSalary(HttpServletRequest request,ModelMap modelMap) {
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			deleteSalaryById(Integer.parseInt(deleteList[i]),modelMap);
		}
		return "redirect:/salary/Page";	
	}
	
	
	@RequestMapping("/Page")
	public String SalaryPage(ModelMap modelMap) {
		getSalarys(modelMap);
		return "/production/HRMS_staff_salary";
	}
	
	//工资配置
	@RequestMapping("/Conf")
	public String SalaryConf() {
		return "/production/HRMS_salary_conf";
	}
	
	//报表
	@RequestMapping("/report")
	public String SalaryReport() {
		return "production/HRMS_salary_report";
	}
}
