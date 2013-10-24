package me.project.service.student;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import me.project.dao.IDateSet4Hibernate;
import me.project.model.Student;

@Service("studentService")
public class StudentService {
	IDateSet4Hibernate iDateSet4Hibernate;
	
	public void insertStudent(Student student) {
		iDateSet4Hibernate.insert(student);
	}
	
	@Resource
	public void setiDateSet4Hibernate(IDateSet4Hibernate iDateSet4Hibernate) {
		this.iDateSet4Hibernate = iDateSet4Hibernate;
	}
}
