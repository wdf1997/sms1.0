package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	
	@Override
	public List<Student> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Student> list = studentMapper.findAll();
		
		return list;
	}


	@Override
	public Student findById(long id) throws Exception {
		return studentMapper.findById(id);
	}
	
	@Override
	public void save(Student student) throws Exception{
		studentMapper.save(student);
	}
	@Override
	public void update(Student student) throws Exception{
		studentMapper.update(student);
	}

	@Override
	public void deleteById(long id) throws Exception{
		studentMapper.deleteById(id);
	}
}













