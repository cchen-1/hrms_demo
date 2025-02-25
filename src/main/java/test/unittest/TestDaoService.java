package test.unittest;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import web.entity.Absence;
import web.entity.Account;
import web.entity.Attendance;
import web.entity.AttendanceError;
import web.entity.Department;
import web.entity.DepartmentPost;
import web.entity.Employment;
import web.entity.Recruit;
import web.entity.RewardPunishment;
import web.service.AbsenceService;
import web.service.AccountService;
import web.service.AttendanceErrorService;
import web.service.AttendanceService;
import web.service.DepartmentPostService;
import web.service.DepartmentService;
import web.service.EmploymentService;
import web.service.RecruitService;
import web.service.RewardPunishmentService;

public class TestDaoService {

	// 1��absence����Է���
	public void absenceUnit(ApplicationContext context) {
		AbsenceService absenceService = (AbsenceService) context.getBean("AbsenceServiceImpl");

		Absence absence = new Absence();
		absence.setStaffNo("testNo");
		absence.setBeginDate(new Timestamp(new Date().getTime()));
		absence.setEndDate(new Timestamp(new Date().getTime()));
		absence.setReason("testReason");
		int addResult = absenceService.addAbsence(absence);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<Absence> absences = absenceService.getAllAbsences();
		for (Absence absenceTemp : absences) {
			System.out.println(absenceTemp.getAbsenceId() + " " + absenceTemp.getStaffNo() + " "
					+ absenceTemp.getBeginDate() + " " + absenceTemp.getEndDate() + " " + absenceTemp.getReason());
		}
		System.out.println("#select: select " + absences.size() + " data..\n");

		int absenceId = absences.get(absences.size() - 1).getAbsenceId();
		absence.setAbsenceId(absenceId);
		absence.setStaffNo("testNo");
		absence.setBeginDate(new Timestamp(new Date().getTime()));
		absence.setEndDate(new Timestamp(new Date().getTime()));
		absence.setReason("testUpdate");
		int updateResult = absenceService.updateAbsence(absence);
		absences = absenceService.getAllAbsences();
		for (Absence absenceTemp : absences) {
			System.out.println(absenceTemp.getAbsenceId() + " " + absenceTemp.getStaffNo() + " "
					+ absenceTemp.getBeginDate() + " " + absenceTemp.getEndDate() + " " + absenceTemp.getReason());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = absenceService.deleteAbsence(absenceId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	// 2��account����Է���
	public void accountUnit(ApplicationContext context) {
		AccountService accountService = (AccountService) context.getBean("AccountServiceImpl");

		Account account = new Account();
		account.setPassword("testPass");
		account.setAccountNo("100");
		account.setStaffNo("testNo");
		int addResult = accountService.addAccount(account);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<Account> accounts = accountService.getAllAccounts();
		for (Account accountTemp : accounts) {
			System.out.println(accountTemp.getAccountId() + " " + accountTemp.getPassword() + " "
					+ accountTemp.getAccountNo() + " " + accountTemp.getStaffNo());
		}
		System.out.println("#select: select " + accounts.size() + " data..\n");

		int accountId = accounts.get(accounts.size() - 1).getAccountId();
		account.setAccountId(accountId);
		account.setPassword("testUpdate");
		account.setAccountNo("110");
		account.setStaffNo("testNo");
		int updateResult = accountService.updateAccount(account);
		accounts = accountService.getAllAccounts();
		for (Account accountTemp : accounts) {
			System.out.println(accountTemp.getAccountId() + " " + accountTemp.getPassword() + " "
					+ accountTemp.getAccountNo() + " " + accountTemp.getStaffNo());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = accountService.deleteAccount(accountId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	// 3��attendance����Է���
	public void attendanceUnit(ApplicationContext context) {
		AttendanceService attendanceService = (AttendanceService) context.getBean("AttendanceServiceImpl");

		Attendance attendance = new Attendance();
		attendance.setStaffNo("testNo");
		attendance.setClockDate(new Timestamp(new Date().getTime()));
		attendance.setClockInDate(new Timestamp(new Date().getTime()));
		attendance.setClockOffDate(new Timestamp(new Date().getTime()));
		int addResult = attendanceService.addAttendance(attendance);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<Attendance> attendances = attendanceService.getAllAttendances();
		for (Attendance attendanceTemp : attendances) {
			System.out.println(attendanceTemp.getAttendanceId() + " " + attendanceTemp.getStaffNo() + " "
					+ attendanceTemp.getClockDate() + " " + attendanceTemp.getClockInDate() + " "
					+ attendanceTemp.getClockOffDate());
		}
		System.out.println("#select: select " + attendances.size() + " data..\n");

		int attendanceId = attendances.get(attendances.size() - 1).getAttendanceId();
		attendance.setAttendanceId(attendanceId);
		attendance.setStaffNo("testNo");
		attendance.setClockDate(new Timestamp(new Date().getTime()));
		attendance.setClockInDate(new Timestamp(new Date().getTime()));
		attendance.setClockOffDate(new Timestamp(new Date().getTime()));
		int updateResult = attendanceService.updateAttendance(attendance);
		attendances = attendanceService.getAllAttendances();
		for (Attendance attendanceTemp : attendances) {
			System.out.println(attendanceTemp.getAttendanceId() + " " + attendanceTemp.getStaffNo() + " "
					+ attendanceTemp.getClockDate() + " " + attendanceTemp.getClockInDate() + " "
					+ attendanceTemp.getClockOffDate());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = attendanceService.deleteAttendance(attendanceId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	// 4��attendanceerror����Է���
	public void attendanceErrorUnit(ApplicationContext context) {
		AttendanceErrorService attendanceErrorService = (AttendanceErrorService) context
				.getBean("AttendanceErrorServiceImpl");

		AttendanceError attendanceError = new AttendanceError();
		attendanceError.setStaffNo("testNo");
		attendanceError.setErrorDate(new Timestamp(new Date().getTime()));
		attendanceError.setErrorType("testType");
		attendanceError.setErrorReason("testReason");
		int addResult = attendanceErrorService.addAttendanceError(attendanceError);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<AttendanceError> attendanceErrors = attendanceErrorService.getAllAttendanceErrors();
		for (AttendanceError attendanceErrorTemp : attendanceErrors) {
			System.out.println(attendanceErrorTemp.getAttendanceErrorId() + " " + attendanceErrorTemp.getStaffNo() + " "
					+ attendanceErrorTemp.getErrorDate() + " " + attendanceErrorTemp.getErrorType() + " "
					+ attendanceErrorTemp.getErrorReason());
		}
		System.out.println("#select: select " + attendanceErrors.size() + " data..\n");

		int attendanceErrorId = attendanceErrors.get(attendanceErrors.size() - 1).getAttendanceErrorId();
		attendanceError.setAttendanceErrorId(attendanceErrorId);
		attendanceError.setStaffNo("testNo");
		attendanceError.setErrorDate(new Timestamp(new Date().getTime()));
		attendanceError.setErrorType("testType");
		attendanceError.setErrorReason("testUpdate");
		int updateResult = attendanceErrorService.updateAttendanceError(attendanceError);
		attendanceErrors = attendanceErrorService.getAllAttendanceErrors();
		for (AttendanceError attendanceErrorTemp : attendanceErrors) {
			System.out.println(attendanceErrorTemp.getAttendanceErrorId() + " " + attendanceErrorTemp.getStaffNo() + " "
					+ attendanceErrorTemp.getErrorDate() + " " + attendanceErrorTemp.getErrorType() + " "
					+ attendanceErrorTemp.getErrorReason());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = attendanceErrorService.deleteAttendanceError(attendanceErrorId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	// 5��department����Է���
	public void departmentUnit(ApplicationContext context) {
		DepartmentService departmentService = (DepartmentService) context.getBean("DepartmentServiceImpl");

		Department department = new Department();
		department.setDepartmentNo("100");
		department.setDepartmentName("testDepart");
		department.setRemark("test");
		int addResult = departmentService.addDepartment(department);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<Department> departments = departmentService.getAllDepartments();
		for (Department departmentTemp : departments) {
			System.out.println(departmentTemp.getDepartmentId() + " " + departmentTemp.getDepartmentNo() + " "
					+ departmentTemp.getDepartmentName() + " " + departmentTemp.getRemark());
		}
		System.out.println("#select: select " + departments.size() + " data..\n");

		int departmentId = departments.get(departments.size() - 1).getDepartmentId();
		department.setDepartmentId(departmentId);
		department.setDepartmentNo("110");
		department.setDepartmentName("testUpdate");
		department.setRemark("testUpdate");
		int updateResult = departmentService.updateDepartment(department);
		departments = departmentService.getAllDepartments();
		for (Department departmentTemp : departments) {
			System.out.println(departmentTemp.getDepartmentId() + " " + departmentTemp.getDepartmentNo() + " "
					+ departmentTemp.getDepartmentName() + " " + departmentTemp.getRemark());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = departmentService.deleteDepartment(departmentId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	// 6��departmentpost����Է���
	public void departmentPostUnit(ApplicationContext context) {
		DepartmentPostService departmentPostService = (DepartmentPostService) context
				.getBean("DepartmentPostServiceImpl");

		DepartmentPost departmentPost = new DepartmentPost();
		departmentPost.setPostNo("testNo");
		departmentPost.setDepartmentNo("12");
		departmentPost.setPostName("testName");
		departmentPost.setPostSalary("10000");
		departmentPost.setRemark("testRemark");
		int addResult = departmentPostService.addDepartmentPost(departmentPost);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<DepartmentPost> departmentPosts = departmentPostService.getAllDepartmentPosts();
		for (DepartmentPost departmentPostTemp : departmentPosts) {
			System.out.println(departmentPostTemp.getPostId() + " " + departmentPostTemp.getPostNo() + " "
					+ departmentPostTemp.getDepartmentNo() + " " + departmentPostTemp.getPostName() + " "
					+ departmentPostTemp.getPostSalary() + " " + departmentPostTemp.getRemark());
		}
		System.out.println("#select: select " + departmentPosts.size() + " data..\n");

		int postId = departmentPosts.get(departmentPosts.size() - 1).getPostId();
		departmentPost.setPostId(postId);
		departmentPost.setPostNo("testNo");
		departmentPost.setDepartmentNo("1200");
		departmentPost.setPostName("testUpdate");
		departmentPost.setPostSalary("12000");
		departmentPost.setRemark("testUpdate");
		int updateResult = departmentPostService.updateDepartmentPost(departmentPost);
		departmentPosts = departmentPostService.getAllDepartmentPosts();
		for (DepartmentPost departmentPostTemp : departmentPosts) {
			System.out.println(departmentPostTemp.getPostId() + " " + departmentPostTemp.getPostNo() + " "
					+ departmentPostTemp.getDepartmentNo() + " " + departmentPostTemp.getPostName() + " "
					+ departmentPostTemp.getPostSalary() + " " + departmentPostTemp.getRemark());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = departmentPostService.deleteDepartmentPost(postId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	// 7��employment����Է���
	public void employmentUnit(ApplicationContext context) {
		EmploymentService employmentService = (EmploymentService) context.getBean("EmploymentServiceImpl");

		Employment employment = new Employment();
		employment.setName("testName");
		employment.setSex("testSex");
		employment.setEmploymentType("testType");
		employment.setEmploymentPost("testPost");
		employment.setStatus("testStatus");
		employment.setComment("testComment");
		employment.setRemark("testRemark");
		employment.setEmploymentResult("testResult");
		int addResult = employmentService.addEmployment(employment);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<Employment> employments = employmentService.getAllEmployments();
		for (Employment employmentTemp : employments) {
			System.out.println(
					employmentTemp.getEmploymentId() + " " + employmentTemp.getName() + " " + employmentTemp.getSex()
							+ " " + employmentTemp.getEmploymentType() + " " + employmentTemp.getEmploymentPost() + " "
							+ employmentTemp.getStatus() + " " + employmentTemp.getComment() + " "
							+ employmentTemp.getRemark() + " " + employmentTemp.getEmploymenyResult());
		}
		System.out.println("#select: select " + employments.size() + " data..\n");

		int employmentId = employments.get(employments.size() - 1).getEmploymentId();
		employment.setEmploymentId(employmentId);
		employment.setName("testNameUpdate");
		employment.setSex("testSexUpdate");
		employment.setEmploymentType("testUpdate");
		employment.setEmploymentPost("testUpdate");
		employment.setStatus("testUpdate");
		employment.setComment("testUpdate");
		employment.setRemark("testUpdate");
		employment.setEmploymentResult("testUpdate");
		int updateResult = employmentService.updateEmployment(employment);
		employments = employmentService.getAllEmployments();
		for (Employment employmentTemp : employments) {
			System.out.println(
					employmentTemp.getEmploymentId() + " " + employmentTemp.getName() + " " + employmentTemp.getSex()
							+ " " + employmentTemp.getEmploymentType() + " " + employmentTemp.getEmploymentPost() + " "
							+ employmentTemp.getStatus() + " " + employmentTemp.getComment() + " "
							+ employmentTemp.getRemark() + " " + employmentTemp.getEmploymenyResult());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = employmentService.deleteEmployment(employmentId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	// 8��recruit����Է���
	public void recruitUnit(ApplicationContext context) {
		RecruitService recruitService = (RecruitService) context.getBean("RecruitServiceImpl");

		Recruit recruit = new Recruit();
		recruit.setTitle("testTitle");
		recruit.setRecruitPost("testPost");
		recruit.setRecruitNumber(100);
		recruit.setPublishDate("testDate");
		recruit.setEndDate(new Timestamp(new Date().getTime()).toString());
		int addResult = recruitService.addRecruit(recruit);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<Recruit> recruits = recruitService.getAllRecruits();
		for (Recruit recruitTemp : recruits) {
			System.out.println(recruitTemp.getRecruitId() + " " + recruitTemp.getTitle() + " "
					+ recruitTemp.getRecruitPost() + " " + recruitTemp.getRecruitNumber() + " "
					+ recruitTemp.getPublishDate() + " " + recruitTemp.getEndDate());
		}
		System.out.println("#select: select " + recruits.size() + " data..\n");

		int recruitId = recruits.get(recruits.size() - 1).getRecruitId();
		recruit.setRecruitId(recruitId);
		recruit.setTitle("testUpdate");
		recruit.setRecruitPost("testUpdate");
		recruit.setRecruitNumber(110);
		recruit.setPublishDate("testDateUpdate");
		recruit.setEndDate(new Timestamp(new Date().getTime()).toString());
		int updateResult = recruitService.updateRecruit(recruit);
		recruits = recruitService.getAllRecruits();
		for (Recruit recruitTemp : recruits) {
			System.out.println(recruitTemp.getRecruitId() + " " + recruitTemp.getTitle() + " "
					+ recruitTemp.getRecruitPost() + " " + recruitTemp.getRecruitNumber() + " "
					+ recruitTemp.getPublishDate() + " " + recruitTemp.getEndDate());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = recruitService.deleteRecruit(recruitId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	// 9��rewardpunishment����Է���
	public void rewardPunishmentUnit(ApplicationContext context) {
		RewardPunishmentService rewardPunishmentService = (RewardPunishmentService) context
				.getBean("RewardPunishmentServiceImpl");

		RewardPunishment rewardPunishment = new RewardPunishment();
		rewardPunishment.setStaffNo("testNo");
		rewardPunishment.setType("testType");
		rewardPunishment.setDetail("testDetail");
		rewardPunishment.setAmount("testAmount");
		int addResult = rewardPunishmentService.addRewardPunishment(rewardPunishment);
		System.out.println("#insert: add " + addResult + " data successfully..\n");

		List<RewardPunishment> rewardPunishments = rewardPunishmentService.getAllRewardPunishments();
		for (RewardPunishment rewardPunishmentTemp : rewardPunishments) {
			System.out.println(rewardPunishmentTemp.getRewardPunishmentId() + " " + rewardPunishmentTemp.getStaffNo()
					+ " " + rewardPunishmentTemp.getType() + " " + rewardPunishmentTemp.getDetail() + " "
					+ rewardPunishmentTemp.getAmount());
		}
		System.out.println("#select: select " + rewardPunishments.size() + " data..\n");

		int rewardPunishmentId = rewardPunishments.get(rewardPunishments.size() - 1).getRewardPunishmentId();
		rewardPunishment.setRewardPunishmentId(rewardPunishmentId);
		rewardPunishment.setStaffNo("testNoUpdate");
		rewardPunishment.setType("testUpdate");
		rewardPunishment.setDetail("testUpdate");
		rewardPunishment.setAmount("testUpdate");
		int updateResult = rewardPunishmentService.updateRewardPunishment(rewardPunishment);
		rewardPunishments = rewardPunishmentService.getAllRewardPunishments();
		for (RewardPunishment rewardPunishmentTemp : rewardPunishments) {
			System.out.println(rewardPunishmentTemp.getRewardPunishmentId() + " " + rewardPunishmentTemp.getStaffNo()
					+ " " + rewardPunishmentTemp.getType() + " " + rewardPunishmentTemp.getDetail() + " "
					+ rewardPunishmentTemp.getAmount());
		}
		System.out.println("#update: update " + updateResult + " data successfully..\n");

		int deleteResult = rewardPunishmentService.deleteRewardPunishment(rewardPunishmentId);
		System.out.println("#delete: delete " + deleteResult + " data successfully..\n");
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "spring-mybatis.xml", "spring.xml" });

		TestDaoService test = new TestDaoService();
		test.employmentUnit(context);
	}

}
