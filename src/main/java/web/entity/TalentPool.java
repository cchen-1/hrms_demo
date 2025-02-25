package web.entity;

public class TalentPool {
	private int talentPoolId;
	private String name;
	private String sex;
	private String email;
	private String recruitType;
	private String recruitPost;
	private String comment;
	private String resumeName;
	
	public TalentPool(int talentPoolId, String name, String sex, String email, String recruitType, String recruitPost,
			String comment, String resumeName) {
		super();
		this.talentPoolId = talentPoolId;
		this.name = name;
		this.sex = sex;
		this.email = email;
		this.recruitType = recruitType;
		this.recruitPost = recruitPost;
		this.comment = comment;
		this.resumeName = resumeName;
	}

	public TalentPool() {
	}

	public int getTalentPoolId() {
		return talentPoolId;
	}

	public void setTalentPoolId(int talentPoolId) {
		this.talentPoolId = talentPoolId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRecruitType() {
		return recruitType;
	}

	public void setRecruitType(String recruitType) {
		this.recruitType = recruitType;
	}

	public String getRecruitPost() {
		return recruitPost;
	}

	public void setRecruitPost(String recruitPost) {
		this.recruitPost = recruitPost;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getResumeName() {
		return resumeName;
	}

	public void setResumeName(String resumeName) {
		this.resumeName = resumeName;
	}

	@Override
	public String toString() {
		return "talentPoolId=" + talentPoolId + ", name=" + name + ", sex=" + sex + ", email=" + email
				+ ", recruitType=" + recruitType + ", recruitPost=" + recruitPost + ", comment=" + comment
				+ ", resumeName=" + resumeName ;
	}
	
}
