package me.project.web.student;

import javax.annotation.Resource;

import me.project.model.Student;
import me.project.service.student.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录页面
 * 
 * @author YX
 */
@Controller("student")
public class StudentController {
	StudentService studentService;
	
	@RequestMapping(value = "/insert")
	public String insertStudent() throws Exception{
		Student student = new Student();
		student.setId(1);
		student.setName("yx");
		student.setAge("21");
		studentService.insertStudent(student);
		return "insertSuccess";
	}
	
	@Resource
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
