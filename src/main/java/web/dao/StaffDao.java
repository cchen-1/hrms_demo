package web.dao;

import java.util.List;

import web.entity.DepartmentPost;
import web.entity.Staff;

public interface StaffDao {

	public Staff findStaffByNo(String staffNo);
	
	public List<Staff> getStaffs();
	
	public Integer addStaff(Staff staff);
	
	public Integer deleteStaffById(int staffId);
	
	public Integer updateStaff(Staff staff);
	
	public List<Staff> findStaffs(Staff staff);
}
