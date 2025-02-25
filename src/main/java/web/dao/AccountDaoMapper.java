package web.dao;

import java.util.List;

import web.entity.Account;

public interface AccountDaoMapper {

	// 获取所有Account实体
	public List<Account> getAllAccounts();

	// 传入一个Account实体向表中插入一行数据，并返回结果信息int（受影响行数）
	public int addAccount(Account account);

	// 传入一个Account实体，使表中与accountId匹配的数据更新为传入Account实体的数据，并返回结果信息int（受影响行数）
	public int updateAccount(Account account);

	// 通过accountId删除表中的一行数据，并返回结果信息int（受影响行数）
	public int deleteAccount(int accountId);

}
