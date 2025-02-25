package web.dao;

import java.util.List;

import web.entity.StaffWelfare;

public interface StaffWelfareDao {

	public StaffWelfare findStaffWelfareByNo(String staffNo);

	public List<StaffWelfare> getStaffWelfares();

	public Integer addStaffWelfare(StaffWelfare staffWelfare);

	public Integer deleteStaffWelfareById(int StaffWelfareId);

	public Integer updateStaffWelfare(StaffWelfare StaffWelfare);
}
