package web.entity;

import java.io.Serializable;

public class Recruit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int recruitId;
	private String title;
	private String recruitPost;
	private int recruitNumber;
	private String publishDate;
	private String endDate;

	public void setRecruitId(int recruitId) {
		this.recruitId = recruitId;
	}

	public int getRecruitId() {
		return recruitId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setRecruitPost(String recruitPost) {
		this.recruitPost = recruitPost;
	}

	public String getRecruitPost() {
		return recruitPost;
	}

	public void setRecruitNumber(int recruitNumber) {
		this.recruitNumber = recruitNumber;
	}

	public int getRecruitNumber() {
		return recruitNumber;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEndDate() {
		return endDate;
	}

}
