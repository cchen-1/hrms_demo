package web.entity;

public class Staff {
	private int staffId;
	private String staffNo;
	private String staffName;
	private String birthDate;
	private String phoneNo;
	private String qq;
	private String wechat;
	private String email;
	private String sex;
	private String identity;
	private String bank;
	private String bankAccount;
	private String nationality;
	private String nativePlace;
	private String nation;
	private String school;
	private String degree;
	private String major;
	private String address;
	private String departmentNo;
	private String postNo;
	private String photo;
	
	public Staff(int staffId, String staffNo, String staffName, String birthDate, String phoneNo, String qq, String wechat,
			String email, String sex, String identity, String bank, String bankAccount, String nationality,
			String nativePlace, String nation, String school, String degree, String major, String address,
			String departmentNo, String postNo, String photo) {
		this.staffId = staffId;
		this.staffNo = staffNo;
		this.staffName = staffName;
		this.birthDate = birthDate;
		this.phoneNo = phoneNo;
		this.qq = qq;
		this.wechat = wechat;
		this.email = email;
		this.sex = sex;
		this.identity = identity;
		this.bank = bank;
		this.bankAccount = bankAccount;
		this.nationality = nationality;
		this.nativePlace = nativePlace;
		this.nation = nation;
		this.school = school;
		this.degree = degree;
		this.major = major;
		this.address = address;
		this.departmentNo = departmentNo;
		this.postNo = postNo;
		this.photo = photo;
	}
	public Staff() {
	}
	public Staff(String staffNo) {
		this.staffNo = staffNo;
	}
	public Staff(String staffNo,String email) {
		this.staffNo = staffNo;
		this.email = email;
	}
	
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
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
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIndentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getPostNo() {
		return postNo;
	}
	public void setPostNo(String postNo) {
		this.postNo = postNo;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "staffId=" + staffId + ", staffNo=" + staffNo + ", staffName=" + staffName + ", birthDate="
				+ birthDate + ", phoneNo=" + phoneNo + ", qq=" + qq + ", wechat=" + wechat + ", email=" + email
				+ ", sex=" + sex + ", identity=" + identity + ", bank=" + bank + ", bankAccount=" + bankAccount
				+ ", nationality=" + nationality + ", nativePlace=" + nativePlace + ", nation=" + nation + ", school="
				+ school + ", degree=" + degree + ", major=" + major + ", address=" + address + ", departmentNo="
				+ departmentNo + ", postNo=" + postNo + ", photo=" + photo;
	}
	
}
