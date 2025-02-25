package web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import web.entity.Department;
import web.entity.DepartmentPost;
import web.entity.Staff;
import web.service.DepartmentPostService;
import web.service.DepartmentService;
import web.service.StaffService;

@Controller
@Scope(value="prototype")
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	private StaffService staffService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private DepartmentPostService departmentPostService;
	
	@RequestMapping("/findStaffByNo")
	public String findStaffByNo(Staff staff,ModelMap modelMap) {
	Staff myStaff = staffService.findStaffByNo(staff.getStaffNo());
	if(myStaff!=null) {
		modelMap.put("singleStaff", myStaff);
		return "success";
	}else {
		return "redirect:/test/staff.jsp";
		}
	}
	
	@RequestMapping("/getStaffs")
	public String getStaffs(ModelMap modelMap) {
		List<Staff> staffs = staffService.getStaffs();
		if(!staffs.isEmpty()) {
			modelMap.put("staffs", staffs);
			return "redirect:/staff/Page";
		}else {
			return "redirect:/staff/Page";
		}
	}
	
	@RequestMapping("/addStaff")
	public String addStaff(Staff staff,ModelMap modelMap) {
		int result = staffService.addStaff(staff);
		System.out.println(result);
		if(result == 1) {
			List<Staff> staffs = staffService.getStaffs();
			modelMap.put("staffs", staffs);
			return "redirect:/staff/Page";
		}else {
			return "redirect:/staff/Page";
		}
	}
	
	@RequestMapping("/deleteStaffById")
	public String deleteStaffById(int staffId,ModelMap modelMap) {
		int result = staffService.deleteStaffById(staffId);
		if(result == 1) {
			List<Staff> staffs = staffService.getStaffs();
			modelMap.put("staffs", staffs);
			return "redirect:/staff/Page";
		}else {
			return "redirect:/staff/Page";
		}
	}
	
	@RequestMapping("/delStaff")
	public String delStaff(HttpServletRequest request,ModelMap modelMap) {
		String deleteStr = request.getParameter("deleteStr");
		deleteStaffById(Integer.parseInt(deleteStr),modelMap);
		return "redirect:/staff/Page";
	}	
	
	@RequestMapping("/updateStaff")
	public String updateStaff(Staff staff,ModelMap modelMap) {
		int result = staffService.updateStaff(staff);
		if(result == 1) {
			List<Staff> staffs = staffService.getStaffs();
			modelMap.put("staffs", staffs);
			return "redirect:/staff/Page";
		}else {
			return "redirect:/staff/Page";
		}
	}
	
	@RequestMapping ( "/select" ) 
	@ResponseBody
	public List<List<Object>> select() {
		List<List<Object>> lists = new ArrayList<List<Object>>(); 
		
		List departments = departmentService.getAllDepartments();
		Department department = new Department(0,"0","请选择","");
		departments.add(0,department);
		
		List posts = departmentPostService.getAllDepartmentPosts(); //点击department后，执行另一个方法，获取选中的字段对应的post，输出到第二个下拉框中
		DepartmentPost departmentPost = new DepartmentPost(0,"0","0","请选择","0","");
		posts.add(0,departmentPost);
		
		lists.add(departments);
		lists.add(posts);
		
		return lists;
	}


	
	//public String StaffPage(Staff staff,ModelMap modelMap) {	
	@RequestMapping(value = "/Page",method = RequestMethod.GET)
	public String StaffPage(ModelMap modelMap) {
		System.out.println("进入职员管理");
		getStaffs(modelMap);
		return "production/HRMS_staff_info";
	}
	
	//报表
	@RequestMapping("/report")
	public String StaffReport() {
		return "/production/HRMS_staff_report";
	}
	
	//个人信息管理
	@RequestMapping("/Self")
	public String SelfAccount() {
		return "/production/HRMS_user_info";
	}
}
