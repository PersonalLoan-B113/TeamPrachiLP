package com.webo.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.main.model.Student;
import com.webo.main.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	StudentRepo sr;
	
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		sr.save(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return (List<Student>)sr.findAll();
	}

	@Override
	public Student getByid(int id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public List<Student> findBySname(String sname) {
		// TODO Auto-generated method stub
		return sr.findBySname(sname);
	}
}
