package com.student;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 驱动服务 加载到容器当中
 * @author zhuzg
 *
 */
public class StartProvider {
	
	public static void main(String[] args) throws IOException {
		System.out.println("准备运行");
		//加载配置文件 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:dubbo-provider.xml");
		//启动容器
		context.start();
		System.out.println("服务启动成功");
		//加阻塞
		System.in.read();
		 
	}

}
