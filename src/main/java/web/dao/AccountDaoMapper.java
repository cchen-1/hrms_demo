package web.dao;

import java.util.List;

import web.entity.Account;

public interface AccountDaoMapper {

	// ��ȡ����Accountʵ��
	public List<Account> getAllAccounts();

	// ����һ��Accountʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addAccount(Account account);

	// ����һ��Accountʵ�壬ʹ������accountIdƥ������ݸ���Ϊ����Accountʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateAccount(Account account);

	// ͨ��accountIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteAccount(int accountId);

}
