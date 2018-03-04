package mvn_ssm;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.junit.Test;

import com.myblog.admia.mode.Article_sort;
import com.myblog.interceptors.LoginUtil;
import com.myblog.tool.MD5Util;

public class Mytest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testmd5() {
		
		System.out.println("123".getBytes());
		System.out.println(MD5Util.toMd5("123"));
	
		
	}
	@Test
	public void test3() {
SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
Timestamp now = new Timestamp(System.currentTimeMillis());
System.out.println(now);// 2015-06-25 14:27:41.477
String time = df.format(now);
System.out.println(time); //2015-06-25 14:27:41 

		
		Article_sort article_sort=new Article_sort(1,"zhangsan",now);
		System.out.println(article_sort);
		System.out.println(df.format(article_sort.getSort_article_time()));
	
		
	}

	@Test
	public void loginut(){
		
		System.out.println(LoginUtil.res("/ffff.do"));
	
		
	}
}
