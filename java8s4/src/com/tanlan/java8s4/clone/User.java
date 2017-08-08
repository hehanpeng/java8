package com.tanlan.java8s4.clone;

public class User implements Cloneable{
	private int id;
	private String name;
	private Group group;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		User user=(User)super.clone();
		Group g=(Group)group.clone();
		user.group=g;
		return user;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
	
}
