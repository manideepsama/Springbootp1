package com.mani.SB1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;
	private int age;
	private String clgName;
	private String id;
	@Autowired
	@Qualifier("maths")
	private Subject sub1;
	public Subject getSub1() {
		return sub1;
	}
	public void setSub1(Subject sub1) {
		this.sub1 = sub1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void test() {
		System.out.println("testing");
	}
}
