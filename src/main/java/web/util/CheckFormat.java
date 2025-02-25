package web.util;

import java.io.*;


public class CheckFormat {
	public static boolean checkEmail(String email) {
		String format = "\\w{2,15}[@][a-z0-9]{2,}[.]\\p{Lower}{2,}";
		/**
		 * w{2,15}: 2~15个[a-zA-Z_0-9]字符；w{}内容是必选的。 如：dyh@152.com是合法的。
		 * [a-z0-9]{3,}：至少三个[a-z0-9]字符,[]内的是必选的；如：dyh200896@16.com是不合法的。
		 * [.]:'.'号时必选的； 如：dyh200896@163com是不合法的。
		 * p{Lower}{2,}小写字母，两个以上。如：dyh200896@163.c是不合法的。
		 **/
		if(email.matches(format)){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkPhone(String phone) {
		String format = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(17[013678])|(18[0,5-9]))\\d{8}$";
		if(phone.matches(format)){
			return true;
		}else {
			return false;
		}
	}
	public static void main(String args[]) {
		String phone = "13500129680";
		if(CheckFormat.checkPhone(phone)) {
			System.out.println(1);
		}
	}
}
