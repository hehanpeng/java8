package com.tanlan.java8s4.clone;

public class TestCloneUser {

	public static void main(String[] args) throws Exception {
		User user1 = new User();
		user1.setId(1);
		user1.setName("Tom");
		Group group = new Group();
		group.setName("一组");
		user1.setGroup(group);

		// User user2=new User();
		// user2.setId(user1.getId());
		// user2.setName(user1.getName());

		User user2 = (User) user1.clone();
		user1.setId(2);
		user1.getGroup().setName("二组");
		System.out.println(user2.getId() + "," + user2.getName() + ","
				+ user2.getGroup().getName());
	}

}
