package com.example.jdbc;

public class student {
	private String Name;
	private String Address;
	private String Email;
	private int Age;
	private String Phone;

	public student() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Name;
		
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public student(String Name, String Address, String Email, int Age, String Phone) {
		this.Name = Name;
		this.Address = Address;
		this.Email = Email;
		this.Age = Age;
		this.Phone = Phone;
	}

}
