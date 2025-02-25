package web.entity;

import java.io.Serializable;

public class DepartmentPost implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int postId;
	private String postNo;
	private String departmentNo;
	private String postName;
	private String postSalary;
	private String remark;

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}

	public String getPostNo() {
		return postNo;
	}

	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}

	public String getDepartmentNo() {
		return departmentNo;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostSalary(String postSalary) {
		this.postSalary = postSalary;
	}

	public String getPostSalary() {
		return postSalary;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public DepartmentPost(int postId, String postNo, String departmentNo, String postName, String postSalary,
			String remark) {
		this.postId = postId;
		this.postNo = postNo;
		this.departmentNo = departmentNo;
		this.postName = postName;
		this.postSalary = postSalary;
		this.remark = remark;
	}

	public DepartmentPost() {
	}
	
}
