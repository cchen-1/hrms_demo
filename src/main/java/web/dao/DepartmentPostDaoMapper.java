package web.dao;

import java.util.List;

import web.entity.DepartmentPost;

public interface DepartmentPostDaoMapper {

	// ��ȡ����DepartmentPostʵ��
	public List<DepartmentPost> getAllDepartmentPosts();

	// ����һ��DepartmentPostʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addDepartmentPost(DepartmentPost departmentPost);

	// ����һ��DepartmentPostʵ�壬ʹ������postIdƥ������ݸ���Ϊ����DepartmentPostʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateDepartmentPost(DepartmentPost departmentPost);

	// ͨ��postIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteDepartmentPost(int postId);

	// ͨ������һ��DepartmentPostʵ�壬��ȡ���ʵ���зǿգ���Ĭ��ֵ��Ԫ��ƥ�������������
	public List<DepartmentPost> getDepartmentPost(DepartmentPost departmentPost);
}
