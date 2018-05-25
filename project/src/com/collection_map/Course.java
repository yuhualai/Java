package com.collection_map;

public class Course {
	/**
	 * 课程类
	 */
	public String id;

	public String name;

	public Course(String id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	public Course() {
		
	}
	//重写equals方法
	@Override
	public boolean equals(Object obj){
		if (this==obj) {
			return true;
		}
		if (obj==null) {
			return false;
		}
		if (!(obj instanceof Course)) {
			return false;
		} 
		Course course = (Course)obj;
		if (this.name == null) {
			if (course.name==null) {
				return true;
			} else {
				return false;
			}
			
		} else {
			if (this.name.equals(course.name)) {
				return true;
			}else {
				return false;
			}

		}

	}

	// public String getId() {
	// return id;
	// }
	//
	// public void setId(String id) {
	// this.id = id;
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }

}
