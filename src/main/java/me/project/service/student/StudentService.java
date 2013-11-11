package me.project.service.student;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import me.project.dao.IDateSet4Hibernate;
import me.project.model.Student;

@Service("studentService")
public class StudentService {
	IDateSet4Hibernate iDateSet4Hibernate;
	
	public void insertStudent(Student student) throws Exception{
		//Session sesson = sessionFactory.getCurrentSession();
		iDateSet4Hibernate.insert(student);
		Student s = new Student();
		s.setId(1000);
		s.setAge("100");
		s.setName("xxh");
		iDateSet4Hibernate.insert(s);
		//throw new Exception();
	}
	
	@Resource
	public void setiDateSet4Hibernate(IDateSet4Hibernate iDateSet4Hibernate) {
		this.iDateSet4Hibernate = iDateSet4Hibernate;
	}
}
