package com.myblog.interceptors;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import net.sf.json.JSONObject;

public class Mytestinterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		//返回用户是否登录
		boolean m = LoginUtil.relogin(request.getRequestURI());
		
		System.out.println("pre");
		 HttpSession session = request.getSession();
		 if (session.getAttribute("bloger")!=null) {
			 if (m) {
				response.sendRedirect(request.getContextPath()+"/welcomeBloger.jsp");
				return false;
			}
			 else {
			 System.out.println(session);
			 return true;
			 }
		}
		else
		{
			
			
			if (m) {
				return true;
			}
			else {
			Map<String, Object> map = new HashMap<String, Object>();
		    map.put("msg", "你还没有登录！");
		    System.out.println("login"+m);
			JSONObject myJson = JSONObject.fromObject(map);
			request.setCharacterEncoding("utf-8");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			
			out.print(myJson);
			out.close();
			return false;
			}
		}
		 
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
  System.out.println("post");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after");
	}

}
