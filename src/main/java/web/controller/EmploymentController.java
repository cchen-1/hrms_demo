package web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.Employment;
import web.service.EmploymentService;

@Controller
@RequestMapping("/Employment")
public class EmploymentController {
	@Resource(name = "EmploymentServiceImpl")
	EmploymentService employmentService;

	@RequestMapping(value = "/Page", method = RequestMethod.GET)
	public String EmploymentPage(Model model) {
		List<Employment> employment = employmentService.getAllEmployments();
		model.addAttribute("employment", employment);
		for(Employment e : employment) {
			System.out.println(e.getEmploymenyResult());
		}
		return "production/HRMS_employment";
	}
	
	//添加录用信息
	@RequestMapping(value = "/addEmployment", method = RequestMethod.POST)
	public String addEmployment(Model model, HttpServletRequest request) {

		Employment employment = new Employment();
		employment.setName(request.getParameter("name"));
		employment.setSex(request.getParameter("sex"));
		employment.setEmploymentType(request.getParameter("employmentType"));
		employment.setEmploymentPost(request.getParameter("employmentPost"));
		employment.setStatus(request.getParameter("status"));
		employment.setComment(request.getParameter("comment"));
		employment.setRemark(request.getParameter("remark"));
		employment.setEmploymentResult(request.getParameter("employmentResult"));
		
		int result = employmentService.addEmployment(employment);
		model.addAttribute("addResult", result);
		
		return "redirect:/Employment/Page";
	}
	
	//删除录用信息
	@RequestMapping(value = "/delEmployment", method = RequestMethod.GET)
	public String delEmployment(Model model, HttpServletRequest request) {
		
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			employmentService.deleteEmployment(Integer.parseInt(deleteList[i]));
		}
		
		return "redirect:/Employment/Page";
	}
	
	//修改录用信息
	@RequestMapping(value = "/updateEmployment", method = RequestMethod.POST)
	public String updateEmployment(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("posId"));
		if(id <0)return "redirect:/Employment/Page";
		
		Employment employment = new Employment();
		employment.setEmploymentId(Integer.parseInt(request.getParameter("EmploymentId")));
		employment.setName(request.getParameter("name"));
		employment.setSex(request.getParameter("sex"));
		employment.setEmploymentType(request.getParameter("employmentType"));
		employment.setEmploymentPost(request.getParameter("employmentPost"));
		employment.setStatus(request.getParameter("status"));
		employment.setComment(request.getParameter("comment"));
		employment.setRemark(request.getParameter("remark"));
		employment.setEmploymentResult(request.getParameter("employmentResult"));
		
		int result = employmentService.updateEmployment(employment);
		model.addAttribute("addResult", result);
		
		return "redirect:/Employment/Page";
	}
	
}
