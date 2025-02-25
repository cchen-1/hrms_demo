package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.AttendanceErrorDaoMapper;
import web.dao.StaffDao;
import web.entity.AttendanceError;
import web.entity.Staff;
import web.service.AttendanceErrorService;

@Service("AttendanceErrorServiceImpl")
public class AttendanceErrorServiceImpl implements AttendanceErrorService {

	@Autowired
	AttendanceErrorDaoMapper attendanceErrorDao;
	@Autowired
	StaffDao staffDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<AttendanceError> getAllAttendanceErrors() {
		// TODO Auto-generated method stub
		try {
			return attendanceErrorDao.getAllAttendanceErrors();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addAttendanceError(AttendanceError attendanceError) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(attendanceError.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return attendanceErrorDao.addAttendanceError(attendanceError);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateAttendanceError(AttendanceError attendanceError) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(attendanceError.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return attendanceErrorDao.updateAttendanceError(attendanceError);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteAttendanceError(int attendanceErrorId) {
		// TODO Auto-generated method stub
		try {
			return attendanceErrorDao.deleteAttendanceError(attendanceErrorId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
