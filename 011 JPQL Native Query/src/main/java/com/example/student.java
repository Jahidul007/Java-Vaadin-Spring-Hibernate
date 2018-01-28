package com.example;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="STUDENT ")
public class student {
	
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="Name")
	private String studentName;
	
	@Column(name="Age")
	private int studentAge;
	
	@Column(name="Student_Grade")
	private int grade;
	/**
	 */
	public student(String studentName,int studentAge,String address) {
		
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.address = address;
	}

	@Transient
	private String address;
 
	public int getId() {
		return id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString()
	{
		return this.studentName;
	}


}
