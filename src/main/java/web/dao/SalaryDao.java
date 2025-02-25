package web.dao;

import java.util.List;

import web.entity.Salary;

//此表为记录表，记录历史工资发布情况
public interface SalaryDao {
	public List<Salary> findSalaryByNo(String staffNo); // 每个用户对应多个表

	public List<Salary> getSalarys();

	public Integer addSalary(Salary salary);

	public Integer deleteSalaryById(int SalaryId);

	// public Integer updateSalary(Salary Salary); 不需要update
}
