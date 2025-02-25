package web.entity;

public class StaffTransfer {
	private int staffTransferId;
	private String staffNo;
	private String staffName;
	private String originalDepartment;
	private String originalPost;
	private String newDepartment;
	private String newPost;
	public int getStaffTransferId() {
		return staffTransferId;
	}
	public void setStaffTransferId(int staffTransferId) {
		this.staffTransferId = staffTransferId;
	}
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getOriginalDepartment() {
		return originalDepartment;
	}
	public void setOriginalDepartment(String originalDepartment) {
		this.originalDepartment = originalDepartment;
	}
	public String getOriginalPost() {
		return originalPost;
	}
	public void setOriginalPost(String originalPost) {
		this.originalPost = originalPost;
	}
	public String getNewDepartment() {
		return newDepartment;
	}
	public void setNewDepartment(String newDepartment) {
		this.newDepartment = newDepartment;
	}
	public String getNewPost() {
		return newPost;
	}
	public void setNewPost(String newPost) {
		this.newPost = newPost;
	}
	public StaffTransfer(String staffNo, String staffName, String originalDepartment,
			String originalPost, String newDepartment, String newPost) {
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.originalDepartment = originalDepartment;
		this.originalPost = originalPost;
		this.newDepartment = newDepartment;
		this.newPost = newPost;
	}
	public StaffTransfer() {
	}
	@Override
	public String toString() {
		return "staffTransferId=" + staffTransferId + ", staffNo=" + staffNo + ", staffName=" + staffName
				+ ", originalDepartment=" + originalDepartment + ", originalPost=" + originalPost + ", newDepartment="
				+ newDepartment + ", newPost=" + newPost ;
	}
	
}
