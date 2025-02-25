package web.entity;

public class Salary {
	private int salaryId;
	private String staffNo;
	private String year;
	private String month;
	private String salary;
	private String publisher;
	private String publishDate;
	
	
	public Salary() {
	}
	public Salary(int salaryId, String staffNo, String year, String month, String salary, String publisher,
			String publishDate) {
		super();
		this.salaryId = salaryId;
		this.staffNo = staffNo;
		this.year = year;
		this.month = month;
		this.salary = salary;
		this.publisher = publisher;
		this.publishDate = publishDate;
	}

	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	@Override
	public String toString() {
		return "salaryId=" + salaryId + ", staffNo=" + staffNo + ", year=" + year + ", month=" + month
				+ ", salary=" + salary + ", publisher=" + publisher + ", publishDate=" + publishDate;
	}
	
}
