package me.project.web;

import javax.annotation.Resource;

import me.project.service.student.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录页面
 * 
 * @author YX
 */
@Controller
public class IndexController {
	StudentService studentService;
	
	@RequestMapping(value = "/index")
	public String login() {
		return "index";
	}
	
	@Resource
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
