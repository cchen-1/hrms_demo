package web.entity;

public class Department implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int departmentId;
	private String departmentNo;
	private String departmentName;
	private String remark;

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public Department(int departmentId, String departmentNo, String departmentName, String remark) {
		this.departmentId = departmentId;
		this.departmentNo = departmentNo;
		this.departmentName = departmentName;
		this.remark = remark;
	}

	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	
}
