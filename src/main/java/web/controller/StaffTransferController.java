package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.StaffTransfer;
import web.service.StaffTransferService;

/*
 * 
 * 注意：此界面可能无法进行增加和修改操作，不知道可否删除
 * 
 */
@Controller
@Scope(value="prototype")
@RequestMapping("/staffTransfer")
public class StaffTransferController {
	
	@Autowired
	private StaffTransferService staffTransferService;
	
	
	@RequestMapping("/findStaffTransferById")
	public String findStaffTransferById(StaffTransfer staffTransfer,ModelMap modelMap) {
	StaffTransfer myStaffTransfer = staffTransferService.findStaffTransferById(staffTransfer.getStaffTransferId());
	if(myStaffTransfer!=null) {
		modelMap.put("singleStaffTransfer", myStaffTransfer);
		return "success";
	}else {
		return "redirect:/test/staffTransfer.jsp";
		}
	}
	
	@RequestMapping("/getStaffTransfers")
	public String getStaffTransfers(ModelMap modelMap) {
		List<StaffTransfer> staffTransfers = staffTransferService.getStaffTransfers();
		if(!staffTransfers.isEmpty()) {
			modelMap.put("staffTransfers", staffTransfers);
			return "success";
		}else {
			return "redirect:/test/staffTransfer.jsp";
		}
	}
	
	@RequestMapping("/addStaffTransfer")
	public String addStaffTransfer(StaffTransfer staffTransfer,ModelMap modelMap) {
		int result = staffTransferService.addStaffTransfer(staffTransfer);
		if(result == 1) {
			List<StaffTransfer> staffTransfers = staffTransferService.getStaffTransfers();
			modelMap.put("staffTransfers", staffTransfers);
			return "redirect:/staffTransfer/Page"; 
		}else if(result == -1){
			//TODO 员工查无此人
			return "redirect:/staffTransfer/Page"; 
			
		}else {
			//TODO 其他错误
			return "redirect:/staffTransfer/Page";  
		}
	}
	@RequestMapping("/deleteStaffTransferById")
	public String deleteStaffTransferById(int staffTransferId,ModelMap modelMap) {
		int result = staffTransferService.deleteStaffTransferById(staffTransferId);
		if(result == 1) {
			List<StaffTransfer> staffTransfers = staffTransferService.getStaffTransfers();
			modelMap.put("staffTransfers", staffTransfers);
			return "success";//"redirect:/staffTransfer/Page";  
		}else {
			return "failed";//"redirect:/staffTransfer/Page";  
		}
	}

	@RequestMapping(value = "/delTransfer", method = RequestMethod.GET)
	public String delTransfer(HttpServletRequest request,ModelMap modelMap)
	{
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			deleteStaffTransferById(Integer.parseInt(deleteList[i]),modelMap);
		}
		return "redirect:/staffTransfer/Page";		
	}
	
	/*@RequestMapping("/updateStaffTransfer")
	public String updateStaffTransfer(StaffTransfer staffTransfer,ModelMap modelMap) {
		int result = staffTransferService.updateStaffTransfer(staffTransfer);
		if(result == 1) {
			List<StaffTransfer> staffTransfers = staffTransferService.getStaffTransfers();
			modelMap.put("staffTransfers", staffTransfers);
			return "success";
		}else {
			return "redirect:/test/staffTransfer.jsp";
		}
	}*/
	
	@RequestMapping("/Page")
	public String StaffTransferPage(ModelMap modelMap) {
		getStaffTransfers(modelMap);
		return "production/HRMS_staff_redeploy";
	}
}
