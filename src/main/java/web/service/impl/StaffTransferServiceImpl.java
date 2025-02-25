package web.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.StaffDao;
import web.dao.StaffTransferDao;
import web.entity.Staff;
import web.entity.StaffTransfer;
import web.service.StaffTransferService;

@Service("staffTransferService")
public class StaffTransferServiceImpl implements StaffTransferService{
	
	@Autowired
	StaffTransferDao staffTransferDao;
	@Autowired
	StaffDao staffDao;
	
	@Transactional(rollbackFor = Exception.class)
	public StaffTransfer findStaffTransferById(int staffTransferId) {
		try {
			return this.staffTransferDao.findStaffTransferById(staffTransferId);
		}catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(rollbackFor = Exception.class)
	public List<StaffTransfer> getStaffTransfers() {
		try {
			return this.staffTransferDao.getStaffTransfers();
		}catch (Exception e) {
			throw e;
		}
	}
	

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addStaffTransfer(StaffTransfer staffTransfer) {
		try {
			int result = 0;
			// 判断是否存在该员工
			Staff staff = staffDao.findStaffByNo(staffTransfer.getStaffNo());
			if (staff != null) {
				result = staffTransferDao.addStaffTransfer(staffTransfer); // 返回受影响行数，由于前端一次只能添加一个，故返回1时表示成功
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
	public int deleteStaffTransferById(int staffTransferId) {
		try {
		int result = 0;
						
			result = staffTransferDao.deleteStaffTransferById(staffTransferId); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	/*@Override
	public int updateStaffTransfer(StaffTransfer staffTransfer) {
		int result = 0;
		try {				
			result = staffTransferDao.updateStaffTransfer(staffTransfer); 
		}finally {
			return (result==1)?1:0;
		}
	}*/


}
