package com.student.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.student.service.StudentService;


public class StudentServiceImpl1  implements StudentService{

	
	 private void sleep() { 
		 try { Thread.sleep(4000);
		 	
		 } catch (InterruptedException e) { 
			 // TODO Auto-generated catch block
			 e.printStackTrace(); } 
		 }
	@Override
	public List<String> getStus() {
		// TODO Auto-generated method stub
		sleep();
			 ArrayList<String> list = new ArrayList<String>() ;
			 list.add("a1");
			 list.add("b1");
			 list.add("c1");
			 return list;
			 
			
		}


}
