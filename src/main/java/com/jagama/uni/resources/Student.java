package com.jagama.uni.resources;

public class Student {
	private String name;
	private int Id;
	private int age;
	
	
	public Student(String name, Integer id, Integer age) {
		super();
		this.name = name;
		Id = id;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "student [name=" + name + ", Id=" + Id + ", age=" + age + "]";
	}
	
	

}
