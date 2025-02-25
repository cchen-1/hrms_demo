package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.AccountDaoMapper;
import web.dao.StaffDao;
import web.entity.Account;
import web.entity.Staff;
import web.service.AccountService;

@Service("AccountServiceImpl")
public class AccountServiceImpl implements AccountService {

	@Autowired
	AccountDaoMapper accountDao;
	@Autowired
	StaffDao staffDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		try {
			return accountDao.getAllAccounts();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addAccount(Account account) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(account.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return accountDao.addAccount(account);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateAccount(Account account) {
		// TODO Auto-generated method stub
		try {
			// 检验员工存在与否，如不存在则返回 -1
			Staff staff = staffDao.findStaffByNo(account.getStaffNo());
			if (staff == null) {
				return -1;
			}

			return accountDao.updateAccount(account);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteAccount(int accountId) {
		// TODO Auto-generated method stub
		try {
			return accountDao.deleteAccount(accountId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
