package web.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.TalentPoolDao;
import web.entity.TalentPool;
import web.service.TalentPoolService;

@Service("talentPoolService")
public class TalentPoolServiceImpl implements TalentPoolService{
	
	@Autowired
	TalentPoolDao talentPoolDao;
	
	@Transactional(rollbackFor = Exception.class)
	public TalentPool findTalentPoolById(int talentPoolId) {
		try {
			return this.talentPoolDao.findTalentPoolById(talentPoolId);
		}catch (Exception e) {
			throw e;
		}
	}

	@Transactional(rollbackFor = Exception.class)
	public List<TalentPool> getTalentPools() {
		try {
			return this.talentPoolDao.getTalentPools();
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addTalentPool(TalentPool talentPool) {
		try {
		int result = 0;
			result = talentPoolDao.addTalentPool(talentPool); //返回受影响行数，由于前端一次只能添加一个角色，故返回1时表示成功 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteTalentPoolById(int talentPoolId) {
		try {
		int result = 0;
			result = talentPoolDao.deleteTalentPoolById(talentPoolId); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateTalentPool(TalentPool talentPool) {
		try {
			int result = 0;
			result = talentPoolDao.updateTalentPool(talentPool); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


}
