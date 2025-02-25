package web.entity;

public class StaffWelfare {
	private int staffWelfareId;
	private String staffNo;
	private String pension;
	private String unemployment;
	private String medical;
	private String birth;
	private String injury;
	private String housingFund;
	private String transportation;
	private String meal;
	private String general;
	public int getStaffWelfareId() {
		return staffWelfareId;
	}
	public void setStaffWelfareId(int staffWelfareId) {
		this.staffWelfareId = staffWelfareId;
	}
	public String getStaffNo() {
		return staffNo;
	}
	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}
	public String getPension() {
		return pension;
	}
	public void setPension(String pension) {
		this.pension = pension;
	}
	public String getUnemployment() {
		return unemployment;
	}
	public void setUnemployment(String unemployment) {
		this.unemployment = unemployment;
	}
	public String getMedical() {
		return medical;
	}
	public void setMedical(String medical) {
		this.medical = medical;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getInjury() {
		return injury;
	}
	public void setInjury(String injury) {
		this.injury = injury;
	}
	public String getHousingFund() {
		return housingFund;
	}
	public void setHousingFund(String housingFund) {
		this.housingFund = housingFund;
	}
	public String getTransportation() {
		return transportation;
	}
	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	public String getMeal() {
		return meal;
	}
	public void setMeal(String meal) {
		this.meal = meal;
	}
	public String getGeneral() {
		return general;
	}
	public void setGeneral(String general) {
		this.general = general;
	}
	public StaffWelfare(int staffWelfareId, String staffNo, String pension, String unemployment, String medical,
			String birth, String injury, String housingFund, String transportation, String meal, String general) {
		this.staffWelfareId = staffWelfareId;
		this.staffNo = staffNo;
		this.pension = pension;
		this.unemployment = unemployment;
		this.medical = medical;
		this.birth = birth;
		this.injury = injury;
		this.housingFund = housingFund;
		this.transportation = transportation;
		this.meal = meal;
		this.general = general;
	}
	public StaffWelfare() {
	}
	@Override
	public String toString() {
		return "staffWelfareId=" + staffWelfareId + ", staffNo=" + staffNo + ", pension=" + pension
				+ ", unemployment=" + unemployment + ", medical=" + medical + ", birth=" + birth + ", injury=" + injury
				+ ", housingFund=" + housingFund + ", transportation=" + transportation + ", meal=" + meal
				+ ", general=" + general ;
	}
	
}
