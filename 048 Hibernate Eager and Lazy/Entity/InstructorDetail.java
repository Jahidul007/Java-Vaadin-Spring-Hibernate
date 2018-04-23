package com.example.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="instructor_detail")

public class InstructorDetail {
	
	// annotate the class as an entity and map to db
	
	//define field
	
	// annotate the fields with db column
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "youtube_channel")
	private String youtubeChannel;
	
	@Column(name = "hobby")
	private String hobby;
	
	
	// add new field for instructor (also add getter/setters)
	// add @OneToOne annotation
	@OneToOne(mappedBy="instructorDetail",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST
			,CascadeType.REFRESH})
	private Instructor instructor;
	
	
	//create constructor
	public InstructorDetail() {
		
	}

	public InstructorDetail(String youtubeChannel, String hobby) {
	
		this.youtubeChannel = youtubeChannel;
		this.hobby = hobby;
	}

	//generate getter and setter methods
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	// generate toString method
	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + ", youtubeChannel=" + youtubeChannel + ", hobby=" + hobby + "]";
	}
}
