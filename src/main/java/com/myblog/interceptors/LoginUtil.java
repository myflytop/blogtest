package com.myblog.interceptors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginUtil {

	public static boolean relogin(String url) {	
		String addsort = "login.do";
		Pattern p = Pattern.compile(addsort);
		Matcher m = p.matcher(url);
		return m.find();
	}
	public static boolean relogin(String url,String action) {	
		String myaction = action;
		Pattern p = Pattern.compile(myaction);
		Matcher m = p.matcher(url);
		return m.find();
	}
	public static String res(String url) {	
		/*反斜杠\用\\代替*/
		String myrex = "/[a-z]{2,}\\.[d][o]";
		Pattern p = Pattern.compile(myrex);
		Matcher m = p.matcher(url);
		if (m.find()) {
			return m.group();
		}
		else
			
		return "nofind";
	}
}
