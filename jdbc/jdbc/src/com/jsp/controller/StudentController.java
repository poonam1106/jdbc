package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student student= new Student();
        student.setId(2);
        student.setName("Divya");
        student.setEmail("Divya@gmail.com");
        student.setGender("Female");
        student.setPhoneno(98675423);
        
        StudentDao studentDao=new StudentDao();
        studentDao.saveStudent(student);
        
        
	}

}
