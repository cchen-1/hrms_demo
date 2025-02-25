package web.entity;

import java.sql.Timestamp;



public class Attendance implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int attendanceId;
	private String staffNo;
	private Timestamp clockDate;
	private Timestamp clockInDate;
	private Timestamp clockOffDate;

	public void setAttendanceId(int attendanceId) {
		this.attendanceId = attendanceId;
	}

	public int getAttendanceId() {
		return attendanceId;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setClockDate(Timestamp clockDate) {
		this.clockDate = clockDate;
	}

	public Timestamp getClockDate() {
		return clockDate;
	}

	public void setClockInDate(Timestamp clockInDate) {
		this.clockInDate = clockInDate;
	}

	public Timestamp getClockInDate() {
		return clockInDate;
	}

	public void setClockOffDate(Timestamp clockOffDate) {
		this.clockOffDate = clockOffDate;
	}

	public Timestamp getClockOffDate() {
		return clockOffDate;
	}

}
