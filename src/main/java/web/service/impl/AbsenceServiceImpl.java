package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.AbsenceDaoMapper;
import web.dao.StaffDao;
import web.entity.Absence;
import web.entity.Staff;
import web.service.AbsenceService;

@Service("AbsenceServiceImpl")
public class AbsenceServiceImpl implements AbsenceService {

	@Autowired
	AbsenceDaoMapper absenceDao;
	@Autowired
	StaffDao staffDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Absence> getAllAbsences() {
		// TODO Auto-generated method stub
		try {
			return absenceDao.getAllAbsences();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addAbsence(Absence absence) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(absence.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return absenceDao.addAbsence(absence);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateAbsence(Absence absence) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(absence.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return absenceDao.updateAbsence(absence);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteAbsence(int absenceId) {
		// TODO Auto-generated method stub
		try {
			return absenceDao.deleteAbsence(absenceId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
