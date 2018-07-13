package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Student;
import com.briup.app02.service.IStudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	// 注入studentService的实例
	@Autowired
	private IStudentService studecntService;
	
	@GetMapping("deleteStudentById")
	public String deleteStudentById(long id){
		try{
			studecntService.deleteById(id);
			return "删除成功";
		}
		catch (Exception e){
			e.printStackTrace();
			return e.getMessage();
		}
	}
		
	
	
	@PostMapping("updateStudnt")
	public String updateStudent(Student student){
		try{
			studecntService.update(student);
			return "修改成功";
		}
		catch (Exception e){
			e.printStackTrace();
			return e.getMessage();
		}
	}
	@PostMapping("saveStudent")
	public void saveStudent(Student student){
		try{
			studecntService.save(student);
			
			
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	// http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllStudent")
	public List<Student> findAllStudent(){
		try {
			List<Student> list = studecntService.findAll();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("findStudentById")
	public Student findStudentById(long id){
		try {
			Student student = studecntService.findById(id);
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}













