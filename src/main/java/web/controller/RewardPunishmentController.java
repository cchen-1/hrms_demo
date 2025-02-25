package web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import web.service.RewardPunishmentService;

@Controller
@RequestMapping("/RewardPunishment")
public class RewardPunishmentController {
	@Resource(name = "RewardPunishmentServiceImpl")
	RewardPunishmentService rewardPunishmentService;
	
}
