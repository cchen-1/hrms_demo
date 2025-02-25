package web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.DepartmentDaoMapper;
import web.dao.DepartmentPostDaoMapper;
import web.dao.StaffDao;
import web.entity.Department;
import web.entity.DepartmentPost;
import web.entity.Staff;
import web.service.DepartmentPostService;

@Service("DepartmentPostServiceImpl")
public class DepartmentPostServiceImpl implements DepartmentPostService {

	@Autowired
	DepartmentPostDaoMapper departmentPostDao;
	@Autowired
	DepartmentDaoMapper departmentDao;
	@Autowired
	StaffDao staffDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<DepartmentPost> getAllDepartmentPosts() {
		// TODO Auto-generated method stub
		try {
			return departmentPostDao.getAllDepartmentPosts();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addDepartmentPost(DepartmentPost departmentPost) {
		// TODO Auto-generated method stub
		try {
			// �����������Ŵ�������粻�����򷵻�-1
			Department department = new Department();
			department.setDepartmentNo(departmentPost.getDepartmentNo());
			List<Department> departments = departmentDao.getDepartment(department);
			if (departments.size() == 0) {
				return -1;
			}

			return departmentPostDao.addDepartmentPost(departmentPost);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateDepartmentPost(DepartmentPost departmentPost) {
		// TODO Auto-generated method stub
		try {
			// �����������Ŵ�������粻�����򷵻�-1
			Department department = new Department();
			department.setDepartmentNo(departmentPost.getDepartmentNo());
			List<Department> departments = departmentDao.getDepartment(department);
			if (departments.size() == 0) {
				return -1;
			}

			return departmentPostDao.updateDepartmentPost(departmentPost);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteDepartmentPost(int postId) {
		// TODO Auto-generated method stub
		try {
			// ͨ�� postId ��ȡ�� departmentPost ʵ��
			DepartmentPost departmentPost = new DepartmentPost();
			departmentPost.setPostId(postId);
			List<DepartmentPost> departmentPosts = departmentPostDao.getDepartmentPost(departmentPost);
			DepartmentPost departmentPostTemp = new DepartmentPost();
			if (departmentPosts.size() != 0) {
				departmentPostTemp = departmentPosts.get(0);
			}

			// �����ְλ������������Ա���������޷�ɾ��������ֵΪ0
			Staff staff = new Staff();
			staff.setPostNo(departmentPostTemp.getPostNo());
			List<Staff> staffs = staffDao.findStaffs(staff);
			if (staffs.size() != 0) {
				return 0;
			}

			return departmentPostDao.deleteDepartmentPost(postId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<DepartmentPost> getDepartmentPost(DepartmentPost departmentPost) {
		try {
			return departmentPostDao.getDepartmentPost(departmentPost);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
}
