package com.webo.main.exceptionhandle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.webo.main.custexception.ExceptionResponse;
import com.webo.main.custexception.StudentNotFound;

@RestControllerAdvice
public class HandelException {
	
	@ExceptionHandler(StudentNotFound.class)
	
	public ExceptionResponse stuexception(StudentNotFound stu, HttpServletRequest req) {
	
		ExceptionResponse er = new ExceptionResponse();
		er.setMsg(stu.getMessage());
		er.setRequestUri(req.getRequestURI());
		er.setNumericStatusCode(HttpServletResponse.SC_NOT_FOUND);
		er.setStringStatusCode(HttpStatus.NOT_FOUND);
		return er;
	}
	
	
}
