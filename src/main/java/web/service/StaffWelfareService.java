package web.service;

import java.util.List;

import web.entity.StaffWelfare;

public interface StaffWelfareService {

	public StaffWelfare findStaffWelfareByNo(String staffNo);

	public List<StaffWelfare> getStaffWelfares();

	public int addStaffWelfare(StaffWelfare staffWelfare);

	public int deleteStaffWelfareById(int staffWelfareId);

	public int updateStaffWelfare(StaffWelfare staffWelfare);
}
