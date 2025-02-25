package web.entity;

import java.io.Serializable;

public class RewardPunishment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int rewardPunishmentId;
	private String staffNo;
	private String type;
	private String detail;
	private String amount;

	public void setRewardPunishmentId(int rewardPunishmentId) {
		this.rewardPunishmentId = rewardPunishmentId;
	}

	public int getRewardPunishmentId() {
		return rewardPunishmentId;
	}

	public void setStaffNo(String staffNo) {
		this.staffNo = staffNo;
	}

	public String getStaffNo() {
		return staffNo;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getDetail() {
		return detail;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmount() {
		return amount;
	}

}
