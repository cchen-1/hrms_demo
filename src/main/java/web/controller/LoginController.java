package web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import web.entity.Account;
import web.service.AccountService;


@Controller
@RequestMapping("/Login")
public class LoginController {
	
	@Resource(name = "AccountServiceImpl")
	AccountService accountService;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		
		return "/production/HRMS_login";
	}
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		
        ModelAndView modelAndView = new ModelAndView();
        
		String accountNo = request.getParameter("accountNo");
		String password = request.getParameter("password");
		System.out.println("用户名：" + accountNo);
		
		List<Account> accounts = accountService.getAllAccounts();
		Account user = null;
		for(Account account : accounts)
		{
			if(account.getAccountNo().equals(accountNo))
			{
				user = account;
				break;
			}
		}
		
		if(user != null) {
			if(user.getPassword().equals(password))
			{
				HttpSession session = request.getSession(true);
				session.setAttribute("username", accountNo);
				modelAndView.setViewName("redirect:/Login/index");
			}else
			{
				modelAndView.addObject("error", "密码错误");
				modelAndView.setViewName("/production/HRMS_login");
			}
		}else
		{
			modelAndView.addObject("error", "用户不存在");
			modelAndView.setViewName("/production/HRMS_login");
		}
		
		return modelAndView;
	}
	
		@RequestMapping(value = "/index", method = RequestMethod.GET)
		public String indexPage(HttpServletRequest request) {
			
	        return "/production/HRMS_index";
		}
	
	//Login这个controller一直都在啊(使用重定向哦❤)
	@RequestMapping(value = "/HRMS_dep_info", method = RequestMethod.GET)
	public String HRMS_dep_info(HttpServletRequest request) {
		
        return "/production/HRMS_dep_info";
	}
}
