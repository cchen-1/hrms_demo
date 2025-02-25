package web.entity;

public class Welfare {
	private int welfareId;
	private String name;
	private String amount;
	private String percentage;
	public Welfare(int welfareId, String name, String amount, String percentage) {
		this.welfareId = welfareId;
		this.name = name;
		this.amount = amount;
		this.percentage = percentage;
	}
	public Welfare() {
	}
	public int getWelfareId() {
		return welfareId;
	} 
	public void setWelfareId(int welfareId) {
		this.welfareId = welfareId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "welfareId=" + welfareId + ", name=" + name + ", amount=" + amount + ", percentage="
				+ percentage ;
	}
	
}
