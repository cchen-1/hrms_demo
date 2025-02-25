package web.entity;

public class Tax {
	private int taxId;
	private float minimum;
	private float maximum;
	private String rate;
	private float rapidCalculation;
	public Tax(int taxId, float minimum, float maximum, String rate, float rapidCalculation) {
		this.taxId = taxId;
		this.minimum = minimum;
		this.maximum = maximum;
		this.rate = rate;
		this.rapidCalculation = rapidCalculation;
	}
	public Tax() {
	}
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public float getMinimum() {
		return minimum;
	}
	public void setMinimum(float minimum) {
		this.minimum = minimum;
	}
	public float getMaximum() {
		return maximum;
	}
	public void setMaximum(float maximum) {
		this.maximum = maximum;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public float getRapidCalculation() {
		return rapidCalculation;
	}
	public void setRapidCalculation(float rapidCalculation) {
		this.rapidCalculation = rapidCalculation;
	}
	@Override
	public String toString() {
		return "taxId=" + taxId + ", minimum=" + minimum + ", maximum=" + maximum + ", rate=" + rate
				+ ", rapidCalculation=" + rapidCalculation;
	}
	
}
