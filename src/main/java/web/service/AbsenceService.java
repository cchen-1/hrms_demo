package web.service;

import java.util.List;

import web.entity.Absence;

public interface AbsenceService {

	// ��ȡ����Absenceʵ��
	public List<Absence> getAllAbsences();

	// ����һ��Absenceʵ������в���һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int addAbsence(Absence absence);

	// ����һ��Absenceʵ�壬ʹ������absenceIdƥ������ݸ���Ϊ����Absenceʵ������ݣ������ؽ����Ϣint����Ӱ��������
	public int updateAbsence(Absence absence);

	// ͨ��absenceIdɾ�����е�һ�����ݣ������ؽ����Ϣint����Ӱ��������
	public int deleteAbsence(int absenceId);

}
