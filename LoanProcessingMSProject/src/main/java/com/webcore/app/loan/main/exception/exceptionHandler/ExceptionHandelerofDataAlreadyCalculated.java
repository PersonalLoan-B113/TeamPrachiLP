package com.webcore.app.loan.main.exception.exceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.webcore.app.loan.main.exception.ExceptionResponse;
import com.webcore.app.loan.main.exception.CustomExceptionClasses.DataAlreadyCalculated;

public class ExceptionHandelerofDataAlreadyCalculated {
	
	@ExceptionHandler(DataAlreadyCalculated.class)
	public ExceptionResponse dataAlreadyCreatedException(DataAlreadyCalculated data, HttpServletRequest http )
	{
	
		ExceptionResponse er = new ExceptionResponse();
		er.setRequestUri(http.getRequestURI());
		er.setMsg(data.getMessage());
		er.setNumericStatusCode(HttpServletResponse.SC_CONFLICT);
		er.setStringStatusCode(HttpStatus.CONFLICT);
		return er;
	}
}
