package web.service;

import java.util.List;

import web.entity.Role;

public interface RoleService {
	public Role findRoleByNo(String stuffNo);
	// public Role findRoleByNo(@Param("stuffNo")String stuffNo);

	public List<Role> getRoles();

	public int addRole(Role role);

	public int deleteRoleById(int roleId);

	public int updateRole(Role role);
}
