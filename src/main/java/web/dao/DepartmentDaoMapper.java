package web.dao;

import java.util.List;

import web.entity.Department;

public interface DepartmentDaoMapper {

	// ��ȡ����Departmentʵ��
	public List<Department> getAllDepartments();

	// ����һ��Departmentʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addDepartment(Department department);

	// ����һ��Departmentʵ�壬ʹ������departmentIdƥ������ݸ���Ϊ����Departmentʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateDepartment(Department department);

	// ͨ��departmentIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteDepartment(int departmentId);

	// ͨ������һ��Departmentʵ�壬��ȡ���ʵ���зǿգ���Ĭ��ֵ��Ԫ��ƥ�������������
	public List<Department> getDepartment(Department department);
}
