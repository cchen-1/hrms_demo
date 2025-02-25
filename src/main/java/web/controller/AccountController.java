package web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.Account;
import web.service.AccountService;

@Controller
@RequestMapping("/Account")
public class AccountController {
	@Resource(name = "AccountServiceImpl")
	AccountService accountService;

	@RequestMapping(value = "/Page", method = RequestMethod.GET)
	public String AccountPage(Model model) {
		List<Account> account = accountService.getAllAccounts();
		model.addAttribute("recruit", account);
		return "production/HRMS_user_management";
	}
	
	//ÃÌº”’À∫≈
	@RequestMapping(value = "/addAccount", method = RequestMethod.POST)
	public String addAccount(Model model, HttpServletRequest request) {
		
		Account account = new Account();
		account.setAccountNo(request.getParameter("accountNo"));
		account.setPassword(request.getParameter("password"));
		account.setStaffNo(request.getParameter("staffNo"));
		
		int result = accountService.addAccount(account);
		model.addAttribute("addResult", result);
		
		return "redirect:/Account/Page";
	}
	
	//…æ≥˝’À∫≈
	@RequestMapping(value = "/delAccount", method = RequestMethod.GET)
	public String delAccount(Model model, HttpServletRequest request) {
		
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			accountService.deleteAccount(Integer.parseInt(deleteList[i]));
		}
		return "redirect:/Account/Page";
	}
	
	//–ﬁ∏ƒ’À∫≈
	@RequestMapping(value = "/updateAccount", method = RequestMethod.POST)
	public String updateAccount(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("accountId"));
		if(id <0)return "redirect:/Account/Page";
		
		Account account = new Account();
		account.setAccountId(Integer.parseInt(request.getParameter("accountId")));
		account.setAccountNo(request.getParameter("accountNo"));
		account.setPassword(request.getParameter("password"));
		account.setStaffNo(request.getParameter("staffNo"));
		
		int result = accountService.updateAccount(account);
		model.addAttribute("addResult", result);
		
		return "redirect:/Account/Page";
	}
	
}
