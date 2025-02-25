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
import web.service.DepartmentService;

@Service("DepartmentServiceImpl")
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDaoMapper departmentDao;
	@Autowired
	StaffDao staffDao;
	@Autowired
	DepartmentPostDaoMapper departmentPostDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		try {
			return departmentDao.getAllDepartments();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addDepartment(Department department) {
		// TODO Auto-generated method stub
		try {
			return departmentDao.addDepartment(department);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateDepartment(Department department) {
		// TODO Auto-generated method stub
		try {
			return departmentDao.updateDepartment(department);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteDepartment(int departmentId) {
		// TODO Auto-generated method stub
		try {
			// ͨ�� departmentId ��ȡ�� department ʵ��
			Department department = new Department();
			department.setDepartmentId(departmentId);
			List<Department> departments = departmentDao.getDepartment(department);
			Department departmentTemp = new Department();
			if (departments.size() != 0) {
				departmentTemp = departments.get(0);
			}
			// ����ò��Ż�����������Ա���������޷�ɾ��������ֵΪ0
			Staff staff = new Staff();
			staff.setDepartmentNo(departmentTemp.getDepartmentNo());
			List<Staff> staffs = staffDao.findStaffs(staff);
			if (staffs.size() != 0) {
				return 0;
			}

			// ����ò��Ż���������ְλ���������޷�ɾ��������ֵΪ0
			DepartmentPost departmentPost = new DepartmentPost();
			departmentPost.setDepartmentNo(departmentTemp.getDepartmentNo());
			List<DepartmentPost> departmentPosts = departmentPostDao.getDepartmentPost(departmentPost);
			if (departmentPosts.size() != 0) {
				return 0;
			}

			return departmentDao.deleteDepartment(departmentId);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public List<Department> getDepartment(Department department) {
		try {
			return departmentDao.getDepartment(department);
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
