package com.xyz.raul.pojo;

public class Pet {
	private final String name;
    private final int age;
	
    public String getName() {
		return name;
	}
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
}
