package com.webo.main.controller;

import java.rmi.StubNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.main.custexception.StudentNotFound;
import com.webo.main.model.Student;
import com.webo.main.service.StudentServiceI;

@RestController
public class HomeController {

	@Autowired
	StudentServiceI ssi;
	
	@RequestMapping(value = "/student",method = RequestMethod.POST)
	public void save(@RequestBody Student s) {
		ssi.save(s);
	}
	
	@RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
	public Student get(@PathVariable("id") int id) throws StudentNotFound {
		
		return ssi.getByid(id);
	}
	
	@RequestMapping(value = "/students",method = RequestMethod.GET)
	public List<Student> getAll(){
		return ssi.getStudents();
	}
	@RequestMapping(value = "/students/{name}",method = RequestMethod.GET)
	public List<Student> getAll(@PathVariable("name") String name) throws StudentNotFound{
		List<Student> l=ssi.findBySname(name);
		if(l.isEmpty()) {
			 throw new StudentNotFound("given student is not present");
		}
		else {

			return l;	
		}
	}
	
}
