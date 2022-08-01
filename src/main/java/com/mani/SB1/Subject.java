package com.mani.SB1;

import org.springframework.stereotype.Component;

@Component("maths")
public class Subject {
	private String sub;
	private String subCode;
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getSubCode() {
		return subCode;
	}
	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	
	public void status() {
		System.out.println("Testing Subject");
	}
}
