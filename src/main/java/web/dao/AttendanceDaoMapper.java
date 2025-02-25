package web.dao;

import java.util.List;

import web.entity.Attendance;

public interface AttendanceDaoMapper {

	// 获取所有Attendance实体
	public List<Attendance> getAllAttendances();

	// 传入一个Attendance实体向表中插入一行数据，并返回结果信息int（受影响行数）
	public int addAttendance(Attendance attendance);

	// 传入一个Attendance实体，使表中与attendanceId匹配的数据更新为传入Attendance实体的数据，并返回结果信息int（受影响行数）
	public int updateAttendance(Attendance attendance);

	// 通过attendanceId删除表中的一行数据，并返回结果信息int（受影响行数）
	public int deleteAttendance(int attendanceId);

}
