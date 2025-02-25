package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.SalaryDao;
import web.dao.StaffDao;
import web.entity.Salary;
import web.entity.Staff;
import web.entity.Salary;
import web.service.SalaryService;

@Service("salaryService")
public class SalaryServiceImpl implements SalaryService{
	@Autowired
	SalaryDao salaryDao;
	@Autowired
	StaffDao staffDao;
	
	@Transactional(rollbackFor = Exception.class)
	public List<Salary> findSalaryByNo(String staffNo) {
		try {
			return this.salaryDao.findSalaryByNo(staffNo);
		}catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(rollbackFor = Exception.class)
	public List<Salary> getSalarys() {
		try {
			return this.salaryDao.getSalarys();
		}catch (Exception e) {
			throw e;
		}

	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addSalary(Salary salary) {
		try {
			int result = 0;
			// 判断是否存在该员工
			Staff staff = staffDao.findStaffByNo(salary.getStaffNo());
			if (staff != null) {
				result = salaryDao.addSalary(salary); // 返回受影响行数，一次只添加一个，故返回1时表示成功，0表示其他错误
				return (result == 1) ? 1 : 0;
			} else {
				return -1;// 员工查无此人
			}
		} catch (Exception e) {
			throw e;
		}
		
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteSalaryById(int salaryId) {
		try {
		int result = 0;
			result = salaryDao.deleteSalaryById(salaryId); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
			
		
	}
	
	//salary表多用于记录发布的历史信息，无需update功能
}
