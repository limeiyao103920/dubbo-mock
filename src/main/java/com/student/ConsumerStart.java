package com.student;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.service.StudentService;

public class ConsumerStart {
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-consumer.xml");
		context.start();
		
		// 测试服务降级
		 StudentService studentService = (StudentService)context.getBean("myStudenta");
		 List<String> list = studentService.getStus();
		 list.stream().forEach(x->{System.out.println("名单是 " + x);});
		 Thread.sleep(1000);
		
		
		
		
	}
	

}
