package web.service;

import java.util.List;

import web.entity.AttendanceError;

public interface AttendanceErrorService {

	// 获取所有AttendanceError实体
	public List<AttendanceError> getAllAttendanceErrors();

	// 传入一个AttendanceError实体向表中插入一行数据，并返回结果信息int（受影响行数）
	public int addAttendanceError(AttendanceError attendanceError);

	// 传入一个AttendanceError实体，使表中与attendanceErrorId匹配的数据更新为传入AttendanceError实体的数据，并返回结果信息int（受影响行数）
	public int updateAttendanceError(AttendanceError attendanceError);

	// 通过attendanceErrorId删除表中的一行数据，并返回结果信息int（受影响行数）
	public int deleteAttendanceError(int attendanceErrorId);

}
