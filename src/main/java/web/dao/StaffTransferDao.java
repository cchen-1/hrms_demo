package web.dao;

import java.util.List;

import web.entity.StaffTransfer;

public interface StaffTransferDao {

	public StaffTransfer findStaffTransferById(int staffTransferId);

	public List<StaffTransfer> getStaffTransfers();

	public Integer addStaffTransfer(StaffTransfer staffTransfer);

	public Integer deleteStaffTransferById(int staffTransferId);

	// public Integer updateStaffTransfer(StaffTransfer staffTransfer); ²»ÐèÒª
}