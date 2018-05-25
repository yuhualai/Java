package com.collection_map;

import java.util.HashSet;
import java.util.Set;

public class Student {
	public
	String id;
	public String name;
//	public List<Course> courses;  //有序
	public Set <Course>courses; //无序

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.courses = new HashSet<Course>();
//		this.courses = new ArrayList<Course>();
	}

}
