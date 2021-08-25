package com.olive.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olive.custom.exception.ProductNotExitException;
import com.olive.model.Employee;

@RestController
public  class ProductController{
	
	@RequestMapping("/fetch")
	public ResponseEntity<Employee> getEmpById(@RequestParam Integer id){
		
		if(id!=5) {
			throw new ProductNotExitException("Product Not Exit ID " + id);
		}
		
		return new ResponseEntity<Employee>(new Employee(10, "Ravi"), HttpStatus.OK);
	}
	
	
	
}
