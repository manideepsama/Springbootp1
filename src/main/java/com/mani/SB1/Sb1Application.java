package com.mani.SB1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb1Application {

	public static void main(String[] args) {
		System.out.println("Hello World1");
		//SpringApplication.run(Sb1Application.class, args);
		System.out.println("Hello World2");
		
		//Normal way
//		Student std1=new Student();
//		std1.test();
		
		//second way
		ConfigurableApplicationContext context=	SpringApplication.run(Sb1Application.class, args);
		Student std2=context.getBean(Student.class);
		std2.test();
		std2.getSub1().status();
	}

}
