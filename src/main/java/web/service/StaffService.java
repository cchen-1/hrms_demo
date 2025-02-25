package web.service;

import java.util.List;

import web.entity.DepartmentPost;
import web.entity.Staff;

public interface StaffService {
	
	public Staff findStaffByNo(String staffNo);
	
	public List<Staff> getStaffs();  
	
	public List<Staff> findStaffs(Staff staff); //根据某一个属性查找对应员工
	
	public int addStaff(Staff staff);
	
	public int deleteStaffById(int staffId);
	
	public int updateStaff(Staff staff);
	
}
