package web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.Recruit;
import web.service.RecruitService;

@Controller
@RequestMapping("/Recruit")
public class RecruitController {
	@Resource(name = "RecruitServiceImpl")
	RecruitService recruitService;

	@RequestMapping(value = "/Page", method = RequestMethod.GET)
	public String RecruitPage(Model model) {
		List<Recruit> recruit = recruitService.getAllRecruits();
		model.addAttribute("recruit", recruit);
		return "production/HRMS_recruit_info";
	}
	
	//添加招牌信息
	@RequestMapping(value = "/addRecruit", method = RequestMethod.POST)
	public String addRecruit(Model model, HttpServletRequest request) {
		
		Recruit recruit = new Recruit();
		recruit.setTitle(request.getParameter("title"));
		recruit.setRecruitPost(request.getParameter("recruitPost"));
		recruit.setRecruitNumber(Integer.parseInt(request.getParameter("recruitNumber")));
		recruit.setPublishDate(request.getParameter("publishDate"));
		recruit.setEndDate(request.getParameter("endDate"));
		
		int result = recruitService.addRecruit(recruit);
		model.addAttribute("addResult", result);
		
		return "redirect:/Recruit/Page";
	}
	
	//删除招聘信息
	@RequestMapping(value = "/delRecruit", method = RequestMethod.GET)
	public String delRecruit(Model model, HttpServletRequest request) {
		
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			recruitService.deleteRecruit(Integer.parseInt(deleteList[i]));
		}
		return "redirect:/Recruit/Page";
	}
	
	//修改招聘信息
	@RequestMapping(value = "/updateRecruit", method = RequestMethod.POST)
	public String updateRecruit(Model model, HttpServletRequest request) {
		int id = Integer.parseInt(request.getParameter("recruitId"));
		if(id <0)return "redirect:/Recruit/Page";
		
		Recruit recruit = new Recruit();
		recruit.setRecruitId(Integer.parseInt(request.getParameter("recruitId")));
		recruit.setTitle(request.getParameter("title"));
		recruit.setRecruitPost(request.getParameter("recruitPost"));
		recruit.setRecruitNumber(Integer.parseInt(request.getParameter("recruitNumber")));
		recruit.setPublishDate(request.getParameter("publishDate"));
		recruit.setEndDate(request.getParameter("endDate"));
		
		int result = recruitService.updateRecruit(recruit);
		model.addAttribute("addResult", result);
		
		return "redirect:/Recruit/Page";
	}
}
