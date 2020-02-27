package com.webo.main.service;

import java.util.List;

import com.webo.main.model.Student;

public interface StudentServiceI {

	public void save(Student student);
	public List<Student> getStudents();
	public Student getByid(int id);
	public List<Student> findBySname(String sname);
}
