package com.myblog.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.myblog.admia.mode.Bloger;

public class Blogerinterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("mypre");
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String blogerlogin = "blogerlogin";
	
		
		Bloger bloger=(Bloger) session.getAttribute(blogerlogin);
		System.out.println(bloger);
		System.out.println(request.getRequestURI());
		// 管理的请求是否为登录请求
		boolean m = LoginUtil.relogin(request.getRequestURI(), blogerlogin);
		if (bloger!= null ) {
			//来自管理员登陆请求
			if (m||LoginUtil.relogin(request.getRequestURI(), "trunlogin")) {
				/*request.getRequestDispatcher("/WEB-INF/bloger/bloger.jsp").forward(request, response);*/
				response.sendRedirect("bloger.jsp");
				System.out.println("1");
				return false;
			} 
			/*来自其它操作*/
			else {
				System.out.println("2");
				return true;
			}
		}
		else
		{  //管理员未登录 请求来自登录
			if (m) {
				System.out.println("3");
				return true;
			}
			//管理员未登录 跳转登录
			else {
			request.getRequestDispatcher("/WEB-INF/bloger/blogerlogin.jsp").forward(request, response);
				/*response.sendRedirect("/blogerlogin.jsp");*/
		    System.out.println("4");
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
