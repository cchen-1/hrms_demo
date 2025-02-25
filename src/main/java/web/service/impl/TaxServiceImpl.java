package web.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.TaxDao;
import web.entity.Tax;
import web.service.TaxService;

@Service("taxService")
public class TaxServiceImpl implements TaxService{
	
	@Autowired
	TaxDao taxDao;
	
	@Transactional(rollbackFor = Exception.class)
	public Tax findTaxById(int taxId) {
		try {
			return this.taxDao.findTaxById(taxId);
		}catch (Exception e) {
			throw e;
		}
	}

	@Transactional(rollbackFor = Exception.class)
	public List<Tax> getTaxs() {
		try {
			return this.taxDao.getTaxs();
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addTax(Tax tax) {
		try {
		int result = 0;
			result = taxDao.addTax(tax); //返回受影响行数，由于前端一次只能添加一个角色，故返回1时表示成功 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteTaxById(int taxId) {
		try {
		int result = 0;
			result = taxDao.deleteTaxById(taxId); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateTax(Tax tax) {
		try {
		int result = 0;
			result = taxDao.updateTax(tax); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


}
