package web.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.StaffDao;
import web.dao.StaffWelfareDao;
import web.entity.Staff;
import web.entity.StaffWelfare;
import web.service.StaffWelfareService;

@Service("staffWelfareService")
public class StaffWelfareServiceImpl implements StaffWelfareService{
	
	@Autowired
	StaffWelfareDao staffWelfareDao;
	@Autowired
	StaffDao staffDao;
	
	@Transactional(rollbackFor = Exception.class)
	public StaffWelfare findStaffWelfareByNo(String staffNo) {
		try {
			return this.staffWelfareDao.findStaffWelfareByNo(staffNo);
		}catch (Exception e) {
			throw e;
		}
	
	}

	@Transactional(rollbackFor = Exception.class)
	public List<StaffWelfare> getStaffWelfares() {
		try {
			return this.staffWelfareDao.getStaffWelfares();
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addStaffWelfare(StaffWelfare staffWelfare) {
		try {
		int result = 0;
		//判断是否存在该员工
		Staff staff = staffDao.findStaffByNo(staffWelfare.getStaffNo());
		if(staff!=null) {
				result = staffWelfareDao.addStaffWelfare(staffWelfare); //返回受影响行数，由于前端一次只能添加一个，故返回1时表示成功 
				return (result==1)?1:0;
			}else {
				return -1; //员工查无此人
			}
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteStaffWelfareById(int staffWelfareId) {
		int result = 0;
		try {				
			result = staffWelfareDao.deleteStaffWelfareById(staffWelfareId); 
		}finally {
			return (result==1)?1:0;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateStaffWelfare(StaffWelfare staffWelfare) {
		try {	
		int result = 0;
			result = staffWelfareDao.updateStaffWelfare(staffWelfare); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}
}
