package web.service;

import java.util.List;

import web.entity.RewardPunishment;

public interface RewardPunishmentService {

	// 获取所有RewardPunishment实体
	public List<RewardPunishment> getAllRewardPunishments();

	// 传入一个RewardPunishment实体向表中插入一行数据，并返回结果信息int（受影响行数）
	public int addRewardPunishment(RewardPunishment rewardPunishment);

	// 传入一个RewardPunishment实体，使表中与rewardpunishmentId匹配的数据更新为传入RewardPunishment实体的数据，并返回结果信息int（受影响行数）
	public int updateRewardPunishment(RewardPunishment rewardPunishment);

	// 通过rewardpunishmentId删除表中的一行数据，并返回结果信息int（受影响行数）
	public int deleteRewardPunishment(int rewardPunishmentId);

}
