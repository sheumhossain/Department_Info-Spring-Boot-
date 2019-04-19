package com.simple.apidesign.department_info.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Students {
	
	@Id
	public ObjectId _id;
	
	public String name;
	public String session;
	public int age;
	public int passion;
	
	public Students() {}
	
	public Students(ObjectId _id, String name, String session, int age, int passion) {
		this._id = _id;
		this.name = name;
		this.session = session;
		this.age = age;
		this.passion = passion;
	}

	public String get_id() {
		return _id.toHexString();
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPassion() {
		return passion;
	}

	public void setPassion(int passion) {
		this.passion = passion;
	}

}