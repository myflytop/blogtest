package com.myblog.httpsessionlisteners;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
//当一个浏览器第一次访问网站的时候，J2EE应用服务器会新建一个HttpSession对象 ，并触发 HttpSession创建事件 ，如果注册了HttpSessionListener事件监听器，则会调用HttpSessionListener事件监听器的 sessionCreated方法
public class LoginHttpsessionlistener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		// TODO Auto-generated method stub
		System.out.println("sessionCreated");
		ServletContext ctx = event.getSession( ).getServletContext( ); 
        Integer numSessions = (Integer) ctx.getAttribute("numSessions"); 
        if (numSessions == null) { 
            numSessions = new Integer(1); 
        } 
        else { 
            int count = numSessions.intValue( ); 
            numSessions = new Integer(count + 1); 
            
        } 
        
        ctx.setAttribute("numSessions", numSessions); 

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		
		// TODO Auto-generated method stub
		ServletContext ctx=event.getSession().getServletContext(); 
		 Integer numSessions = (Integer)ctx.getAttribute("numSessions"); 
		  if(numSessions == null) 
		  {
		            numSessions = new Integer(0); 
		   } 
		  else { 
		            int count = numSessions.intValue( ); 
		            numSessions = new Integer(count - 1); 
		        } 
		        ctx.setAttribute("numSessions", numSessions);
		        System.out.println("numSessions"+numSessions);
		  } 
	
	}


