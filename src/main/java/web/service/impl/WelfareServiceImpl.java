package web.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.WelfareDao;
import web.entity.Welfare;
import web.service.WelfareService;

@Service("welfareService")
public class WelfareServiceImpl implements WelfareService{
	
	@Autowired
	WelfareDao welfareDao;
	
	@Transactional(rollbackFor = Exception.class)
	public Welfare findWelfareByName(String name) {
		try {
			return this.welfareDao.findWelfareByName(name);
		} catch (Exception e) {
			throw e;
		}
	}

	@Transactional(rollbackFor = Exception.class)
	public List<Welfare> getWelfares() {
		try {
			return this.welfareDao.getWelfares();
		} catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addWelfare(Welfare welfare) {
		try {
		int result = 0;
			result = welfareDao.addWelfare(welfare); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
			// TODO: handle exception
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteWelfareById(int welfareId) {
		try {
		int result = 0;
			result = welfareDao.deleteWelfareById(welfareId); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateWelfare(Welfare welfare) {
		try {
		int result = 0;
			result = welfareDao.updateWelfare(welfare); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	
}
