package web.service;

import java.util.List;

import web.entity.Department;

public interface DepartmentService {

	// ��ȡ����Departmentʵ��
	public List<Department> getAllDepartments();

	// ����һ��Departmentʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addDepartment(Department department);

	// ����һ��Departmentʵ�壬ʹ������departmentIdƥ������ݸ���Ϊ����Departmentʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateDepartment(Department department);

	// ͨ��departmentIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteDepartment(int departmentId);
	
	public List<Department> getDepartment(Department department);
}
