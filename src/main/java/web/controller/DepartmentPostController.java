package web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.Department;
import web.entity.DepartmentPost;
import web.service.DepartmentPostService;
/*
 * 12-10
 * 问题：修改，删除
 * 
 */
@Controller
@RequestMapping("/DepartmentPost")
public class DepartmentPostController {
	@Resource(name = "DepartmentPostServiceImpl")
	DepartmentPostService departmentPostService;
	
	@RequestMapping(value = "/Page", method = RequestMethod.GET)
	public String DeptPostPage(Model model) {
		List<DepartmentPost> departmentPost = departmentPostService.getAllDepartmentPosts();
		model.addAttribute("departmentsPost", departmentPost);
		return "production/HRMS_dep_pos";
	}
	
	//添加职位
	//可能没有对应的部门
	@RequestMapping(value = "/addPost", method = RequestMethod.POST)
	public String addPos(Model model, HttpServletRequest request) {

		DepartmentPost deptPost = new DepartmentPost();
		deptPost.setPostNo(request.getParameter("posNo"));
		deptPost.setPostName(request.getParameter("posName"));
		deptPost.setDepartmentNo(request.getParameter("departmentNo"));
		deptPost.setPostSalary(request.getParameter("posSalary"));
		deptPost.setRemark(request.getParameter("remark"));
		
		int result = departmentPostService.addDepartmentPost(deptPost);
		model.addAttribute("addResult", result);
		//return DeptInfo(model);
		return "redirect:/DepartmentPost/Page";
	}
	
	//删除职位
	@RequestMapping(value = "/delPost", method = RequestMethod.GET)
	public String delPos(Model model, HttpServletRequest request) {
		
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			departmentPostService.deleteDepartmentPost(Integer.parseInt(deleteList[i]));
		}
		return "redirect:/DepartmentPost/Page";
	}
	
	//修改职位
	@RequestMapping(value = "/updatePost", method = RequestMethod.POST)
	public String updatePost(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("posId"));
		if(id <0)return "redirect:/DepartmentPost/Page";
		
		DepartmentPost deptPos = new DepartmentPost();
		deptPos.setPostId(Integer.parseInt(request.getParameter("posId")));
		deptPos.setPostNo(request.getParameter("posNo"));
		deptPos.setDepartmentNo(request.getParameter("departmentNo"));
		deptPos.setPostName(request.getParameter("posName"));
		deptPos.setPostSalary(request.getParameter("posSalary"));
		deptPos.setRemark(request.getParameter("remark"));
		
		int result = departmentPostService.updateDepartmentPost(deptPos);
		model.addAttribute("addResult", result);
		
		return "redirect:/DepartmentPost/Page";
	}
}
