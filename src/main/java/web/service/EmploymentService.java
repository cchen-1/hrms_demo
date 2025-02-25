package web.service;

import java.util.List;

import web.entity.Employment;

public interface EmploymentService {

	// ��ȡ����Employmentʵ��
	public List<Employment> getAllEmployments();

	// ����һ��Employmentʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addEmployment(Employment employment);

	// ����һ��Employmentʵ�壬ʹ������employmentIdƥ������ݸ���Ϊ����Employmentʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateEmployment(Employment employment);

	// ͨ��employmentIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteEmployment(int employmentId);

}
