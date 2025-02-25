package web.entity;

public class Role {
	int roleId;
	String staffNo;
	String role;
	
	public Role() {
	}
	public Role(int roleId, String staffNo, String role) {
		super();
		this.roleId = roleId;
		this.staffNo = staffNo;
		this.role = role;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "roleId=" + roleId + ", staffNo=" + staffNo + ", role=" + role ;
	}
	
}
