package web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import web.service.AbsenceService;

@Controller
@RequestMapping("/Absence")
public class AbsenceController {
	@Resource(name = "AbsenceServiceImpl")
	AbsenceService absenceService;

}
