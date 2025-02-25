package web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.entity.TalentPool;
import web.service.TalentPoolService;

@Controller
@Scope(value="prototype")
@RequestMapping("/talentPool")
public class TalentPoolController {
	
	@Autowired
	private TalentPoolService talentPoolService;
	
	
	@RequestMapping("/findTalentPoolById")
	public String findTalentPoolById(TalentPool talentPool,ModelMap modelMap) {
	TalentPool myTalentPool = talentPoolService.findTalentPoolById(talentPool.getTalentPoolId());
	if(myTalentPool!=null) {
		modelMap.put("singleTalentPool", myTalentPool);
		return "success";
	}else {
		return "redirect:/test/talentPool.jsp";
		}
	}
	
	@RequestMapping("/getTalentPools")
	public String getTalentPools(ModelMap modelMap) {
		List<TalentPool> talentPools = talentPoolService.getTalentPools();
		if(!talentPools.isEmpty()) {
			modelMap.put("talentPools", talentPools);
			return "redirect:/talentPool/Page";
		}else {
			return "redirect:/talentPool/Page";
		}
	}
	
	@RequestMapping("/addTalentPool")
	public String addTalentPool(TalentPool talentPool,ModelMap modelMap) {
		int result = talentPoolService.addTalentPool(talentPool);
		if(result == 1) {
			List<TalentPool> talentPools = talentPoolService.getTalentPools();
			modelMap.put("talentPools", talentPools);
			return "success";
		}else {
			return "redirect:/talentPool/Page";
		}
	}
	@RequestMapping("/deleteTalentPoolById")
	public String deleteTalentPoolById(int talentPoolId,ModelMap modelMap) {
		int result = talentPoolService.deleteTalentPoolById(talentPoolId);
		if(result == 1) {
			List<TalentPool> talentPools = talentPoolService.getTalentPools();
			modelMap.put("talentPools", talentPools);
			return "success";
		}else {
			return "redirect:/test/talentPool.jsp";
		}
	}
	@RequestMapping("/updateTalentPool")
	public String updateTalentPool(TalentPool talentPool,ModelMap modelMap) {
		int result = talentPoolService.updateTalentPool(talentPool);
		if(result == 1) {
			List<TalentPool> talentPools = talentPoolService.getTalentPools();
			modelMap.put("talentPools", talentPools);
			return "success";
		}else {
			return "redirect:/test/talentPool.jsp";
		}
	}
	
	@RequestMapping(value = "/delTalentPool", method = RequestMethod.GET)
	public String delTalentPool(HttpServletRequest request,ModelMap modelMap) {
		String deleteStr = request.getParameter("deleteStr");
		String[] deleteList = deleteStr.split(",");
		for(int i=0; i<deleteList.length; ++i)
		{
			System.out.println(deleteList[i]);
			deleteTalentPoolById(Integer.parseInt(deleteList[i]),modelMap);
		}
		return "redirect:/talentPool/Page";		
	}	
	
	@RequestMapping("/Page")
	public String TalentPoolPage(ModelMap modelMap) {
		getTalentPools(modelMap);
		return "production/HRMS_talent_pool";
	}
}
