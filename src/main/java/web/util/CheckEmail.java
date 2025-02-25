package web.util;

public class CheckEmail {
	public static boolean checkEmail(String email) {
		String format = "\\w{2,15}[@][a-z0-9]{3,}[.]\\p{Lower}{2,}";
		/**
		 * w{2,15}: 2~15个[a-zA-Z_0-9]字符；w{}内容是必选的�? 如：dyh@152.com是合法的�?
		 * [a-z0-9]{3,}：至少三个[a-z0-9]字符,[]内的是必选的；如：dyh200896@16.com是不合法的�??
		 * [.]:'.'号时必�?�的�? 如：dyh200896@163com是不合法的�??
		 * p{Lower}{2,}小写字母，两个以上�?�如：dyh200896@163.c是不合法的�??
		 **/
		if (email.matches(format)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String args[]) {
		String mail = "365@gmail.com";
		if (CheckEmail.checkEmail(mail)) {
			System.out.println(1);
		}
	}
}
