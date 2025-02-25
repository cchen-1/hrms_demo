package web.service;

import java.util.List;

import web.entity.Salary;

public interface SalaryService {
	public List<Salary> findSalaryByNo(String staffNo);

	public List<Salary> getSalarys();

	public int addSalary(Salary Salary);

	public int deleteSalaryById(int SalaryId);

	// public int updateSalary(Salary Salary);
}
