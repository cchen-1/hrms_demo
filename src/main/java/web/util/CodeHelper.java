package web.util;

public class CodeHelper {
	// 获取加权随机验证码，num为验证码位数，numWeight为数字权值，letterUpWeight为大写字母权值，letterLowWeight为小写字母权值
	public static String getCheckCode(int num, double numWeight, double letterUpWeight, double letterLowWeight) {
		// 判断权值输入是否正确，可能需要改因为浮点数运算不精确
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

	// 将传入字符串所有大写字母变小写字母后返回
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

	// 将传入字符串所有小写字母变大写字母后返回
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
