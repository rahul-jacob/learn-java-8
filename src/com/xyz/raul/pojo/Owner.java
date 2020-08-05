package com.xyz.raul.pojo;

public class Owner {
	private final String name;
    private final String country;
    private final String city;
    private final Pet pet;
	public Owner(String name, String country, String city, Pet pet) {
		super();
		this.name = name;
		this.country = country;
		this.city = city;
		this.pet = pet;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	public Pet getPet() {
		return pet;
	}
	@Override
	public String toString() {
		return "Owner [name=" + name + ", country=" + country + ", city="
				+ city + ", pet=" + pet + "]";
	}
}
