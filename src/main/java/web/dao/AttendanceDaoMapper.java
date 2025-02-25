package web.dao;

import java.util.List;

import web.entity.Attendance;

public interface AttendanceDaoMapper {

	// ��ȡ����Attendanceʵ��
	public List<Attendance> getAllAttendances();

	// ����һ��Attendanceʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addAttendance(Attendance attendance);

	// ����һ��Attendanceʵ�壬ʹ������attendanceIdƥ������ݸ���Ϊ����Attendanceʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateAttendance(Attendance attendance);

	// ͨ��attendanceIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteAttendance(int attendanceId);

}
