package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.RecruitDaoMapper;
import web.entity.Recruit;
import web.service.RecruitService;

@Service("RecruitServiceImpl")
public class RecruitServiceImpl implements RecruitService {

	@Autowired
	RecruitDaoMapper recruitDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Recruit> getAllRecruits() {
		// TODO Auto-generated method stub
		try {
			return recruitDao.getAllRecruits();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addRecruit(Recruit recruit) {
		// TODO Auto-generated method stub
		try {
			return recruitDao.addRecruit(recruit);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateRecruit(Recruit recruit) {
		// TODO Auto-generated method stub
		try {
			return recruitDao.updateRecruit(recruit);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteRecruit(int recruitId) {
		// TODO Auto-generated method stub
		try {
			return recruitDao.deleteRecruit(recruitId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
