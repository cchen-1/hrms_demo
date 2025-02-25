package web.entity;

import java.sql.Timestamp;

public class AttendanceError implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int attendanceErrorId;
	private String staffNo;
	private Timestamp errorDate;
	private String errorType;
	private String errorReason;

	public void setAttendanceErrorId(int attendanceErrorId) {
		this.attendanceErrorId = attendanceErrorId;
	}

	public int getAttendanceErrorId() {
		return attendanceErrorId;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setErrorDate(Timestamp errorDate) {
		this.errorDate = errorDate;
	}

	public Timestamp getErrorDate() {
		return errorDate;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getErrorType() {
		return errorType;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public String getErrorReason() {
		return errorReason;
	}

}
