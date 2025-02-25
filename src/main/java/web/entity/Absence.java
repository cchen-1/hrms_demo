package web.entity;

import java.sql.Timestamp;

public class Absence implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int absenceId;
	private String staffNo;
	private Timestamp beginDate;
	private Timestamp endDate;
	private String reason;

	public void setAbsenceId(int absenceId) {
		this.absenceId = absenceId;
	}

	public int getAbsenceId() {
		return absenceId;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setBeginDate(Timestamp beginDate) {
		this.beginDate = beginDate;
	}

	public Timestamp getBeginDate() {
		return beginDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Timestamp getEndDate() {
		return endDate;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getReason() {
		return reason;
	}

}
