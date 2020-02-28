package com.xyz.raul.pojo;


/**
 * @author 1223204
 *
 */
public class Developer {
	
	private String name;
	
	private String technology;
	
	private String salary;
	
	private int level;

	
	
	public Developer(String name, String technology, String salary, int level) {
		super();
		this.name = name;
		this.technology = technology;
		this.salary = salary;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Developer [name=" + name + ", technology=" + technology
				+ ", salary=" + salary + ", level=" + level + "]";
	}
	
	

}
