package web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import web.service.AttendanceErrorService;

@Controller
@RequestMapping("/AttendanceError")
public class AttendanceErrorController {
	@Resource(name = "AttendanceErrorServiceImpl")
	AttendanceErrorService attendanceErrorService;

}
