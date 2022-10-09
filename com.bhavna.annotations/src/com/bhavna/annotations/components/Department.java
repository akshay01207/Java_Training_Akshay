package com.bhavna.annotations.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("department")
public class Department {
	@Value("1001")
	private int dId;
	@Value("Development")
	private String name;
	
	public Department() {
		super();
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", name=" + name + "]";
	}
	
	

}
