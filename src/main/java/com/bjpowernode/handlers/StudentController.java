package com.bjpowernode.handlers;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjpowernode.beans.Student;
import com.bjpowernode.service.IStudentService;
@Controller
@RequestMapping("/test")
public class StudentController{
  /*  @Autowired
    @Qualifier("studentService")*/
	@Resource(name="studentService")
	private IStudentService service;

	public void setService(IStudentService service) {
		this.service = service;
	}
	@RequestMapping("/register.do")
	public String doregister(String name,int age) throws Exception {

		Student student = new Student(name, age);
		service.addStudent(student);

		return "/welcome.jsp";
	}
	@RequestMapping("/login.do")
	public String login(/*HttpSession httpSession*/ ) throws Exception {

		/*Student student = new Student(name, age);
		service.addStudent(student);*/
		/*httpSession.setAttribute("login","loginsession");*/
		System.out.println("login");

		return "/WEB-INF/views/login.jsp";
	}
	@RequestMapping("/session_test.do")
	public String session_test(HttpSession httpSession,String name ) throws Exception {

		/*Student student = new Student(name, age);
		service.addStudent(student);*/
		httpSession.setAttribute("session_test",name);
		System.out.println(name);

		return "/session_test.jsp";
	}

}
