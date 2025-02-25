package web.service;

import java.util.List;

import web.entity.RewardPunishment;

public interface RewardPunishmentService {

	// ��ȡ����RewardPunishmentʵ��
	public List<RewardPunishment> getAllRewardPunishments();

	// ����һ��RewardPunishmentʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addRewardPunishment(RewardPunishment rewardPunishment);

	// ����һ��RewardPunishmentʵ�壬ʹ������rewardpunishmentIdƥ������ݸ���Ϊ����RewardPunishmentʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateRewardPunishment(RewardPunishment rewardPunishment);

	// ͨ��rewardpunishmentIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteRewardPunishment(int rewardPunishmentId);

}
