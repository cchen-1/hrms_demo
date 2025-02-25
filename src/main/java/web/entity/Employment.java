package web.entity;

import java.io.Serializable;

public class Employment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int employmentId;
	private String name;
	private String sex;
	private String employmentType;
	private String employmentPost;
	private String status;
	private String comment;
	private String remark;
	private String employmentResult;

	public void setEmploymentId(int employmentId) {
		this.employmentId = employmentId;
	}

	public int getEmploymentId() {
		return employmentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentPost(String employmentPost) {
		this.employmentPost = employmentPost;
	}

	public String getEmploymentPost() {
		return employmentPost;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getComment() {
		return comment;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRemark() {
		return remark;
	}

	public void setEmploymentResult(String employmentResult) {
		this.employmentResult = employmentResult;
	}

	public String getEmploymenyResult() {
		return employmentResult;
	}

}
