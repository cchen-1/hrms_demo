package web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;

import web.entity.Absence;
import web.entity.Attendance;
import web.entity.AttendanceError;
import web.entity.RewardPunishment;
import web.service.AbsenceService;
import web.service.AttendanceErrorService;
import web.service.AttendanceService;
import web.service.RewardPunishmentService;

@Controller
@RequestMapping("/Attendance")
public class AttendanceController {
	@Resource(name = "AttendanceServiceImpl")
	AttendanceService attendanceService;
	@Resource(name = "AttendanceErrorServiceImpl")
	AttendanceErrorService attendanceErrorService;
	@Resource(name = "AbsenceServiceImpl")
	AbsenceService absenceService;
	@Resource(name = "RewardPunishmentServiceImpl")
	RewardPunishmentService rewardPunishmentService;
	
	
	@RequestMapping(value="/Page", method = RequestMethod.GET)
	public String AttendancePage(Model model) {
				
		List<Attendance> attendance = attendanceService.getAllAttendances();
		model.addAttribute("attendance", JSON.toJSONString(attendance));
		
		List<AttendanceError> attendanceError = attendanceErrorService.getAllAttendanceErrors();
		model.addAttribute("attendanceError", attendanceError);

		List<Absence> absence = absenceService.getAllAbsences();
		model.addAttribute("absence", absence);

		List<RewardPunishment> rewardPunishment = rewardPunishmentService.getAllRewardPunishments();
		model.addAttribute("rewardPunishment", rewardPunishment);
		
		//多表问题：无
		
		
		return "/production/HRMS_attendance";
	}
	
}
