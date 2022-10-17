package com.bhavna.entity;

public class ReferralEntity {
	private int id;
	private String name;
	private int age;

	@Override
	public String toString() {
		return "ReferralBean [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public ReferralEntity() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public ReferralEntity(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}


