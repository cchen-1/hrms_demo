package web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.Department;
import web.service.DepartmentService;
/*
 * 12-10
 * 问题：删除
 * 
 */
@Controller
@RequestMapping("/Department")
public class DepartmentController {
	@Resource(name = "DepartmentServiceImpl")
	DepartmentService departmentService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getDepart(Model model) {
		List<Department> departments = departmentService.getAllDepartments();
		model.addAttribute("departments", departments);
		return "test";
	}

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String addDepart(Model model) {
		Department department = new Department();
		department.setDepartmentName("tt100");
		int result = departmentService.addDepartment(department);
		model.addAttribute("addResult", result);
		return "test";
	}
	
	@RequestMapping(value = "/Info", method = RequestMethod.GET)
	public String DeptInfo(Model model) {
		List<Department> departments = departmentService.getAllDepartments();
		model.addAttribute("departmentsInfo", departments);
		return "production/HRMS_dep_info";
	}
	
	//这里有个bug，刷新页面就会继续添加上次的添加项目（重定向解决了）
	@RequestMapping(value = "/addDept", method = RequestMethod.POST)
	public String addDept(Model model, HttpServletRequest request) {
		Department department = new Department();
		department.setDepartmentNo(request.getParameter("deptNo"));
		department.setDepartmentName(request.getParameter("deptName"));
		department.setRemark(request.getParameter("remark"));
		int result = -1;
		try {
			result = departmentService.addDepartment(department);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		//if(result == -1)return "redirect:/Department/Info";
		model.addAttribute("addResult", result);
		//return DeptInfo(model);
		return "redirect:/Department/Info";
	}
	
	
	//删除
	@RequestMapping(value = "/delDept", method = RequestMethod.GET)
	public String delDept(Model model, HttpServletRequest request) {
		
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		System.out.println("删除条数：" + deleteList.length);
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			departmentService.deleteDepartment(Integer.parseInt(deleteList[i]));
		}
		return DeptInfo(model);
	}
	
	@RequestMapping(value = "/updateDept", method = RequestMethod.POST)
	public String updateDept(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("deptId"));
		if(id <0)return DeptInfo(model);
		Department department = new Department();
		department.setDepartmentId(id);
		department.setDepartmentNo(request.getParameter("deptNo"));
		department.setDepartmentName(request.getParameter("deptName"));
		department.setRemark(request.getParameter("remark"));
		
		int result = departmentService.updateDepartment(department);
		model.addAttribute("addResult", result);
		return DeptInfo(model);
	}
}
