package web.dao;

import java.util.List;

import web.entity.Role;

public interface RoleDao {

	public Role findRoleByNo(String staffNo);

	public List<Role> getRoles();

	public Integer addRole(Role role);

	public Integer deleteRoleById(int roleId);

	public Integer updateRole(Role role);
}
