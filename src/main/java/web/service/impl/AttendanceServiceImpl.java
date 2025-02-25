package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.AttendanceDaoMapper;
import web.dao.StaffDao;
import web.entity.Attendance;
import web.entity.Staff;
import web.service.AttendanceService;

@Service("AttendanceServiceImpl")
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceDaoMapper attendanceDao;
	@Autowired
	StaffDao staffDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Attendance> getAllAttendances() {
		// TODO Auto-generated method stub
		try {
			return attendanceDao.getAllAttendances();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(attendance.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return attendanceDao.addAttendance(attendance);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(attendance.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return attendanceDao.updateAttendance(attendance);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteAttendance(int attendanceId) {
		// TODO Auto-generated method stub
		try {
			return attendanceDao.deleteAttendance(attendanceId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
