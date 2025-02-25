package web.service;

import java.util.List;

import web.entity.Employment;

public interface EmploymentService {

	// 获取所有Employment实体
	public List<Employment> getAllEmployments();

	// 传入一个Employment实体向表中插入一行数据，并返回结果信息int（受影响行数）
	public int addEmployment(Employment employment);

	// 传入一个Employment实体，使表中与employmentId匹配的数据更新为传入Employment实体的数据，并返回结果信息int（受影响行数）
	public int updateEmployment(Employment employment);

	// 通过employmentId删除表中的一行数据，并返回结果信息int（受影响行数）
	public int deleteEmployment(int employmentId);

}
