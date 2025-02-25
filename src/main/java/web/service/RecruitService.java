package web.service;

import java.util.List;

import web.entity.Recruit;

public interface RecruitService {

	// ��ȡ����Recruitʵ��
	public List<Recruit> getAllRecruits();

	// ����һ��Recruitʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addRecruit(Recruit recruit);

	// ����һ��Recruitʵ�壬ʹ������recruitIdƥ������ݸ���Ϊ����Recruitʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateRecruit(Recruit recruit);

	// ͨ��recruitIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteRecruit(int recruitId);

}
