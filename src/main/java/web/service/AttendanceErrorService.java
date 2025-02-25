package web.service;

import java.util.List;

import web.entity.AttendanceError;

public interface AttendanceErrorService {

	// ��ȡ����AttendanceErrorʵ��
	public List<AttendanceError> getAllAttendanceErrors();

	// ����һ��AttendanceErrorʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addAttendanceError(AttendanceError attendanceError);

	// ����һ��AttendanceErrorʵ�壬ʹ������attendanceErrorIdƥ������ݸ���Ϊ����AttendanceErrorʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateAttendanceError(AttendanceError attendanceError);

	// ͨ��attendanceErrorIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteAttendanceError(int attendanceErrorId);

}
