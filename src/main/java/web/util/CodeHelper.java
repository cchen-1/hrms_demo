package web.util;

public class CodeHelper {
	// ��ȡ��Ȩ�����֤�룬numΪ��֤��λ����numWeightΪ����Ȩֵ��letterUpWeightΪ��д��ĸȨֵ��letterLowWeightΪСд��ĸȨֵ
	public static String getCheckCode(int num, double numWeight, double letterUpWeight, double letterLowWeight) {
		// �ж�Ȩֵ�����Ƿ���ȷ��������Ҫ����Ϊ���������㲻��ȷ
		if (numWeight + letterUpWeight + letterLowWeight != 1) {
			return null;
		}

		String strNum = "0123456789";
		String strLetterUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String strLetterLower = "abcdefghijklmnopqrstuvwxyz";

		String code = "";
		for (int i = 0; i < num; i++) {
			int random = (int) (Math.random() * 100);
			if (random < 100 * numWeight) {
				code += strNum.charAt((int) (Math.random() * 10));
			} else if (random < 100 * (numWeight + letterUpWeight)) {
				code += strLetterUpper.charAt((int) (Math.random() * 26));
			} else if (random < 100 * (numWeight + letterUpWeight + letterLowWeight)) {
				code += strLetterLower.charAt((int) (Math.random() * 26));
			}
		}

		return code;
	}

	// �������ַ������д�д��ĸ��Сд��ĸ�󷵻�
	public static String getLetterLowerString(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

	// �������ַ�������Сд��ĸ���д��ĸ�󷵻�
	public static String getLetterUpperString(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				sb.append(Character.toUpperCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
