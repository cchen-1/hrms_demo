package web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import web.entity.Role;
import web.service.RoleService;

@Controller
@Scope(value="prototype")
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	
	@RequestMapping("/findRoleByNo")
	public String findRoleByNo(Role role,ModelMap modelMap) {
		Role myRole = roleService.findRoleByNo(role.getStaffNo());
		if(myRole!=null) {
			modelMap.put("singleRole", myRole);
			return "success";
		}else {
			return "redirect:/test/role.jsp";
		}
	}
	
	@RequestMapping("/getRoles")
	public String getRoles(ModelMap modelMap) {
		List<Role> roles = roleService.getRoles();
		System.out.println(roles);
		if(!roles.isEmpty()) {
			modelMap.put("roles", roles);
			return "success";
		}else {
			return "redirect:/test/role.jsp";
		}
	}
	
	@RequestMapping("/addRole")
	public String addRole(Role role,ModelMap modelMap) {
		int result = roleService.addRole(role);
		if(result == 1) {
			List<Role> roles = roleService.getRoles();
			modelMap.put("roles", roles);
			return "success";
		}else if(result == -1) {
			//TODO 员工查无此人
			return "redirect:/test/role.jsp";
		}else {
			//TODO 已有该员工的角色记录或其他错误
			return "redirect:/test/role.jsp";
		}
	}
	@RequestMapping("/deleteRoleById")
	public String deleteRoleById(int roleId,ModelMap modelMap) {
		int result = roleService.deleteRoleById(roleId);
		if(result == 1) {
			List<Role> roles = roleService.getRoles();
			modelMap.put("roles", roles);
			return "success";
		}else {
			return "redirect:/test/role.jsp";
		}
	}
	@RequestMapping("/updateRole")
	public String updateRole(Role role,ModelMap modelMap) {
		int result = roleService.updateRole(role);
		if(result == 1) {
			List<Role> roles = roleService.getRoles();
			modelMap.put("roles", roles);
			return "success";
		}else {
			return "redirect:/test/role.jsp";
		}
	}
	
	@RequestMapping("/Page")
	public String RolePage() {
		return "/production/HRMS_authority";
	}
	
}
