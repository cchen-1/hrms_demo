package web.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import web.dao.RoleDao;
import web.dao.StaffDao;
import web.entity.Role;
import web.entity.Staff;
import web.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleDao roleDao;
	@Autowired
	StaffDao staffDao;
	
	@Transactional(rollbackFor = Exception.class)
	public Role findRoleByNo(String staffNo) {
		try {
			return this.roleDao.findRoleByNo(staffNo);
		}catch (Exception e) {
			throw e;
		}
		
	}

	@Transactional(rollbackFor = Exception.class)
	public List<Role> getRoles() {
		try {
			return this.roleDao.getRoles();
		}catch(Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int addRole(Role role) {
		try {
			int result = 0;
			// 根据工号判断是否存在这个员工
			Staff staff = staffDao.findStaffByNo(role.getStaffNo());
			if (staff != null) {
				result = roleDao.addRole(role); // 返回受影响行数，由于前端一次只能添加一个角色，故返回1时表示成功，0则一般为该员工已经是（超级）管理员
				return (result == 1) ? 1 : 0;
			} else {
				return -1;// 员工查无此人
			}
		} catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int deleteRoleById(int roleId) {
		try {
			int result = 0;
			result = roleDao.deleteRoleById(roleId); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}


	@Override
	@Transactional(rollbackFor = Exception.class)
	public int updateRole(Role role) {
		try {
			int result = 0;
			result = roleDao.updateRole(role); 
			return (result==1)?1:0;
		}catch (Exception e) {
			throw e;
		}
	}
}
