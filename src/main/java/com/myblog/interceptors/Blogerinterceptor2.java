package com.myblog.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.myblog.admia.mode.Bloger;

public class Blogerinterceptor2 implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("mypre");
		
		boolean re;
		System.out.println(request.getRequestURI());
		/*请求的RequestURI路径*/
		String requestURI=request.getRequestURI();
		/*获取session对象*/
		HttpSession session = request.getSession();
		/*登录请求*/
		/*String blogerlogin = "blogerlogin.do";*/
		/*转发到管理登录主页*/
		/*String flogin="fblogerlogin.do";*/
		/*转发到管理主页*/
		/*String fbloger="fbloger.do";*/
		Bloger bloger=(Bloger) session.getAttribute("blogerlogin");
		switch (LoginUtil.res(requestURI)) {
		   case "/blogerlogin.do":
			   if (bloger!=null) {
				   response.sendRedirect("bloger.jsp");
				   re=false;
				}
			   else {	   
				re=true;
			}
			break;
          case "/fblogerlogin.do":
        	  if (bloger!=null) {
        		 /* request.getRequestDispatcher("/WEB-INF/bloger/bloger.jsp").forward(request, response);*/
        		  response.sendRedirect("bloger.jsp");
        		  re=false;
			}
        	  else {
                /*request.getRequestDispatcher("/WEB-INF/bloger/blogerlogin.jsp").forward(request, response);*/
        		  
        		  re=true;
			}
			break;
          case "/fbloger.do":
        	  if (bloger!=null) {
        		  re=true;
  			}
        	  else {
        		  /*request.getRequestDispatcher("/WEB-INF/bloger/blogerlogin.jsp").forward(request, response);*/
        		  response.sendRedirect("blogerlogin.jsp");
        		  re=false;
  			}
  			break;
		default:
			if (bloger!=null) {
				re= true;
			}
			else {
				request.getRequestDispatcher("/WEB-INF/bloger/blogerlogin.jsp").forward(request, response);
				re=false;
			}
			break;
		}
		
		return re;
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
