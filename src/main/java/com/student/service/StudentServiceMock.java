package com.student.service;

import java.util.ArrayList;
import java.util.List;
/*
 * 
  * 命名方式严格固定的 必须是接口名后后边+Mock
 * 
 *
 */
public class StudentServiceMock implements StudentService{

	
	@Override
	public List<String> getStus() {
		// TODO Auto-generated method stub
		System.out.println("降级被调用");
		 ArrayList<String> list = new ArrayList<String>() ;
		 list.add("a0");
		 list.add("b0");
		 list.add("c0");
		 return list;
	}
	
	

}
