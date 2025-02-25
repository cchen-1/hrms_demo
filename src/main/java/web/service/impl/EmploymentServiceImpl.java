package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.EmploymentDaoMapper;
import web.entity.Employment;
import web.service.EmploymentService;

@Service("EmploymentServiceImpl")
public class EmploymentServiceImpl implements EmploymentService {

	@Autowired
	EmploymentDaoMapper employmentDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Employment> getAllEmployments() {
		// TODO Auto-generated method stub
		try {
			return employmentDao.getAllEmployments();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addEmployment(Employment employment) {
		// TODO Auto-generated method stub
		try {
			return employmentDao.addEmployment(employment);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateEmployment(Employment employment) {
		// TODO Auto-generated method stub
		try {
			return employmentDao.updateEmployment(employment);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteEmployment(int employmentId) {
		// TODO Auto-generated method stub
		try {
			return employmentDao.deleteEmployment(employmentId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
