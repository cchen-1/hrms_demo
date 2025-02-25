package web.service;

import java.util.List;

import web.entity.StaffTransfer;

public interface StaffTransferService {

	public StaffTransfer findStaffTransferById(int staffTransferId);

	public List<StaffTransfer> getStaffTransfers();

	public int addStaffTransfer(StaffTransfer staffTransfer);

	public int deleteStaffTransferById(int staffTransferId);

	// public int updateStaffTransfer(StaffTransfer staffTransfer);
}
