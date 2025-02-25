package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.RewardPunishmentDaoMapper;
import web.dao.StaffDao;
import web.entity.RewardPunishment;
import web.entity.Staff;
import web.service.RewardPunishmentService;

@Service("RewardPunishmentServiceImpl")
public class RewardPunishmentServiceImpl implements RewardPunishmentService {

	@Autowired
	RewardPunishmentDaoMapper rewardPunishmentDao;
	@Autowired
	StaffDao staffDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<RewardPunishment> getAllRewardPunishments() {
		// TODO Auto-generated method stub
		try {
			return rewardPunishmentDao.getAllRewardPunishments();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addRewardPunishment(RewardPunishment rewardPunishment) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(rewardPunishment.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return rewardPunishmentDao.addRewardPunishment(rewardPunishment);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateRewardPunishment(RewardPunishment rewardPunishment) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(rewardPunishment.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return rewardPunishmentDao.updateRewardPunishment(rewardPunishment);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteRewardPunishment(int rewardPunishmentId) {
		// TODO Auto-generated method stub
		try {
			return rewardPunishmentDao.deleteRewardPunishment(rewardPunishmentId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
