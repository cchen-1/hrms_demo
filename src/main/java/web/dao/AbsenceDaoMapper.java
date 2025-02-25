package web.dao;

import java.util.List;

import web.entity.Absence;

public interface AbsenceDaoMapper {

	// 获取所有Absence实体
	public List<Absence> getAllAbsences();

	// 传入一个Absence实体向表中插入一行数据，并返回结果信息int（受影响行数）
	public int addAbsence(Absence absence);

	// 传入一个Absence实体，使表中与absenceId匹配的数据更新为传入Absence实体的数据，并返回结果信息int（受影响行数）
	public int updateAbsence(Absence absence);

	// 通过absenceId删除表中的一行数据，并返回结果信息int（受影响行数）
	public int deleteAbsence(int absenceId);

}
