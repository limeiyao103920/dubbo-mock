package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.student.service.StudentService;

public class StudentServiceImpl2  implements StudentService{

	@Override
	public List<String> getStus() {
		// TODO Auto-generated method stub
		
			 ArrayList<String> list = new ArrayList<String>() ;
			 list.add("a2");
			 list.add("b2");
			 list.add("c2");
			 return list;
			 
			
		}

	
}
