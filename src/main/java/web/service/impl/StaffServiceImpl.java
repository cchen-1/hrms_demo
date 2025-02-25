package web.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;

import web.dao.StaffDao;
import web.entity.Department;
import web.entity.DepartmentPost;
import web.entity.Staff;
import web.entity.StaffTransfer;
import web.service.DepartmentPostService;
import web.service.DepartmentService;
import web.service.StaffService;
import web.service.StaffTransferService;
import web.util.CheckFormat;

@Service("staffService")
public class StaffServiceImpl implements StaffService{
	
	@Autowired
	StaffDao staffDao;
	@Autowired
	StaffTransferService staffTransferService;
	@Autowired
	DepartmentPostService departmentPostService;
	@Autowired
	DepartmentService departmentService;
	
	@Transactional(rollbackFor = Exception.class)
	public Staff findStaffByNo(String staffNo) {
		try {
			return this.staffDao.findStaffByNo(staffNo);
		}catch (Exception e) {
			throw e;
		}
	
	}

	@Transactional(rollbackFor = Exception.class)
	public List<Staff> getStaffs() {
		try {
			return this.staffDao.getStaffs();
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addStaff(Staff staff) {
		try {
			int result = 0;
			boolean isEmailLegal = CheckFormat.checkEmail(staff.getEmail());
			boolean isPhoneLegal = CheckFormat.checkPhone(staff.getPhoneNo()); // 检查手机号码
			if (isEmailLegal && isPhoneLegal) {
				result = staffDao.addStaff(staff);
			}
			return (result == 1) ? 1 : 0;
		} catch (Exception e) {
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteStaffById(int staffId) {
		try {
		int result = 0;
			result = staffDao.deleteStaffById(staffId); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateStaff(Staff newStaff) {
		try {
			int result = 0;
			Staff originalStaff = this.findStaffByNo(newStaff.getStaffNo());// 员工号默认不能修改
			
			boolean isEmailLegal = CheckFormat.checkEmail(newStaff.getEmail());
			boolean isPhoneLegal = true;//CheckFormat.checkPhone(newStaff.getPhoneNo()); // 检查手机号码
			
			if (isEmailLegal && isPhoneLegal) {
				//检查部门或职位是否发生更改
				if (originalStaff.getDepartmentNo() != newStaff.getDepartmentNo()
						|| originalStaff.getPostNo() != newStaff.getPostNo()) {
					
					//部门，职位编号信息从 staff对象->department，departmentPost对象
					DepartmentPost departmentPost1 = new DepartmentPost();
					DepartmentPost departmentPost2 = new DepartmentPost();
					departmentPost1.setPostNo(originalStaff.getPostNo());
					departmentPost2.setPostNo(newStaff.getPostNo());
					
					Department department1 = new Department();
					Department department2 = new Department();
					department1.setDepartmentNo(originalStaff.getDepartmentNo());
					department2.setDepartmentNo(newStaff.getDepartmentNo());
					
					//根据编号查询完整的department，departmentPost对象，即包含部门职位名称
					List<DepartmentPost> departmentPosts1 = departmentPostService.getDepartmentPost(departmentPost1);
					List<DepartmentPost> departmentPosts2 = departmentPostService.getDepartmentPost(departmentPost2);
					
					List<Department> departments1 = departmentService.getDepartment(department1);
					List<Department> departments2 = departmentService.getDepartment(department2);
					
					//获取部门名称，职位名称，传入staffTransfer对象中，生成一条人事调动记录
					StaffTransfer staffTransfer = new StaffTransfer( originalStaff.getStaffNo(),
							originalStaff.getStaffName(), departments1.get(0).getDepartmentName(), departmentPosts1.get(0).getPostName(),
							departments2.get(0).getDepartmentName(), departmentPosts2.get(0).getPostName());
					staffTransferService.addStaffTransfer(staffTransfer);
				}
				result = staffDao.updateStaff(newStaff);
			}
			return (result == 1) ? 1 : 0;
		} catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Staff> findStaffs(Staff staff) {
		try{
			return staffDao.findStaffs(staff);
		}catch (Exception e) {
			throw e;
		}
	}
}
