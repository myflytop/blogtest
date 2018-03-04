package com.bjpowernode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bjpowernode.beans.Student;
import com.bjpowernode.dao.IStudentDao;
@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	@Autowired
	@Qualifier("IStudentDao")
	private IStudentDao dao;
	
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}
    @Transactional
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

}
