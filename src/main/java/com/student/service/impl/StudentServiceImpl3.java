package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.student.service.StudentService;

public class StudentServiceImpl3 implements StudentService{

	
	@Override
	public List<String> getStus() {
		// TODO Auto-generated method stub
		
			 ArrayList<String> list = new ArrayList<String>() ;
			 list.add("a3");
			 list.add("b3");
			 list.add("c4");
			 return list;
			 
			
		}


	
}
