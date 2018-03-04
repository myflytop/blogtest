package com.myblog.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
public class Mytestinterceptor2 implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pre");
		 HttpSession session = request.getSession();
		 String se=(String) session.getAttribute("login");
		 if (se!=null&&se.equals("loginsession")) {
			 
	      
	      
			/*不能重定向到内部*/
			response.sendRedirect("welcome.jsp");
			/* request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);*/
			 return false;
		}
		 else		 
		return true;
		 
		
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
